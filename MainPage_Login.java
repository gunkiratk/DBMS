/*
 * Created by JFormDesigner on Wed Apr 12 18:01:43 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class MainPage_Login extends JFrame {
    public MainPage_Login() {
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        passwordField1 = new JPasswordField();

        //======== this ========

/*        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});
*/
        setLayout(null);

        //---- label1 ----
        label1.setText("Medical Records Management System");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        add(label1);
        label1.setBounds(new Rectangle(new Point(25, 30), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("Username");
        add(label2);
        label2.setBounds(new Rectangle(new Point(130, 85), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("Password");
        add(label3);
        label3.setBounds(new Rectangle(new Point(130, 110), label3.getPreferredSize()));
        add(textField1);
        textField1.setBounds(200, 80, 75, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("Sign In");
        add(button1);
        button1.setBounds(new Rectangle(new Point(175, 145), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Sign Up");
        add(button2);
        button2.setBounds(new Rectangle(new Point(325, 255), button2.getPreferredSize()));
        add(passwordField1);
        passwordField1.setBounds(200, 105, 75, passwordField1.getPreferredSize().height);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vasu Agarwal
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JPasswordField passwordField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
