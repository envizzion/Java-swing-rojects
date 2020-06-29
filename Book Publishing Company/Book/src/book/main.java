/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer i7
 */
public class main extends javax.swing.JFrame {

    Connection con;
    PreparedStatement psss;
    ResultSet rsss;

    public main() {
        settimer();
        initComponents();
        LoadID();
        frm();
        pub();
        IN();

        main.setVisible(true);

        java.util.Date d = new java.util.Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd");
        String s = sdf.format(d);
        lbl_DATE.setText(s);
    }

    private void settimer() {
        Timer t = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                java.util.Date a = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
                String z = s.format(a);
                lbl_TIME.setText(z);
            }
        });
        t.start();
    }

    void frm() {

        Addnewbook.setVisible(false);
        main.setVisible(true);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
        Search.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        lbl_addnewbook = new javax.swing.JLabel();
        lbl_invoice = new javax.swing.JLabel();
        lbl_shop = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();
        lbl_purchase = new javax.swing.JLabel();
        lbl_setting = new javax.swing.JLabel();
        lbl_DATE = new javax.swing.JLabel();
        lbl_TIME = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lbl_back6 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lbl_saerch = new javax.swing.JLabel();
        mainback = new javax.swing.JLabel();
        Addnewbook = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_ISBM = new javax.swing.JTextField();
        txt_Bookname = new javax.swing.JTextField();
        txt_Author = new javax.swing.JTextField();
        txt_SellPrice = new javax.swing.JTextField();
        txt_Quantity = new javax.swing.JTextField();
        txt_cost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_book = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        combo_type = new javax.swing.JComboBox();
        lbl_back = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        Shops = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_Oid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_Oname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_Ocity = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_Otel = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_outlet = new javax.swing.JTable();
        lbl_back1 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Invoice = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txt_IIid = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_IIisbn = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_IIqua = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lbl_back2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb_invoice = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lbl_IIsubtotal = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        lbl_A = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        lbl_IPrice = new javax.swing.JLabel();
        Available_Main = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Authors = new javax.swing.JPanel();
        txt_AAdd = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_Aid = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_FF = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_ALastName = new javax.swing.JTextField();
        txt_AEmail = new javax.swing.JTextField();
        txt_AFirstName = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_Atel = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_author = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        lbl_back3 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Setting = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        txt_PScurrent = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();
        txt_PSnew = new javax.swing.JPasswordField();
        jLabel33 = new javax.swing.JLabel();
        txt_PSreenter = new javax.swing.JPasswordField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txt_newName = new javax.swing.JTextField();
        txt_NEWPS = new javax.swing.JPasswordField();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        lbl_back4 = new javax.swing.JLabel();
        txt_AAAAA = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Publication = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txt_PID = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txt_Pisbn = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txt_Poutid = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txt_PunitP = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txt_Pquantity = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lbl_PSubtotal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_publication = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        lbl_back5 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        mainback1 = new javax.swing.JLabel();
        Search = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        txt_SER = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_SEARCH = new javax.swing.JTable();
        lbl_SSSisbn = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        lbl_back7 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tb_out = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_addnewbook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_addnewbook.setForeground(new java.awt.Color(255, 0, 0));
        lbl_addnewbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/newBook1.jpg"))); // NOI18N
        lbl_addnewbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_addnewbookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_addnewbookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_addnewbookMouseExited(evt);
            }
        });
        lbl_addnewbook.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_addnewbookMouseMoved(evt);
            }
        });
        lbl_addnewbook.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl_addnewbookFocusGained(evt);
            }
        });
        main.add(lbl_addnewbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 260, 170));

        lbl_invoice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_invoice.setForeground(new java.awt.Color(255, 0, 0));
        lbl_invoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/invoice2.jpg"))); // NOI18N
        lbl_invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_invoiceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_invoiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_invoiceMouseExited(evt);
            }
        });
        main.add(lbl_invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 330, 120));

        lbl_shop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_shop.setForeground(new java.awt.Color(255, 0, 0));
        lbl_shop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/shop1.jpg"))); // NOI18N
        lbl_shop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_shopMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_shopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_shopMouseExited(evt);
            }
        });
        main.add(lbl_shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 260, 170));

        lbl_author.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_author.setForeground(new java.awt.Color(255, 0, 0));
        lbl_author.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/author2.jpg"))); // NOI18N
        lbl_author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_authorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_authorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_authorMouseExited(evt);
            }
        });
        main.add(lbl_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 160, 140));

        lbl_purchase.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_purchase.setForeground(new java.awt.Color(255, 0, 0));
        lbl_purchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/purchase1.jpg"))); // NOI18N
        lbl_purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_purchaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_purchaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_purchaseMouseExited(evt);
            }
        });
        main.add(lbl_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 170, 360));

        lbl_setting.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_setting.setForeground(new java.awt.Color(255, 0, 0));
        lbl_setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/settings2.jpg"))); // NOI18N
        lbl_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_settingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_settingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_settingMouseExited(evt);
            }
        });
        main.add(lbl_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 150, 140));

        lbl_DATE.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lbl_DATE.setForeground(new java.awt.Color(255, 255, 255));
        main.add(lbl_DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 130, 20));

        lbl_TIME.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lbl_TIME.setForeground(new java.awt.Color(255, 255, 255));
        main.add(lbl_TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, 20));

        jLabel46.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 0, 0));
        jLabel46.setText("Time");
        main.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 20));

        jLabel47.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 0, 0));
        jLabel47.setText("Date");
        main.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 20));

        lbl_back6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/windows-8-icon-614x460 copy.png"))); // NOI18N
        lbl_back6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_back6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_back6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_back6MouseExited(evt);
            }
        });
        main.add(lbl_back6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 100, 90));

        jLabel30.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Welcome to Book Publication Management System");
        main.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 570, 40));

        lbl_saerch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/saerch1.jpg"))); // NOI18N
        lbl_saerch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_saerchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_saerchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_saerchMouseExited(evt);
            }
        });
        main.add(lbl_saerch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 330, 80));

        mainback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/main.jpg"))); // NOI18N
        mainback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        main.add(mainback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        Addnewbook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Author ID");
        Addnewbook.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 170, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Type");
        Addnewbook.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 30));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name of the Book");
        Addnewbook.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, 30));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity");
        Addnewbook.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 170, 30));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ISBN Number");
        Addnewbook.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 30));

        txt_ISBM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Addnewbook.add(txt_ISBM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 230, 30));

        txt_Bookname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Bookname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BooknameActionPerformed(evt);
            }
        });
        Addnewbook.add(txt_Bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 230, 30));

        txt_Author.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Addnewbook.add(txt_Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, 30));

        txt_SellPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Addnewbook.add(txt_SellPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 120, 30));

        txt_Quantity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Addnewbook.add(txt_Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 120, 30));

        txt_cost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Addnewbook.add(txt_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 120, 30));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selling Price");
        Addnewbook.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, 30));

        tb_book.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb_book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBM Number", "Author ID", "Name of Book", "Type", "Cost", "Selling Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_bookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_book);
        if (tb_book.getColumnModel().getColumnCount() > 0) {
            tb_book.getColumnModel().getColumn(0).setResizable(false);
            tb_book.getColumnModel().getColumn(1).setResizable(false);
            tb_book.getColumnModel().getColumn(2).setResizable(false);
            tb_book.getColumnModel().getColumn(3).setResizable(false);
            tb_book.getColumnModel().getColumn(4).setResizable(false);
            tb_book.getColumnModel().getColumn(5).setResizable(false);
            tb_book.getColumnModel().getColumn(6).setResizable(false);
        }

        Addnewbook.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 870, 170));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Addnewbook.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 120, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Addnewbook.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 120, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Addnewbook.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 120, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Addnewbook.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 120, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Rs.");
        Addnewbook.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 40, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Rs.");
        Addnewbook.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 30, 30));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cost");
        Addnewbook.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 30));

        combo_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_typeActionPerformed(evt);
            }
        });
        Addnewbook.add(combo_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 120, 30));

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/windows-8-icon-614x460 copy.png"))); // NOI18N
        lbl_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_backMouseExited(evt);
            }
        });
        Addnewbook.add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 100, 90));

        jLabel54.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Add a new Book or Update details");
        Addnewbook.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 420, 40));

        pic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/main.jpg"))); // NOI18N
        Addnewbook.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        getContentPane().add(Addnewbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        Shops.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Outlet ID");
        Shops.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 30));

        txt_Oid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Shops.add(txt_Oid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 230, 30));

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Outlet Name");
        Shops.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, 30));

        txt_Oname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Oname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_OnameActionPerformed(evt);
            }
        });
        Shops.add(txt_Oname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 230, 30));

        jLabel16.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("City");
        Shops.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 30));

        txt_Ocity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Shops.add(txt_Ocity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 180, 30));

        jLabel17.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tele Phone No");
        Shops.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 30));

        txt_Otel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Shops.add(txt_Otel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 120, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Submit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Shops.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 120, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Shops.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 120, 30));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Shops.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 120, 30));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Clear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Shops.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 120, 30));

        tb_outlet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb_outlet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Outlet ID", "Outlet Name", "City", "Tel Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_outlet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_outletMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_outlet);
        if (tb_outlet.getColumnModel().getColumnCount() > 0) {
            tb_outlet.getColumnModel().getColumn(0).setResizable(false);
            tb_outlet.getColumnModel().getColumn(1).setResizable(false);
            tb_outlet.getColumnModel().getColumn(2).setResizable(false);
            tb_outlet.getColumnModel().getColumn(3).setResizable(false);
        }

        Shops.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 870, 170));

        lbl_back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/windows-8-icon-614x460 copy.png"))); // NOI18N
        lbl_back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_back1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_back1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_back1MouseExited(evt);
            }
        });
        Shops.add(lbl_back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 100, 90));

        jLabel55.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Add a new Outlet or Update details");
        Shops.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 410, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/main.jpg"))); // NOI18N
        Shops.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        getContentPane().add(Shops, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        Invoice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Invoice ID");
        Invoice.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 30));

        txt_IIid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Invoice.add(txt_IIid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 230, 30));

        jLabel26.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("ISBN No");
        Invoice.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, 30));

        txt_IIisbn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_IIisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IIisbnActionPerformed(evt);
            }
        });
        txt_IIisbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_IIisbnKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_IIisbnKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IIisbnKeyTyped(evt);
            }
        });
        Invoice.add(txt_IIisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 230, 30));

        jLabel27.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Quantity");
        Invoice.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 170, 30));

        txt_IIqua.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_IIqua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_IIquaKeyPressed(evt);
            }
        });
        Invoice.add(txt_IIqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, 30));

        jLabel28.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Unit Price");
        Invoice.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Rs.");
        Invoice.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 40, 30));

        lbl_back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/windows-8-icon-614x460 copy.png"))); // NOI18N
        lbl_back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_back2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_back2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_back2MouseExited(evt);
            }
        });
        Invoice.add(lbl_back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 100, 90));

        tb_invoice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb_invoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "ISBN No", "Quantity", "Date", "Time", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_invoiceMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tb_invoice);
        if (tb_invoice.getColumnModel().getColumnCount() > 0) {
            tb_invoice.getColumnModel().getColumn(0).setResizable(false);
            tb_invoice.getColumnModel().getColumn(1).setResizable(false);
            tb_invoice.getColumnModel().getColumn(2).setResizable(false);
            tb_invoice.getColumnModel().getColumn(3).setResizable(false);
        }

        Invoice.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 870, 170));

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton21.setText("Submit");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        Invoice.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 120, 30));

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton24.setText("Clear");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        Invoice.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 120, 30));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 0, 0));
        jLabel48.setText("Sub Total");
        Invoice.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 140, 40));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Rs.");
        Invoice.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 40, 40));

        lbl_IIsubtotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_IIsubtotal.setForeground(new java.awt.Color(255, 255, 255));
        Invoice.add(lbl_IIsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 220, 40));

        jLabel56.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Sell a Book to a Customer (Main Outlet)");
        Invoice.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 460, 40));

        lbl_A.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_A.setForeground(new java.awt.Color(255, 255, 255));
        Invoice.add(lbl_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 210, 30));

        jLabel61.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Quantity Available in the Stock");
        Invoice.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 190, 20));

        lbl_IPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_IPrice.setForeground(new java.awt.Color(255, 255, 255));
        Invoice.add(lbl_IPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 150, 30));

        Available_Main.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Available_Main.setForeground(new java.awt.Color(255, 255, 255));
        Available_Main.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                Available_MainAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Invoice.add(Available_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 70, 30));

        jLabel62.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("The Book Name Regarding to the ISBN");
        Invoice.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 190, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/main.jpg"))); // NOI18N
        Invoice.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        getContentPane().add(Invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        Authors.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_AAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Authors.add(txt_AAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 180, 30));

        jLabel18.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Author ID");
        Authors.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 30));

        txt_Aid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Authors.add(txt_Aid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 230, 30));

        jLabel19.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Full Name");
        Authors.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, 30));

        txt_FF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_FF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FFActionPerformed(evt);
            }
        });
        txt_FF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_FFKeyReleased(evt);
            }
        });
        Authors.add(txt_FF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 230, 30));

        jLabel20.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Address");
        Authors.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 30));

        jLabel21.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("E-mail Address");
        Authors.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 170, 30));

        txt_ALastName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Authors.add(txt_ALastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 120, 30));

        txt_AEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Authors.add(txt_AEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 180, 30));

        txt_AFirstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Authors.add(txt_AFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 120, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ex(Osith Rajanayake)");
        Authors.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 170, 30));

        jLabel23.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tele Phone No");
        Authors.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 170, 30));

        txt_Atel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Authors.add(txt_Atel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 180, 30));

        tb_author.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb_author.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Author ID", "First Name", "Last Name", "Address", "E-mail", "Tel No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_authorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_author);
        if (tb_author.getColumnModel().getColumnCount() > 0) {
            tb_author.getColumnModel().getColumn(0).setResizable(false);
            tb_author.getColumnModel().getColumn(1).setResizable(false);
            tb_author.getColumnModel().getColumn(2).setResizable(false);
            tb_author.getColumnModel().getColumn(3).setResizable(false);
            tb_author.getColumnModel().getColumn(4).setResizable(false);
            tb_author.getColumnModel().getColumn(5).setResizable(false);
        }

        Authors.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 870, 170));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("Submit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        Authors.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 120, 30));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setText("Update");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        Authors.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 120, 30));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        Authors.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 120, 30));

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setText("Clear");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Authors.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 120, 30));

        lbl_back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/windows-8-icon-614x460 copy.png"))); // NOI18N
        lbl_back3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_back3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_back3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_back3MouseExited(evt);
            }
        });
        Authors.add(lbl_back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 100, 90));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("(press ENTER to genarate)");
        Authors.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, -1));

        jLabel57.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Add a new Auhtor or Update details");
        Authors.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 410, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/main.jpg"))); // NOI18N
        Authors.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        getContentPane().add(Authors, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        Setting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("User Name");
        Setting.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 30));

        jLabel38.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Current Password");
        Setting.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 30));
        Setting.add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, 30));
        Setting.add(txt_PScurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, 30));

        jLabel24.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Enter new Password");
        Setting.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 30));
        Setting.add(txt_PSnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 190, 30));

        jLabel33.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Reenter Password");
        Setting.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, 30));
        Setting.add(txt_PSreenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 190, 30));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.setText("Clear");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        Setting.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 110, 30));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setText("Save");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        Setting.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 110, 30));

        jLabel36.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("User Name");
        Setting.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 110, 30));

        jLabel37.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Password");
        Setting.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 110, 30));

        txt_newName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Setting.add(txt_newName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 180, 30));
        Setting.add(txt_NEWPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 180, 30));

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setText("Clear");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        Setting.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 110, 30));

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setText("Save");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        Setting.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 110, 30));

        lbl_back4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/windows-8-icon-614x460 copy.png"))); // NOI18N
        lbl_back4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_back4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_back4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_back4MouseExited(evt);
            }
        });
        Setting.add(lbl_back4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 100, 90));

        txt_AAAAA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Setting.add(txt_AAAAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 180, 30));

        jLabel50.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("User Name");
        Setting.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 110, 30));
        Setting.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 302, 880, 10));

        jLabel58.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Change Password or Create a New User");
        Setting.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 460, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/main.jpg"))); // NOI18N
        Setting.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        getContentPane().add(Setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        Publication.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("ID Publication");
        Publication.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 30));

        txt_PID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Publication.add(txt_PID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 230, 30));

        jLabel35.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("ISBN No");
        Publication.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, 30));

        txt_Pisbn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Pisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PisbnActionPerformed(evt);
            }
        });
        Publication.add(txt_Pisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 230, 30));

        jLabel39.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Outlet ID");
        Publication.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 170, 30));

        txt_Poutid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Publication.add(txt_Poutid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, 30));

        jLabel40.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Unit Price");
        Publication.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 30));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Rs.");
        Publication.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 40, 30));

        txt_PunitP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Publication.add(txt_PunitP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 120, 30));

        jLabel42.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Quantity");
        Publication.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 30));

        txt_Pquantity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Publication.add(txt_Pquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 120, 30));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 0, 0));
        jLabel43.setText("Sub Total");
        Publication.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 140, 40));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Rs.");
        Publication.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 40, 40));

        lbl_PSubtotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_PSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        Publication.add(lbl_PSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 220, 40));

        tb_publication.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb_publication.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Publication ID", "ISBN Name", "Outlet ID", "Quantity", "Unit Price", "Sub Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_publication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_publicationMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tb_publication);
        if (tb_publication.getColumnModel().getColumnCount() > 0) {
            tb_publication.getColumnModel().getColumn(0).setResizable(false);
            tb_publication.getColumnModel().getColumn(1).setResizable(false);
            tb_publication.getColumnModel().getColumn(2).setResizable(false);
            tb_publication.getColumnModel().getColumn(3).setResizable(false);
            tb_publication.getColumnModel().getColumn(3).setHeaderValue("Quantity");
            tb_publication.getColumnModel().getColumn(4).setResizable(false);
            tb_publication.getColumnModel().getColumn(5).setResizable(false);
            tb_publication.getColumnModel().getColumn(5).setHeaderValue("Sub Total");
        }

        Publication.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 870, 170));

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setText("Submit");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        Publication.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 120, 30));

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton23.setText("Clear");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        Publication.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 120, 30));

        lbl_back5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/windows-8-icon-614x460 copy.png"))); // NOI18N
        lbl_back5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_back5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_back5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_back5MouseExited(evt);
            }
        });
        Publication.add(lbl_back5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 100, 90));

        jLabel59.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Publication to Outlets");
        Publication.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 270, 40));

        mainback1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/main.jpg"))); // NOI18N
        mainback1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Publication.add(mainback1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Publication, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        Search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Search");
        Search.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, 30));

        txt_SER.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_SER.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_SERKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SERKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SERKeyTyped(evt);
            }
        });
        Search.add(txt_SER, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 520, 30));

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton22.setText("Search");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        Search.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 160, 30));

        tb_SEARCH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tb_SEARCH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBM Number", "Name of Book", "Author ID", "Type", "Cost", "Selling Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_SEARCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_SEARCHMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tb_SEARCH);
        if (tb_SEARCH.getColumnModel().getColumnCount() > 0) {
            tb_SEARCH.getColumnModel().getColumn(0).setResizable(false);
            tb_SEARCH.getColumnModel().getColumn(1).setResizable(false);
            tb_SEARCH.getColumnModel().getColumn(2).setResizable(false);
            tb_SEARCH.getColumnModel().getColumn(3).setResizable(false);
            tb_SEARCH.getColumnModel().getColumn(4).setResizable(false);
            tb_SEARCH.getColumnModel().getColumn(5).setResizable(false);
            tb_SEARCH.getColumnModel().getColumn(6).setResizable(false);
        }

        Search.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 870, 150));

        lbl_SSSisbn.setForeground(new java.awt.Color(255, 255, 255));
        Search.add(lbl_SSSisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 180, 30));

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("(Search by Book Name)");
        Search.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 400, 20));

        lbl_back7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/windows-8-icon-614x460 copy.png"))); // NOI18N
        lbl_back7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_back7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_back7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_back7MouseExited(evt);
            }
        });
        Search.add(lbl_back7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 100, 90));

        jLabel60.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Search Books");
        Search.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 170, 40));

        tb_out.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Outlet Name", "Available Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tb_out);
        if (tb_out.getColumnModel().getColumnCount() > 0) {
            tb_out.getColumnModel().getColumn(0).setResizable(false);
            tb_out.getColumnModel().getColumn(1).setResizable(false);
        }

        Search.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 350, 110));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/main.jpg"))); // NOI18N
        Search.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_addnewbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_addnewbookMouseClicked
        Addnewbook.setVisible(true);
        main.setVisible(false);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
        Search.setVisible(false);

        type();

        DefaultTableModel dtm;
        dtm = (DefaultTableModel) tb_book.getModel();
        dtm.setRowCount(0);

        try {
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM books");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("ISBN"));
                v.add(rs.getString("authorid"));
                v.add(rs.getString("name"));
                v.add(rs.getString("type"));
                v.add(rs.getString("cost"));
                v.add(rs.getString("selling_price"));
                v.add(rs.getString("quantity"));

                dtm.addRow(v);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_lbl_addnewbookMouseClicked

    private void lbl_shopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_shopMouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(false);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(true);
        Search.setVisible(false);

        DefaultTableModel dtm = (DefaultTableModel) tb_outlet.getModel();

        dtm.setRowCount(0);
        try {
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM outlets");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("idoutlet"));
                v.add(rs.getString("outletname"));
                v.add(rs.getString("city"));
                v.add(rs.getString("phone"));

                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lbl_shopMouseClicked

    private void lbl_settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_settingMouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(false);
        Setting.setVisible(true);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
        Search.setVisible(false);
    }//GEN-LAST:event_lbl_settingMouseClicked

    private void lbl_purchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_purchaseMouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(false);
        Setting.setVisible(false);
        Publication.setVisible(true);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
        Search.setVisible(false);

        try {
            DefaultTableModel dtm = (DefaultTableModel) tb_publication.getModel();

            dtm.setRowCount(0);

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM publication");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("idpublication"));
                v.add(rs.getString("ISBN"));
                v.add(rs.getString("idoutlets"));
                v.add(rs.getString("quantity"));
                v.add(rs.getString("unit_price"));
                v.add(rs.getString("sub_total"));
                v.add(rs.getString("date"));
                v.add(rs.getString("time"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lbl_purchaseMouseClicked

    private void lbl_invoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_invoiceMouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) tb_invoice.getModel();

            dtm.setRowCount(0);

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM sale");
            while (rs.next()) {
                Vector v = new Vector();
//idivoice, books_ISBN, quantity, date, time, total
                v.add(rs.getString("idivoice"));
                v.add(rs.getString("books_ISBN"));
                v.add(rs.getString("quantity"));
                v.add(rs.getString("date"));
                v.add(rs.getString("time"));
                v.add(rs.getString("total"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Addnewbook.setVisible(false);
        main.setVisible(false);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(true);
        Shops.setVisible(false);
        Search.setVisible(false);
    }//GEN-LAST:event_lbl_invoiceMouseClicked

    private void lbl_authorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_authorMouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(false);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(true);
        Invoice.setVisible(false);
        Shops.setVisible(false);
        Search.setVisible(false);

        try {
            DefaultTableModel dtm = (DefaultTableModel) tb_author.getModel();

            dtm.setRowCount(0);

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM authors");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("idauthor"));
                v.add(rs.getString("first_name"));
                v.add(rs.getString("last_name"));
                v.add(rs.getString("address"));
                v.add(rs.getString("email"));
                v.add(rs.getString("phone"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lbl_authorMouseClicked

    private void txt_BooknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BooknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BooknameActionPerformed

    private void lbl_addnewbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_addnewbookMouseEntered
        lbl_addnewbook.setVisible(true);

        ImageIcon II = new ImageIcon(getClass().getResource("newBook2.jpg"));
        lbl_addnewbook.setIcon(II);

    }//GEN-LAST:event_lbl_addnewbookMouseEntered

    private void lbl_addnewbookMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_addnewbookMouseMoved

    }//GEN-LAST:event_lbl_addnewbookMouseMoved

    private void lbl_addnewbookFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_addnewbookFocusGained

    }//GEN-LAST:event_lbl_addnewbookFocusGained

    private void lbl_addnewbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_addnewbookMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("newBook1.jpg"));
        lbl_addnewbook.setIcon(II);
    }//GEN-LAST:event_lbl_addnewbookMouseExited

    private void lbl_shopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_shopMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("shop2.jpg"));
        lbl_shop.setIcon(II);
    }//GEN-LAST:event_lbl_shopMouseEntered

    private void lbl_shopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_shopMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("shop1.jpg"));
        lbl_shop.setIcon(II);
    }//GEN-LAST:event_lbl_shopMouseExited

    private void lbl_purchaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_purchaseMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("purchase2.jpg"));
        lbl_purchase.setIcon(II);
    }//GEN-LAST:event_lbl_purchaseMouseEntered

    private void lbl_purchaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_purchaseMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("purchase1.jpg"));
        lbl_purchase.setIcon(II);
    }//GEN-LAST:event_lbl_purchaseMouseExited

    private void lbl_invoiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_invoiceMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("invoice1.jpg"));
        lbl_invoice.setIcon(II);
    }//GEN-LAST:event_lbl_invoiceMouseEntered

    private void lbl_invoiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_invoiceMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("invoice2.jpg"));
        lbl_invoice.setIcon(II);
    }//GEN-LAST:event_lbl_invoiceMouseExited

    private void lbl_authorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_authorMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("author1.jpg"));
        lbl_author.setIcon(II);
    }//GEN-LAST:event_lbl_authorMouseEntered

    private void lbl_authorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_authorMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("author2.jpg"));
        lbl_author.setIcon(II);
    }//GEN-LAST:event_lbl_authorMouseExited

    private void lbl_settingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_settingMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("settings1.jpg"));
        lbl_setting.setIcon(II);
    }//GEN-LAST:event_lbl_settingMouseEntered

    private void lbl_settingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_settingMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("settings2.jpg"));
        lbl_setting.setIcon(II);
    }//GEN-LAST:event_lbl_settingMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

