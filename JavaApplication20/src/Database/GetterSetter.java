/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

/**
 *
 * @author Acer
 */
public class GetterSetter {
    
    
   public String createAccNo(String accType){
       String accountName="";
       String msID="";
       String accName="";
       switch(accType){
          
           case "MS": accountName="membersavings";
           break;
           case "NS": accountName="nonmembersavings";
           break;
           case "SS": accountName="samurdhidefinitesavings";
           break;
           case "GS": accountName="groupsavings";
           break;
           case "SH": accountName="shares";
           break;
           case "DS": accountName="diriyamathasavings";
           break;
           case "SI": accountName="sisuraka";
           break;
           case "KE": accountName="kekulu";
           break;
           case "LN": accountName="loandetails";
           break;   
       
       
       }
       
       
        ResultSet rs1=null;
        ResultSet rs2=null;
        
        try{

            
            Connection c = Dbconnection.mycon();
            Statement s=c.createStatement();
            Statement s1=c.createStatement();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
            
            if(accountName=="kekulu" || accountName=="sisuraka")accName="child";
            
            
            if(accountName=="kekulu")rs1=s1.executeQuery("select * from "+accName+" where AccNo LIKE 'K%'");
            else if(accountName=="sisuraka")rs1=s1.executeQuery("select * from "+accName+" where AccNo LIKE 'S%'");
            else rs1=s1.executeQuery("select * from "+accountName);
            
            
            
            
            if(rs1.last()){
              String y=rs1.getString("AccNo");
              
               int y1=Integer.parseInt(y.substring(2));
                //System.out.println(y1);
                 y = accType+String.format("%03d", y1+1);
                
                msID=y;
            }
            else{
                
                //System.out.println("no val");
            
           
            msID=accType+"001";
            
            }
            
            
        
        
        }
        
        catch(Exception e){
           
            JOptionPane.showMessageDialog(null, e);
       }
    
   
   
   
   return msID;
   }
   
   
   
