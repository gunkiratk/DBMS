import java.awt.*;
import javax.swing.*;
//import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Apr 12 18:55:37 IST 2017
 */



/**
 * @author Gunkirat Kaur
 */
public class Doctor_View extends JPanel {
    public Doctor_View() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vasu Agarwal
        button14 = new JButton();
        button13 = new JButton();
        label1 = new JLabel();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //---- button14 ----
        button14.setText("Home");
        add(button14);
        button14.setBounds(new Rectangle(new Point(5, 5), button14.getPreferredSize()));

        //---- button13 ----
        button13.setText("Logout");
        add(button13);
        button13.setBounds(315, 5, 79, 25);

        //---- label1 ----
        label1.setText("View Doctors");
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 21));
        add(label1);
        label1.setBounds(120, 35, 155, 26);

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
    private JButton button14;
    private JButton button13;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
