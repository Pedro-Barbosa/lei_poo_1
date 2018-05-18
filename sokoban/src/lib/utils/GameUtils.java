package lib.utils;

import javax.swing.JOptionPane;

/**
 *******************************
 * Implemented by Paulo Pereira
 *******************************
 */
public class GameUtils {

    public static void showDialogMessage(String title, String msg, int messageType) {
        JOptionPane.showMessageDialog(null, msg, title, messageType);
    }
    
}