   public double getInterest(String typeID){
    String y="0";
    boolean isLoanInt=false;
    boolean isAccInt=false;
    switch(typeID){
         
           case "MS":
         
           case "NS": 
           case "SS":
           case "GS": 
           case "SH": 
           case "DS": 
           case "SI": 
           case "KE": isAccInt=true;
           break;
           case "CU": 
           case "SE":
           case "LI":
           case "HO":isLoanInt=true;
           break;   
       
    
    
    }
        
        ResultSet rs1=null;
     try{
  
            Connection c = Dbconnection.mycon();
            Statement s1=c.createStatement();
          
           if(isAccInt)
           rs1=s1.executeQuery("select Interest from accountinfo where typeID='"+typeID+"'");
            
           if(isLoanInt)
           rs1=s1.executeQuery("select Interest from loaninfo where typeID='"+typeID+"'");

           if(rs1.next()){
               y=rs1.getString("Interest");
  
            }
  
  
     }
     catch(Exception e){
           JOptionPane.showMessageDialog(null, e);}
    
            
    return Double.parseDouble(y);
    }
   
       
  public  void createMember(String accID,String NIC){
        
    try{
      Connection c = Dbconnection.mycon();
            Statement s=c.createStatement();
    s.executeUpdate("insert into member values('"+accID+"','"+NIC+"v')");
    
    
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
    }
    
    public void createNonMember(String accID,String NIC){
        
    try{
      Connection c = Dbconnection.mycon();
            Statement s=c.createStatement();
    s.executeUpdate("insert into nonmember values('"+accID+"','"+NIC+"v')");
    
    
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
    }
    
    
    
    public boolean isaMember(String NIC){
    boolean isMem=false;
     
    try{
      Connection c = Dbconnection.mycon();
      Statement s=c.createStatement();
      ResultSet rs=s.executeQuery("select * from member where NIC='"+NIC+"v'");
      if(rs.first())isMem=true;
     
    
    }
    
    catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    
    
    
    return isMem;
    }
    
    
    public boolean isaNonMember(String NIC){
    boolean isNMem=false;
     
    try{
      Connection c = Dbconnection.mycon();
      Statement s=c.createStatement();
      ResultSet rs=s.executeQuery("select * from nonmember where NIC='"+NIC+"v'");
      if(rs.first())isNMem=true;
     
    
    }
    
    catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    
    
    
    return isNMem;
    }
    
    
    
    
    public void createSavingAccnts(String accType,String  date,JTextField NIC,boolean isaMem){
        
        String accountName="";
       String msID="";
       String realAccountName="";
       
       
       switch(accType){
          
           case "MS": accountName="membersavings"; realAccountName="Member Savings";
           break;
           case "NS": accountName="nonmembersavings";realAccountName="Non Member Savings";
           break;
           case "SS": accountName="samurdhidefinitesavings";realAccountName="Samurdhi Definite Savings";
           break;
           case "SH": accountName="shares";realAccountName="Shares";
           break;
           case "DS": accountName="diriyamathasavings";realAccountName="Diriya Matha Savings";
           break;
          // case "SI": accountName="sisuraka";
           //break;
          // case "KE": accountName="kekulu";
          // break;
              
    
       
       
       }
        
        
    
        ResultSet rs1=null;
        ResultSet rs2=null;
        if(!hasAccnt(accType,NIC.getText())){
        try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
             msID=createAccNo(accType);
            
             if(accType!="SS" )s2.executeUpdate("insert into "+accountName+" values('"+msID+"','"+date+"',0,0,0,'"+NIC.getText()+"v')");
             else             s2.executeUpdate("insert into "+accountName+" values('"+msID+"','"+date+"',0,0,'"+NIC.getText()+"v')");      
             
             if(isaMem ){
                 
                 
                 
                 createMember(msID,NIC.getText());
               if(accType=="MS"){
                   //createSavingAccnts("SH",date,NIC,true);
                String accT= createAccNo("SH") ;
               s2.executeUpdate("insert into shares values('"+accT+"','"+date+"',0,0,0,'"+NIC.getText()+"v')");
               createMember(accT,NIC.getText());
                 
               }
              //createMember(msID,NIC.getText());

             //if(isaMem)
             }
             else if(!isaMem ) createNonMember(msID,NIC.getText());
          
        JOptionPane.showMessageDialog(null, "New"+realAccountName+" AccNo. for NIC: "+NIC.getText()+"v is "+msID );
        
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
     }
       else JOptionPane.showMessageDialog(null, "The user :"+NIC.getText()+"v already has a "+accountName+ " account "); 
        
    
    }
    
    
    public String concatAddr(JTextField streetNo,JTextField street,JTextField town){
        return streetNo.getText()+","+street.getText()+","+town.getText();
        
     
     
    
    }
    public String[] expAddr(String tblName,JTextField NIC,JTextField accNo,boolean isaMem){
       String s[]={"","",""},origAddr = null,temp;
       String nic=NIC.getText()+"v";
       String accno=accNo.getText();
       try{
       Connection c = Dbconnection.mycon();
       Statement s2=c.createStatement();
       Statement s3=c.createStatement();
       ResultSet rs = null,rs1,rs2;
       if(!nic.isEmpty())rs= s2.executeQuery("select Address from "+tblName+" where NIC= '"+nic+"'");
       else if(!accno.isEmpty()){
           
           if(isaMem)rs1=s3.executeQuery("select NIC from member where AccNo='"+accno+"'");
           else      rs1=s3.executeQuery("select NIC from nonmember where AccNo='"+accno+"'");
           
           
           while(rs1.next())nic=rs1.getString("NIC");
           
          rs= s2.executeQuery("select Address from "+tblName+" where NIC= '"+nic+"'");
       
          
       }
       
       if(rs.next())origAddr=rs.getString("Address");
       
       
       
       
       
       }
       catch(Exception e){JOptionPane.showMessageDialog(null,e );}
        
     
     
    return expAddr(origAddr);
    }
    
    public String[] expAddr(String fullAddr){
    
    String st=fullAddr;
    String st1[]={"","",""},temp;
                
        temp=st.substring(0,st.indexOf(",", 0)); 
        st1[0]=temp;
        int fstComma=st.indexOf(",", 0);
        temp=st.substring(fstComma+1,st.indexOf(",", fstComma+1));
        st1[1]=temp;
        
        int scndComma=st.indexOf(",", fstComma+1);
        
        temp=st.substring(scndComma+1,st.length());
        st1[2]=temp;
        
        System.out.println(st1[0]+st1[1]+st1[2]);
    
    return st1;
    }
    
    public boolean hasAccnt(String accType,String NICnoV){
    
    String nic=NICnoV+"v";
    boolean hasAcc=true;
    String accountName="";
       String msID="";
       switch(accType){
          
           case "MS": accountName="membersavings";
           break;
           case "NS": accountName="nonmembersavings";
           break;
           case "SS": accountName="samurdhidefinitesavings";
           break;
           case "GS": accountName="groupsavingsmembers";
           break;
           case "SH": accountName="shares";
           break;
           case "DS": accountName="diriyamathasavings";
           break;
           case "SI": accountName="sisuraka";
           break;
           case "KE": accountName="kekulu";
           break;
           case "CUS": accountName="customer"; 
           break;
          case "GUR": accountName="guardian"; 
           break;
          case "LOAN": accountName="loandetails"; 
           break;
          case "STAMP": accountName="STAMP";
          break;
       }
       
       
        try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            if(accountName=="kekulu" ){
             ResultSet rs=s2.executeQuery("select * from child where   Type= 'KE' && gNIC = '"+nic+"'");
             if(!rs.first()){hasAcc=false;}
            }
            else if(accountName=="sisuraka"){
             ResultSet rs=s2.executeQuery("select * from child where Type= 'SI' && gNIC= '"+nic+"'");
             if(!rs.first()){hasAcc=false;}
            }
            else{
            ResultSet rs=s2.executeQuery("select * from "+accountName+" where NIC= '"+nic+"'");
            if(!rs.first()){hasAcc=false;}
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
    
    return hasAcc;
    }
    
    
    
    public boolean hasChildAccnt(String NICnoV,String name){
    
    String nic=NICnoV+"v";
    boolean hasAcc=true;
    String accountName="";
       String msID="";
       
       
       
        try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            
             ResultSet rs=s2.executeQuery("select * from child where   childName = '"+name+"' && gNIC = '"+nic+"'  ");
             if(!rs.first()){hasAcc=false;}
           
        
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
    
    return hasAcc;
    }
    
   public double depositCash(String accType,String accNo,Double amount){
        String accountName="";
        Double balance=0.0;
        switch(accType){
          
           case "MS": accountName="membersavings";
           break;
           case "NS": accountName="nonmembersavings";
           break;
           case "SS": accountName="samurdhidefinitesavings";
           break;
           case "GS": accountName="groupsavingsmembers";
           break;
           case "SH": accountName="shares";
           break;
           case "DS": accountName="diriyamathasavings";
           break;
           case "SI": accountName="sisuraka";
           break;
           case "KE": accountName="kekulu";
           break;
           case "CUS": accountName="customer"; 
           break;
          case "GUR": accountName="guardian"; 
           break;
       
       
       }
       
    
    try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
             ResultSet rs=s2.executeQuery("select * from "+accountName+" where   AccNo= '"+accNo+"'");
             if(rs.next()){
             
             double initDep=Double.parseDouble(rs.getString("DepositAmount"));
             double Total=Double.parseDouble(rs.getString("Total"));
             s3.executeUpdate("update "+accountName+" SET DepositAmount = '"+(initDep+amount)+"', Total = '"+(Total+amount)+"' where AccNo='"+accNo+"'");
             balance =Total + amount; 
             
             }
             else JOptionPane.showMessageDialog(null,"The specified Account Doesnt exist Deposit Terminated");
            
           
        
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
    
    return balance;
    }
    
    public Double  withDrawCash(String accType,String accNo,Double amount){
    double balance=0;
     String accountName="";
        switch(accType){
          
           case "MS": accountName="membersavings";
           break;
           case "NS": accountName="nonmembersavings";
           break;
           case "SS": accountName="samurdhidefinitesavings";
           break;
           case "GS": accountName="groupsavingsmembers";
           break;
           case "SH": accountName="shares";
           break;
           case "DS": accountName="diriyamathasavings";
           break;
           case "SI": accountName="sisuraka";
           break;
           case "KE": accountName="kekulu";
           break;
           case "CUS": accountName="customer"; 
           break;
          case "GUR": accountName="guardian"; 
           break;
       
       
       }
       
    
    try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
             ResultSet rs=s2.executeQuery("select * from "+accountName+" where   AccNo= '"+accNo+"'");
             if(rs.next()){
             
             double initWithdr=Double.parseDouble(rs.getString("WithDrawAmount"));
             double Total=Double.parseDouble(rs.getString("Total"));
             
             
             if((Total-amount)>0){
             s3.executeUpdate("update "+accountName+" SET  WithdrawAmount= '"+(initWithdr+amount)+"',Total='"+(Total-amount)+"' where AccNo='"+accNo+"'");
             balance = Total-amount;
             } 
             else  JOptionPane.showMessageDialog(null,"Withdrawel Terminated: AccBalance insufficient");
             }
             else JOptionPane.showMessageDialog(null," Deposit Terminated :The specified Account Doesnt exist");
            
           
        
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
    return balance;
    }
    
    
   public boolean hasCash(String accType,String nicNoV){
        String accountName=accTypeConv(accType);
        String nic=nicNoV+"v";
        boolean hasCash=false;
        try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
             ResultSet rs=s2.executeQuery("select * from "+accountName+" where   NIC= '"+nic+"'");
             if(rs.first()){
                 double Total=Double.parseDouble(rs.getString("Total"));
             
             
             
             if((Total)>0)hasCash=true;
             
             }
           
        
        
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
        
        
return hasCash;
}


    
    String accTypeConv(String accType){
    
         String accountName="";
        switch(accType){
          
           case "MS": accountName="membersavings";
           break;
           case "NS": accountName="nonmembersavings";
           break;
           case "SS": accountName="samurdhidefinitesavings";
           break;
           case "GS": accountName="groupsavingsmembers";
           break;
           case "SH": accountName="shares";
           break;
           case "DS": accountName="diriyamathasavings";
           break;
           case "SI": accountName="sisuraka";
           break;
           case "KE": accountName="kekulu";
           break;
           case "CUS": accountName="customer"; 
           break;
          case "GUR": accountName="guardian"; 
           break;
          case "CHINFO": accountName="child_info";
          break;
       
       }
       
    
    return accountName;
    }
    
   
     public String getAccNo(String accType,String NICnoV){
    
    String nic=NICnoV+"v";
    String accNo="";
    String accountName="";
       String msID="";
       switch(accType){
          
           case "MS": accountName="membersavings";
           break;
           case "NS": accountName="nonmembersavings";
           break;
           case "SS": accountName="samurdhidefinitesavings";
           break;
           case "GS": accountName="groupsavingsmembers";
           break;
           case "SH": accountName="shares";
           break;
           case "DS": accountName="diriyamathasavings";
           break;
           case "SI": accountName="sisuraka";
           break;
           case "KE": accountName="kekulu";
           break;
           case "CUS": accountName="customer"; 
           break;
          case "GUR": accountName="guardian"; 
           break;
       
       
       }
       
       
        try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            if(accountName=="kekulu" ){
             ResultSet rs=s2.executeQuery("select * from child where   Type= 'KE' && gNIC = '"+nic+"'");
             if(rs.first()){accNo=rs.getString("AccNo");}
            }
            else if(accountName=="sisuraka"){
             ResultSet rs=s2.executeQuery("select * from child where Type= 'SI' && gNIC= '"+nic+"'");
             if(rs.first()){accNo=rs.getString("AccNo");}
            }
            else{
            ResultSet rs=s2.executeQuery("select * from "+accountName+" where NIC= '"+nic+"'");
            if(rs.first()){accNo=rs.getString("AccNo");}
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
    
    return accNo;
    }
    
    
    public void transfAcc(JTextField nic1,String accType1,JTextField nic2,String accType2){
    
        GetterSetter gs1=new GetterSetter();
        String nic_1=nic1.getText()+"v";
        String nic_2=nic2.getText()+"v";
        
        String accName1=accTypeConv(accType1);
        String accName2=accTypeConv(accType2);
        String accNo1=getAccNo(accType1,nic1.getText());
        String accNo2=getAccNo(accType2,nic2.getText());
        
        double total1=0,total2=0;
        
        
       if(!hasAccnt(accType1,nic1.getText()))JOptionPane.showMessageDialog(null,"The specified Account Doesn't exist for nic1 ");
       else if(!hasAccnt(accType2,nic2.getText()))JOptionPane.showMessageDialog(null,"The specified Account Doesn't exist for nic2");
       else if( gs1.hasAccnt("MS", nic1.getText()) && (gs1.hasAccnt("GS", nic1.getText()) || gs1.hasAccnt("DS", nic1.getText()))){
            JOptionPane.showMessageDialog(null,"Please transfer other accounts before transferring Member savings ");

       }
       else{  
      try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
             Statement s4=c.createStatement();
             Statement s5=c.createStatement();
             Statement s6=c.createStatement();
            
            ResultSet rs=s2.executeQuery("select * from "+accName1+" where   AccNo= '"+accNo1+"'");
             if(rs.next()){
             
             
             total1=Double.parseDouble(rs.getString("Total"));
             
             
             }
             
             if(accName1=="membersavings"){
             ResultSet rs2=s3.executeQuery("select * from shares where   NIC = '"+nic_1+"'");
             if(rs2.next()){
             
             
             total2=Double.parseDouble(rs2.getString("Total"));
             
             
             }
             s4.executeUpdate("delete from shares where NIC = '"+nic_1+"'");
             s5.executeUpdate("delete from customer where NIC = '"+nic_1+"'");
             
             } 
           
              depositCash(accType2,accNo2,total1+total2);
            
          s4.executeUpdate("delete from "+accName1+" where accNo='"+accNo1+"'");
          
          if(isaMember(nic1.getText())){
          s4.executeUpdate("delete  from member where accNo='"+accNo1+"'");
          }
            
          
          
          else if(isaNonMember(nic1.getText())){
              s4.executeUpdate("delete from nonmember where accNo='"+accNo1+"'");
              ResultSet rs2=s5.executeQuery("select * from nonmember where NIC= '"+nic_1+"'");
              if(!rs2.first())s6.executeUpdate("delete from customer where NIC = '"+nic_1+"'");
              
          }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }  
        
        
       }
    }
    
    
    public void accDelete(String accType1,JTextField nic1){
    
    String nic_1=nic1.getText()+"v";
    
        String accName1=accTypeConv(accType1);
        
        String accNo1=getAccNo(accType1,nic1.getText());
        GetterSetter gs1=new GetterSetter();
        String nicNoV=nic1.getText();
        
        
       if(!hasAccnt(accType1,nic1.getText()))JOptionPane.showMessageDialog(null,"The specified Account Doesn't exist for nic1 ");
       
       else if( (gs1.hasAccnt("MS", nicNoV) && accType1=="MS") && (gs1.hasAccnt("GS", nicNoV) || gs1.hasAccnt("DS", nicNoV)))
            JOptionPane.showMessageDialog(null,"Please delete other accounts before deleting Member savings ");

       else{  
      try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
             Statement s4=c.createStatement();
             
             
             if(accName1=="membersavings"){
               
                    singleAccDel("MS",nic1.getText());
                    singleAccDel("SH",nic1.getText());
                    singleAccDel("CUS",nic1.getText());
             }
             
             
          
          
             else {
                 singleAccDel(accType1,nic1.getText());
             
             
             if(accType1=="NS"){
             if(!(isaNonMember(nic1.getText()))&& gs1.hasAccnt("CUS", nicNoV)) singleAccDel("CUS",nic1.getText());
             
             }
             }
         
        }
       
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }  
        
        
       }
    }
    
 
   public void singleAccDel(String accType,String nicNoV){
             String accName=accTypeConv(accType);                 
             GetterSetter gs1=new GetterSetter();
             
             if( gs1.hasAccnt("MS", nicNoV) && (gs1.hasAccnt("GS", nicNoV) || gs1.hasAccnt("DS", nicNoV)))
            JOptionPane.showMessageDialog(null,"Please delete other accounts before deleting Member savings ");
            
             else if(hasCash(accType,nicNoV))JOptionPane.showMessageDialog(null,"please empty the account before proceeding ");

             try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
            Statement s4=c.createStatement();
            Statement s5=c.createStatement();
             String nic=nicNoV+"v";
            
           
            
             

           
            
             
            s2.executeUpdate("delete from "+accName+" where NIC = '"+nicNoV+"v'");
             
             
             if(isaMember(nicNoV)){
                 s3.executeUpdate("delete from member where NIC = '"+nicNoV+"v'");

                 
             }
             
             else if(isaNonMember(nicNoV))s3.executeUpdate("delete from nonmember where NIC ='"+nicNoV+"v'");
           
            
             
             }
             catch(Exception e){JOptionPane.showMessageDialog(null, e);}
             
   }
   
