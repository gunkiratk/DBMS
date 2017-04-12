/*
 * Created by JFormDesigner on Wed Apr 12 18:24:47 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Patient_Update extends JPanel {
    public Patient_Update() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        this2 = new JPanel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        label10 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this2 ========
        {

            // JFormDesigner evaluation mark
            this2.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), this2.getBorder())); this2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            this2.setLayout(null);

            //---- label3 ----
            label3.setText("Name");
            this2.add(label3);
            label3.setBounds(new Rectangle(new Point(25, 85), label3.getPreferredSize()));

            //---- label4 ----
            label4.setText("Age");
            this2.add(label4);
            label4.setBounds(new Rectangle(new Point(25, 110), label4.getPreferredSize()));

            //---- label5 ----
            label5.setText("Contact Number");
            this2.add(label5);
            label5.setBounds(new Rectangle(new Point(25, 135), label5.getPreferredSize()));

            //---- label6 ----
            label6.setText("Address");
            this2.add(label6);
            label6.setBounds(new Rectangle(new Point(25, 160), label6.getPreferredSize()));
            this2.add(textField2);
            textField2.setBounds(135, 80, 90, textField2.getPreferredSize().height);
            this2.add(textField3);
            textField3.setBounds(135, 105, 90, textField3.getPreferredSize().height);
            this2.add(textField4);
            textField4.setBounds(135, 130, 90, textField4.getPreferredSize().height);
            this2.add(textField5);
            textField5.setBounds(135, 155, 90, textField5.getPreferredSize().height);

            //---- label10 ----
            label10.setText("Update Patient");
            label10.setFont(label10.getFont().deriveFont(Font.PLAIN, label10.getFont().getSize() + 10f));
            label10.setHorizontalAlignment(SwingConstants.CENTER);
            this2.add(label10);
            label10.setBounds(125, 5, 165, 30);

            //======== scrollPane1 ========
            {

                //---- textArea1 ----
                textArea1.setText("show details here");
                scrollPane1.setViewportView(textArea1);
            }
            this2.add(scrollPane1);
            scrollPane1.setBounds(255, 55, 130, 145);

            //---- button1 ----
            button1.setText("Update");
            this2.add(button1);
            button1.setBounds(new Rectangle(new Point(170, 260), button1.getPreferredSize()));

            //---- button2 ----
            button2.setText("Home");
            this2.add(button2);
            button2.setBounds(new Rectangle(new Point(5, 5), button2.getPreferredSize()));

            //---- button3 ----
            button3.setText("Logout");
            this2.add(button3);
            button3.setBounds(new Rectangle(new Point(330, 5), button3.getPreferredSize()));

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
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel label10;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
