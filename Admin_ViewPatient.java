/*
 * Created by JFormDesigner on Wed Apr 12 23:59:36 IST 2017
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Admin_ViewPatient extends JFrame {
    private int id;
    public Admin_ViewPatient(int ID) {
        initComponents();
        setSize(480,350);
        setLocationRelativeTo(null);
        setVisible(true);
        this.id = ID;
    }

    private void button4ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Admin_Login(id);
    }

    private void button5ActionPerformed(ActionEvent e) {
        setVisible(false);
        new MainPage_Login();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        button4 = new JButton();
        label2 = new JLabel();
        button5 = new JButton();
        button6 = new JButton();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button4 ----
        button4.setText("Home");
        button4.addActionListener(e -> button4ActionPerformed(e));
        contentPane.add(button4);
        button4.setBounds(5, 5, 100, button4.getPreferredSize().height);

        //---- label2 ----
        label2.setText("View Patient");
        label2.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(180, 10), label2.getPreferredSize()));

        //---- button5 ----
        button5.setText("Logout");
        button5.addActionListener(e -> button5ActionPerformed(e));
        contentPane.add(button5);
        button5.setBounds(365, 5, 100, button5.getPreferredSize().height);

        //---- button6 ----
        button6.setText("View");
        contentPane.add(button6);
        button6.setBounds(190, 40, 100, button6.getPreferredSize().height);

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(table2);
        }
        contentPane.add(scrollPane2);
        scrollPane2.setBounds(15, 80, 445, 200);

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
        setSize(480, 330);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vasu Agarwal
    private JButton button4;
    private JLabel label2;
    private JButton button5;
    private JButton button6;
    private JScrollPane scrollPane2;
    private JTable table2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