   public void deleteChildAcc(String accType,String accNo){
   
       try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
            Statement s4=c.createStatement();
            Statement s5=c.createStatement();
            String nic="";
           String name="";
           if(accType=="KE" || accType=="SI"){
           
            ResultSet rs1=s2.executeQuery("select * from child where AccNo= '"+accNo+"'");
           if(rs1.first()){
               
               nic=rs1.getString("gNIC");
               name=rs1.getString("childName");
               
               
               s3.executeUpdate("delete from child_info where gNIC = '"+nic+"' && Name = '"+name+"'");
               
                ResultSet rs2=s4.executeQuery("select * from child where gNIC= '"+nic+"'");
           if(!rs2.first())s3.executeUpdate("delete from guardian where NIC = '"+nic+"'");
               
           
           
           
           
           
           }
           
           
          }
           
           else JOptionPane.showMessageDialog(null,"No child account records found for Acc No :"+accNo);
           
           
           }
           
          catch(Exception e){}
             
    
   
   }
   
   public String createLoanAcc(String loanType,String nicNoV,String gNIC,String name,String addr,String tpNo){
   double maxAmnt=0;
    String accNo="";   
             
       
       
       
       
       try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
            Statement s4=c.createStatement();
            Statement s5=c.createStatement();
            String nic=nicNoV+"v";
            String gnic=gNIC+"v";
             accNo=createAccNo("LN");
            
           //esultSet rs1=s4.executeQuery("select");
            
            
            
            
           
            s2.executeUpdate("insert into loandetails values('"+accNo+"','"+nic+"','0','0','0','0','0','"+loanType+"','no','0000-00-00')");
            s3.executeUpdate("insert into guaranter values('"+accNo+"','"+gnic+"','"+name+"','"+tpNo+"')");
            JOptionPane.showMessageDialog(null, "Records saved sucessfully");
           
       }
           
          catch(Exception e){e.printStackTrace();}
             
       
      
   return accNo;
   }
   
   
   public double getLoanMaxAmnt(String accType){
   double amnt=0;
   try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
            Statement s4=c.createStatement();
            Statement s5=c.createStatement();
           
            ResultSet rs1=s4.executeQuery("select * from loaninfo where Type='"+accType+"'");
            if(rs1.first())amnt=rs1.getDouble("MaxAmount");
            }
           
          catch(Exception e){e.printStackTrace();}
   return amnt;
   }
   
    public double getLoanMinAmnt(String accType){
   double amnt=0;
   try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
            Statement s4=c.createStatement();
            Statement s5=c.createStatement();
           
            ResultSet rs1=s4.executeQuery("select * from loaninfo where Type ='"+accType+"'");
            if(rs1.first())amnt=rs1.getDouble("MinAmount");
            }
           
          catch(Exception e){e.printStackTrace();}
   return amnt;
   }
   
   
      public double getLoanIntrst(String accType){
   double amnt=0;
   try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
            Statement s4=c.createStatement();
            Statement s5=c.createStatement();
           
            ResultSet rs1=s4.executeQuery("select * from loaninfo where Type ='"+accType+"'");
            if(rs1.first())amnt=rs1.getDouble("Interest");
            }
           
          catch(Exception e){e.printStackTrace();}
   return amnt;
   }
      
      
      public void setLoanIntrst(String accType,String amnt){
   
   try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
            Statement s4=c.createStatement();
            Statement s5=c.createStatement();
           
            s4.executeUpdate("update loaninfo set Interest = '"+amnt+"' where Type ='"+accType+"'");
            
   }
           
          catch(Exception e){e.printStackTrace();}
   
   
  
   
   }
      
      
      
      
   public void accountUpdater(String accType){
   
  //String accNames[]={"membersavings","nonmembersavings","samurdhidefinitesavings","groupsavings","shares","diriyamathasavings","sisuraka","kekulu"};

  String dsk[]={"diriyamathasavings","child"};
  String mgn[]={"membersavings","nonmembersavings","groupsavings"};
  String samShar[]={"samurdhidefinitesavings","shares"};
  
  String accNames[] = null;
  if(accType=="DSK"){accNames=dsk;}
  else if(accType=="MGN"){accNames=mgn;}
  else if(accType=="SamShar"){accNames=samShar;}
   
  try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
            Statement s4=c.createStatement();
            Statement s5=c.createStatement();
            String  startDate;
            String lastUpdate = null;
            String nextUpdate = null;
            double total=0.0,dep=0.0,interest=0.0;
            ResultSet rs1=s3.executeQuery("select * from updatedetails where type = '"+accType+"'");
            if(rs1.first()){
                lastUpdate=rs1.getString("LastUpdate");
                nextUpdate=rs1.getString("NextUpdate");
                interest=rs1.getDouble("Interest");
            } 
             LocalDate lastD=LocalDate.parse(lastUpdate);
             LocalDate nextD=LocalDate.parse(nextUpdate);
             LocalDate now=LocalDate.now();
             
            
           
           
               for(int i=0;i<accNames.length;i++){
                   
                 
               ResultSet rs=s2.executeQuery("select * from "+accNames[i]);
               ResultSet rs3=s5.executeQuery("select * from "+accNames[i]);
            if(rs3.first()){   
            while(rs.next()){
            String accNo=rs.getString("AccNo");
            startDate = rs.getString("StartDate");
            total=rs.getDouble("Total");
            dep=rs.getDouble("DepositAmount");
            LocalDate  startD= LocalDate.parse(startDate,DateTimeFormat.forPattern("MM/dd/yy"));
            
         
           if(startD.isBefore(lastD)){
               System.out.println(startD+" is before "+lastD);
             dep+=total*interest;
             total+=total*interest;
             
           s4.executeUpdate("update "+accNames[i]+" SET Total = '"+Math.ceil(total)+"', DepositAmount = '"+Math.ceil(dep)+"' where AccNo = '"+accNo+"'");
           }
        
            
            
            }
            }
                    
            
           }
        }
           
          catch(Exception e){e.printStackTrace();}
      }    
      
      
      

