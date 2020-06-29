
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Queries {
     FormValidate f1;
   SQLHandler sql=null;
   
 Queries(){
   sql=new SQLHandler();
 }  
   
 public boolean  getItemAvailability(String itemID,String type,String date){
      return sql.isResultAvail("select * from item_order_dates where item_id='"+itemID+"' and item_type = '"+type+"' and date ='"+date+"';");
      
   }
  

 
  public void  deleteOrderDate(String itemID,String type,String date){
     String[] ss={itemID,type,date};
       sql.queryPass("delete from item_order_dates where item_id='"+itemID+"' and item_type = '"+type+"' and date ='"+date+"';","update");
   
   }
 
  
   public ArrayList<String> removeDuplicates(ArrayList<String> list) 
    { 
  
        // Create a new LinkedHashSet 
        Set<String> set = new LinkedHashSet<>(); 
  
        // Add the elements to set 
        set.addAll(list); 
  
        // Clear the list 
        list.clear(); 
  
        // add the elements of set 
        // with no duplicates to the list 
        list.addAll(set); 
  
        // return the list 
        return list; 
    } 
   
 void add_JewelorDress_Order(String cusID,ArrayList<String> data,String today,String ReqDay,String advance){
     float sum=0;  
     for(String str:data){
                   String[] vals=str.split("-");
                    sum+=Float.parseFloat(vals[2]);      
                   
               }   
     String[] orderVals={cusID,today,ReqDay,"jewel_dress",advance,String.valueOf(sum)};
       sql.addNewRowNoID("order_requests",orderVals);
     
    String ordID=sql.getSingleResult("select orderID from order_requests order by orderID desc limit 1");
        for(String str:data){
                   String[] vals=str.split("-");
        String[] valss={vals[0],ordID,vals[1],ReqDay};           
          sql.addNewRow("item_order_dates", valss);
               
        }   
     
          
 
}  
 
 
 void add_decor_Group_Order(String cusID,ArrayList<String> data,String today,String ReqDay,String advance){
     float sum=0;  
     for(String str:data){
                   String[] vals=str.split("-");
                    sum+=Float.parseFloat(vals[2]);      
                   
               }   
     String[] orderVals={cusID,today,ReqDay,"decor_group",advance,String.valueOf(sum)};
       sql.addNewRowNoID("order_requests",orderVals);
     
    String ordID=sql.getSingleResult("select orderID from order_requests order by orderID desc limit 1");
        for(String str:data){
                   String[] vals=str.split("-");
        String[] valss={vals[0],ordID,vals[1],ReqDay};           
          sql.addNewRow("item_order_dates", valss);
               
        }   
     
          
 
}  
  
public void add_emp_release_Order(String cusID,ArrayList<String> data,String today){
     float sum=0;  
     for(String str:data){
                   String[] vals=str.split("-");
                    sum+=Float.parseFloat(vals[3]);      
                   
               }   
     String[] orderVals={cusID,String.valueOf(sum),today};
       sql.addNewRowNoID("supplier_orders",orderVals);
        
    String ordID=sql.getSingleResult("select order_ID from supplier_orders order by order_ID desc limit 1");
        for(String str:data){
                   String[] vals=str.split("-");
        String[] valss={ordID,vals[0],vals[2]};           
          sql.addNewRow("supplier_order_items", valss);
          sql.queryPass("update stock set Quantity= Quantity + '"+vals[2]+"' where id='"+vals[0]+"';", "update");
        }   
     
          
 
}  


public void add_catering_Order(String cusID,ArrayList<String> data,String today,String reqDay,String advance){
     float sum=0;  
     for(String str:data){
                   String[] vals=str.split("-");
                    sum+=Float.parseFloat(vals[3]);      
                   
               }   
     String[] orderVals={cusID,advance,String.valueOf(sum),reqDay};
       sql.addNewRowNoID("catering_orders",orderVals);
        
    String ordID=sql.getSingleResult("select order_ID from catering_orders order by order_ID desc limit 1");
        for(String str:data){
                   String[] vals=str.split("-");
        String[] valss={ordID,vals[0],vals[2]};           
          sql.addNewRow("catering_order_items", valss);
        }   
     
          
 
}
/*
ArrayList<String[]> getIncome(String section){
      ArrayList<String[]> ls=new ArrayList<String[]>();
      ResultSet rs=null;
      
      try{
      switch(section){
          case "catering":{
             rs=sql.getResultSet("select ");
          }
      }
      }
      catch(Exception e){e.printStackTrace();}
      

}*/
 
}
