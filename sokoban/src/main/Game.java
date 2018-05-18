package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lib.menu.MainMenu;
import lib.enums.GameState;
import lib.enums.MenuOption;
import lib.utils.GameUtils;

public class Game extends javax.swing.JFrame {

    public static GameState gameState;
    public static double screenWidth;
    public static double screenHeight;
    
    public Game() {
        initComponents();
        initExtraComponents();
    }
    
    private void initExtraComponents() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // gets screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = screenSize.getWidth();
        screenHeight = screenSize.getHeight();
        
        startMenu();
    }
    
    private void startMenu() {
        int menuX = (int) Math.floor(getValuePercentage(screenWidth, 0.25));
        int menuY = (int) Math.floor(getValuePercentage(screenHeight, 0.25));
        int width = (int) Math.floor(getValuePercentage(screenWidth, 0.50));
        int height = (int) Math.floor(getValuePercentage(screenHeight, 0.50));
        
        MainMenu menu = new MainMenu(menuX, menuY, width, height);
        
        // defines options behaviours
        menu.addClickListener(MenuOption.START,(t) -> {
            GameUtils.showDialogMessage("Info", "START", JOptionPane.INFORMATION_MESSAGE);
        });
        
        menu.addClickListener(MenuOption.EDITOR,(t) -> {
            GameUtils.showDialogMessage("Info", "EDITOR", JOptionPane.INFORMATION_MESSAGE);
        });
        
        menu.addClickListener(MenuOption.ABOUT,(t) -> {
            GameUtils.showDialogMessage("Info", "ABOUT", JOptionPane.INFORMATION_MESSAGE);
        });
        
        menu.addClickListener(MenuOption.QUIT,(t) -> {
            this.dispose();
        });
        
        this.add(menu); 
    }
    private double getValuePercentage(double value, double percentage) {
        return value * percentage;
    }
    
    /*
    private void centerWindow() {
        this.pack();
        this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        this.setLocationRelativeTo(null);
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
