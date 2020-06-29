/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Acer
 */
public class FormValidate {
    
    public FormValidate(){
     
     
        
    
    
    }
    
    //    returns true if ends with '.com' and contains only one '@'
    public boolean validateEmail(String input) {
        if (input.endsWith(".com") && countCharacter(input, '@') == 1) {
            return true;
        }
        return false;
    }
    public boolean validateEmail_v(String input) {
        if (input.endsWith(".com") && countCharacter(input, '@') == 1) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "Invalid E-mail", "Error", 0);
        return false;
    }
//    returns true for alphanumeric inputs
    public boolean isAlphaNumeric(String input){
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }
    
//    returns true if input only contains letters
    public boolean isTextOnly(String input){
        char c;
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
//    returns true if input is alpha numeric except for dash
    public boolean dash_only(String input){
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isDigit(c) && !Character.isLetter(c) && c != '-') {
                return false;
            }
        }
        return true;
    }
    
//    returns true if NIC is valid
    public boolean validateNIC(String input){
        if(!(input.endsWith("V") || input.endsWith("v")) || input.length() != 10){
            return false;
        }
        for (int i = 0; i < input.length() - 1; i++) {
            char c = input.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        return true;
    }
    

     public boolean validateNIC_v(String input){
        if(!(input.endsWith("V") || input.endsWith("v")) || input.length() != 10){
            JOptionPane.showMessageDialog(null, "Invalid NIC", "Error", 0);
            return false;
        }
        for (int i = 0; i < input.length() - 1; i++) {
            char c = input.charAt(i);
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "Invalid NIC", "Error", 0);
                return false;
            }
        }
        
        return true;
    }
     
     
     public boolean ValidateNIC_no_V(JTextField field,boolean emptyCheck){
        String input=field.getText();
        
        
        
        if(input.isEmpty()){
            JOptionPane.showMessageDialog(null, "the field cannot be left empty ");
            if(emptyCheck==false)emptyCheck=true;
        }
        
        else if(!input.isEmpty()){
                for (int i = 0; i < input.length(); i++) {
            char c=input.charAt(i);
            if(!Character.isDigit(c)){
                 JOptionPane.showMessageDialog(null, "Invalid ID number ");
                 field.setText("");
                return false;
                
            }
          }
        }
        
        
        else if(input.length() != 10){
            JOptionPane.showMessageDialog(null, "Please enter 10 digits ");
            field.setText("");
            return false;
        }

        return true;
   
    }
     
     
    
    
    public boolean isEmptyField(JTextField field/*, String err*/){
        if (field.getText().isEmpty()) {
           // JOptionPane.showMessageDialog(null, (err + " cannot be empty"), "Error", 0);
            field.grabFocus();
            return true;
        }
        return false;
    }
    
    
    private int countCharacter(String text, char key){
        int count = 0;
        char c;
        
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            if (c == key) {
                count++;
            }
        }
        return count;
    }
   /*
    public boolean ValidatePhone(JTextField field){
        String input=field.getText();
        
        
        
        if(input.isEmpty()){
            JOptionPane.showMessageDialog(null, "the field cannot be left empty ");
            
        }
        
        else if(!input.isEmpty()){
                for (int i = 0; i < input.length(); i++) {
            char c=input.charAt(i);
            if(!Character.isDigit(c)){
                 JOptionPane.showMessageDialog(null, "Invalid Phone number ");
                 field.setText("");
                return false;
                
            }
          }
        }
        
        else if(input.length() != 10){
            JOptionPane.showMessageDialog(null, "Please enter 10 digits ");
            field.setText("");
            return false;
        }

        
        return true;
   
    }
    */
    
  
    
    
        
    public void validatePhoneKeyEvt(java.awt.event.KeyEvent evt,JTextField f){
    
    char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE){
        evt.consume();
        }
        else if(f.getText().length()>9){
        
        evt.consume();
        
    

        }
        
        
          
        else{
        f.addFocusListener(new FocusAdapter() {
         public void focusLost(FocusEvent e) {
             
         if(f.getText().length()<9){
         f.setText("");
         }  
         }
       });
       
        }
    }  
    
    
     public void validateNumOnlyKeyEvt(java.awt.event.KeyEvent evt,JTextField f){
    
    char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE){
        evt.consume();
         
        }
    }  
    
    
      public void validateNICKeyEvt(java.awt.event.KeyEvent evt,JTextField f){
    
    char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE){
        evt.consume();
        }
        else if(f.getText().length()>8){
        
        evt.consume();
        
    

        }
        
        
          
        else{
        f.addFocusListener(new FocusAdapter() {
         public void focusLost(FocusEvent e) {
             
         if(f.getText().length()<9){
         f.setText("");
         }  
         }
       });
       
        }
    } 
      
      
      
      
        public void validateNameKeyEvt(java.awt.event.KeyEvent evt,JTextField f){
    
    char c=evt.getKeyChar();
        if( !(Character.isLetter(c)) || c==KeyEvent.VK_DELETE){
       
        if(c!=' ') evt.consume();
        }
        
        
        
          
    }  
    
   public void validateTextOnlyKeyEvt(java.awt.event.KeyEvent evt,JTextField f){
    
    char c=evt.getKeyChar();
        if( (!Character.isLetter(c)) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE){
        evt.consume();
        }
        
        
    

        }
        
   
   
   /*JTextField farr[]={jTextField8,jTextField17,jTextField27,jTextField30};
        if(!f1.FieldsAreEmpty(farr)){*/
   public boolean FieldsAreEmpty(JPanel jp){
    JTextField[] fArr= getTFieldArrFromPanel(jp);
   boolean isEmpty=false;
   for(int i=0;i<fArr.length;i++){
     if(fArr[i].getText().isEmpty()){
         
          fArr[i].grabFocus();
          isEmpty=true;
         JOptionPane.showMessageDialog(null, "non of the fields cannot be left empty ");
         break;
         
         
   }
   
   
   } 
   return isEmpty;       
   } 
   
  public void validateDigitOnlyKeyEvt(java.awt.event.KeyEvent evt,JTextField f){
    
    char c=evt.getKeyChar();
        if( (!Character.isDigit(c)) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE){
        evt.consume();
        }
        
        
    

        }
  
  public void validateStreetNoKeyEvt(java.awt.event.KeyEvent evt,JTextField f){
    
    char c=evt.getKeyChar();
        if( !(Character.isLetterOrDigit(c)) ||  c==KeyEvent.VK_DELETE || c==KeyEvent.VK_BACK_SPACE ){
          if( !(c==KeyEvent.VK_SLASH) )  evt.consume();
        
        
        }
   
   
  }
  
  
  
        public void validateAccNoKeyEvt(java.awt.event.KeyEvent evt,JTextField f){
    
    char c=evt.getKeyChar();
        if(!(Character.isLetterOrDigit(c)) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE){
        evt.consume();
        }
        else if(f.getText().length()>5){
        
        evt.consume();
        
    

        }
        
        
          
        else{
        f.addFocusListener(new FocusAdapter() {
         public void focusLost(FocusEvent e) {
             
         if(f.getText().length()<5){
         f.setText("");
         }  
         }
       });
       
        }
    }
  
  
  public void clearTextFields(JTextField f[]){

for(int i=0;i<f.length;i++){
f[i].setText("");
}
  } 
  
  
  
  
 public void clearPanelTextFields(JPanel jp){
  Component[] components = jp.getComponents();
    for (Component component : components) {
        if (component instanceof JTextField || component instanceof JTextArea) {
            JTextComponent specificObject = (JTextComponent) component;
            specificObject.setText("");
       } 
    }
 }
 
 
 
 

 
 public JTextField[] getTFieldArrFromPanel(JPanel jp){
   Component[] components = jp.getComponents();
   int size=0;
    for (Component component : components) {
        if (component instanceof JTextField )size++; 
    }
    JTextField[] arr=new JTextField[size];
    int count=0;
   for (Component component : components) {
        if (component instanceof JTextField ) {
            JTextField specificObject = (JTextField) component;
            arr[count]=specificObject;
            count++;
        }

    }
     System.out.println(count);
   return arr;
 }
 
 public JCheckBox[] getTCheckBoxArrFromPanel(JPanel jp){
   Component[] components = jp.getComponents();
   int size=0;
    for (Component component : components) {
        if (component instanceof JCheckBox )size++; 
    }
    JCheckBox[] arr=new JCheckBox[size];
    int count=0;
   for (Component component : components) {
        if (component instanceof JCheckBox ) {
            JCheckBox specificObject = (JCheckBox)component;
            arr[count]=specificObject;
            count++;
        }

    }
     System.out.println(count);
   return arr;
 }
}
    
    /*
    public void validateP(JTextField f){
    
    
       if(f.getText().length()<10){
        
        f.addFocusListener(new FocusAdapter() {
         public void focusLost(FocusEvent e) {
             
            
        JOptionPane.showMessageDialog(null, "it works ");
             
         }
       });*/
        
        
  
    


