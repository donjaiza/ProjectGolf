package sun.natee.ton.control.api;

import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author surapol
 */
public class PUtility {
    public static void ShowMsg(String StrMsg) {
        //JOptionPane jd = new JOptionPane() ;
        JOptionPane.showMessageDialog(null, StrMsg, "Show Message Dialog...", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void ShowError(String StrMsg) {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), StrMsg, "Show Error Dialog...", JOptionPane.ERROR_MESSAGE);

    }

    public static void ShowMyMsg(java.awt.Component TComponent, String StrMsg) {
        JOptionPane.showMessageDialog(TComponent, StrMsg, "Show Error Dialog...", JOptionPane.ERROR_MESSAGE);

    }

    public static void ShowWaring(String StrMsg) {
        JOptionPane.showMessageDialog(null, StrMsg, "Show Waring Dialog...", JOptionPane.WARNING_MESSAGE);
    }
}
