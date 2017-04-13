package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.sun.xml.internal.bind.v2.model.core.ID;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 18:24:39 IST 2017
 */



/**
 * @author Gunkirat Kaur
 */
public class Admin_Login extends JFrame {
    private int id;
    public Admin_Login(int ID) {
        this.id = ID;
        initComponents();
        setSize(480,350);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void button14ActionPerformed(ActionEvent e) {

        // TODO add your code here
    }

    private void button13ActionPerformed(ActionEvent e) {

        setVisible(false);
        new MainPage_Login();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button3ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Doctor_SearchDoctor(id);
    }

    private void button4ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Doctor_SearchPatient(id);
    }

    private void button5ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Search_Prescription(id);
    }

    private void button10ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Search_Invoice(id);
    }

    private void button7ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Admin_ViewDoctor(id);
    }

    private void button8ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Admin_ViewPatient(id);
    }

    private void button9ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Admin_ViewPrescription(id);
    }

    private void button11ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Admin_ViewInvoice(id);
    }

    private void button15ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Admin_ViewAppointment(id);
    }

    private void button6ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Admin_Delete(id);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        label2 = new JLabel();
        label3 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button6 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Admin Details");
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 21));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(160, 10), label1.getPreferredSize()));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(275, 40, 175, 95);

        //---- label2 ----
        label2.setText("Search");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(25, 145), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("View");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(230, 145), label3.getPreferredSize()));

        //---- button3 ----
        button3.setText("Doctor");
        button3.addActionListener(e -> button3ActionPerformed(e));
        contentPane.add(button3);
        button3.setBounds(75, 140, 135, 25);

        //---- button4 ----
        button4.setText("Patient");
        button4.addActionListener(e -> button4ActionPerformed(e));
        contentPane.add(button4);
        button4.setBounds(75, 165, 135, 25);

        //---- button5 ----
        button5.setText("Prescription");
        button5.addActionListener(e -> button5ActionPerformed(e));
        contentPane.add(button5);
        button5.setBounds(75, 190, 135, 25);

        //---- button7 ----
        button7.setText("Doctor");
        button7.addActionListener(e -> button7ActionPerformed(e));
        contentPane.add(button7);
        button7.setBounds(280, 140, 125, 25);

        //---- button8 ----
        button8.setText("Patient");
        button8.addActionListener(e -> button8ActionPerformed(e));
        contentPane.add(button8);
        button8.setBounds(280, 165, 125, 25);

        //---- button9 ----
        button9.setText("Prescription");
        button9.addActionListener(e -> button9ActionPerformed(e));
        contentPane.add(button9);
        button9.setBounds(280, 190, 125, 24);

        //---- button10 ----
        button10.setText("Invoice");
        button10.addActionListener(e -> button10ActionPerformed(e));
        contentPane.add(button10);
        button10.setBounds(75, 215, 135, 25);

        //---- button11 ----
        button11.setText("Invoice");
        button11.addActionListener(e -> button11ActionPerformed(e));
        contentPane.add(button11);
        button11.setBounds(280, 215, 125, 25);

        //---- button6 ----
        button6.setText("Delete Patient/Doctor");
        button6.addActionListener(e -> button6ActionPerformed(e));
        contentPane.add(button6);
        button6.setBounds(130, 275, 227, 32);

        //---- button13 ----
        button13.setText("Logout");
        button13.addActionListener(e -> button13ActionPerformed(e));
        contentPane.add(button13);
        button13.setBounds(350, 5, 100, 25);

        //---- button14 ----
        button14.setText("Home");
        button14.addActionListener(e -> button14ActionPerformed(e));
        contentPane.add(button14);
        button14.setBounds(5, 5, 100, 25);

        //---- button15 ----
        button15.setText("Appointment");
        button15.addActionListener(e -> button15ActionPerformed(e));
        contentPane.add(button15);
        button15.setBounds(280, 240, 125, 25);

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
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JLabel label2;
    private JLabel label3;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button6;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
