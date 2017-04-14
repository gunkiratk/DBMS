/*
 * Created by JFormDesigner on Wed Apr 12 19:07:45 IST 2017
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Doctor_SearchPatient extends JFrame {
    private int id;
    public Doctor_SearchPatient(int ID) {
        this.id = ID;
        initComponents();
        comboBox1.addItem("Name");
        comboBox1.addItem("Age");
        comboBox1.addItem("Illness");
        comboBox1.addItem("Gender");
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
            JOptionPane.showMessageDialog(null,"Fuck you again");
        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        setVisible(false);
        new MainPage_Login();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        label1 = new JLabel();
        button2 = new JButton();
        button1 = new JButton();
        comboBox1 = new JComboBox();
        textField1 = new JTextField();
        button3 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Search Patient");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        contentPane.add(label1);
        label1.setBounds(185, 10, label1.getPreferredSize().width, 30);

        //---- button2 ----
        button2.setText("Logout");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(370, 15, 100, button2.getPreferredSize().height);

        //---- button1 ----
        button1.setText("Home");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(15, 15, 100, button1.getPreferredSize().height);
        contentPane.add(comboBox1);
        comboBox1.setBounds(115, 50, 111, comboBox1.getPreferredSize().height);
        contentPane.add(textField1);
        textField1.setBounds(255, 50, 113, textField1.getPreferredSize().height);

        //---- button3 ----
        button3.setText("Search");
        contentPane.add(button3);
        button3.setBounds(200, 80, 100, button3.getPreferredSize().height);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(20, 120, 445, 200);

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
    private JButton button2;
    private JButton button1;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton button3;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables




}
