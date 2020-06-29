package Classes;

import GUI.EXceptionAndToast.Toast;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Hasitha Udara
 */
public class Validation {
//  ----- Validation method for NIC -----

    private final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private Pattern pattern;
    private Matcher matcher;

    private String ErrorsList = "";

    private String EmptyFields = "";

    public void Emailvalidate(final String email) {

        if (EmptyFields.equals("")) {

            pattern = Pattern.compile(EMAIL_PATTERN);

            matcher = pattern.matcher(email);

            if (!matcher.matches()) {

                ErrorsList += "Invalid Email Address,";

            }

        }

    }

    public void validationNIC(String nic) {

        if (EmptyFields.equals("")) {

            String result = "";
            try {
                int wordLength = nic.length();

                if (wordLength == 10) {
                    String word = nic.substring(0, 9);
                    for (int i = 0; i < word.length(); i++) {
                        if (!Character.isDigit(word.charAt(i))) {
                            result = "10 digit Error";
                            ErrorsList += result + " ,";
                        } else {
                            result = "";
                            ErrorsList += result;
                        }
                    }
                } else if (wordLength == 15) {
                    String word = nic.substring(0, 14);
                    for (int i = 0; i < word.length(); i++) {
                        if (!Character.isDigit(word.charAt(i))) {
                            result = "15 digit Error";
                            ErrorsList += result + " ,";
                        } else {
                            result = "";
                            ErrorsList += result;
                        }
                    }
                } else {
                    result = "error In NIC";
                    ErrorsList += result + " ,";
                }
            } catch (Exception e) {
                System.out.println("Error in Validation " + e);
            }

        }

    }
//    --------------------------------------------

//    validation method for phone number
    public void validationPhone(String phone, String title) {

        if (EmptyFields.equals("")) {
            boolean flag = false;
            try {
                if (phone.length() == 10) {
                    for (int i = 0; i < phone.length(); i++) {
                        flag = Character.isDigit(phone.charAt(i));
                    }
                } else {
                    flag = false;
                }

            } catch (Exception e) {
                System.out.println("Error in Validation " + e);
            }

            if (flag == false) {
                ErrorsList += "Invalid " + title + ",";
            }

        }

    }
//    --------------------------------------------

//    validation for empty textfields
    public void emptyTextfield(JTextField[] textFields) {

        try {
            for (JTextField jTextField : textFields) {
                if (jTextField.getText().isEmpty()) {
                    System.out.println("nillaaaa");
                   // jTextField.setBackground(Color.CYAN);
                    EmptyFields += jTextField.getName() + ",";

                }

            }
        } catch (Exception e) {
            System.out.println("Error in Validation " + e);
        }

    }
    
    
       public void emptyTextArea(JTextArea[] textAreas) {

        try {
            for (JTextArea jTextArea : textAreas) {
                if (jTextArea.getText().isEmpty()) {
                    System.out.println("nillaaaa");
                    EmptyFields += jTextArea.getName() + ",";

                }

            }
        } catch (Exception e) {
            System.out.println("Error in Validation " + e);
        }

    }
    
    
    
    
    

    public void emptyPasswordfield(JPasswordField[] passFields) {

        try {
            for (JPasswordField jTextField : passFields) {

                if ((jTextField.getPassword().length) == 0) {

                    EmptyFields += jTextField.getName() + ",";

                }

            }
        } catch (Exception e) {
            System.out.println("Error in Validation " + e);
        }

    }
//    -------------------------------------------- 

    public static void numberChecker(KeyEvent evt) {
        if (!Character.isAlphabetic(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }

    public static void CharacterChecker(KeyEvent evt) {
        if (Character.isAlphabetic(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE) {
            evt.consume();
            // evt.getKeyChar() == KeyEvent.VK_SPACE
        }
    }
    
       public static void numbersOnlyWithPoint(KeyEvent evt) {
        if (Character.isAlphabetic(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_STOP) {
            evt.consume();
            // evt.getKeyChar() == KeyEvent.VK_SPACE
        }
    }

    public void comboBoxChecker(String Title, JComboBox jComboBox) {

        if (jComboBox.getSelectedIndex() == 0) {
            EmptyFields += Title + ",";

        }

    }

//    for check boxes check
    public void checkBoxChecker(String title, JCheckBox... checkBoxes) {

        int checkboxcount = 0;
        for (JCheckBox checkBox : checkBoxes) {
            if (checkBox.isSelected()) {
                checkboxcount++;
            }
        }
        if (checkboxcount == 0) {
            EmptyFields += title + ",";
        }

    }

//    for radio buttons check
    public void radioButtonChecker(String title, JRadioButton... radioButtons) {

        int radiobuttoncount = 0;
        for (JRadioButton radioButton : radioButtons) {
            if (radioButton.isSelected()) {
                radiobuttoncount++;
            }
        }
        if (radiobuttoncount == 0) {
            EmptyFields += title + ",";
        }

    }

    public void passwordMissMatchChecker(JPasswordField pass, JPasswordField confirmPass) {

        char[] password = pass.getPassword();
        char[] confirm = confirmPass.getPassword();
        boolean val = true;

        if (password.length == confirm.length) {

            for (int i = 0; i < password.length; i++) {

                if (password[i] != confirm[i]) {
                    val = false;

                }

            }

        } else {

            val = false;

        }

        if (val == false) {

            ErrorsList += "password Missmatch,";

        }
    }

    /*
        consume the event if
        and only if it is a character 
        use for keytyped event
     */
    public static void charChecker(KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    public boolean validateForm(JFrame parent) {

        //System.out.println(EmptyFields + " " + ErrorsList);
        boolean isValidated = false;
        String message = "";

        if (!EmptyFields.equals("")) {
            message = "Please Fill Following Fields on Form"
                    + " " + EmptyFields;
            Toast messageBox = new Toast(message, 1, parent);
            messageBox.setVisible(true);

        } else if (!ErrorsList.equals("")) {

            message = "Please correct Following Fields on Form"
                    + " " + ErrorsList;
            Toast messageBox = new Toast(message, 1, parent);
            messageBox.setVisible(true);
        } else {

            isValidated = true;

        }

        EmptyFields = "";
        ErrorsList = "";

        return isValidated;

    }

}
