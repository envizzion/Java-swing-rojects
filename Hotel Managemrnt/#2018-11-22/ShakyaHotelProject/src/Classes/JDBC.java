package Classes;

import GUI.EXceptionAndToast.ExceptionDisplay;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JDBC {

    static final String url = "jdbc:mysql://localhost:3306/hotelres";
    static final String url2 = "com.mysql.cj.jdbc.Driver";
    static final String userName = "root";
    static final String password = "KasunAps30@";

    static Connection c = null;

    public static Connection con() {

        try {

            if (c == null) {
                Class.forName(url2);
                c = DriverManager.getConnection(url, userName, password);
            }

        } catch (Exception e) {

            String customException = "Unable to establish  The connection: May be Class no Found Exception";
            String JVMEception = e.toString();
            ExceptionDisplay eDisplay = new ExceptionDisplay(" public static Connection con", "JDBC", customException, JVMEception);
            eDisplay.setVisible(true);

        }
        return c;
    }

    public static void TerminateConnection() {

        try {

            if (c != null) {
                c.close();
                c = null;

            }

        } catch (Exception e) {

            String customException = "Unable to terminate The connection";
            String JVMEception = e.getStackTrace().toString();
            ExceptionDisplay eDisplay = new ExceptionDisplay("public static void TerminateConnection", "JDBC", customException, JVMEception);
            eDisplay.setVisible(true);

        }

    }

    public void putData(String sql) throws Exception {
        con().createStatement().executeUpdate(sql);//Non Select // insert/update/delete //number of records affected
    }

    public ResultSet getData(String sql) {
        ResultSet rs = null;
        try {

            rs = con().createStatement().executeQuery(sql);//Only Select//result set
            //TerminateConnection();

        } catch (Exception e) {

            String customException = "Unable to fetch data from database";
            String JVMEception = e.toString();
            ExceptionDisplay eDisplay = new ExceptionDisplay("public ResultSet getData(String sql)", "JDBC", customException, JVMEception);
            eDisplay.setVisible(true);

        }

        return rs;
    }

    /*NEW MOTHODS*/
 /*For Test the datbase Connectivity*/
    public boolean Check(String DBName) throws SQLException {
        String Query = "SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME ='" + DBName + "' ";
        boolean status = con().createStatement().execute(Query);
        TerminateConnection();
        return status;

    }

    public int InsertDataToDB(String FieldNames, String partialStatement, String TableName) throws SQLException {

        String Query = "INSERT INTO " + TableName + "(" + FieldNames + ")  VALUES (";
        Query += partialStatement + ")";
        Connection connection = con();
        int affectedRows = connection.createStatement().executeUpdate(Query);
        TerminateConnection();
        System.out.println("CREATED QUERY  " + Query);
        return affectedRows;

    }

    /*also can use to remove/delete*/
    public int UpdateDataBaseTable(String tableName, String partialStatement1, String partialStatement2) {

        String Query = "UPDATE " + tableName + " SET";
        Query += " " + partialStatement1;
        Query += " WHERE " + partialStatement2;
        int affectedRows = 0;
        Connection connection = con();

        try {

            // System.out.println("UpdateQuery  "+Query);
            affectedRows = connection.createStatement().executeUpdate(Query);
        } catch (Exception e) {

            System.out.println(" public int UpdateDataBaseTable " + e);

        }

        TerminateConnection();
        System.out.println("CREATED QUERY  " + Query);
        return affectedRows;

    }

//    public ResultSet GetData(String tableName,String fields)
//    {
//        
//        String Query ="SELECT "+fields;
//        Query += "FROM "+tableName;
//    
//    
//    
//    
//    
//    }
    //make sure to call the clearTable in helper calass befor this mEthod
    public void addToTable(JTable table, ResultSet Rs) {

        if (Rs != null && table != null) {

            DefaultTableModel dfm = (DefaultTableModel) table.getModel();
            int colCount = table.getColumnCount();

            try {

                while (Rs.next()) {
                    Vector v = new Vector();

                    for (int i = 1; i <= colCount; i++) {

                        v.add(Rs.getString(i));

                        System.out.println("DATA=" + Rs.getString(i));

                    }

                    dfm.addRow(v);

                }

            } catch (SQLException e) {

                System.out.println("hello " + e.toString());

            }

        }

        JDBC.TerminateConnection();

    }

    public void addToTable(JTable table, ResultSet Rs, int decimalindex) {

        if (Rs != null && table != null) {

            DefaultTableModel dfm = (DefaultTableModel) table.getModel();
            int colCount = table.getColumnCount();

            try {

                while (Rs.next()) {
                    Vector v = new Vector();

                    for (int i = 1; i <= colCount; i++) {

                        if (i == decimalindex) {
                            v.add(Float.parseFloat(Rs.getString(i)));
                        } else {
                            v.add(Rs.getString(i));
                        }

                    }

                    dfm.addRow(v);

                }

            } catch (SQLException e) {

                System.out.println("hello " + e.toString());

            }

        }

        JDBC.TerminateConnection();

    }

    public void loadToComboBox(JComboBox comboBox, String SQL) {

        comboBox.removeAllItems();
        comboBox.addItem("-- Select Capacity --");
        ResultSet Rs = getData(SQL);

        try {

            while (Rs.next()) {

                comboBox.addItem(Rs.getString(1) + "-" + Rs.getString(2));

            }

        } catch (SQLException e) {

            System.out.println("public void loadToComboBox" + e);

        }

    }

}

