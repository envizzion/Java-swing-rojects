/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputVerify;
import java.awt.*;
 import java.util.*;
 import java.awt.event.*;
 import javax.swing.*;

/**
 *
 * @author Acer
 */
public class MyInputVerifier extends InputVerifier {
@Override
public boolean verify(JComponent input) {
    String text = ((JTextField) input).getText().trim();
    if (text.isEmpty()) return false;
    if (text.matches(".*\\d.*")) return false;

    return true;
    


}

public void verifyTP(JTextField f){
 
    if(!verify(f)){
    
      JOptionPane.showMessageDialog(null, "Allowed no of digits is 10 ");
    }



}

}