public void loanAccUpdater(){
    GetterSetter gs1=new GetterSetter();
     try{
      Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
            Statement s4=c.createStatement();
            Statement s5=c.createStatement();
            String  startDate;
            String lastUpdate = null;
            String nextUpdate = null;
            double total=0.0,dep=0.0,interest=0.0;
       ResultSet rs1=s3.executeQuery("select * from updatedetails where type = 'LOANS'");
            if(rs1.first()){
                lastUpdate=rs1.getString("LastUpdate");
                nextUpdate=rs1.getString("NextUpdate");
                //interest=rs1.getDouble("Interest");
            } 
             LocalDate lastD=LocalDate.parse(lastUpdate);
             LocalDate nextD=LocalDate.parse(nextUpdate);
             LocalDate now=LocalDate.now();
             Double instal,bal,amount;
             int noOfInst,remainInstal;
            String loanType="";
            ResultSet rs=s2.executeQuery("select * from loandetails where Issued = 'yes'");
            ResultSet rs3=s5.executeQuery("select * from loandetails where Issued = 'yes'");
            if(rs3.first()){   
            while(rs.next()){
            loanType=rs.getString("Type");
            String accNo=rs.getString("LoanID");
            startDate = rs.getString("StartDate");
            instal=rs.getDouble("Installment");
            remainInstal=rs.getInt("RemainingInstallment");
            noOfInst=rs.getInt("No_of_Installment");
            bal=rs.getDouble("RemainingAmount");
            amount=rs.getDouble("Amount");
            //dep=rs.getDouble("DepositAmount");
            LocalDate  startD= LocalDate.parse(startDate,DateTimeFormat.forPattern("MM/dd/yy"));
            
             interest=gs1.getLoanIntrst(loanType);
            
            
           if(startD.isBefore(lastD)){
               //System.out.println(startD+" is before "+lastD);
               
             amount+=instal*interest;
             bal+=instal*interest;
             instal=bal/remainInstal;
               
            // bal+=total*interest;
            // total+=total*interest;
             
           s4.executeUpdate("update loandetails SET Amount = '"+amount.intValue()+"', Installment = '"+instal.intValue()+"', RemainingAmount = '"+bal.intValue()+"' where LoanID = '"+accNo+"' ");
           }
     
     
     
     }
            }
     }
     catch(Exception e){e.printStackTrace();
     
     
     }




}