//            ISBN, idauthor, name, type, cost, selling_price, quantity
            Db.getconneConnection().createStatement().executeUpdate("INSERT INTO books (ISBN,authorid,name,type,cost,selling_price,quantity) VALUES ('" + txt_ISBM.getText() + "','" + txt_Author.getText() + "','" + txt_Bookname.getText() + "','" + combo_type.getSelectedItem().toString() + "','" + txt_cost.getText() + "','" + txt_SellPrice.getText() + "','" + txt_Quantity.getText() + "')");

            DefaultTableModel dtm = (DefaultTableModel) tb_book.getModel();

            dtm.setRowCount(0);

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM books");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("ISBN"));
                v.add(rs.getString("name"));
                v.add(rs.getString("authorid"));
                v.add(rs.getString("type"));
                v.add(rs.getString("cost"));
                v.add(rs.getString("selling_price"));
                v.add(rs.getString("quantity"));

                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        DefaultTableModel dm;
        dm = (DefaultTableModel) tb_book.getModel();
        dm.setRowCount(0);

        try {
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM books");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("ISBN"));
                v.add(rs.getString("authorid"));
                v.add(rs.getString("name"));
                v.add(rs.getString("type"));
                v.add(rs.getString("cost"));
                v.add(rs.getString("selling_price"));
                v.add(rs.getString("quantity"));

                dm.addRow(v);
            }
        } catch (Exception e) {

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tb_book.getModel();
        dtm.setRowCount(0);

        try {
//            ISBN, name, authorid, type, cost, selling_price, quantity
            Db.getconneConnection().createStatement().executeUpdate("UPDATE books SET name='" + txt_Bookname.getText() + "',authorid='" + txt_Author.getText() + "',type='" + combo_type.getSelectedItem().toString() + "', cost='" + txt_cost.getText() + "', selling_price='" + txt_SellPrice.getText() + "', quantity='" + txt_Quantity.getText() + "' WHERE ISBN='" + txt_ISBM.getText() + "'");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM books");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("ISBN"));
                v.add(rs.getString("authorid"));
                v.add(rs.getString("name"));
                v.add(rs.getString("type"));
                v.add(rs.getString("cost"));
                v.add(rs.getString("selling_price"));
                v.add(rs.getString("quantity"));

                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        txt_Author.setText("");
        txt_Bookname.setText("");
        txt_ISBM.setText("");
        txt_Quantity.setText("");
        txt_SellPrice.setText("");
        txt_cost.setText("");
        combo_type.removeAllItems();
        type();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tb_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_bookMouseClicked
        try {
            combo_type.removeAllItems();
            DefaultTableModel dtm = (DefaultTableModel) tb_book.getModel();
            int i = tb_book.getSelectedRow();
            String s = dtm.getValueAt(i, 0).toString();
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM books WHERE ISBN='" + s + "'");
//        ISBN, name, authorid, type, cost, selling_price, quantity
            while (rs.next()) {
                txt_ISBM.setText(rs.getString("ISBN"));
                txt_Bookname.setText(rs.getString("name"));
                txt_Author.setText(rs.getString("authorid"));
                combo_type.addItem(rs.getString("type"));
                txt_cost.setText(rs.getString("cost"));
                txt_SellPrice.setText(rs.getString("selling_price"));
                txt_Quantity.setText(rs.getString("quantity"));
            }
            combo_type.remove(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        type();
    }//GEN-LAST:event_tb_bookMouseClicked

    private void type() {
        try {
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM type");
            while (rs.next()) {
                combo_type.addItem(rs.getString("type"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Db.getconneConnection().createStatement().executeUpdate("DELETE FROM books WHERE ISBN='" + txt_ISBM.getText() + "'");

        } catch (Exception e) {
            e.printStackTrace();
        }

        DefaultTableModel dtm = (DefaultTableModel) tb_book.getModel();
        dtm.setRowCount(0);
        try {

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM books");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("ISBN"));
                v.add(rs.getString("authorid"));
                v.add(rs.getString("name"));
                v.add(rs.getString("type"));
                v.add(rs.getString("cost"));
                v.add(rs.getString("selling_price"));
                v.add(rs.getString("quantity"));

                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        txt_Author.setText("");
        txt_Bookname.setText("");
        txt_ISBM.setText("");
        txt_Quantity.setText("");
        txt_SellPrice.setText("");
        txt_cost.setText("");
        combo_type.removeAllItems();
        type();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void combo_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_typeActionPerformed

    }//GEN-LAST:event_combo_typeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txt_Author.setText("");
        txt_Bookname.setText("");
        txt_ISBM.setText("");
        txt_Quantity.setText("");
        txt_SellPrice.setText("");
        txt_cost.setText("");
        combo_type.removeAllItems();
        type();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_OnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_OnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_OnameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {

//            idoutlet, outletname, city, phone
            Db.getconneConnection().createStatement().executeUpdate("INSERT INTO outlets (idoutlet,outletname,city,phone) VALUES ('" + txt_Oid.getText() + "','" + txt_Oname.getText() + "','" + txt_Ocity.getText() + "','" + txt_Otel.getText() + "')");

            DefaultTableModel dtm = (DefaultTableModel) tb_outlet.getModel();

            dtm.setRowCount(0);

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM outlets");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("idoutlet"));
                v.add(rs.getString("outletname"));
                v.add(rs.getString("city"));
                v.add(rs.getString("phone"));

                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tb_outlet.getModel();
        dtm.setRowCount(0);

        try {
//            idoutlet, outletname, city, phone
            Db.getconneConnection().createStatement().executeUpdate("UPDATE outlets SET outletname='" + txt_Oname.getText() + "',city='" + txt_Ocity.getText() + "',phone='" + txt_Otel.getText() + "' WHERE idoutlet='" + txt_Oid.getText() + "'");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM outlets");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("idoutlet"));
                v.add(rs.getString("outletname"));
                v.add(rs.getString("city"));
                v.add(rs.getString("phone"));

                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        txt_Ocity.setText("");
        txt_Oid.setText("");
        txt_Otel.setText("");
        txt_Oname.setText("");

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            //            idoutlet, outletname, city, phone
            Db.getconneConnection().createStatement().executeUpdate("DELETE FROM outlets WHERE idoutlet='" + txt_Oid.getText() + "'");

        } catch (Exception e) {
            e.printStackTrace();
        }

        DefaultTableModel dtm = (DefaultTableModel) tb_outlet.getModel();
        dtm.setRowCount(0);
        try {

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM outlets");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("idoutlet"));
                v.add(rs.getString("outletname"));
                v.add(rs.getString("city"));
                v.add(rs.getString("phone"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        txt_Ocity.setText("");
        txt_Oid.setText("");
        txt_Otel.setText("");
        txt_Oname.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        txt_Ocity.setText("");
        txt_Oid.setText("");
        txt_Otel.setText("");
        txt_Oname.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tb_outletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_outletMouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) tb_outlet.getModel();
            int i = tb_outlet.getSelectedRow();
            String s = dtm.getValueAt(i, 0).toString();
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM outlets WHERE idoutlet='" + s + "'");
//        idoutlet, outletname, city, phone
            while (rs.next()) {
                txt_Oid.setText(rs.getString("idoutlet"));
                txt_Oname.setText(rs.getString("outletname"));
                txt_Ocity.setText(rs.getString("city"));
                txt_Otel.setText(rs.getString("phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tb_outletMouseClicked

    private void txt_FFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FFActionPerformed

    private void tb_authorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_authorMouseClicked
        txt_AAdd.setText("");
        txt_AEmail.setText("");
        txt_AFirstName.setText("");
        txt_ALastName.setText("");
        txt_Aid.setText("");
        txt_Atel.setText("");

        try {
            DefaultTableModel dtm = (DefaultTableModel) tb_author.getModel();
            int i = tb_author.getSelectedRow();
            String s = dtm.getValueAt(i, 0).toString();
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM authors WHERE idauthor='" + s + "'");
//        idauthor, first_name, last_name, address, email, phone
            while (rs.next()) {
                txt_Aid.setText(rs.getString("idauthor"));
                String a = (rs.getString("first_name"));
                String b = (rs.getString("last_name"));
                txt_FF.setText(a + " " + b);
                txt_AAdd.setText(rs.getString("address"));
                txt_AEmail.setText(rs.getString("email"));
                txt_Atel.setText(rs.getString("phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tb_authorMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
//            idauthor, first_name, last_name, address, email, phone
            Db.getconneConnection().createStatement().executeUpdate("INSERT INTO authors (idauthor, first_name, last_name, address, email, phone) VALUES ('" + txt_Aid.getText() + "','" + txt_AFirstName.getText() + "','" + txt_ALastName.getText() + "','" + txt_AAdd.getText() + "','" + txt_AEmail.getText() + "','" + txt_Atel.getText() + "')");

            DefaultTableModel dtm = (DefaultTableModel) tb_author.getModel();

            dtm.setRowCount(0);

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM authors");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("idauthor"));
                v.add(rs.getString("first_name"));
                v.add(rs.getString("last_name"));
                v.add(rs.getString("address"));
                v.add(rs.getString("email"));
                v.add(rs.getString("phone"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tb_author.getModel();
        dtm.setRowCount(0);

        try {
//          idauthor, first_name, last_name, address, email, phone
            Db.getconneConnection().createStatement().executeUpdate("UPDATE authors SET first_name='" + txt_AFirstName.getText() + "',last_name='" + txt_ALastName.getText() + "',address='" + txt_AAdd.getText() + "',email='" + txt_AEmail.getText() + "', phone='" + txt_Atel.getText() + "' WHERE idauthor='" + txt_Aid.getText() + "'");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM authors");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("idauthor"));
                v.add(rs.getString("first_name"));
                v.add(rs.getString("last_name"));
                v.add(rs.getString("address"));
                v.add(rs.getString("email"));
                v.add(rs.getString("phone"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        txt_FF.setText("");
        txt_AAdd.setText("");
        txt_AEmail.setText("");
        txt_AFirstName.setText("");
        txt_ALastName.setText("");
        txt_Aid.setText("");
        txt_Atel.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tb_author.getModel();
        dtm.setRowCount(0);

        try {
//          idauthor, first_name, last_name, address, email, phone
            Db.getconneConnection().createStatement().executeUpdate("DELETE FROM authors WHERE idauthor='" + txt_Aid.getText() + "'");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM authors");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("idauthor"));
                v.add(rs.getString("first_name"));
                v.add(rs.getString("last_name"));
                v.add(rs.getString("address"));
                v.add(rs.getString("email"));
                v.add(rs.getString("phone"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        txt_FF.setText("");
        txt_AAdd.setText("");
        txt_AEmail.setText("");
        txt_AFirstName.setText("");
        txt_ALastName.setText("");
        txt_Aid.setText("");
        txt_Atel.setText("");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        txt_AAdd.setText("");
        txt_AEmail.setText("");
        txt_AFirstName.setText("");
        txt_ALastName.setText("");
        txt_Aid.setText("");
        txt_Atel.setText("");
        txt_FF.setText("");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void txt_FFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FFKeyReleased
        int i = evt.getKeyCode();

        if (i == 10) {
            String[] a = txt_FF.getText().split(" ");
            txt_AFirstName.setText(a[0]);
            txt_ALastName.setText(a[1]);

        }
    }//GEN-LAST:event_txt_FFKeyReleased

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        txt_PScurrent.setText("");
        txt_PSnew.setText("");
        txt_PSreenter.setText("");
        txt_Username.setText("");
    }//GEN-LAST:event_jButton16ActionPerformed
    String US;
    String CPP;
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String CU = new String(txt_PScurrent.getPassword());
        try {
            Statement st = Db.getconneConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM login WHERE username='" + txt_Username.getText() + "'");
            while (rs.next()) {
                US = rs.getString("username");
                CPP = rs.getString("password");
            }
            String PS = new String(txt_PSnew.getPassword());
            if (CPP.equals(CU)) {
                String RE = new String(txt_PSreenter.getPassword());
                if (PS.equals(RE)) {
                    Statement st1 = Db.getconneConnection().createStatement();
                    st1.executeUpdate("UPDATE login SET password='" + RE + "' WHERE username='" + txt_Username.getText() + "'");
                    JOptionPane.showMessageDialog(this, "You have Changed your Password", "Change Password", 1);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Password", "Error", 2);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        txt_NEWPS.setText("");
        txt_newName.setText("");

    }//GEN-LAST:event_jButton18ActionPerformed

    public void LoadID() {
        try {
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT MAX(loginid) FROM login");

            if (rs.next()) {
                int a = rs.getInt("MAX(loginid)") + 1;
                String max = "" + a;
                txt_AAAAA.setText(max);
            } else {
                txt_AAAAA.setText("1");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        try {
            Statement st = Db.getconneConnection().createStatement();
            String pass = new String(txt_NEWPS.getPassword());
            st.executeUpdate("INSERT INTO login(username,password) VALUES('" + txt_newName.getText() + "','" + pass + "')");
            JOptionPane.showMessageDialog(this, "You have Create a NEW USER", "New User", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void txt_IIisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IIisbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IIisbnActionPerformed

    private void txt_PisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PisbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PisbnActionPerformed

    private void tb_publicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_publicationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_publicationMouseClicked

    private void pub() {
        try {
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT MAX(idpublication) FROM publication");

            if (rs.next()) {
                int a = rs.getInt("MAX(idpublication)") + 1;
                String max = "" + a;
                txt_PID.setText(max);
            } else {
                txt_PID.setText("1");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    int q;
    String isbn;
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        try {

            isbn = txt_Pisbn.getText();
            q = Integer.parseInt(txt_Pquantity.getText());
            int p = Integer.parseInt(txt_PunitP.getText());

            int tot = (p) * (q);
            lbl_PSubtotal.setText(tot + "");

//                                                                                                                                                                           idpublication, ISBN, idoutlets, quantity, unit_price, sub_total, date, time
            Db.getconneConnection().createStatement().executeUpdate("INSERT INTO publication (idpublication, ISBN, idoutlets, quantity, unit_price, sub_total, date, time) VALUES ('" + txt_PID.getText() + "','" + txt_Pisbn.getText() + "','" + txt_Poutid.getText() + "','" + q + "','" + txt_PunitP.getText() + "','" + lbl_PSubtotal.getText() + "','" + lbl_DATE.getText() + "','" + lbl_TIME.getText() + "')");

            DefaultTableModel dtm = (DefaultTableModel) tb_publication.getModel();

            dtm.setRowCount(0);

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM publication");
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("idpublication"));
                v.add(rs.getString("ISBN"));
                v.add(rs.getString("idoutlets"));
                v.add(rs.getString("quantity"));
                v.add(rs.getString("unit_price"));
                v.add(rs.getString("sub_total"));
                v.add(rs.getString("date"));
                v.add(rs.getString("time"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM books WHERE ISBN='" + isbn + "' ");
            while (rs.next()) {
                int qun = rs.getInt("quantity");
                int nowq = (qun) - (q);
                String now = nowq + "";
                Db.getconneConnection().createStatement().executeUpdate("UPDATE books SET quantity ='" + now + "' WHERE ISBN='" + isbn + "' ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        txt_PID.setText("");
        txt_Pisbn.setText("");
        txt_Poutid.setText("");
        txt_Pquantity.setText("");
        txt_PunitP.setText("");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void lbl_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("45.png"));
        lbl_back.setIcon(II);
    }//GEN-LAST:event_lbl_backMouseEntered

    private void lbl_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(true);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
    }//GEN-LAST:event_lbl_backMouseClicked

    private void lbl_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("windows-8-icon-614x460 copy.png"));
        lbl_back.setIcon(II);
    }//GEN-LAST:event_lbl_backMouseExited

    private void lbl_back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back1MouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(true);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
    }//GEN-LAST:event_lbl_back1MouseClicked

    private void lbl_back1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back1MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("45.png"));
        lbl_back1.setIcon(II);
    }//GEN-LAST:event_lbl_back1MouseEntered

    private void lbl_back1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back1MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("windows-8-icon-614x460 copy.png"));
        lbl_back1.setIcon(II);
    }//GEN-LAST:event_lbl_back1MouseExited

    private void lbl_back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back2MouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(true);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
    }//GEN-LAST:event_lbl_back2MouseClicked

    private void lbl_back2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back2MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("45.png"));
        lbl_back2.setIcon(II);
    }//GEN-LAST:event_lbl_back2MouseEntered

    private void lbl_back2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back2MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("windows-8-icon-614x460 copy.png"));
        lbl_back2.setIcon(II);
    }//GEN-LAST:event_lbl_back2MouseExited

    private void lbl_back3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back3MouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(true);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
    }//GEN-LAST:event_lbl_back3MouseClicked

    private void lbl_back3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back3MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("45.png"));
        lbl_back3.setIcon(II);
    }//GEN-LAST:event_lbl_back3MouseEntered

    private void lbl_back3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back3MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("windows-8-icon-614x460 copy.png"));
        lbl_back3.setIcon(II);
    }//GEN-LAST:event_lbl_back3MouseExited

    private void lbl_back4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back4MouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(true);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
    }//GEN-LAST:event_lbl_back4MouseClicked

    private void lbl_back4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back4MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("45.png"));
        lbl_back4.setIcon(II);
    }//GEN-LAST:event_lbl_back4MouseEntered

    private void lbl_back4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back4MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("windows-8-icon-614x460 copy.png"));
        lbl_back4.setIcon(II);
    }//GEN-LAST:event_lbl_back4MouseExited

    private void lbl_back5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back5MouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(true);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
    }//GEN-LAST:event_lbl_back5MouseClicked

    private void lbl_back5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back5MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("45.png"));
        lbl_back5.setIcon(II);
    }//GEN-LAST:event_lbl_back5MouseEntered

    private void lbl_back5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back5MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("windows-8-icon-614x460 copy.png"));
        lbl_back5.setIcon(II);
    }//GEN-LAST:event_lbl_back5MouseExited

    private void lbl_back6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_back6MouseClicked

    private void lbl_back6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back6MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("45.png"));
        lbl_back6.setIcon(II);
    }//GEN-LAST:event_lbl_back6MouseEntered

    private void lbl_back6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back6MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("windows-8-icon-614x460 copy.png"));
        lbl_back6.setIcon(II);
    }//GEN-LAST:event_lbl_back6MouseExited

    private void tb_invoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_invoiceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_invoiceMouseClicked

    private void IN() {
        try {
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT MAX(idivoice) FROM sale");

            if (rs.next()) {
                int a = rs.getInt("MAX(idivoice)") + 1;
                String max = "" + a;
                txt_IIid.setText(max);
            } else {
                txt_IIid.setText("1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String Iisbn;
    int IIIq;
    int tot;

    void tot() {
        IIIq = Integer.parseInt(txt_IIqua.getText());
        int p = Integer.parseInt(lbl_IPrice.getText());
        tot = (p) * (IIIq);
        lbl_IIsubtotal.setText("" + tot);
    }

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        try {

            Iisbn = txt_IIisbn.getText();
            tot();

//                                                                                                                                  idivoice, books_ISBN, quantity, date, time, total
            Db.getconneConnection().createStatement().executeUpdate("INSERT INTO sale (idivoice, books_ISBN, quantity, date, time, total) VALUES ('" + txt_IIid.getText() + "','" + Iisbn + "','" + IIIq + "','" + lbl_DATE.getText() + "','" + lbl_TIME.getText() + "','" + lbl_IIsubtotal.getText() + "')");

            DefaultTableModel dtm = (DefaultTableModel) tb_invoice.getModel();

            dtm.setRowCount(0);

            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM sale");
            while (rs.next()) {
                Vector v = new Vector();
//idivoice, books_ISBN, quantity, date, time, total
                v.add(rs.getString("idivoice"));
                v.add(rs.getString("books_ISBN"));
                v.add(rs.getString("quantity"));
                v.add(rs.getString("date"));
                v.add(rs.getString("time"));
                v.add(rs.getString("total"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM books WHERE ISBN='" + Iisbn + "' ");
            while (rs.next()) {
                int qun = rs.getInt("quantity");
                int nowq = (qun) - (IIIq);
                String now = "" + nowq;
                Available_Main.setText(now);
                Db.getconneConnection().createStatement().executeUpdate("UPDATE books SET quantity ='" + now + "' WHERE ISBN='" + Iisbn + "' ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        IN();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        txt_IIid.setText("");
        txt_IIisbn.setText("");
        lbl_IIsubtotal.setText("");
        txt_IIqua.setText("");
        lbl_IPrice.setText("");
        lbl_IPrice.setText("");
        Available_Main.setText("");
        lbl_A.setText("");
        IN();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void lbl_saerchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_saerchMouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(false);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
        Search.setVisible(true);

    }//GEN-LAST:event_lbl_saerchMouseClicked

    private void lbl_saerchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_saerchMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("search2.jpg"));
        lbl_saerch.setIcon(II);
    }//GEN-LAST:event_lbl_saerchMouseEntered

    private void lbl_saerchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_saerchMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("saerch1.jpg"));
        lbl_saerch.setIcon(II);
    }//GEN-LAST:event_lbl_saerchMouseExited



    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
//        ISBN, name, authorid, type, cost, selling_price, quantity
//        idpublication, ISBN, idoutlets, quantity, unit_price, sub_total, date, time

        try {
            String s = txt_SER.getText();
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM `book`.`publication` LEFT OUTER JOIN book.outlets o ON publication.idoutlets=o.idoutlet LEFT OUTER JOIN book.books b ON publication.ISBN=b.ISBN WHERE b.name LIKE '" + txt_SER.getText() + "%'");

            DefaultTableModel dtm = (DefaultTableModel) tb_out.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("outletname"));
                v.add(rs.getString("quantity"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            PreparedStatement ps = Db.getconneConnection().prepareStatement("SELECT * FROM books WHERE name=?");
            ps.setString(1, txt_SER.getText());
            ResultSet rs;
            rs = ps.executeQuery();

            DefaultTableModel dtm = (DefaultTableModel) tb_SEARCH.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {

                Vector v = new Vector();

                v.add(rs.getString("ISBN"));
                v.add(rs.getString("name"));
                v.add(rs.getString("authorid"));
                v.add(rs.getString("type"));
                v.add(rs.getString("cost"));
                v.add(rs.getString("selling_price"));
                v.add(rs.getString("quantity"));

                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void tb_SEARCHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_SEARCHMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tb_SEARCH.getModel();
        txt_SER.setText(dtm.getValueAt(tb_SEARCH.getSelectedRow(),1).toString());
        
        try {
            String s = txt_SER.getText();
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT o.outletname, publication.quantity FROM `book`.`publication` LEFT OUTER JOIN book.outlets o ON publication.idoutlets=o.idoutlet LEFT OUTER JOIN book.books b ON publication.ISBN=b.ISBN WHERE b.name = '"+ txt_SER.getText() + "' GROUP BY o.outletname");
//            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM `book`.`publication` LEFT OUTER JOIN book.outlets o ON publication.idoutlets=o.idoutlet LEFT OUTER JOIN book.books b ON publication.ISBN=b.ISBN WHERE b.name ='" + txt_SER.getText() + "'");

            DefaultTableModel dt = (DefaultTableModel) tb_out.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("outletname"));
                v.add(rs.getString("quantity"));
                dt.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_tb_SEARCHMouseClicked

    private void txt_SERKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SERKeyReleased
        try {
            String s = txt_SER.getText();
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT o.outletname, publication.quantity FROM `book`.`publication` LEFT OUTER JOIN book.outlets o ON publication.idoutlets=o.idoutlet LEFT OUTER JOIN book.books b ON publication.ISBN=b.ISBN WHERE b.name = '"+ txt_SER.getText() + "' GROUP BY o.outletname");
//            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM `book`.`publication` LEFT OUTER JOIN book.outlets o ON publication.idoutlets=o.idoutlet LEFT OUTER JOIN book.books b ON publication.ISBN=b.ISBN WHERE b.name ='" + txt_SER.getText() + "'");

            DefaultTableModel dtm = (DefaultTableModel) tb_out.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("outletname"));
                v.add(rs.getString("quantity"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT * FROM books WHERE name LIKE  '"+txt_SER.getText()+"%' ");
            DefaultTableModel dtm = (DefaultTableModel) tb_SEARCH.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {

                Vector v = new Vector();

                v.add(rs.getString("ISBN"));
                v.add(rs.getString("name"));
                v.add(rs.getString("authorid"));
                v.add(rs.getString("type"));
                v.add(rs.getString("cost"));
                v.add(rs.getString("selling_price"));
                v.add(rs.getString("quantity"));

                dtm.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_SERKeyReleased

    private void lbl_back7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back7MouseClicked
        Addnewbook.setVisible(false);
        main.setVisible(true);
        Setting.setVisible(false);
        Publication.setVisible(false);
        Authors.setVisible(false);
        Invoice.setVisible(false);
        Shops.setVisible(false);
        Search.setVisible(false);
    }//GEN-LAST:event_lbl_back7MouseClicked

    private void lbl_back7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back7MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("45.png"));
        lbl_back7.setIcon(II);
    }//GEN-LAST:event_lbl_back7MouseEntered

    private void lbl_back7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_back7MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("windows-8-icon-614x460 copy.png"));
        lbl_back7.setIcon(II);
    }//GEN-LAST:event_lbl_back7MouseExited

    private void txt_SERKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SERKeyPressed

    }//GEN-LAST:event_txt_SERKeyPressed

    private void txt_SERKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SERKeyTyped

    }//GEN-LAST:event_txt_SERKeyTyped

    private void txt_IIisbnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IIisbnKeyReleased
        try {
            ResultSet rs = Db.getconneConnection().createStatement().executeQuery("SELECT name,selling_price,quantity FROM books WHERE ISBN='" + txt_IIisbn.getText() + "'");
            while (rs.next()) {
                String name = rs.getString("name");
                String price = rs.getString("selling_price");
                String Q = rs.getString("quantity");
                Available_Main.setText(Q);
                lbl_A.setText(name);
                lbl_IPrice.setText(price);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_IIisbnKeyReleased

    private void Available_MainAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Available_MainAncestorMoved

    }//GEN-LAST:event_Available_MainAncestorMoved

    private void txt_IIisbnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IIisbnKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txt_IIisbnKeyTyped

    private void txt_IIisbnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IIisbnKeyPressed
        char c = evt.getKeyChar();
        if ((c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            Available_Main.setText("");
            lbl_A.setText("");
            lbl_IPrice.setText("");
        }
    }//GEN-LAST:event_txt_IIisbnKeyPressed
    int sub = 0;
    private void txt_IIquaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IIquaKeyPressed

        char c = evt.getKeyChar();
        while (c == KeyEvent.VK_ENTER) {
            tot();
            int i = tot;

            sub += i;

            txt_IIid.setText("");
            txt_IIisbn.setText("");
            lbl_IIsubtotal.setText("");
            txt_IIqua.setText("");
            lbl_IPrice.setText("");
            lbl_IPrice.setText("");
            Available_Main.setText("");
            lbl_A.setText("");
            IN();
            String java = "" + sub;
            lbl_IIsubtotal.setText(java);
        }
    }//GEN-LAST:event_txt_IIquaKeyPressed
        String search="";
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
        } catch (ClassNotFoundException | InstantiationException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Addnewbook;
    private javax.swing.JPanel Authors;
    private javax.swing.JLabel Available_Main;
    private javax.swing.JPanel Invoice;
    private javax.swing.JPanel Publication;
    private javax.swing.JPanel Search;
    private javax.swing.JPanel Setting;
    private javax.swing.JPanel Shops;
    private javax.swing.JComboBox combo_type;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_A;
    private javax.swing.JLabel lbl_DATE;
    private javax.swing.JLabel lbl_IIsubtotal;
    private javax.swing.JLabel lbl_IPrice;
    private javax.swing.JLabel lbl_PSubtotal;
    private javax.swing.JLabel lbl_SSSisbn;
    private javax.swing.JLabel lbl_TIME;
    private javax.swing.JLabel lbl_addnewbook;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_back1;
    private javax.swing.JLabel lbl_back2;
    private javax.swing.JLabel lbl_back3;
    private javax.swing.JLabel lbl_back4;
    private javax.swing.JLabel lbl_back5;
    private javax.swing.JLabel lbl_back6;
    private javax.swing.JLabel lbl_back7;
    private javax.swing.JLabel lbl_invoice;
    private javax.swing.JLabel lbl_purchase;
    private javax.swing.JLabel lbl_saerch;
    private javax.swing.JLabel lbl_setting;
    private javax.swing.JLabel lbl_shop;
    private javax.swing.JPanel main;
    private javax.swing.JLabel mainback;
    private javax.swing.JLabel mainback1;
    private javax.swing.JLabel pic;
    private javax.swing.JTable tb_SEARCH;
    private javax.swing.JTable tb_author;
    private javax.swing.JTable tb_book;
    private javax.swing.JTable tb_invoice;
    private javax.swing.JTable tb_out;
    private javax.swing.JTable tb_outlet;
    private javax.swing.JTable tb_publication;
    private javax.swing.JTextField txt_AAAAA;
    private javax.swing.JTextField txt_AAdd;
    private javax.swing.JTextField txt_AEmail;
    private javax.swing.JTextField txt_AFirstName;
    private javax.swing.JTextField txt_ALastName;
    private javax.swing.JTextField txt_Aid;
    private javax.swing.JTextField txt_Atel;
    private javax.swing.JTextField txt_Author;
    private javax.swing.JTextField txt_Bookname;
    private javax.swing.JTextField txt_FF;
    private javax.swing.JTextField txt_IIid;
    private javax.swing.JTextField txt_IIisbn;
    private javax.swing.JTextField txt_IIqua;
    private javax.swing.JTextField txt_ISBM;
    private javax.swing.JPasswordField txt_NEWPS;
    private javax.swing.JTextField txt_Ocity;
    private javax.swing.JTextField txt_Oid;
    private javax.swing.JTextField txt_Oname;
    private javax.swing.JTextField txt_Otel;
    private javax.swing.JTextField txt_PID;
    private javax.swing.JPasswordField txt_PScurrent;
    private javax.swing.JPasswordField txt_PSnew;
    private javax.swing.JPasswordField txt_PSreenter;
    private javax.swing.JTextField txt_Pisbn;
    private javax.swing.JTextField txt_Poutid;
    private javax.swing.JTextField txt_Pquantity;
    private javax.swing.JTextField txt_PunitP;
    private javax.swing.JTextField txt_Quantity;
    private javax.swing.JTextField txt_SER;
    private javax.swing.JTextField txt_SellPrice;
    private javax.swing.JTextField txt_Username;
    private javax.swing.JTextField txt_cost;
    private javax.swing.JTextField txt_newName;
    // End of variables declaration//GEN-END:variables
}
