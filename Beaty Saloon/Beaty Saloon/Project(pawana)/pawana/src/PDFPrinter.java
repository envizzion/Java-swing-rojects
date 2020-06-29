/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.ResultSet;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.CMYKColor;


import com.itextpdf.text.pdf.PdfPTable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nipuna
 */
public class PDFPrinter {
    SQLHandler sql;
 
 void PDFPrinter(){
     sql=new SQLHandler(); 
}    
    
 public void printPDF(String topic,String query,String[] arr,String fileName){
    final  int  NoOfCol=arr.length;
     System.out.println(NoOfCol);
    SQLHandler sq=new SQLHandler(); 
        
        System.out.println("sdfsdf");
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(fileName+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();
        Document document = new Document(PageSize.A4,50, 50, 50, 50);
        
        //Creation of PdfWriter object
        try {
            
            PdfWriter writer = PdfWriter.getInstance(document,
            new FileOutputStream(filePath));
            document.open();
        } catch (Exception e) {
            System.out.println(e);
        }
        Image img = null;

           // try {
               // document.add(img);
           // } catch (DocumentException ex) {
              //  Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
            //}
        Paragraph title1 = new Paragraph("                 WEERASINGHE STORES                     ", 
        FontFactory.getFont(FontFactory.TIMES_ROMAN, 
        24, Font.BOLDITALIC,new CMYKColor(10, 520,80,90)));
        Chapter chapter1 = new Chapter(title1, 1);
        chapter1.setNumberDepth(0);     
        float Telephone = 0;
        
        Paragraph title2 = new Paragraph("                                                                                                        Telephone No:- 0785554054", 
        FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLDITALIC,new CMYKColor(210, 390, 67,90)));
        Chapter chapter2 = new Chapter(title2,1);
        chapter1.setNumberDepth(0);     
            try{
        document.add(title1);
        document.add(title2);
            PdfPTable t = new PdfPTable(NoOfCol); 
            PdfPTable t1 = new PdfPTable(5); 
            t.setSpacingBefore(50);
            t.setSpacingAfter(50);
            
            t1.setSpacingBefore(20);
            t1.setSpacingAfter(5);

             //dialog.setSelectedFile(new File("spareparts.pdf"));
             
                                     Paragraph title3 = new Paragraph( topic        , 
            FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.ITALIC,new CMYKColor(33,680,565,91)));
            Chapter chapter3 = new Chapter(title3, 1);
            chapter1.setNumberDepth(0);
           document.add(title3);
          document.add(new Paragraph(""));
       
           ResultSet rs=sq.getResultSet(query); 
       Font redFont=new Font(Font.FontFamily.TIMES_ROMAN,12,Font.ITALIC|Font.UNDERLINE,BaseColor.RED);   
       for(int i=0;i<NoOfCol;i++){
             Phrase chunk =new Phrase(arr[i],redFont);
              t.addCell(chunk);
              }  
                System.out.println("4");
          while(rs.next()){
             
              for(int i=0;i<NoOfCol;i++){
                t.addCell(rs.getString(i+1));
                 
              }
              System.out.println("");
          } 
                
                
                
                document.add(t);
                
                document.close();
            }
            catch(Exception e){e.printStackTrace();}

 
         
    }
        
     
        
        
   
    
        
 }
 

 
  public void printIncome(String topic,String fileName,String retail,String whole,PdfPTable retTable,PdfPTable whTable){
    
    String total=String.valueOf(Float.parseFloat(whole)+Float.parseFloat(retail));
    
    
    SQLHandler sq=new SQLHandler(); 
        
       
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(fileName+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();
        Document document = new Document(PageSize.A4,50, 50, 50, 50);
        
        //Creation of PdfWriter object
        try {
            
            PdfWriter writer = PdfWriter.getInstance(document,
            new FileOutputStream(filePath));
            document.open();
        } catch (Exception e) {
            System.out.println(e);
        }
        Image img = null;

           // try {
               // document.add(img);
           // } catch (DocumentException ex) {
              //  Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
            //}
        Paragraph title1 = new Paragraph("                 WEERASINGHE STORES                     ", 
        FontFactory.getFont(FontFactory.TIMES_ROMAN, 
        24, Font.BOLDITALIC,new CMYKColor(10, 520,80,90)));
        Chapter chapter1 = new Chapter(title1, 1);
        chapter1.setNumberDepth(0);     
        float Telephone = 0;
        
        Paragraph title2 = new Paragraph("                                                                                                        Telephone No:- 0785554054", 
        FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLDITALIC,new CMYKColor(210, 390, 67,90)));
        Chapter chapter2 = new Chapter(title2,1);
        chapter1.setNumberDepth(0);     
            try{
        document.add(title1);
        document.add(title2);
        
        document.add(new Paragraph(""));
        document.add(getPara("Retail Sales Table","L"));
        document.add(retTable);
        document.add(getPara("Total:"+retail,"R"));
        
        document.add(new Paragraph(""));
        document.add(getPara("WholeSale Table","L"));
        document.add(retTable);
        document.add(getPara("Total:Rs"+whole,"R"));
        
         document.add(new Paragraph(" "));
         document.add(new Paragraph(" "));
         document.add(getPara("Overall Income: Rs"+total,"R"));
        document.close();
            }
            catch(Exception e){e.printStackTrace();}

 
         
    }
  }     
        
   public void printBillCatering(String topic,String fileName,String Total,String[] columns,ArrayList<String[]> data,String today,String reqDay,String advance,String orderID,String cusID,String repName){
    
    String total=Total;
    
    
    SQLHandler sq=new SQLHandler(); 
        
       
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(fileName+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();
        Document document = new Document(PageSize.A4,50, 50, 140, 140);
        
        //Creation of PdfWriter object
        try {
            
            PdfWriter writer = PdfWriter.getInstance(document,
            new FileOutputStream(filePath));
            document.open();
            writer.setPageEvent(new MyPdfPageEventHelper(repName));
        } catch (Exception e) {
            System.out.println(e);
        }
        


        
        PdfPTable billTable=getArrayListTable(columns,data);
        
        String remain=String.valueOf(Float.parseFloat(total)-Float.parseFloat(advance));
       
       // String cusName=sql.getSingleResult("select Name from customer where cusID='"+cusID+"';");
         //   System.out.println(cusName);
       
            try{
                
       document.add(this.getPara ("Issued Date: "+today+"     Requested Date: "+reqDay,"R"));
       document.add(Chunk.NEWLINE);         
       document.add(this.getTitle(topic, "C"));
       document.add(Chunk.NEWLINE);
       document.add(this.getPara("Order ID: "+orderID+"      Customer Name: "+cusID,"L"));
 
        document.add(billTable);
        document.add(getPara("Total            : Rs."+total,"R"));
        document.add(Chunk.NEWLINE);
        document.add(getPara("Advance          : Rs."+advance,"R"));
        document.add(Chunk.NEWLINE);
        document.add(getPara("Remaining Payment: Rs."+remain,"R"));  
        document.close();
            }
            catch(Exception e){e.printStackTrace();}

 
         
    }     
        
        
 }   
   
   
   
   
   
      public void printBillWedding(String topic,String fileName,String Total,String[] columns,ArrayList<String[]> data,String today,String reqDay,String advance,String orderID,String cusID,String repName){
    
    String total=Total;
    
    
    SQLHandler sq=new SQLHandler(); 
        
       
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(fileName+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();
        Document document = new Document(PageSize.A4,50, 50, 140, 140);
        
        //Creation of PdfWriter object
        try {
            
            PdfWriter writer = PdfWriter.getInstance(document,
            new FileOutputStream(filePath));
            document.open();
            writer.setPageEvent(new MyPdfPageEventHelper(repName));
        } catch (Exception e) {
            System.out.println(e);
        }
        


        
        PdfPTable billTable=getArrayListTable(columns,data);
        
        String remain=String.valueOf(Float.parseFloat(total)-Float.parseFloat(advance));
       
       // String cusName=sql.getSingleResult("select Name from customer where cusID='"+cusID+"';");
         //   System.out.println(cusName);
       
            try{
                
       document.add(this.getPara ("Issued Date: "+today+"     Requested Date: "+reqDay,"R"));
       document.add(Chunk.NEWLINE);         
       document.add(this.getTitle(topic, "C"));
       document.add(Chunk.NEWLINE);
       document.add(this.getPara("Order ID: "+orderID+"      Customer Name: "+cusID,"L"));
 
        document.add(billTable);
        document.add(getPara("Total            : Rs."+total,"R"));
        document.add(Chunk.NEWLINE);
        document.add(getPara("Advance          : Rs."+advance,"R"));
        document.add(Chunk.NEWLINE);
        document.add(getPara("Remaining Payment: Rs."+remain,"R"));  
        document.close();
            }
            catch(Exception e){e.printStackTrace();}

 
         
    }     
        
        
 }  
   
 public void printBillSaloon1(String topic,String fileName,String Total,String[] columns,ArrayList<String[]> data,String today,String orderID,String cusID,String reportName){
    
    String total = Total;
    
    
    SQLHandler sq=new SQLHandler(); 
        
       
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(fileName+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();
        Document document = new Document(PageSize.A4,50, 50, 140, 140);
        
        //Creation of PdfWriter object
        try {
            
            PdfWriter writer = PdfWriter.getInstance(document,
            new FileOutputStream(filePath));
            document.open();
            writer.setPageEvent(new MyPdfPageEventHelper(reportName));
        } catch (Exception e) {
            System.out.println(e);
        }
        


        
        PdfPTable billTable=getArrayListTable(columns,data);
        
       
       
       // String cusName=sql.getSingleResult("select Name from customer where cusID='"+cusID+"';");
         //   System.out.println(cusName);
       
            try{
                
       document.add(this.getPara ("Issued Date: "+today,"R"));
       document.add(Chunk.NEWLINE);         
       document.add(this.getTitle(topic, "C"));
       document.add(Chunk.NEWLINE);
       document.add(this.getPara("Order ID: "+orderID+"      Customer Name: "+cusID,"L"));
 
        document.add(billTable);
        document.add(getPara("Total            : Rs."+total,"R"));
        
 
        document.close();
            }
            catch(Exception e){e.printStackTrace();}

 
         
    }     
        
        
 }  
 
 
 public void printDetails(String topic,String fileName,String[] columns,String query,String today,String reportName){
    
   
    
    
    SQLHandler sq=new SQLHandler(); 
        
       
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(fileName+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();
        Document document = new Document(PageSize.A4,50, 50, 140, 140);
        
        //Creation of PdfWriter object
        try {
            
            PdfWriter writer = PdfWriter.getInstance(document,
            new FileOutputStream(filePath));
            document.open();
            writer.setPageEvent(new MyPdfPageEventHelper(reportName));
        } catch (Exception e) {
            System.out.println(e);
        }
        


        
        PdfPTable billTable=this.getTable(query, columns,"BIG");
        
       
       
       // String cusName=sql.getSingleResult("select Name from customer where cusID='"+cusID+"';");
         //   System.out.println(cusName);
       
            try{
                
       document.add(this.getPara ("Issued Date: "+today,"R"));
       document.add(Chunk.NEWLINE);         
       document.add(this.getTitle(topic, "C"));
       document.add(Chunk.NEWLINE);
       document.add(billTable);
       document.close();
            }
            catch(Exception e){e.printStackTrace();}
   }     
        
        
 }  
 
 
 
 
 
 public void printIncomeExpen(String topic,String fileName,String[] columns,String total,String query,String today,String from,String to, String reportName){
    
   
    
    
    SQLHandler sq=new SQLHandler(); 
        
       
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(fileName+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();
        Document document = new Document(PageSize.A4,50, 50, 140, 140);
        
        //Creation of PdfWriter object
        try {
            
            PdfWriter writer = PdfWriter.getInstance(document,
            new FileOutputStream(filePath));
            document.open();
            writer.setPageEvent(new MyPdfPageEventHelper(reportName));
        } catch (Exception e) {
            System.out.println(e);
        }
        


        
        PdfPTable billTable=this.getTable(query, columns,"BIG");
        
       
       
       // String cusName=sql.getSingleResult("select Name from customer where cusID='"+cusID+"';");
         //   System.out.println(cusName);
       
            try{
                
       document.add(this.getPara ("Issued Date: "+today,"R"));
       document.add(Chunk.NEWLINE);         
       document.add(this.getTitle(topic, "C"));
       document.add(Chunk.NEWLINE);
       document.add(getPara("From :"+from+"         To:"+to,"L"));
       
       document.add(billTable);
       
       document.add(getPara("Total :Rs."+total,"R"));
       document.close();
            }
            catch(Exception e){e.printStackTrace();}
   }     
        
        
 }  
 
 
 
 public void printOverAll(String topic,String fileName,String[] income,String[] exp,String profit,String today,String from,String to,String reportName){
    
   
    
    
    SQLHandler sq=new SQLHandler(); 
        
       
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(fileName+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();
        Document document = new Document(PageSize.A4,50, 50, 140, 140);
        
        //Creation of PdfWriter object
        try {
            
            PdfWriter writer = PdfWriter.getInstance(document,
            new FileOutputStream(filePath));
            document.open();
            writer.setPageEvent(new MyPdfPageEventHelper(reportName));
        } catch (Exception e) {
            System.out.println(e);
        }
        


        
      
      
       
      
        PdfPTable t = new PdfPTable(3); 
           
            t.setSpacingBefore(50);
            t.setSpacingAfter(50);
      
    
       Font redFont=new Font(Font.FontFamily.TIMES_ROMAN,16,Font.BOLD,BaseColor.MAGENTA);  
       Font magFont=new Font(Font.FontFamily.TIMES_ROMAN,18,Font.BOLD,BaseColor.MAGENTA);
       
         try{
             Phrase sect=new Phrase("Sections",redFont);
             Phrase incom =new Phrase("Income",redFont);
             Phrase expens=new Phrase("Expenses",redFont);
             Phrase cater=new Phrase("Catering",redFont);
             Phrase Wedd=new Phrase("Wedding",redFont);
             Phrase salon=new Phrase("Saloon",redFont);
             Phrase tot=new Phrase("TOTAL",redFont);
             
             
              t.addCell(sect);t.addCell(incom);t.addCell(expens);
              t.addCell(cater);t.addCell(income[0]);t.addCell(exp[0]);
              t.addCell(salon);t.addCell(income[1]);t.addCell(exp[1]);
              t.addCell(Wedd);t.addCell(income[2]);t.addCell(exp[2]);
              t.addCell(tot);t.addCell(income[3]);t.addCell(exp[3]);
          }
          catch(Exception e)
          {e.printStackTrace();}
        
       
       
       // String cusName=sql.getSingleResult("select Name from customer where cusID='"+cusID+"';");
         //   System.out.println(cusName);
       
            try{
                
       document.add(this.getPara ("Issued Date: "+today,"R"));
       document.add(Chunk.NEWLINE);         
       document.add(this.getTitle(topic, "C"));
       document.add(Chunk.NEWLINE);
       document.add(getPara("From :"+from+"         To:"+to,"L"));
       
       document.add(t);
       
       Phrase prof=new Phrase("NET PROFIT : Rs."+profit,magFont);
       
       document.add(prof);
      
       document.close();
            }
            catch(Exception e){e.printStackTrace();}
   }     
        
        
 }  
   
   
 
    void printPDF(String date, String supplier_name, String contact_no, String receipt_Details, String select_nametypebrandWholesale_priceretail, String[] arr, String return_stoc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void printPDF(String receipt_Details, String select_datesupplier_namecontact_nonametyp, ResultSet rs, String return_stoc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void printPDF(String receipt_Details, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    



   Paragraph getTitle(String str,String allign){
        Paragraph title1 = new Paragraph(str, 
        FontFactory.getFont(FontFactory.TIMES_ROMAN, 
        20, Font.BOLDITALIC,BaseColor.DARK_GRAY));
        Chapter chapter1 = new Chapter(title1, 1);
        
        switch(allign){
            case "L":title1.setAlignment(Element.ALIGN_LEFT);
            break;
            case "R":title1.setAlignment(Element.ALIGN_RIGHT);
            break;
            case "C":title1.setAlignment(Element.ALIGN_CENTER);
            break;
            
        }
        
        return title1;
 
 }   
   
   Paragraph getTitle2(String str){
        Paragraph title1 = new Paragraph(str, 
        FontFactory.getFont(FontFactory.TIMES_ROMAN, 
        12, Font.NORMAL,BaseColor.DARK_GRAY));
        Chapter chapter1 = new Chapter(title1, 1);
        
        return title1;
 
 }   
 
   Paragraph getPara(String str,String allign){
        Paragraph title2 = new Paragraph(str,
        FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLACK));
        
         switch(allign){
            case "L":title2.setAlignment(Element.ALIGN_LEFT);
            break;
            case "R":title2.setAlignment(Element.ALIGN_RIGHT);
            break;
            case "C":title2.setAlignment(Element.ALIGN_CENTER);
            break;
            
        }
        
   return title2;
   }
   
      
  PdfPTable getTable(String query,String[] ColumnNames,String size){
      int NoOfCol=ColumnNames.length;
      String[] arr=ColumnNames;
        SQLHandler sq=new SQLHandler();
      
        PdfPTable t = new PdfPTable(NoOfCol); 
           t.setSpacingBefore(50);
            t.setSpacingAfter(50);
            
        if(size.equals("NORMAL")){
            
        }
        else {
         t.setWidthPercentage(100);
        }
      ResultSet rs=sq.getResultSet(query); 
       Font blackFont=new Font(Font.FontFamily.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK);   
       for(int i=0;i<NoOfCol;i++){
             Phrase chunk =new Phrase(arr[i],blackFont);
              t.addCell(chunk);
              }  
           
            System.out.println("4");
          try{
            while(rs.next()){
             
              for(int i=0;i<NoOfCol;i++){
                t.addCell(rs.getString(i+1));
                 
              }
              System.out.println("");
          }
          }
          catch(Exception e)
          {e.printStackTrace();}
          
          return t;
  } 
   
  
  PdfPTable getArrayListTable(String[] ColumnNames,ArrayList<String[]> data){
      int NoOfCol=ColumnNames.length;
      String[] arr=ColumnNames;
       
      
        PdfPTable t = new PdfPTable(NoOfCol); 
           
            t.setSpacingBefore(50);
            t.setSpacingAfter(50);
      
    
       Font redFont=new Font(Font.FontFamily.TIMES_ROMAN,14,Font.BOLD|Font.UNDERLINE,BaseColor.BLACK);   
       for(int i=0;i<NoOfCol;i++){
             Phrase chunk =new Phrase(arr[i],redFont);
              t.addCell(chunk);
              }  
           
            System.out.println("4");
          try{
           for(int i=0;i<data.size();i++){
               String[] tmp=data.get(i);
              for(int j=0;j<NoOfCol ;j++){
                  t.addCell(tmp[j]);
              }
            
           }
          }
          catch(Exception e)
          {e.printStackTrace();}
          
          return t;
  } 


















}



