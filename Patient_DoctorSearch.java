import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 18:52:45 IST 2017
 */



/**
 * @author Gunkirat Kaur
 */
public class Patient_DoctorSearch extends JPanel {
    public Patient_DoctorSearch() {
        initComponents();
        comboBox1.addItem("Name");
        comboBox1.addItem("Age");
        comboBox1.addItem("Specialisation");
        comboBox1.addItem("Gender");


    }

    private void comboBox1ActionPerformed(ActionEvent e) {
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

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //---- label1 ----
        label1.setText("Search Doctor");
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 21));
        add(label1);
        label1.setBounds(125, 25, 155, label1.getPreferredSize().height);

        //---- button14 ----
        button14.setText("Home");
        add(button14);
        button14.setBounds(0, 0, 79, 25);

        //---- button13 ----
        button13.setText("Logout");
        add(button13);
        button13.setBounds(315, 5, 79, 25);
        add(textField1);
        textField1.setBounds(210, 60, 130, 30);

        //======== panel1 ========
        {
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
        add(panel1);
        panel1.setBounds(new Rectangle(new Point(85, 135), panel1.getPreferredSize()));

        //---- comboBox1 ----
        comboBox1.addActionListener(e -> comboBox1ActionPerformed(e));
        add(comboBox1);
        comboBox1.setBounds(60, 60, 105, 30);

        //---- button1 ----
        button1.setText("Search");
        add(button1);
        button1.setBounds(145, 110, 82, button1.getPreferredSize().height);

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
    private JTextField textField1;
    private JPanel panel1;
    private JComboBox comboBox1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
