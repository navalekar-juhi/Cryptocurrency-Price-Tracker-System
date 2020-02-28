/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Juhi Navalekar
 */
public class Components {
    
    public static boolean isTextEmpty(String a) {

        if (a.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter details");
            return true;
        }
        return false;
    }
    public static boolean validateEmail(String email) {

        Pattern p = Pattern.compile("^[_a-z0-9-\\+]+(\\.[_a-z0-9-]+)*@[_a-z0-9-]+(\\.[a-z0-9]+)*(\\.[a-z]{2,})$", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(email);

        return m.matches();
    }
}
