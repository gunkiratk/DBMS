import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 18:40:28 IST 2017
 */



/**
 * @author Gunkirat Kaur
 */
public class Doctor_update extends JPanel {
    public Doctor_update() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gunkirat Kaur
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
        label7 = new JLabel();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //---- label1 ----
        label1.setText("Doctor Update");
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 21));
        add(label1);
        label1.setBounds(new Rectangle(new Point(120, 25), label1.getPreferredSize()));

        //---- button14 ----
        button14.setText("Home");
        add(button14);
        button14.setBounds(0, 0, 79, 25);

        //---- button13 ----
        button13.setText("Logout");
        add(button13);
        button13.setBounds(315, 0, 79, 25);
        add(textArea1);
        textArea1.setBounds(270, 75, 121, 170);

        //---- label3 ----
        label3.setText("Age");
        add(label3);
        label3.setBounds(25, 110, 30, 20);

        //---- label4 ----
        label4.setText("Contact Number");
        add(label4);
        label4.setBounds(30, 140, label4.getPreferredSize().width, 15);

        //---- label5 ----
        label5.setText("Address");
        add(label5);
        label5.setBounds(new Rectangle(new Point(25, 170), label5.getPreferredSize()));

        //---- label6 ----
        label6.setText("Name");
        add(label6);
        label6.setBounds(25, 80, 135, label6.getPreferredSize().height);
        add(textField1);
        textField1.setBounds(165, 110, 90, 20);
        add(textField2);
        textField2.setBounds(165, 140, 90, 20);
        add(textField3);
        textField3.setBounds(165, 170, 90, 20);
        add(textField4);
        textField4.setBounds(165, 80, 90, 20);

        //---- button1 ----
        button1.setText("Update");
        add(button1);
        button1.setBounds(new Rectangle(new Point(90, 230), button1.getPreferredSize()));

        //---- label7 ----
        label7.setText("Initial Details");
        label7.setFont(new Font(".SF NS Text", Font.PLAIN, 8));
        add(label7);
        label7.setBounds(310, 60, 87, label7.getPreferredSize().height);

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
    // Generated using JFormDesigner Evaluation license - Gunkirat Kaur
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
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
