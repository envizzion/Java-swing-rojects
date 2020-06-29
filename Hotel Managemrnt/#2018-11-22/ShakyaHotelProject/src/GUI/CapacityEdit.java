/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.CustomRenderer;
import Classes.Helper;
import Classes.JDBC;
import Classes.Validation;
import GUI.EXceptionAndToast.Toast;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Hasitha Udara
 */
public class CapacityEdit extends javax.swing.JFrame {

    private Helper helper = new Helper();
    private JDBC db = new JDBC();
    private Validation v = new Validation();
    TableColumn myTableColumn0;
    TableColumn myTableColumn1;
    private JFrame parent;

    /**
     * Creates new form CapacityEdit
     */
    public CapacityEdit() {
        initComponents();
    }

    public CapacityEdit(JFrame parent) {

        initComponents();
        InitialDataLoader();
        myTableColumn0 = capacityTable.getColumnModel().getColumn(0);
        helper.hideColumn(capacityTable, myTableColumn0);

        idText.setVisible(false);
        this.parent = parent;
        this.parent.setEnabled(false);
        
        
        capacityTable.getColumnModel().getColumn(1).setCellRenderer(new CustomRenderer());
        
        
        
        
        
       


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        capacityTable = new javax.swing.JTable();
        jLabel70 = new javax.swing.JLabel();
        catagoryName = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        capacityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Price(Rs)"
            }
        ));
        jScrollPane14.setViewportView(capacityTable);

        jLabel70.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel70.setText("Name :");

        catagoryName.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        catagoryName.setName("catName"); // NOI18N

        jButton24.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton24.setText("Refresh");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton25.setText("Edit Selected");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel71.setText("Price :");

        price.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        price.setName("price"); // NOI18N
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });

        jButton41.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButton41.setText("Update Capacity");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButton42.setText("Save Capacity");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButton43.setText("Back");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        idText.setText("jTextField1");

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel71)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel70)
                                        .addGap(14, 14, 14)))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(catagoryName, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                    .addComponent(price)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton41, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(catagoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed

        
       
        JTextField[] FieldSet = {
            catagoryName,
            price

        };

        v.emptyTextfield(FieldSet);

        boolean isValidated = v.validateForm(this);

        if (isValidated) {

            try {

                String[] FieldSet1 = {
                    catagoryName.getText(),
                    price.getText(),
                    "Active"
                };

                String query3 = helper.querySetter1(FieldSet1);
                db.InsertDataToDB("category_one_name,price,status", query3, "cat_level_one");

            } catch (Exception e) {

//                System.out.println("Execption" + e);
                e.printStackTrace();
            }

            Toast succesfulMessage = new Toast("You have Succsessfull addesd new catagory to the System.", 1, this);
            succesfulMessage.setVisible(true);

            helper.clearTextFields(jPanel9);

            helper.clearTable(capacityTable);
            helper.showColumn(capacityTable, myTableColumn0);
            ResultSet Rs = db.getData("SELECT idcat_level_one,category_one_name,price FROM hotelres.cat_level_one WHERE status='Active';");
            // helper.addToTable(jTable2, Rs);
            db.addToTable(capacityTable, Rs,3);
            helper.hideColumn(capacityTable, myTableColumn0);

            int index = capacityTable.getRowCount() - 1;

            helper.selectlastAddedUpdatedRecord(capacityTable, index);

        }


    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        
        HomeWindow form =(HomeWindow)parent;
        form.loadCombo();
        this.parent.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped

        v.numbersOnlyWithPoint(evt);


    }//GEN-LAST:event_priceKeyTyped

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        helper.clearTable(capacityTable);
        helper.showColumn(capacityTable, myTableColumn0);
        ResultSet Rs = db.getData("SELECT idcat_level_one,category_one_name,price FROM hotelres.cat_level_one WHERE status='Active';");

         db.addToTable(capacityTable, Rs,3);
        helper.hideColumn(capacityTable, myTableColumn0);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

        int[] Rows = capacityTable.getSelectedRows();

        if (Rows.length == 0) {
            Toast message = new Toast("No Any Row Selected For Edit and update", 1, this);
            message.setVisible(true);

        } else if (Rows.length > 1) {

            Toast message = new Toast("cant Ubpade Multiple Rows at Same Rime", 1, this);
            message.setVisible(true);

        } else {

            String id = capacityTable.getModel().getValueAt(Rows[0], 0).toString();

            String Query = "SELECT "
                    + "idcat_level_one,"
                    + "category_one_name,"
                    + "price"
                    + " FROM "
                    + "cat_level_one WHERE  idcat_level_one ='" + id + "'";

            System.out.println(Query);
            ResultSet Rs = db.getData(Query);
            helper.spliitDataSet(Rs, 3, 0, 0, 0, 0);
            JDBC.TerminateConnection();

            JTextField[] fields = {
                idText,
                catagoryName,
                price

            };

            helper.tofields(fields,2);

        }


    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed

        int[] Rows = capacityTable.getSelectedRows();

        if (Rows.length == 0) {
            Toast message = new Toast("No Any Row Selected For Edit and update", 1, this);
            message.setVisible(true);

        } else if (Rows.length > 1) {

            Toast message = new Toast("cant Ubpade Multiple Rows at Same Rime", 1, this);
            message.setVisible(true);

        } else {

            JTextField[] FieldSet = {
                catagoryName,
                price

            };

            v.emptyTextfield(FieldSet);

            boolean isValidated = v.validateForm(this);

            if (isValidated) {

                //,,,,,,,,,,,login_idlogin
                String Q1 = "category_one_name = '" + catagoryName.getText() + "' ,";
                Q1 += "price = '" + price.getText() + "' ";

                String Q2 = "idcat_level_one ='" + idText.getText() + "'";

                db.UpdateDataBaseTable("cat_level_one", Q1, Q2);

                Toast succesfulMessage = new Toast("You have Succsessfull Updated User to the System.", 1, this);
                succesfulMessage.setVisible(true);

                helper.clearTextFields(jPanel9);

                helper.clearTable(capacityTable);
                helper.showColumn(capacityTable, myTableColumn0);
                ResultSet Rs = db.getData("SELECT idcat_level_one,category_one_name,price FROM hotelres.cat_level_one WHERE status='Active';");

                db.addToTable(capacityTable, Rs,3);
                helper.hideColumn(capacityTable, myTableColumn0);

                int index = Rows[0];
                helper.selectlastAddedUpdatedRecord(capacityTable, index);

            }

        }


    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int[] Rows = capacityTable.getSelectedRows();

        if (Rows.length == 0) {
            Toast message = new Toast("No Any Row Selected For Edit and update", 1, this);
            message.setVisible(true);

        } else {

            String Q1 = "status= '" + "Inactive" + "'";
            String Q2 = "idcat_level_one =";

            for (int Row : Rows) {

                String idSet = capacityTable.getModel().getValueAt(Row, 0).toString();
                Q2 += "'" + idSet + "'";
                db.UpdateDataBaseTable("cat_level_one", Q1, Q2);
                Q2 = "idcat_level_one =";

            }

            helper.clearTable(capacityTable);
            helper.showColumn(capacityTable, myTableColumn0);
            ResultSet Rs = db.getData("SELECT idcat_level_one,category_one_name,price FROM hotelres.cat_level_one WHERE status='Active';");

            db.addToTable(capacityTable, Rs,3);
            helper.hideColumn(capacityTable, myTableColumn0);

        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CapacityEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapacityEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapacityEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapacityEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapacityEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable capacityTable;
    private javax.swing.JTextField catagoryName;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JTextField price;
    // End of variables declaration//GEN-END:variables

    private void InitialDataLoader() {

        ResultSet Rs = db.getData("SELECT idcat_level_one,category_one_name,price FROM hotelres.cat_level_one WHERE status='Active';");
        // helper.addToTable(jTable2, Rs);
        db.addToTable(capacityTable, Rs,3);

    }
}
