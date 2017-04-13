/*
 * Created by JFormDesigner on Wed Apr 12 18:01:43 IST 2017
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class MainPage_Login extends JFrame {
    private int id;
    public MainPage_Login() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(480,350);
    }

    private void button2ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Patient_Register();
    }

    private void button3ActionPerformed(ActionEvent e) {
        setVisible(false);
        new Doctor_Register();
    }

    private void button1ActionPerformed(ActionEvent e) {
        setVisible(false);
        id = Integer.valueOf(textField1.getText());
        if(id==0)
        {
            dispose();
            new Admin_Login(0);
        }
        else if(id>0 && id<5000)
        {
            dispose();
            new Patient_Login(id);
        }
        else if(id>=5000 && id<=10000)
        {
            dispose();
            new Doctor_Login(id);
        }
        else
            JOptionPane.showMessageDialog(null,"Login Failed");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Medical Records Management System");
        label1.setFont(new Font("Ubuntu", Font.PLAIN, 21));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(55, 15), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("ID");
        contentPane.add(label2);
        label2.setBounds(155, 85, 55, label2.getPreferredSize().height);
        contentPane.add(textField1);
        textField1.setBounds(200, 80, 75, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("Sign In");
        button1.addActionListener(e -> {
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
			button1ActionPerformed(e);
		});
        contentPane.add(button1);
        button1.setBounds(165, 120, 100, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText("Sign Up as a Patient");
        button2.addActionListener(e -> {
			button2ActionPerformed(e);
			button2ActionPerformed(e);
		});
        contentPane.add(button2);
        button2.setBounds(280, 250, 190, button2.getPreferredSize().height);

        //---- button3 ----
        button3.setText("Sign Up as a Doctor");
        button3.addActionListener(e -> button3ActionPerformed(e));
        contentPane.add(button3);
        button3.setBounds(280, 280, 190, 30);

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
    private JLabel label2;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
