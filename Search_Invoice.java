/*
 * Created by JFormDesigner on Wed Apr 12 19:09:56 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Search_Invoice extends JPanel {
    public Search_Invoice() {
        initComponents();
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

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //---- button1 ----
        button1.setText("Home");
        add(button1);
        button1.setBounds(new Rectangle(new Point(5, 5), button1.getPreferredSize()));

        //---- label1 ----
        label1.setText("Search Invoice");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        add(label1);
        label1.setBounds(new Rectangle(new Point(130, 10), label1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Logout");
        add(button2);
        button2.setBounds(new Rectangle(new Point(330, 5), button2.getPreferredSize()));

        //---- label3 ----
        label3.setText("Or");
        add(label3);
        label3.setBounds(190, 160, 30, 15);

        //---- button4 ----
        button4.setText("View all");
        add(button4);
        button4.setBounds(new Rectangle(new Point(165, 175), button4.getPreferredSize()));

        //---- label4 ----
        label4.setText("Invoice ID");
        add(label4);
        label4.setBounds(125, 100, 49, 14);
        add(textField2);
        textField2.setBounds(220, 95, 65, 22);

        //---- button5 ----
        button5.setText("Search");
        add(button5);
        button5.setBounds(170, 125, 68, 30);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
