/*
 * Created by JFormDesigner on Thu Apr 13 00:08:33 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Patient_ViewAppointments extends JFrame {
    public Patient_ViewAppointments() {
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
        button3 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("Home");
        contentPane.add(button1);
        button1.setBounds(5, 5, 100, button1.getPreferredSize().height);

        //---- label1 ----
        label1.setText("View Appointments");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(150, 10), label1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Logout");
        contentPane.add(button2);
        button2.setBounds(360, 5, 100, button2.getPreferredSize().height);

        //---- button3 ----
        button3.setText("View");
        contentPane.add(button3);
        button3.setBounds(190, 40, 100, button3.getPreferredSize().height);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(15, 85, 435, 200);

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
    private JButton button3;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