public void stampUpdater(){
   
  //String accNames[]={"membersavings","nonmembersavings","samurdhidefinitesavings","groupsavings","shares","diriyamathasavings","sisuraka","kekulu"};


  String accNames[] = {"membersavings","diriyamathasavings"};
   
   
  try{
         
            
            Connection c = Dbconnection.mycon();
            Statement s2=c.createStatement();
            Statement s3=c.createStatement();
            Statement s4=c.createStatement();
            Statement s5=c.createStatement();
            Statement s6=c.createStatement();
            Statement s7=c.createStatement();
            Statement s8=c.createStatement();
            String  startDate;
            String lastUpdate = null;
            String nextUpdate = null;
            double total=0.0,dep=0.0,interest=0.0;
            ResultSet rs1=s3.executeQuery("select * from updatedetails where type = 'STAMP'");
            if(rs1.first()){
                lastUpdate=rs1.getString("LastUpdate");
                nextUpdate=rs1.getString("NextUpdate");
               
            } 
             LocalDate lastD=LocalDate.parse(lastUpdate);
             LocalDate nextD=LocalDate.parse(nextUpdate);
             LocalDate now=LocalDate.now();
             
            
           
           
              
                   
                 
               ResultSet rs=s2.executeQuery("select * from  stamp where Eligible ='Yes' ");
               ResultSet rs3=s5.executeQuery("select * from stamp where Eligible = 'Yes'");
               
                if(rs3.first()){   
                  while(rs.next()){
                  String nic=rs.getString("NIC");
                  String savings=rs.getString("ForSavings");
                  String deposit=rs.getString("ForDeposit");
                  
                  
                  
                  ResultSet rs4=s3.executeQuery("select * from membersavings where NIC = '"+nic+"'");
                  
                  if(rs4.first()){
                              String accNo=rs4.getString("AccNo");
            startDate = rs4.getString("StartDate");
            total=rs4.getDouble("Total");
            dep=rs4.getDouble("DepositAmount");
            LocalDate  startD= LocalDate.parse(startDate,DateTimeFormat.forPattern("MM/dd/yy"));
            
         
           if(startD.isBefore(lastD)){
              // System.out.println(startD+" is before "+lastD);
             dep+=Double.parseDouble(savings );
             total+=Double.parseDouble(savings );
             
           s7.executeUpdate("update membersavings SET Total = '"+Math.ceil(total)+"', DepositAmount = '"+Math.ceil(dep)+"' where AccNo = '"+accNo+"'");
           }
        
                  
                  }
                  
                  
                  
                  
                  
                  ResultSet rs5=s4.executeQuery("select * from samurdhidefinitesavings where NIC = '"+nic+"'");
                  
                  
                  if(rs5.first()){
                              String accNo=rs5.getString("AccNo");
            startDate = rs5.getString("StartDate");
            total=rs5.getDouble("Total");
            dep=rs5.getDouble("DepositAmount");
            LocalDate  startD= LocalDate.parse(startDate,DateTimeFormat.forPattern("MM/dd/yy"));
            
         
           if(startD.isBefore(lastD)){
              // System.out.println(startD+" is before "+lastD);
             dep+=Double.parseDouble(deposit );
             total+=Double.parseDouble(deposit );
             
           s8.executeUpdate("update membersavings SET Total = '"+Math.ceil(total)+"', DepositAmount = '"+Math.ceil(dep)+"' where AccNo = '"+accNo+"'");
           }
        
                  
                  }
                  
                  
                  
                  
                  
                  
                  
                  }
                } 
               
        
                    
            
           
        }
           
          catch(Exception e){e.printStackTrace();}
      }    





}

   
      









     
    
    
    
    
    
    
    
   
    


    
    
    
    
    
    
    
    
    

