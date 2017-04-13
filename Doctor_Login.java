package com.company;
import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 18:13:56 IST 2017
 */



/**
 * @author Gunkirat Kaur
 */
public class Doctor_Login extends JFrame {
    public Doctor_Login() {
        initComponents();
        setSize(480,350);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        button1 = new JButton();
        label3 = new JLabel();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button6 = new JButton();
        button7 = new JButton();

        //======== this ========

/*        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});
*/
        setLayout(null);

        //---- label1 ----
        label1.setText("Doctor Details");
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 21));
        add(label1);
        label1.setBounds(new Rectangle(new Point(175, 10), label1.getPreferredSize()));
        add(label2);
        label2.setBounds(265, 43, 43, label2.getPreferredSize().height);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        add(scrollPane1);
        scrollPane1.setBounds(340, 40, 125, 110);

        //---- button1 ----
        button1.setText("Update Doctor Details");
        add(button1);
        button1.setBounds(60, 60, 225, button1.getPreferredSize().height);

        //---- label3 ----
        label3.setText("Search");
        label3.setFont(new Font(".SF NS Text", Font.PLAIN, 15));
        add(label3);
        label3.setBounds(90, 110, 52, 25);

        //---- button2 ----
        button2.setText("Doctor");
        add(button2);
        button2.setBounds(165, 107, 125, button2.getPreferredSize().height);

        //---- button3 ----
        button3.setText("Patient");
        add(button3);
        button3.setBounds(165, 145, 125, button3.getPreferredSize().height);

        //---- button4 ----
        button4.setText("Prescription");
        add(button4);
        button4.setBounds(165, 180, 125, button4.getPreferredSize().height);

        //---- button5 ----
        button5.setText("Invoice");
        add(button5);
        button5.setBounds(165, 215, 125, button5.getPreferredSize().height);

        //---- button13 ----
        button13.setText("Logout");
        add(button13);
        button13.setBounds(370, 10, 100, 25);

        //---- button14 ----
        button14.setText("Home");
        add(button14);
        button14.setBounds(10, 10, 100, 25);

        //---- button6 ----
        button6.setText("Create Prescription");
        add(button6);
        button6.setBounds(50, 270, 175, 32);

        //---- button7 ----
        button7.setText("Create Invoice");
        add(button7);
        button7.setBounds(275, 270, 155, 32);

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
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton button1;
    private JLabel label3;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button13;
    private JButton button14;
    private JButton button6;
    private JButton button7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
