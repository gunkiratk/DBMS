/*
 * Created by JFormDesigner on Wed Apr 12 19:09:56 IST 2017
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Search_Invoice extends JFrame {
    private int id;
    public Search_Invoice(int ID) {
        this.id = ID;
        initComponents();
        setLocationRelativeTo(null);
        setSize(480,350);
        setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        setVisible(false);
        if(id==0)
            new Admin_Login(id);
        else if(id<5000 && id>0)
            new Patient_Login(id);
        else if(id>=5000 && id<=10000)
            new Doctor_Login(id);
        else
            JOptionPane.showMessageDialog(null,"Fuckyou");
    }

    private void button2ActionPerformed(ActionEvent e) {
        setVisible(false);
        new MainPage_Login();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();
        label3 = new JLabel();
        button4 = new JButton();
        label4 = new JLabel();
        textField2 = new JTextField();
        button5 = new JButton();
        table1 = new JTable();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("Home");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(10, 5, 100, button1.getPreferredSize().height);

        //---- label1 ----
        label1.setText("Search Invoice");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(170, 10), label1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Logout");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(365, 5, 100, button2.getPreferredSize().height);

        //---- label3 ----
        label3.setText("Or");
        contentPane.add(label3);
        label3.setBounds(245, 110, 20, 15);

        //---- button4 ----
        button4.setText("View all");
        contentPane.add(button4);
        button4.setBounds(205, 130, 100, button4.getPreferredSize().height);

        //---- label4 ----
        label4.setText("Invoice ID");
        contentPane.add(label4);
        label4.setBounds(160, 50, 85, 14);
        contentPane.add(textField2);
        textField2.setBounds(255, 45, 65, 22);

        //---- button5 ----
        button5.setText("Search");
        contentPane.add(button5);
        button5.setBounds(205, 75, 100, 30);
        contentPane.add(table1);
        table1.setBounds(15, 165, 443, 140);

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
    private JLabel label1;
    private JButton button2;
    private JLabel label3;
    private JButton button4;
    private JLabel label4;
    private JTextField textField2;
    private JButton button5;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
