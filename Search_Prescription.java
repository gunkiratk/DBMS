/*
 * Created by JFormDesigner on Wed Apr 12 19:09:48 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Search_Prescription extends JFrame {
    public Search_Prescription() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(480,350);
        setVisible(true);
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
        contentPane.add(button1);
        button1.setBounds(10, 5, 100, button1.getPreferredSize().height);

        //---- label1 ----
        label1.setText("Search Prescription");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(145, 10), label1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Logout");
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
        label4.setText("Prescription ID");
        contentPane.add(label4);
        label4.setBounds(130, 50, 115, 14);
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
