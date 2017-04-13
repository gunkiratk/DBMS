/*
 * Created by JFormDesigner on Wed Apr 12 18:11:30 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Patient_Login extends JFrame {
    public Patient_Login() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(480,350);
        setVisible(true);
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
        button9 = new JButton();
        button10 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setText("show details here");
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(290, 50, 175, 155);

        //---- button1 ----
        button1.setText("Update Patient");
        contentPane.add(button1);
        button1.setBounds(50, 65, 175, button1.getPreferredSize().height);

        //---- label1 ----
        label1.setText("Search");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(60, 125), label1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Doctor");
        contentPane.add(button2);
        button2.setBounds(110, 115, 140, button2.getPreferredSize().height);

        //---- button3 ----
        button3.setText("Prescription");
        contentPane.add(button3);
        button3.setBounds(110, 145, 140, button3.getPreferredSize().height);

        //---- button4 ----
        button4.setText("Invoice");
        contentPane.add(button4);
        button4.setBounds(110, 175, 140, button4.getPreferredSize().height);

        //---- button5 ----
        button5.setText("Fix Appointment");
        contentPane.add(button5);
        button5.setBounds(250, 230, 160, button5.getPreferredSize().height);

        //---- label2 ----
        label2.setText("Patient Details");
        label2.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label2);
        label2.setBounds(35, 15, 400, label2.getPreferredSize().height);

        //---- button6 ----
        button6.setText("Logout");
        contentPane.add(button6);
        button6.setBounds(365, 10, 100, button6.getPreferredSize().height);

        //---- button7 ----
        button7.setText("Home");
        contentPane.add(button7);
        button7.setBounds(5, 5, 100, button7.getPreferredSize().height);

        //---- button8 ----
        button8.setText("View Appointments");
        contentPane.add(button8);
        button8.setBounds(40, 230, 160, button8.getPreferredSize().height);

        //---- button9 ----
        button9.setText("Complex Query 1");
        contentPane.add(button9);
        button9.setBounds(40, 270, 160, button9.getPreferredSize().height);

        //---- button10 ----
        button10.setText("Complex Query 2");
        contentPane.add(button10);
        button10.setBounds(250, 270, 160, 30);

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
    private JButton button9;
    private JButton button10;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
