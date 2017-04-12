/*
 * Created by JFormDesigner on Wed Apr 12 23:57:35 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Admin_Delete extends JPanel {
    public Admin_Delete() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label2 = new JLabel();
        textField1 = new JTextField();
        button3 = new JButton();
        label3 = new JLabel();
        label4 = new JLabel();
        button4 = new JButton();
        textField3 = new JTextField();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //---- label1 ----
        label1.setText("Delete Patient/Doctor");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        add(label1);
        label1.setBounds(new Rectangle(new Point(90, 10), label1.getPreferredSize()));

        //---- button1 ----
        button1.setText("Home");
        add(button1);
        button1.setBounds(new Rectangle(new Point(5, 5), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Logout");
        add(button2);
        button2.setBounds(new Rectangle(new Point(330, 5), button2.getPreferredSize()));

        //---- label2 ----
        label2.setText("Patient ID");
        add(label2);
        label2.setBounds(130, 70, label2.getPreferredSize().width, 15);
        add(textField1);
        textField1.setBounds(205, 65, 50, textField1.getPreferredSize().height);

        //---- button3 ----
        button3.setText("Delete");
        add(button3);
        button3.setBounds(new Rectangle(new Point(165, 95), button3.getPreferredSize()));

        //---- label3 ----
        label3.setText("Or");
        add(label3);
        label3.setBounds(new Rectangle(new Point(190, 135), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("Doctor ID");
        add(label4);
        label4.setBounds(135, 165, 50, 14);

        //---- button4 ----
        button4.setText("Delete");
        add(button4);
        button4.setBounds(170, 190, 63, 30);
        add(textField3);
        textField3.setBounds(205, 160, 50, 22);

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
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JLabel label2;
    private JTextField textField1;
    private JButton button3;
    private JLabel label3;
    private JLabel label4;
    private JButton button4;
    private JTextField textField3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