/*
    
    4.3.1.3 Changes in the Connector/J API
This section describes the changes to the Connector/J API going from version 5.1 to 8.0. You might need to adjust your API calls accordingly:

The name of the class that implements java.sql.Driver in MySQL Connector/J has changed from com.mysql.jdbc.Driver to com.mysql.cj.jdbc.Driver. The old class name has been deprecated.

The names of these commonly-used interfaces have also been changed:

ExceptionInterceptor: from com.mysql.jdbc.ExceptionInterceptor to com.mysql.cj.exceptions.ExceptionInterceptor

StatementInterceptor: from com.mysql.jdbc.StatementInterceptorV2 to com.mysql.cj.interceptors.QueryInterceptor

ConnectionLifecycleInterceptor: from com.mysql.jdbc.ConnectionLifecycleInterceptor to com.mysql.cj.jdbc.interceptors.ConnectionLifecycleInterceptor

AuthenticationPlugin: from com.mysql.jdbc.AuthenticationPlugin to com.mysql.cj.protocol.AuthenticationPlugin

BalanceStrategy: from com.mysql.jdbc.BalanceStrategy to com.mysql.cj.jdbc.ha.BalanceStrategy.
    
    
    
    
    
 */
 /*      
            String Query="INSERT INTO login (username,password,Type)  VALUES (?,?,?)";
            
          
                
                
               PreparedStatement ps=null;
              
               
               try {
               
                    Connection connection=JDBC.con();
                    ps=connection.prepareStatement(Query);
                    ps.setString(1,userNameText.getText());
                    ps.setString(2,new String(PasswordText.getPassword()));
                    ps.setString(3, UserType.getSelectedItem().toString());
                  int k =  ps.executeUpdate();
                      System.out.println(k);
                   
            } catch (Exception e) {
                
                   System.out.println(e);
                
            }
              
 */
//        /*below Method is not very adaptable only for table that only string fileds*/
//    public int InsertDataToDBStringOnly(String[] FieldSet, String TableName) {
//
//        String Query = "INSERT INTO '" + TableName + "' VALUES (";
//        for (int i = 0; i < FieldSet.length; i++) {
//
//            if (i == (FieldSet.length - 1)) {
//                Query += "'" + FieldSet[i] + "')";
//
//            } else {
//                Query += "'" + FieldSet[i] + "',";
//            }
//
//        }
//
//        return 1;
//
//    }

