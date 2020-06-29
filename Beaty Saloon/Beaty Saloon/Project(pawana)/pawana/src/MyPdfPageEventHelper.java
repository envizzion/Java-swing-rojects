
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class MyPdfPageEventHelper extends PdfPageEventHelper {
    String fName;
    
    public MyPdfPageEventHelper(String imageName){
      fName=imageName; 
    
    }
    @Override
    public void onEndPage(PdfWriter pdfWriter, Document document) {
 
           System.out.println("Creating Waterwark Image in PDF");
           
           try {
                  
                  //Use this method if you want to get image from your Local system
                  Image waterMarkImage = Image.getInstance("F:/PROJECTS/Beaty Saloon/Beaty Saloon/Project(pawana)/pawana/report Images/"+fName+"");
                  
                //  String urlOfWaterMarKImage = "https://lh5.googleusercontent.com/"
                   //            + "koRHmyNXUGLIjtkHFOJ-1tE5KKl-vZAW3AWLlynkAZSY3Z9m9HBn"
                 //              + "boAPiakPTUiySX7W1I8xDwD4g49sD2JfgDDNJIPUdYVDWHfVomeh"
                  //             + "FJHWUk1tDPYlpiB32eZ5TDCKUAAZUIQ"   ;
                  
                  //Get waterMarkImage from some URL
                  //Image waterMarkImage = Image.getInstance(new URL(urlOfWaterMarKImage));
                  
                  //Get width and height of whole page
                  float pdfPageWidth = document.getPageSize().getWidth();
                  float pdfPageHeight = document.getPageSize().getHeight();
 
                  //Set waterMarkImage on whole page
                  pdfWriter.getDirectContentUnder().addImage(waterMarkImage,
                               pdfPageWidth, 0, 0, pdfPageHeight, 0, 0);
 
           }catch(Exception e){
                  e.printStackTrace();
           }
    }
}
 
/* OUTPUT of above program/Example -
 
Writing Paragraph to PDF
Creating Waterwark Image in PDF
PDF created in >> E:/Add Image As Watermark In Pdf.pdf
 
*/
    

