/*
 * Created by JFormDesigner on Wed Apr 12 19:09:48 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Patient_SearchPrescription extends JPanel {
    public Patient_SearchPrescription() {
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        button2 = new JButton();
        label1 = new JLabel();
        button1 = new JButton();
        label4 = new JLabel();
        textField2 = new JTextField();
        button5 = new JButton();
        label5 = new JLabel();
        textField3 = new JTextField();
        button6 = new JButton();
        label6 = new JLabel();
        button7 = new JButton();
        label7 = new JLabel();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //---- button2 ----
        button2.setText("Logout");
        add(button2);
        button2.setBounds(new Rectangle(new Point(330, 5), button2.getPreferredSize()));

        //---- label1 ----
        label1.setText("Search Prescription");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        add(label1);
        label1.setBounds(new Rectangle(new Point(105, 10), label1.getPreferredSize()));

        //---- button1 ----
        button1.setText("Home");
        add(button1);
        button1.setBounds(new Rectangle(new Point(5, 5), button1.getPreferredSize()));

        //---- label4 ----
        label4.setText("Doctor ID");
        add(label4);
        label4.setBounds(new Rectangle(new Point(120, 65), label4.getPreferredSize()));
        add(textField2);
        textField2.setBounds(215, 60, 65, textField2.getPreferredSize().height);

        //---- button5 ----
        button5.setText("Search");
        add(button5);
        button5.setBounds(165, 90, 68, button5.getPreferredSize().height);

        //---- label5 ----
        label5.setText("Prescription ID");
        add(label5);
        label5.setBounds(new Rectangle(new Point(120, 150), label5.getPreferredSize()));
        add(textField3);
        textField3.setBounds(215, 145, 65, textField3.getPreferredSize().height);

        //---- button6 ----
        button6.setText("Search");
        add(button6);
        button6.setBounds(165, 175, 68, button6.getPreferredSize().height);

        //---- label6 ----
        label6.setText("Or");
        add(label6);
        label6.setBounds(185, 210, 30, 15);

        //---- button7 ----
        button7.setText("View all");
        add(button7);
        button7.setBounds(new Rectangle(new Point(160, 225), button7.getPreferredSize()));

        //---- label7 ----
        label7.setText("Or");
        add(label7);
        label7.setBounds(185, 125, 30, 15);

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
    private JButton button2;
    private JLabel label1;
    private JButton button1;
    private JLabel label4;
    private JTextField textField2;
    private JButton button5;
    private JLabel label5;
    private JTextField textField3;
    private JButton button6;
    private JLabel label6;
    private JButton button7;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
