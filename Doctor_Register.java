package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 17:53:51 IST 2017
 */



/**
 * @author unknown
 */
public class Doctor_Register extends JFrame {
    public Doctor_Register() {
        initComponents();
        setSize(480,350);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        setVisible(false);
        new MainPage_Login();
    }

    private void button2ActionPerformed(ActionEvent e) {
        setVisible(false);

        JOptionPane.showMessageDialog(null,"Doctor Registered");
        new MainPage_Login();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gunkirat Kaur
        label7 = new JLabel();
        label1 = new JLabel();
        textField6 = new JTextField();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        textField4 = new JTextField();
        label6 = new JLabel();
        textField5 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        label8 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label7 ----
        label7.setText("Register Doctor");
        label7.setFont(new Font(".SF NS Text", Font.PLAIN, 21));
        contentPane.add(label7);
        label7.setBounds(165, 15, 175, 30);

        //---- label1 ----
        label1.setText("Name");
        contentPane.add(label1);
        label1.setBounds(120, 75, 133, label1.getPreferredSize().height);
        contentPane.add(textField6);
        textField6.setBounds(255, 70, 128, textField6.getPreferredSize().height);

        //---- label2 ----
        label2.setText("Age");
        contentPane.add(label2);
        label2.setBounds(120, 100, 133, label2.getPreferredSize().height);
        contentPane.add(textField1);
        textField1.setBounds(255, 100, 128, textField1.getPreferredSize().height);

        //---- label3 ----
        label3.setText("Contact Number");
        contentPane.add(label3);
        label3.setBounds(120, 135, 133, label3.getPreferredSize().height);
        contentPane.add(textField2);
        textField2.setBounds(255, 130, 128, textField2.getPreferredSize().height);

        //---- label4 ----
        label4.setText("Address");
        contentPane.add(label4);
        label4.setBounds(120, 165, 133, label4.getPreferredSize().height);
        contentPane.add(textField3);
        textField3.setBounds(255, 160, 128, textField3.getPreferredSize().height);

        //---- label5 ----
        label5.setText("Gender");
        contentPane.add(label5);
        label5.setBounds(120, 195, 133, label5.getPreferredSize().height);
        contentPane.add(textField4);
        textField4.setBounds(255, 190, 128, textField4.getPreferredSize().height);

        //---- label6 ----
        label6.setText("Field of");
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(120, 225), label6.getPreferredSize()));
        contentPane.add(textField5);
        textField5.setBounds(255, 220, 128, textField5.getPreferredSize().height);

        //---- button1 ----
        button1.setText("Cancel");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(95, 265, 100, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText("Register");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(305, 265, 100, 32);

        //---- label8 ----
        label8.setText("Specialization");
        contentPane.add(label8);
        label8.setBounds(new Rectangle(new Point(120, 240), label8.getPreferredSize()));

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
    // Generated using JFormDesigner Evaluation license - Gunkirat Kaur
    private JLabel label7;
    private JLabel label1;
    private JTextField textField6;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private JTextField textField4;
    private JLabel label6;
    private JTextField textField5;
    private JButton button1;
    private JButton button2;
    private JLabel label8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

