/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Ice
 */
public class CustomRenderer extends DefaultTableCellRenderer {
    
    

      private final  DecimalFormat formatter = new DecimalFormat( "#.00" );
 
      @Override
      public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,boolean hasFocus, int row, int column) {
 
        
 
         value = formatter.format((Number)value);
 
            // And pass it on to parent class
 
         return super.getTableCellRendererComponent(
            table, value, isSelected, hasFocus, row, column );
      }
      
}
