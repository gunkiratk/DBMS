/*
 * Created by JFormDesigner on Wed Apr 12 18:01:16 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Patient_Register extends JPanel {
    public Patient_Register() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        this2 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        textField8 = new JTextField();
        textField9 = new JTextField();
        textField10 = new JTextField();
        label10 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this2 ========
        {

            // JFormDesigner evaluation mark
            this2.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), this2.getBorder())); this2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            this2.setLayout(null);

            //---- label2 ----
            label2.setText("Patient ID");
            this2.add(label2);
            label2.setBounds(25, 60, label2.getPreferredSize().width, 15);

            //---- label3 ----
            label3.setText("Name");
            this2.add(label3);
            label3.setBounds(new Rectangle(new Point(25, 85), label3.getPreferredSize()));

            //---- label4 ----
            label4.setText("Age");
            this2.add(label4);
            label4.setBounds(new Rectangle(new Point(25, 110), label4.getPreferredSize()));

            //---- label5 ----
            label5.setText("Contact Number");
            this2.add(label5);
            label5.setBounds(new Rectangle(new Point(25, 135), label5.getPreferredSize()));

            //---- label6 ----
            label6.setText("Address");
            this2.add(label6);
            label6.setBounds(new Rectangle(new Point(25, 160), label6.getPreferredSize()));

            //---- label7 ----
            label7.setText("Gender");
            this2.add(label7);
            label7.setBounds(new Rectangle(new Point(25, 185), label7.getPreferredSize()));

            //---- label8 ----
            label8.setText("Date Admitted");
            this2.add(label8);
            label8.setBounds(new Rectangle(new Point(25, 210), label8.getPreferredSize()));

            //---- label9 ----
            label9.setText("Illness");
            this2.add(label9);
            label9.setBounds(new Rectangle(new Point(25, 235), label9.getPreferredSize()));

            //---- textField1 ----
            textField1.setText("editable = false");
            this2.add(textField1);
            textField1.setBounds(135, 55, 90, textField1.getPreferredSize().height);
            this2.add(textField2);
            textField2.setBounds(135, 80, 90, textField2.getPreferredSize().height);
            this2.add(textField3);
            textField3.setBounds(135, 105, 90, textField3.getPreferredSize().height);
            this2.add(textField4);
            textField4.setBounds(135, 130, 90, textField4.getPreferredSize().height);
            this2.add(textField5);
            textField5.setBounds(135, 155, 90, textField5.getPreferredSize().height);
            this2.add(textField6);
            textField6.setBounds(135, 180, 90, textField6.getPreferredSize().height);
            this2.add(textField7);
            textField7.setBounds(135, 205, 20, textField7.getPreferredSize().height);
            this2.add(textField8);
            textField8.setBounds(160, 205, 19, textField8.getPreferredSize().height);
            this2.add(textField9);
            textField9.setBounds(185, 205, 40, textField9.getPreferredSize().height);
            this2.add(textField10);
            textField10.setBounds(135, 230, 90, textField10.getPreferredSize().height);

            //---- label10 ----
            label10.setText("Register Patient");
            label10.setFont(label10.getFont().deriveFont(Font.PLAIN, label10.getFont().getSize() + 10f));
            label10.setHorizontalAlignment(SwingConstants.CENTER);
            this2.add(label10);
            label10.setBounds(0, 5, 400, 30);

            //---- button1 ----
            button1.setText("Register");
            this2.add(button1);
            button1.setBounds(new Rectangle(new Point(140, 260), button1.getPreferredSize()));

            //---- button2 ----
            button2.setText("Cancel");
            this2.add(button2);
            button2.setBounds(new Rectangle(new Point(210, 260), button2.getPreferredSize()));

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < this2.getComponentCount(); i++) {
                    Rectangle bounds = this2.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = this2.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                this2.setMinimumSize(preferredSize);
                this2.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vasu Agarwal
    private JPanel this2;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JLabel label10;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
