/*
 * Created by JFormDesigner on Thu Apr 13 00:12:56 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Complex_Query1 extends JPanel {
    public Complex_Query1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        this2 = new JPanel();
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();
        button3 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();

        //======== this2 ========
        {

            // JFormDesigner evaluation mark
            this2.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), this2.getBorder())); this2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            this2.setLayout(null);

            //---- button1 ----
            button1.setText("Home");
            this2.add(button1);
            button1.setBounds(new Rectangle(new Point(5, 5), button1.getPreferredSize()));

            //---- label1 ----
            label1.setText("View Doctors");
            label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
            this2.add(label1);
            label1.setBounds(new Rectangle(new Point(210, 10), label1.getPreferredSize()));

            //---- button2 ----
            button2.setText("Logout");
            this2.add(button2);
            button2.setBounds(new Rectangle(new Point(450, 5), button2.getPreferredSize()));

            //---- button3 ----
            button3.setText("View");
            this2.add(button3);
            button3.setBounds(new Rectangle(new Point(245, 85), button3.getPreferredSize()));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }
            this2.add(scrollPane1);
            scrollPane1.setBounds(15, 130, 500, 155);

            //---- label2 ----
            label2.setText("Illness");
            this2.add(label2);
            label2.setBounds(new Rectangle(new Point(220, 65), label2.getPreferredSize()));
            this2.add(textField1);
            textField1.setBounds(265, 60, 70, textField1.getPreferredSize().height);

            //---- label3 ----
            label3.setText("Complex Query 1 - Display Doctors which the Patient can consult on type of illness selected by Patient.");
            this2.add(label3);
            label3.setBounds(5, 25, 600, 40);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < this2.getComponentCount(); i++) {
                    Rectangle bounds = this2.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = this2.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                this2.setMinimumSize(preferredSize);
                this2.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vasu Agarwal
    private JPanel this2;
    private JButton button1;
    private JLabel label1;
    private JButton button2;
    private JButton button3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
