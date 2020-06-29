/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Acer
 */
public class StockUpdate {
    
    public void supStocksChange(String intialStock,String finalStock,String foodID){
    int n1=Integer.parseInt(intialStock);
    int n2=Integer.parseInt(finalStock);    
    String newStock;   
        
    try{
    Connection c = new BSDB().con();
    Statement s=c.createStatement();
    
    
    if(n1!=n2){
      int check=JOptionPane.showConfirmDialog(null,"Do you also want to change the stock food amount ? ","stock check",JOptionPane.YES_NO_OPTION);       
       if(check==JOptionPane.YES_OPTION){
          if(n2>n1){
              newStock=String.valueOf(n2-n1);
              //incrementing food quantity
            s.executeUpdate("update food_item set stock_amount = stock_amount + '"+newStock+"' where Food_ID='"+foodID+"'");
          }
          if(n2<n1){
             newStock=String.valueOf(n1-n2);
             //reducing food quantity
            s.executeUpdate("update food_item set stock_amount = stock_amount - '"+newStock+"' where Food_ID='"+foodID+"'");
             
          }
          
          }
       
       }
    
    
    
    }
    
    
    
    
    
   catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
   }
    
 }
    
 public void cusStocksChange(String intialStock,String finalStock,String foodID){
    int n1=Integer.parseInt(intialStock);
    int n2=Integer.parseInt(finalStock);    
    String newStock;   
        
    try{
    Connection c = new BSDB().con();
    Statement s=c.createStatement();
    
    
    if(n1!=n2){
      int check=JOptionPane.showConfirmDialog(null,"Do you also want to change the stock food amount ? ","stock check",JOptionPane.YES_NO_OPTION);       
       if(check==JOptionPane.YES_OPTION){
          if(n2>n1){
              newStock=String.valueOf(n2-n1);
              //incrementing food quantity
            s.executeUpdate("update food_item set stock_amount = stock_amount - '"+newStock+"' where Food_ID='"+foodID+"'");
          }
          if(n2<n1){
             newStock=String.valueOf(n1-n2);
             //reducing food quantity
            s.executeUpdate("update food_item set stock_amount = stock_amount + '"+newStock+"' where Food_ID='"+foodID+"'");
             
          }
          
          }
       
       }
    
    
    
    }
    
    
    
    
    
   catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
   }
    
 }
    
    
void supDeleteStock(String stock,String foodID){
     int check=JOptionPane.showConfirmDialog(null,"Do you also want to change the stock food amount ? ","stock check",JOptionPane.YES_NO_OPTION);       
       if(check==JOptionPane.YES_OPTION){
          try{ 
           Connection c = new BSDB().con();
          Statement pst=c.createStatement();  
            //deleting from food_item table
          pst.executeUpdate("update food_item set stock_amount = stock_amount - '"+stock+"' where Food_ID = '"+foodID+"'");
          }
          catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
          
          }
       }
}
       
void cusDeleteStock(String stock,String foodID){
     int check=JOptionPane.showConfirmDialog(null,"Do you also want to change the stock food amount ? ","stock check",JOptionPane.YES_NO_OPTION);       
       if(check==JOptionPane.YES_OPTION){
          try{ 
           Connection c = new BSDB().con();
          Statement pst=c.createStatement();  
            //deleting from food_item table
          pst.executeUpdate("update food_item set stock_amount = stock_amount + '"+stock+"' where Food_ID = '"+foodID+"'");
          }
          catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
          
          }
       }     
       
       


}    
    
    
}
