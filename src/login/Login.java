/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import View.Loginframe;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author Vijay kumar
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
         try {
             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

    UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      database.DB.load();
      new Loginframe().setVisible(true);
   ImageIcon img = new ImageIcon("H:\\Java Project\\Java\\vijay final project\\Student System Management\\src\\Images");

    }


    
}
