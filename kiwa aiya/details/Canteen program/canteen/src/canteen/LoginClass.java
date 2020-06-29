/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package canteen;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kiwa
 */
public class LoginClass {
    public boolean loginCheckAdmin(String currentUser, String currentPass) {
        boolean check = false;

        try {
            Connection c = new BSDB().con();
            Statement st = c.createStatement();

            String sql = "SELECT * FROM login WHERE UserName ='" + currentUser + "' AND Password = '" + currentPass + "' ";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                check = true;
            }

            if (check == false) {
                JOptionPane.showMessageDialog(null, "Didn't match username and password");

            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
        return check;
    }
    
   public boolean loginCheckCust(String currentUser,String currentPass){
          boolean check = false;

        try {
            Connection c = new BSDB().con();
            Statement st = c.createStatement();

            String sql = "SELECT * FROM cust_login WHERE userName ='" + currentUser + "' AND password = '" + currentPass + "' ";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                check = true;
            }

            if (check == false) {
                JOptionPane.showMessageDialog(null, "Didn't match username and password");

            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
   
   
   
      

        return check;
    }
   
    public void CheckCustUsernamePassword(String currentUser,String currentPass,String newUser,String newPass ,String cus_ID){
          boolean check = false;

        try {
            Connection c = new BSDB().con();
            Statement st = c.createStatement();
            Statement st2=c.createStatement();
            Statement st3=c.createStatement();
            String sql = "SELECT * FROM cust_login WHERE username = '" + currentUser + "' AND password = '" + currentPass + "' AND Cust_ID = '"+cus_ID+"'";
            ResultSet rs = st.executeQuery(sql);
            
            String sql2="SELECT * FROM cust_login WHERE username = '" + newUser + "'";
            ResultSet rs2=st2.executeQuery(sql2);
            
            String sql3="update cust_login set username  = '"+newUser+"' , password = '"+newPass+"' where Cust_ID = '"+cus_ID+ "'";
            //checking previous username and password are valid
            while (rs.next()) {
               
                check = true;
            }

            if (check == false) {
                JOptionPane.showMessageDialog(null, "Didn't match  previous username and password");

            }
            
            //if previous are valid then checking new username and password are available
            if(check==true){
               
                //if new user new password are used  check will be false
                while(rs2.next()){
                 check=false;
                }
                if(check==true){
                   
                    st3.executeUpdate(sql3);
                    JOptionPane.showMessageDialog(null, "SUCCESS");
                
                }
                if(check==false){JOptionPane.showMessageDialog(null, "new username is not available");}
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
   
   
   
      

       // return check;
    }
   
   
   
   
    
}


