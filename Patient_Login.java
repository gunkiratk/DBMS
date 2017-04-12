/*
 * Created by JFormDesigner on Wed Apr 12 18:11:30 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Patient_Login extends JPanel {
    public Patient_Login() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        label2 = new JLabel();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setText("show details here");
            scrollPane1.setViewportView(textArea1);
        }
        add(scrollPane1);
        scrollPane1.setBounds(255, 50, 135, 140);

        //---- button1 ----
        button1.setText("Update Patient");
        add(button1);
        button1.setBounds(new Rectangle(new Point(40, 60), button1.getPreferredSize()));

        //---- label1 ----
        label1.setText("Search");
        add(label1);
        label1.setBounds(new Rectangle(new Point(40, 125), label1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Doctor");
        add(button2);
        button2.setBounds(new Rectangle(new Point(85, 115), button2.getPreferredSize()));

        //---- button3 ----
        button3.setText("Prescription");
        add(button3);
        button3.setBounds(new Rectangle(new Point(85, 145), button3.getPreferredSize()));

        //---- button4 ----
        button4.setText("Invoice");
        add(button4);
        button4.setBounds(new Rectangle(new Point(85, 175), button4.getPreferredSize()));

        //---- button5 ----
        button5.setText("Fix Appointment with Doctor");
        add(button5);
        button5.setBounds(new Rectangle(new Point(40, 230), button5.getPreferredSize()));

        //---- label2 ----
        label2.setText("Patient Details");
        label2.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        add(label2);
        label2.setBounds(0, 15, 400, label2.getPreferredSize().height);

        //---- button6 ----
        button6.setText("Logout");
        add(button6);
        button6.setBounds(new Rectangle(new Point(330, 5), button6.getPreferredSize()));

        //---- button7 ----
        button7.setText("Home");
        add(button7);
        button7.setBounds(new Rectangle(new Point(5, 5), button7.getPreferredSize()));

        //---- button8 ----
        button8.setText("View Appointments");
        add(button8);
        button8.setBounds(new Rectangle(new Point(235, 230), button8.getPreferredSize()));

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
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton button1;
    private JLabel label1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel label2;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
