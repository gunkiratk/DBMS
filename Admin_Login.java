import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 18:24:39 IST 2017
 */



/**
 * @author Gunkirat Kaur
 */
public class Admin_Login extends JPanel {
    public Admin_Login() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gunkirat Kaur
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        button1 = new JButton();
        button2 = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button6 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //---- label1 ----
        label1.setText("Admin Details");
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 21));
        add(label1);
        label1.setBounds(new Rectangle(new Point(115, 20), label1.getPreferredSize()));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        add(scrollPane1);
        scrollPane1.setBounds(290, 30, 110, 95);

        //---- button1 ----
        button1.setText("Update Patient Details");
        add(button1);
        button1.setBounds(new Rectangle(new Point(40, 55), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Update Doctor Details");
        add(button2);
        button2.setBounds(40, 95, 171, button2.getPreferredSize().height);

        //---- label2 ----
        label2.setText("Search");
        add(label2);
        label2.setBounds(new Rectangle(new Point(25, 145), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("View");
        add(label3);
        label3.setBounds(new Rectangle(new Point(230, 145), label3.getPreferredSize()));

        //---- button3 ----
        button3.setText("Doctor");
        add(button3);
        button3.setBounds(105, 140, 80, 25);

        //---- button4 ----
        button4.setText("Patient");
        add(button4);
        button4.setBounds(105, 165, 78, 25);

        //---- button5 ----
        button5.setText("Prescription");
        add(button5);
        button5.setBounds(105, 190, button5.getPreferredSize().width, 25);

        //---- button7 ----
        button7.setText("Doctor");
        add(button7);
        button7.setBounds(280, 140, button7.getPreferredSize().width, 25);

        //---- button8 ----
        button8.setText("Patient");
        add(button8);
        button8.setBounds(280, 165, button8.getPreferredSize().width, 25);

        //---- button9 ----
        button9.setText("Prescription");
        add(button9);
        button9.setBounds(280, 190, 104, 24);

        //---- button10 ----
        button10.setText("Invoice");
        add(button10);
        button10.setBounds(105, 215, 90, 25);

        //---- button11 ----
        button11.setText("Invoice");
        add(button11);
        button11.setBounds(280, 215, 90, 25);

        //---- button6 ----
        button6.setText("Delete Patient ");
        add(button6);
        button6.setBounds(15, 275, 167, 32);

        //---- button12 ----
        button12.setText("Delete Doctor");
        add(button12);
        button12.setBounds(200, 280, 171, 32);

        //---- button13 ----
        button13.setText("Logout");
        add(button13);
        button13.setBounds(315, 5, 79, 25);

        //---- button14 ----
        button14.setText("Home");
        add(button14);
        button14.setBounds(5, 5, 79, 25);

        //---- button15 ----
        button15.setText("Appointment");
        add(button15);
        button15.setBounds(280, 240, 115, 25);

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
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton button1;
    private JButton button2;
    private JLabel label2;
    private JLabel label3;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button6;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
