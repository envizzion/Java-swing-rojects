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
 * @author kiwa
 */
public class Sup_Search extends javax.swing.JFrame {

    /**
     * Creates new form Sup_Search
     */
    String strdate;
    Connection c;
    Statement pst;
    ResultSet rs;
    public Sup_Search() {
        initComponents();
        fillsupName();
        fillFoodName();
    }

    public void fillsupName() {
        String supname = " ";
        try {
            c = new BSDB().con();
            Statement st = c.createStatement();
            String sql = "SELECT * FROM supliers";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                supname = rs.getString("SupName");
                jComboBox1.addItem(supname);
                jComboBox2.addItem(supname);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    
    public void fillFoodName(){
         String foodname = " ";
        try {
            Connection c = new BSDB().con();
            Statement st = c.createStatement();
            String sql = "SELECT * FROM food";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                foodname = rs.getString("FoodName");
                jComboBox3.addItem(foodname);
                
            } 
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void searchDetails() {

        try {
            Connection c = new BSDB().con();
            Statement st = c.createStatement();

            Date date = date1.getDate();
            Date date4 = date2.getDate();
            String datecompiler = String.format("%1$tY-%1$tm-%1$td", date);
            String datecompiler1 = String.format("%1$tY-%1$tm-%1$td", date4);
            String name=jComboBox1.getSelectedItem().toString();
            String tbl = "Select * from orders where Date between '" + datecompiler +"' AND '"+datecompiler1 +"' AND SupName='" + name + "'";
            ResultSet rs = st.executeQuery(tbl);
            tblsupplier.setModel(DbUtils.resultSetToTableModel(rs));
            

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsupplier = new javax.swing.JTable();
        date2 = new com.toedter.calendar.JDateChooser();
        date1 = new com.toedter.calendar.JDateChooser();
        btnsearch1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        date3 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        text6 = new javax.swing.JTextArea();
        text4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 140, 20));

        jLabel1.setBackground(new java.awt.Color(102, 255, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Suplier Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 100, 20));

        jLabel2.setBackground(new java.awt.Color(102, 255, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Date ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 90, 20));

        tblsupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Supplier name", "Food name", "Quntity", "Unit Price", "Description", "ID"
            }
        ));
        tblsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsupplier);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 540, 200));

        date2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date2PropertyChange(evt);
            }
        });
        getContentPane().add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 140, -1));

        date1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date1PropertyChange(evt);
            }
        });
        getContentPane().add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 140, -1));

        btnsearch1.setText("Search");
        btnsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, -1, -1));

        delete1.setText("Delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 255, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 80, 20));

        jLabel4.setBackground(new java.awt.Color(102, 255, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 80, 20));

        jLabel5.setBackground(new java.awt.Color(102, 255, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Food name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 80, 20));

        jLabel6.setBackground(new java.awt.Color(102, 255, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Unit Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 20));

        text5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text5KeyTyped(evt);
            }
        });
        getContentPane().add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 130, 30));

        jLabel7.setBackground(new java.awt.Color(102, 255, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Description");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 80, 20));

        date3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date3PropertyChange(evt);
            }
        });
        getContentPane().add(date3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 140, -1));

        text6.setColumns(20);
        text6.setRows(5);
        jScrollPane2.setViewportView(text6);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 150, 70));

        text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text4ActionPerformed(evt);
            }
        });
        text4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text4KeyTyped(evt);
            }
        });
        getContentPane().add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 130, 30));

        jLabel8.setBackground(new java.awt.Color(102, 255, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Quantity");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 20));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, 20));

        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, 30));

        jLabel10.setFont(new java.awt.Font("Wide Latin", 2, 18)); // NOI18N
        jLabel10.setText("DETAILS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 220, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen/B2.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void date2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date2PropertyChange

    }//GEN-LAST:event_date2PropertyChange

    private void date1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_date1PropertyChange

    private void btnsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch1ActionPerformed
        // TODO add your handling code here:
        searchDetails();
        
    }//GEN-LAST:event_btnsearch1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
      
        try{
            String Sql="DELETE FROM Orders WHERE ID='"+add7+"'";
        pst=c.prepareStatement(Sql);
           pst.executeUpdate(Sql);
           JOptionPane.showMessageDialog(null, "deleted");
            searchDetails();
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_delete1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      try{
          
          String v1= jComboBox2.getSelectedItem().toString();
          Date v2= date3.getDate();
          String v3= jComboBox3.getSelectedItem().toString();
          String v4= text4.getText();
          String v5= text5.getText();
          String v6= text6.getText();
          String datecompiler = String.format("%1$tY-%1$tm-%1$td", v2);
          
           String Sql ="update Orders set Date='"+datecompiler+"',SupName='"+v1+"',FoodName='"+v3+"',Quntity='"+v4+"',UnitPrice='"+v5+"',Description='"+v6+"' where ID='"+add7+"'";
           pst=c.prepareStatement(Sql);
           pst.executeUpdate(Sql);
            JOptionPane.showMessageDialog(null, "updated");
            searchDetails();
           
      }
      catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
      }
    }//GEN-LAST:event_btnUpdateActionPerformed
    String add7;
    private void tblsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsupplierMouseClicked
        // TODO add your handling code here:
        try{
            
            int row=tblsupplier.getSelectedRow();
            String Table_Click=(tblsupplier.getModel().getValueAt(row,6).toString());
            String Sql="Select * from Orders where ID='"+ Table_Click+"'";
            
            pst=c.prepareStatement(Sql);
            rs=pst.executeQuery(Sql);
            if(rs.next()){
                String add1=rs.getString("SupName");
         //       jComboBox2.addItem(add1);
                Date add2=rs.getDate("Date");
               date3.setDate(add2);
               String add3=rs.getString("FoodName");
                //text3.setText(add3);
                String add4=rs.getString("Quntity");
                text4.setText(add4);
                String add5=rs.getString("UnitPrice");
                text5.setText(add5);
                String add6=rs.getString("Description");
                text6.setText(add6);
                  add7=rs.getString("ID");
                
            }
            
            
            
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblsupplierMouseClicked

    private void date3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_date3PropertyChange

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text4ActionPerformed

    private void text4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text4KeyTyped
        // TODO add your handling code here:
          char n=evt.getKeyChar();
         if(!(Character.isDigit(n)|| n==KeyEvent.VK_BACK_SPACE || n==KeyEvent.VK_DELETE)){
               getToolkit().beep();
            evt.consume();
         }
    }//GEN-LAST:event_text4KeyTyped

    private void text5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text5KeyTyped
        // TODO add your handling code here:
          char n=evt.getKeyChar();
         if(!(Character.isDigit(n)|| n==KeyEvent.VK_BACK_SPACE || n==KeyEvent.VK_DELETE)){
               getToolkit().beep();
            evt.consume();
         }
    }//GEN-LAST:event_text5KeyTyped

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
            java.util.logging.Logger.getLogger(Sup_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sup_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sup_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sup_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sup_Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnsearch1;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private com.toedter.calendar.JDateChooser date3;
    private javax.swing.JButton delete1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblsupplier;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextArea text6;
    // End of variables declaration//GEN-END:variables
}
