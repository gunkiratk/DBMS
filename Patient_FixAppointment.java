/*
 * Created by JFormDesigner on Wed Apr 12 20:05:58 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Patient_FixAppointment extends JFrame {
    public Patient_FixAppointment() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(480,350);
        setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        button1 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button3 = new JButton();
        textField4 = new JTextField();
        textField5 = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("Home");
        contentPane.add(button1);
        button1.setBounds(5, 15, 100, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText("Logout");
        contentPane.add(button2);
        button2.setBounds(365, 15, 100, button2.getPreferredSize().height);

        //---- label1 ----
        label1.setText("Fix Appointment");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(160, 20), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("Time");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(165, 85), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("Date");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(165, 110), label3.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(215, 80, 145, textField1.getPreferredSize().height);
        contentPane.add(textField2);
        textField2.setBounds(215, 105, 30, 22);

        //---- button3 ----
        button3.setText("Set appointment");
        contentPane.add(button3);
        button3.setBounds(125, 145, 195, button3.getPreferredSize().height);
        contentPane.add(textField4);
        textField4.setBounds(255, 105, 30, 22);
        contentPane.add(textField5);
        textField5.setBounds(295, 105, 65, 22);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vasu Agarwal
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button3;
    private JTextField textField4;
    private JTextField textField5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
