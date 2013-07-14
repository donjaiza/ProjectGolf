/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sun.natee.ton.control.api;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Installation-Laptop
 */
public class LockPanelCom extends JPanel {
    
    public void lockScreen(boolean check) {
        Component c, c2;
        for (int i = 0; i < getComponentCount(); i++) {
            c = getComponent(i);
            if(c.getClass()==JPanel.class){
                JPanel panel = (JPanel) getComponent(i);                
                for (int j = 0; j < panel.getComponentCount(); j++) {
                    c2 = panel.getComponent(j);
                    if (c2.getClass() == JTextField.class) {
                        JTextField text = (JTextField) c2;
                        text.setEditable(check);
                        //if(!check)text.setText("");
                        text.setBackground(Color.WHITE);
                    }
                    if (c2.getClass() == JFormattedTextField.class) {
                        JFormattedTextField text = (JFormattedTextField) c2;
                        text.setEditable(check);
                        //if(!check)text.setText("");
                        text.setBackground(Color.WHITE);
                    }
                    if (c2.getClass() == JComboBox.class) {
                        JComboBox text = (JComboBox) c2;
                        text.setEnabled(check);
                        if(!check)text.setSelectedIndex(0);
                        text.setBackground(Color.WHITE);
                    }
                    if (c2.getClass() == JButton.class) {
                        JButton text = (JButton) c2;
                        text.setEnabled(check);
                    }
                    if(c2.getClass()== JRadioButton.class){
                        JRadioButton radio=(JRadioButton)c2;
                        radio.setEnabled(check);
                    }
                }
            }
            
        }
    }
    
    public void lockScreen(JPanel panelMain, boolean check) {
        for (int i = 0; i < panelMain.getComponentCount(); i++) {
            Component c = panelMain.getComponent(i);
            if (c.getClass() == JTextField.class) {
                JTextField text = (JTextField) c;
                text.setEditable(check);
                //if(!check)text.setText("");
                //text.setBackground(Color.WHITE);
            }
            if (c.getClass() == JFormattedTextField.class) {
                JFormattedTextField text = (JFormattedTextField) c;
                text.setEditable(check);
                //if(!check)text.setText("");
                //text.setBackground(Color.WHITE);
            }
            if (c.getClass() == JComboBox.class) {
                JComboBox text = (JComboBox) c;
                text.setEnabled(check);
                //if(!check)text.setSelectedIndex(0);
                //text.setBackground(Color.WHITE);
            }
            if (c.getClass() == JButton.class) {
                JButton text = (JButton) c;
                text.setEnabled(check);
            }
            if(c.getClass()== JRadioButton.class){
                JRadioButton radio=(JRadioButton)c;
                radio.setEnabled(check);
            }
            
        }
    }
}
