package com.company;
import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 18:40:28 IST 2017
 */



/**
 * @author Gunkirat Kaur
 */
public class Doctor_update extends JFrame {
    public Doctor_update() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(480,350);
        setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        label1 = new JLabel();
        button14 = new JButton();
        button13 = new JButton();
        textArea1 = new JTextArea();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Doctor Update");
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 21));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(160, 20), label1.getPreferredSize()));

        //---- button14 ----
        button14.setText("Home");
        contentPane.add(button14);
        button14.setBounds(10, 15, 100, 25);

        //---- button13 ----
        button13.setText("Logout");
        contentPane.add(button13);
        button13.setBounds(355, 15, 100, 25);
        contentPane.add(textArea1);
        textArea1.setBounds(330, 75, 121, 170);

        //---- label3 ----
        label3.setText("Age");
        contentPane.add(label3);
        label3.setBounds(25, 110, 30, 20);

        //---- label4 ----
        label4.setText("Contact Number");
        contentPane.add(label4);
        label4.setBounds(25, 143, label4.getPreferredSize().width, 15);

        //---- label5 ----
        label5.setText("Address");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(25, 170), label5.getPreferredSize()));

        //---- label6 ----
        label6.setText("Name");
        contentPane.add(label6);
        label6.setBounds(25, 83, 135, label6.getPreferredSize().height);
        contentPane.add(textField1);
        textField1.setBounds(165, 110, 90, 20);
        contentPane.add(textField2);
        textField2.setBounds(165, 140, 90, 20);
        contentPane.add(textField3);
        textField3.setBounds(165, 167, 90, 20);
        contentPane.add(textField4);
        textField4.setBounds(165, 80, 90, 20);

        //---- button1 ----
        button1.setText("Update");
        contentPane.add(button1);
        button1.setBounds(105, 215, 100, button1.getPreferredSize().height);

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
    private JLabel label1;
    private JButton button14;
    private JButton button13;
    private JTextArea textArea1;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
