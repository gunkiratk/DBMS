import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 17:53:51 IST 2017
 */



/**
 * @author unknown
 */
public class Doctor_Register extends JPanel {
    public Doctor_Register() {
        initComponents();
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

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //---- label7 ----
        label7.setText("Register Doctor");
        label7.setFont(new Font(".SF NS Text", Font.PLAIN, 21));
        add(label7);
        label7.setBounds(115, 20, 175, 30);

        //---- label1 ----
        label1.setText("Name");
        add(label1);
        label1.setBounds(70, 75, 133, label1.getPreferredSize().height);
        add(textField6);
        textField6.setBounds(205, 70, 128, textField6.getPreferredSize().height);

        //---- label2 ----
        label2.setText("Age");
        add(label2);
        label2.setBounds(70, 104, 133, label2.getPreferredSize().height);
        add(textField1);
        textField1.setBounds(205, 100, 128, textField1.getPreferredSize().height);

        //---- label3 ----
        label3.setText("Contact Number");
        add(label3);
        label3.setBounds(70, 135, 133, label3.getPreferredSize().height);
        add(textField2);
        textField2.setBounds(205, 130, 128, textField2.getPreferredSize().height);

        //---- label4 ----
        label4.setText("Address");
        add(label4);
        label4.setBounds(70, 165, 133, label4.getPreferredSize().height);
        add(textField3);
        textField3.setBounds(205, 160, 128, textField3.getPreferredSize().height);

        //---- label5 ----
        label5.setText("Gender");
        add(label5);
        label5.setBounds(70, 195, 133, label5.getPreferredSize().height);
        add(textField4);
        textField4.setBounds(205, 190, 128, textField4.getPreferredSize().height);

        //---- label6 ----
        label6.setText("Field of Specialisation");
        add(label6);
        label6.setBounds(new Rectangle(new Point(70, 225), label6.getPreferredSize()));
        add(textField5);
        textField5.setBounds(205, 220, 128, textField5.getPreferredSize().height);

        //---- button1 ----
        button1.setText("Cancel");
        add(button1);
        button1.setBounds(new Rectangle(new Point(95, 255), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Register");
        add(button2);
        button2.setBounds(200, 255, 85, 32);

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
