/*
 * Created by JFormDesigner on Wed Apr 12 23:57:35 IST 2017
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Admin_Delete extends JFrame {
    private int id;
    public Admin_Delete(int ID) {
        this.id = ID;
        initComponents();
        setSize(480,350);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        setVisible(false);
        new Admin_Login(0);
    }

    private void button2ActionPerformed(ActionEvent e) {
        setVisible(false);
        MainPage_Login m = new MainPage_Login();
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        button4 = new JButton();
        textField3 = new JTextField();
        button5 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Delete Patient/Doctor");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(125, 10), label1.getPreferredSize()));

        //---- button1 ----
        button1.setText("Home");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(5, 5, 100, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText("Logout");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(350, 5, 100, button2.getPreferredSize().height);

        //---- label2 ----
        label2.setText("Patient ID");
        contentPane.add(label2);
        label2.setBounds(130, 70, label2.getPreferredSize().width, 15);
        contentPane.add(textField1);
        textField1.setBounds(205, 65, 50, textField1.getPreferredSize().height);

        //---- label3 ----
        label3.setText("Or");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(190, 135), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("Doctor ID");
        contentPane.add(label4);
        label4.setBounds(125, 165, 70, 14);

        //---- button4 ----
        button4.setText("Delete");
        contentPane.add(button4);
        button4.setBounds(170, 190, 100, 30);
        contentPane.add(textField3);
        textField3.setBounds(205, 160, 50, 22);

        //---- button5 ----
        button5.setText("Delete");
        contentPane.add(button5);
        button5.setBounds(170, 95, 100, 30);

        contentPane.setPreferredSize(new Dimension(465, 310));
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vasu Agarwal
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JLabel label4;
    private JButton button4;
    private JTextField textField3;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
