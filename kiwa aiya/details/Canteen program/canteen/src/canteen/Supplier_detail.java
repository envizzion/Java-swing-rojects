/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen;
import java.awt.event.KeyEvent;
import java.sql.Connection;

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
public class Supplier_detail extends javax.swing.JFrame {
      
    Connection c;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form Supplier_detail
     */
    public Supplier_detail() {
        initComponents();
        supplierFill();
    }
    void supplierFill(){
        
      try{
            c = new BSDB().con();
        String tbl = "SELECT * FROM supplier";
            st=c.createStatement();
             rs = st.executeQuery(tbl);
            supTable.setModel(DbUtils.resultSetToTableModel(rs));
                        //JOptionPane.showMessageDialog(this, "Save Completed");

      }
      catch(Exception e){System.out.println(e);}
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        supTable = new javax.swing.JTable();
        sName = new javax.swing.JTextField();
        tp = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        supTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        supTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(supTable);

        sName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameActionPerformed(evt);
            }
        });

        updateButton.setText("update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("delete only if all the supplier orders are completed");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(tp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(127, 127, 127)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(updateButton)
                        .addGap(107, 107, 107)
                        .addComponent(deleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String getRow;
    private void supTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supTableMouseClicked
        // TODO add your handling code here:
         try{
            Connection c1;
            c1= new BSDB().con();
            Statement st = c1.createStatement();
            
            int row=supTable.getSelectedRow();
             getRow=(supTable.getModel().getValueAt(row,0).toString());
            String sql="Select * from supplier where Sup_ID='"+ getRow+"'";
            
            ResultSet rs1=st.executeQuery(sql);
            
         while(rs1.next()){
             
            //getting_sup_tp no
            Statement st1=c1.createStatement();
             ResultSet rs2=st1.executeQuery("select Sup_tp from sup_tp_nos where Sup_ID='"+getRow+"'");
             if(rs2.next()){ tp.setText(rs2.getString("Sup_tp"));}
            
             //getting sup name
             
            sName.setText(rs1.getString("Sup_name"));
             
             
             
             address.setText(rs1.getString("Sup_address"));        
             
                
        
               
              
         }   
            
            
            
        }
        catch(Exception e){
            System.out.println(e);
             JOptionPane.showMessageDialog(null, e);
        }
            
            
            
            
            
    }//GEN-LAST:event_supTableMouseClicked

    private void sNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
         try{
          
       
        
          Statement pst=c.createStatement();
          
          
          
          
          //updating supplier-tp-nos table
           pst.executeUpdate("update sup_tp_nos set Sup_tp='"+tp.getText()+"' where Sup_ID='"+getRow+"'");
          
          
          
           String Sql ="update supplier set Sup_name='"+sName.getText()+"',Sup_address='"+address.getText()+"' where Sup_ID='"+getRow+"'";
           pst=c.prepareStatement(Sql);
           
           pst.executeUpdate(Sql);
            JOptionPane.showMessageDialog(null, "updated");
            supplierFill();
           
      }
      catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
      }
                                      
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       try{
          Statement pst=c.createStatement();  
          Statement pst1=c.createStatement();
            //deleting from supplier_tp_nos table
        String supTp="delete from sup_tp_nos where Sup_ID='"+getRow+"'";
        pst.executeUpdate(supTp);
            
         
            //saving order ids of the supplier
            String orderSet="select Order_ID from sup_orders where Sup_ID IN ('"+getRow+"')";
            pst=c.prepareStatement(orderSet);
            ResultSet supOrderIDs=pst.executeQuery(orderSet);
            
          //deleting sup_orders of the supplier
         pst1.executeUpdate("delete from sup_orders where Sup_ID='"+getRow+"'");
         
        
          //deleting from orders
          while(supOrderIDs.next()){
         pst1.executeUpdate("delete from orders where Order_ID='"+supOrderIDs.getString("Order_ID")+"'");
                 }
           
         //deleting from supplier table
        String Sql="DELETE FROM supplier WHERE Sup_ID='"+getRow+"'";
            pst1.executeUpdate(Sql);
           JOptionPane.showMessageDialog(null, "deleted");
            supplierFill();
        }
        
        
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Supplier_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier_detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sName;
    private javax.swing.JTable supTable;
    private javax.swing.JTextField tp;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
