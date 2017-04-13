/*
 * Created by JFormDesigner on Wed Apr 12 18:24:47 IST 2017
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Vasu Agarwal
 */
public class Patient_Update extends JFrame {
    public Patient_Update() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(480,350);
        setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
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

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label3 ----
        label3.setText("Name");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(25, 85), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("Age");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(25, 110), label4.getPreferredSize()));

        //---- label5 ----
        label5.setText("Contact Number");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(25, 135), label5.getPreferredSize()));

        //---- label6 ----
        label6.setText("Address");
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(25, 160), label6.getPreferredSize()));
        contentPane.add(textField2);
        textField2.setBounds(155, 80, 90, textField2.getPreferredSize().height);
        contentPane.add(textField3);
        textField3.setBounds(155, 105, 90, textField3.getPreferredSize().height);
        contentPane.add(textField4);
        textField4.setBounds(155, 130, 90, textField4.getPreferredSize().height);
        contentPane.add(textField5);
        textField5.setBounds(155, 155, 90, textField5.getPreferredSize().height);

        //---- label10 ----
        label10.setText("Update Patient");
        label10.setFont(label10.getFont().deriveFont(Font.PLAIN, label10.getFont().getSize() + 10f));
        label10.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label10);
        label10.setBounds(155, 5, 165, 30);

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setText("show details here");
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(310, 55, 155, 155);

        //---- button1 ----
        button1.setText("Update");
        contentPane.add(button1);
        button1.setBounds(195, 255, 100, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText("Home");
        contentPane.add(button2);
        button2.setBounds(5, 5, 100, button2.getPreferredSize().height);

        //---- button3 ----
        button3.setText("Logout");
        contentPane.add(button3);
        button3.setBounds(365, 5, 100, button3.getPreferredSize().height);

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
