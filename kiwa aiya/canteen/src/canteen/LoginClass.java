/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package canteen;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kiwa
 */
public class LoginClass {
    public boolean LoginCheck(String currentUser, String currentPass) {
        boolean check = false;

        try {
            Connection c = new BSDB().con();
            Statement st = c.createStatement();

            String sql = "SELECT * FROM Login WHERE UserName ='" + currentUser + "' AND Password = '" + currentPass + "' ";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                check = true;
            }

            if (check == false) {
                JOptionPane.showMessageDialog(null, "Didn't match username and password");

            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }

        return check;
    }
    
}
