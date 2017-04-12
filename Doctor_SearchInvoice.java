/*
 * Created by JFormDesigner on Wed Apr 12 19:51:53 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Doctor_SearchInvoice extends JPanel {
    public Doctor_SearchInvoice() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        this2 = new JPanel();
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();
        textField1 = new JTextField();
        label2 = new JLabel();
        button3 = new JButton();
        label3 = new JLabel();
        button4 = new JButton();
        label4 = new JLabel();
        textField2 = new JTextField();
        button5 = new JButton();
        label5 = new JLabel();

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
            label1.setText("Search Invoice");
            label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
            this2.add(label1);
            label1.setBounds(new Rectangle(new Point(130, 10), label1.getPreferredSize()));

            //---- button2 ----
            button2.setText("Logout");
            this2.add(button2);
            button2.setBounds(new Rectangle(new Point(330, 5), button2.getPreferredSize()));
            this2.add(textField1);
            textField1.setBounds(220, 80, 65, textField1.getPreferredSize().height);

            //---- label2 ----
            label2.setText("Patient ID");
            this2.add(label2);
            label2.setBounds(new Rectangle(new Point(125, 85), label2.getPreferredSize()));

            //---- button3 ----
            button3.setText("Search");
            this2.add(button3);
            button3.setBounds(170, 110, 68, button3.getPreferredSize().height);

            //---- label3 ----
            label3.setText("Or");
            this2.add(label3);
            label3.setBounds(195, 230, 30, 15);

            //---- button4 ----
            button4.setText("View all");
            this2.add(button4);
            button4.setBounds(new Rectangle(new Point(170, 245), button4.getPreferredSize()));

            //---- label4 ----
            label4.setText("Invoice ID");
            this2.add(label4);
            label4.setBounds(125, 170, 49, 14);
            this2.add(textField2);
            textField2.setBounds(220, 165, 65, 22);

            //---- button5 ----
            button5.setText("Search");
            this2.add(button5);
            button5.setBounds(170, 195, 68, 30);

            //---- label5 ----
            label5.setText("Or");
            this2.add(label5);
            label5.setBounds(195, 145, 30, 15);

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
    private JTextField textField1;
    private JLabel label2;
    private JButton button3;
    private JLabel label3;
    private JButton button4;
    private JLabel label4;
    private JTextField textField2;
    private JButton button5;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
