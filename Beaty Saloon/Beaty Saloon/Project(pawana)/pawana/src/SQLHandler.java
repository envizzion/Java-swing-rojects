/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Acer
 */
public class SQLHandler {
    
  public  void queryPass(String query,String queryType){
       System.out.println(query);
        try{
            Connection c = Dbconnection.mycon();
            Statement s = c.createStatement();
            switch(queryType){
                case "update":s.executeUpdate(query);
                break;
                case "query":s.executeQuery(query);
                break;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
   public String getIDName(String tableName){
    String idName=""; 
       switch(tableName){
          
           case "damages": idName="orderID";
           break;
           case "driversonorders": idName="driverID";
           break;
           case "driverdetails": idName="driverID";
           break;
           case "drivertruck": idName="driverID";
           break;
           case "heldup": idName="orderID";
           break;
           case "orderdates": idName="orderID";
           break;
           case "orders": idName="orderID";
           break;
           case "shippinglines": idName="lineID";
           break;
           case "transporterdetails": idName="transID"; 
           break;
          case "transportersonduty": idName="orderID"; 
           break;
          case "truckdetails": idName="truckID";
          break;
          case "yarddetails": idName="yardID";
          break;
       }
       return idName;
   } 
    
    
    
    
 public   void addNewRow(String tableName,String[] vals){
        
        String values="insert into "+tableName+" values(";
        int i=0;
        for(i=0;i<vals.length-1;i++){
            values+="'"+vals[i]+"',";
        }
        values+="'"+vals[i]+"');";
        
        System.out.println(values); 
       queryPass(values,"update");
    
    
    }
 
  public   void addNewRowNoID(String tableName,String[] vals){
        
        String values="insert into "+tableName+" values(null,";
        int i=0;
        
        for(i=0;i<vals.length-1;i++){
            values+="'"+vals[i]+"',";
        }
        values+="'"+vals[i]+"');";
        
        System.out.println(values); 
       queryPass(values,"update");
    
    
    }
  
  public   void editRow(String tableName,String conditn,String[][] colNamesAndvals){
        int size=colNamesAndvals.length;
        String values="update "+tableName+"  set ";
        int i=0;
        
        for(i=0;i<size;i++){
            values+=colNamesAndvals[i][0]+"='"+colNamesAndvals[i][1]+"',";
        }
        values=values.substring(0, values.length()-1);
        values+=" "+conditn+";";
        
        
        queryPass(values,"update");
    
    
    }
    public String[] textFieldToArray(JTextField[] arr){
        String[] ar=new String[arr.length];
       
        for(int i=0;i<arr.length;i++)ar[i]=arr[i].getText();
        return ar;
    }
    
   public void deleteByID(String tableName,String column,String value){
      //String idName=getIDName(tableName);
      queryPass("delete from "+tableName+" where "+column+" = '"+value+"';","update");
  
  }
   
   
  public ResultSet getResultSet(String query){
        ResultSet rs=null;
        try {
            Connection c = Dbconnection.mycon();
            Statement s = c.createStatement();

             rs=s.executeQuery(query);
       
           

        }

        catch(Exception e){System.out.println(e);}
         
  return rs;
  }  
  
  public boolean idChecker(String tableName,String column,String value){
          //String idName=getIDName(tableName);
          ResultSet rs=getResultSet("select * from "+tableName+" where "+column+"='"+value+"';");
          
          try{
            if(rs.first()){
                System.out.println(rs.first());
                return true;
            }
            
            }
         catch(Exception e){
            e.printStackTrace();
         
         }
  
  
  return false;
  }
  
    public boolean isResultAvail(String query){
          
          ResultSet rs=getResultSet(query);
          
          try{
            if(rs.first())return true;
            
            }
         catch(Exception e){
            e.printStackTrace();
        }
  
  
  return false;
  }
  
  public boolean nameChecker(String tableName,String name){
          String idName=getIDName(tableName);
          ResultSet rs=getResultSet("select * from "+tableName+" where name='"+name+"';");
          
          try{
            if(rs.first())return true;
            
            }
         catch(Exception e){
            e.printStackTrace();
        }
  
  
  return false;
  }
  
  
 public Calendar getDate(String sDate){
       SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
       Calendar c=Calendar.getInstance();
       try{
       c.setTime(s.parse(sDate));
       }
       catch (Exception e){e.printStackTrace();}
 return c;
 }
 
 public DateFormat setdateFormat(){
    SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
    
   return s;
 }
 
 public int getDateDifference(String newDate,String oldDate){
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     int df=0;
       try{
        Date date1 = sdf.parse(oldDate);
        Date date2 = sdf.parse(newDate);
       
        long diff=date2.getTime()-date1.getTime();
        df= (int)(diff / (1000 * 60 * 60 * 24));
       }
       catch(Exception e){
       e.printStackTrace();
       }
       return df;
 }
 
//public int gateMonthDifference(){
 
// }
 
public String getSingleResult(String query){
 ResultSet rs=getResultSet(query); 
 String res="";
                try{
                 if(rs.next()){
                       res=rs.getString(1);
                       if(res==null)res="null";
                 }
                 else res="null";
                }
                catch(Exception e){
                  e.printStackTrace();
                }
 
 return res;
 }
 
 public DefaultListModel getListModelResultSet(String query){
     
     
     DefaultListModel mdl=new DefaultListModel();
     ResultSet rs=getResultSet(query);         
                try{
                 while(rs.next())
                       mdl.addElement(rs.getString(1));
                }
                catch(Exception e){
                  e.printStackTrace();
                }
                return mdl;      
 
 }
 
 public ArrayList<String> getArrayListResultSet(String query){
     
     
     ArrayList<String> ls=new ArrayList<String>();
     ResultSet rs=getResultSet(query);         
                try{
                 while(rs.next())
                       ls.add(rs.getString(1));
                }
                catch(Exception e){
                  e.printStackTrace();
                }
                return ls;   
 
 }
 
 
 
 public String[] getSingleRowVals(String query,int noOfColumns){
     
     String[] arr=new String[noOfColumns];
     
     ResultSet rs=getResultSet(query);         
                try{
                 while(rs.next())
                      for(int x=1;x<=noOfColumns;x++)arr[x-1]=rs.getString(x);
                }
                catch(Exception e){
                  e.printStackTrace();
                }
                return arr;   
 
 }
 
 
 
 
 
 public void setDriverOrder_array(String[] driverID,String orderID,String state,String date) {
     
     
     for(String x:driverID){
         String[] vals={x,orderID,state,date};
         addNewRow("driversonorders",vals);
    }
 }
 public void finishDriverOrder(String driverID,String date,String payment){
        ResultSet rs= getResultSet("select * from driversonorders where driverID = '"+driverID+"'");
        String startDate="",state="",orderID="";
        try{
         if(rs.next());   
           startDate=rs.getString("date");
           state=rs.getString("stage");
           orderID=rs.getString("orderID");
        }
        catch(Exception e){e.printStackTrace();}
        
//      deleteByID("driversonorders",driverID);
      
      
      String[] vals={driverID,orderID,startDate,date,payment,state,"no"};
      addNewRow("driverjobsdone",vals);
 }
 

 
 
 
 
 public boolean checkLogin(String user,String password){
           
          ResultSet rs=getResultSet("select password from users where userName='"+user+"';");
          
          try{
            if(rs.first())
                if(rs.getString("password").equals(password))
                      System.out.println("login ok");
                        return true;
            
            }
          
         catch(Exception e){
            e.printStackTrace();
         
         }
          System.out.println("login wrong");
          return false;
  
  
  
  }
 
void printMeassage(String msg){
     JOptionPane.showMessageDialog(null,msg);
 
 }
 
String getCombVal(JComboBox c){
  return c.getSelectedItem().toString();

}

void setComboVals(String query,JComboBox c){
   ResultSet rs=getResultSet(query);
   c.removeAllItems();
   try{
   while(rs.next()){
     c.addItem(rs.getString(1));
   
   }
   }
   catch(Exception e){
      e.printStackTrace();
   
   }
}

String getTableCellVal(JTable c,int column){
  int row=c.getSelectedRow();

  return c.getValueAt(row, column).toString();
   
}
boolean checkTableSel(JTable c){
  int row=c.getSelectedRow();

  if(row==-1)return false;
  else return true;
   
}

void setTableModel(JTable table,String query){
         ResultSet rs=getResultSet(query);
     
       table.setModel(DbUtils.resultSetToTableModel(rs));     


}

 public String getColumnSum(String tableName,String column,String condition){
          //String idName=getIDName(tableName);
          ResultSet rs=getResultSet("select sum("+column+") from "+tableName+" "+condition);
         
          String res="";
          try{
            if(rs.first()){
               //System.out.println(rs.first());
               if(rs.getString(1).isEmpty()|| rs.getString(1)==null)return "0";
              else 
            return rs.getString(1);
            }
            
           
            }
         catch(Exception e){
            e.printStackTrace();
         
         }
  return "0";
  }

 
}
 

