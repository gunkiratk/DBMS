package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 20:10:49 IST 2017
 */



/**
 * @author Gunkirat Kaur
 */
public class Create_invoice extends JFrame {
    private int id;
    public Create_invoice(int ID) {
        this.id = ID;
        initComponents();
        setSize(480,350);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void button14ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Doctor_Login(id);
        // TODO add your code here
    }

    private void button13ActionPerformed(ActionEvent e) {
        setVisible(false);
        new MainPage_Login();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        label1 = new JLabel();
        button14 = new JButton();
        button13 = new JButton();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        button1 = new JButton();
        label4 = new JLabel();
        textField3 = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Create Invoice");
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 17));
        contentPane.add(label1);
        label1.setBounds(175, 10, 130, 26);

        //---- button14 ----
        button14.setText("Home");
        button14.addActionListener(e -> button14ActionPerformed(e));
        contentPane.add(button14);
        button14.setBounds(15, 5, 100, 25);

        //---- button13 ----
        button13.setText("Logout");
        button13.addActionListener(e -> button13ActionPerformed(e));
        contentPane.add(button13);
        button13.setBounds(365, 5, 100, 25);

        //---- label2 ----
        label2.setText("Patient ID");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(125, 73), label2.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(225, 70, 115, 20);

        //---- label3 ----
        label3.setText("Amount");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(125, 105), label3.getPreferredSize()));
        contentPane.add(textField2);
        textField2.setBounds(225, 102, 115, 20);

        //---- button1 ----
        button1.setText("Create");
        contentPane.add(button1);
        button1.setBounds(200, 170, 100, button1.getPreferredSize().height);

        //---- label4 ----
        label4.setText("Due Date");
        contentPane.add(label4);
        label4.setBounds(125, 137, 100, 16);
        contentPane.add(textField3);
        textField3.setBounds(225, 135, 115, 20);

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
    private JButton button14;
    private JButton button13;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JButton button1;
    private JLabel label4;
    private JTextField textField3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
