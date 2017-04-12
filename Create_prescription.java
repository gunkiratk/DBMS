import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 20:03:46 IST 2017
 */



/**
 * @author Gunkirat Kaur
 */
public class Create_prescription extends JPanel {
    public Create_prescription() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gunkirat Kaur
        label1 = new JLabel();
        button14 = new JButton();
        button13 = new JButton();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
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
        label1.setText("Create Prescription");
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 17));
        add(label1);
        label1.setBounds(95, 30, 175, 26);

        //---- button14 ----
        button14.setText("Home");
        add(button14);
        button14.setBounds(0, 5, 79, 25);

        //---- button13 ----
        button13.setText("Logout");
        add(button13);
        button13.setBounds(320, 10, 79, 25);

        //---- label2 ----
        label2.setText("Patient ID");
        add(label2);
        label2.setBounds(new Rectangle(new Point(50, 70), label2.getPreferredSize()));
        add(textField1);
        textField1.setBounds(150, 70, 115, 20);

        //---- label3 ----
        label3.setText("Medicine");
        add(label3);
        label3.setBounds(new Rectangle(new Point(55, 105), label3.getPreferredSize()));
        add(textField2);
        textField2.setBounds(150, 100, 115, 20);

        //---- button1 ----
        button1.setText("Create");
        add(button1);
        button1.setBounds(new Rectangle(new Point(150, 155), button1.getPreferredSize()));

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
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
