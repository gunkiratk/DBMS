/*
 * Created by JFormDesigner on Wed Apr 12 19:07:45 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Doctor_SearchPatient extends JPanel {
    public Doctor_SearchPatient() {
        initComponents();
        comboBox1.addItem("Name");
        comboBox1.addItem("Age");
        comboBox1.addItem("Illness");
        comboBox1.addItem("Gender");
        setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();
        comboBox1 = new JComboBox();
        textField1 = new JTextField();
        button3 = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new MigLayout(
            "insets 0,hidemode 3,gap 5 5",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- button1 ----
        button1.setText("Home");
        add(button1, "cell 0 0");

        //---- label1 ----
        label1.setText("Search Patient");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        add(label1, "cell 3 0 2 1");

        //---- button2 ----
        button2.setText("Logout");
        add(button2, "cell 8 0");
        add(comboBox1, "cell 2 4");
        add(textField1, "cell 4 4");

        //---- button3 ----
        button3.setText("Search");
        add(button3, "cell 3 6 2 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vasu Agarwal
    private JButton button1;
    private JLabel label1;
    private JButton button2;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables




}
