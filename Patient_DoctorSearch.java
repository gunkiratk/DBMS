package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 18:52:45 IST 2017
 */



/**
 * @author Gunkirat Kaur
 */
public class Patient_DoctorSearch extends JFrame {

    public Patient_DoctorSearch() {
        initComponents();
        comboBox1.addItem("Name");
        comboBox1.addItem("Age");
        comboBox1.addItem("Specialisation");
        comboBox1.addItem("Gender");
        setLocationRelativeTo(null);
        setSize(480,350);
        setVisible(true);


    }

    private void comboBox1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button14ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gunkirat Kaur
        label1 = new JLabel();
        button14 = new JButton();
        button13 = new JButton();
        textField1 = new JTextField();
        panel1 = new JPanel();
        comboBox1 = new JComboBox();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Search Doctor");
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 21));
        contentPane.add(label1);
        label1.setBounds(165, 15, 155, label1.getPreferredSize().height);

        //---- button14 ----
        button14.setText("Home");
        button14.addActionListener(e -> button14ActionPerformed(e));
        contentPane.add(button14);
        button14.setBounds(10, 10, 100, 25);

        //---- button13 ----
        button13.setText("Logout");
        contentPane.add(button13);
        button13.setBounds(360, 10, 100, 25);
        contentPane.add(textField1);
        textField1.setBounds(235, 50, 130, 30);

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
//            panel1.setBorder(new javax.swing.border.CompoundBorder(
//                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
//                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
//                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
//                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(null);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(new Rectangle(new Point(85, 135), panel1.getPreferredSize()));

        //---- comboBox1 ----
        comboBox1.addActionListener(e -> comboBox1ActionPerformed(e));
        contentPane.add(comboBox1);
        comboBox1.setBounds(115, 50, 105, 30);

        //---- button1 ----
        button1.setText("Search");
        contentPane.add(button1);
        button1.setBounds(195, 90, 100, 30);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(20, 140, 445, 175);

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
    private JLabel label1;
    private JButton button14;
    private JButton button13;
    private JTextField textField1;
    private JPanel panel1;
    private JComboBox comboBox1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
