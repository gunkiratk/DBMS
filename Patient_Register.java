/*
 * Created by JFormDesigner on Wed Apr 12 18:01:16 IST 2017
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

/**
 * @author Vasu Agarwal
 */
public class Patient_Register extends JFrame {
    static int counter = 0;
    int present_counter = 0;
    public Patient_Register() {
        counter++;
        present_counter = counter;
        initComponents();
        setSize(480,350);
        setLocationRelativeTo(null);
        setVisible(true);
        textField1.setText(String.valueOf(present_counter));
    }

    private void button1ActionPerformed(ActionEvent e) throws Exception {
        setVisible(false);
        Connection conn = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","abcd");
            String query = "INSERT INTO Patient " + "VALUES(" + present_counter + "," + "'" + textField2.getText() + "'," + Integer.valueOf(textField3.getText()) + "," + Integer.valueOf(textField4.getText()) + ",'" + textField5.getText() + "','" + textField6.getText() +"','" + textField9.getText() +"','" + textField10.getText() + "')";
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            conn.close();
            System.out.println("Updated");
        } finally
        {
            try
            {
                if(stmt!=null)
                    stmt.close();
            }
            catch(SQLException se2)
            {
            }
            try
            {
                if(conn!=null)
                    conn.close();
            }
            catch(SQLException se)
            {
                se.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(null,"Patient Registered");
        new MainPage_Login();
    }

    private void button2ActionPerformed(ActionEvent e) {
        setVisible(false);
        new MainPage_Login();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
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
        textField9 = new JTextField();
        textField10 = new JTextField();
        label10 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label2 ----
        label2.setText("Patient ID");
        contentPane.add(label2);
        label2.setBounds(140, 60, label2.getPreferredSize().width, 15);

        //---- label3 ----
        label3.setText("Name");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(140, 85), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("Age");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(140, 110), label4.getPreferredSize()));

        //---- label5 ----
        label5.setText("Contact Number");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(140, 135), label5.getPreferredSize()));

        //---- label6 ----
        label6.setText("Address");
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(140, 160), label6.getPreferredSize()));

        //---- label7 ----
        label7.setText("Gender");
        contentPane.add(label7);
        label7.setBounds(new Rectangle(new Point(140, 185), label7.getPreferredSize()));

        //---- label8 ----
        label8.setText("Date Admitted");
        contentPane.add(label8);
        label8.setBounds(new Rectangle(new Point(140, 210), label8.getPreferredSize()));

        //---- label9 ----
        label9.setText("Illness");
        contentPane.add(label9);
        label9.setBounds(new Rectangle(new Point(140, 235), label9.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(265, 55, 90, textField1.getPreferredSize().height);
        contentPane.add(textField2);
        textField2.setBounds(265, 80, 90, textField2.getPreferredSize().height);
        contentPane.add(textField3);
        textField3.setBounds(265, 105, 90, textField3.getPreferredSize().height);
        contentPane.add(textField4);
        textField4.setBounds(265, 130, 90, textField4.getPreferredSize().height);
        contentPane.add(textField5);
        textField5.setBounds(265, 155, 90, textField5.getPreferredSize().height);
        contentPane.add(textField6);
        textField6.setBounds(265, 180, 90, textField6.getPreferredSize().height);
        contentPane.add(textField9);
        textField9.setBounds(265, 205, 90, textField9.getPreferredSize().height);
        contentPane.add(textField10);
        textField10.setBounds(265, 230, 90, textField10.getPreferredSize().height);

        //---- label10 ----
        label10.setText("Register Patient");
        label10.setFont(label10.getFont().deriveFont(Font.PLAIN, label10.getFont().getSize() + 10f));
        label10.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label10);
        label10.setBounds(45, 5, 400, 30);

        //---- button1 ----
        button1.setText("Register");
        button1.addActionListener(e -> {
            try {
                button1ActionPerformed(e);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
        contentPane.add(button1);
        button1.setBounds(120, 260, 100, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText("Cancel");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(235, 260, 100, button2.getPreferredSize().height);

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
    private JTextField textField9;
    private JTextField textField10;
    private JLabel label10;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
