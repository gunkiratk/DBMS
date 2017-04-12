/*
 * Created by JFormDesigner on Wed Apr 12 20:05:58 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Patient_FixAppointment extends JPanel {
    public Patient_FixAppointment() {
        initComponents();
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
        textField3 = new JTextField();
        textField4 = new JTextField();
        button3 = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //---- button1 ----
        button1.setText("Home");
        add(button1);
        button1.setBounds(new Rectangle(new Point(5, 5), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Logout");
        add(button2);
        button2.setBounds(new Rectangle(new Point(330, 5), button2.getPreferredSize()));

        //---- label1 ----
        label1.setText("Fix Appointment");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        add(label1);
        label1.setBounds(new Rectangle(new Point(125, 10), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("Time");
        add(label2);
        label2.setBounds(new Rectangle(new Point(140, 70), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("Date");
        add(label3);
        label3.setBounds(new Rectangle(new Point(140, 95), label3.getPreferredSize()));
        add(textField1);
        textField1.setBounds(175, 65, 95, textField1.getPreferredSize().height);
        add(textField2);
        textField2.setBounds(175, 90, 14, 22);
        add(textField3);
        textField3.setBounds(215, 90, 55, 22);
        add(textField4);
        textField4.setBounds(195, 90, 14, 22);

        //---- button3 ----
        button3.setText("Set appointment");
        add(button3);
        button3.setBounds(new Rectangle(new Point(150, 140), button3.getPreferredSize()));

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
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
