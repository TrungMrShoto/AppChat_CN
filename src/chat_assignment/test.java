/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_assignment;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.event.ActionEvent;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javafx.scene.control.TableColumn;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
/**
 *
 * @author Meep
 */
public class test extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public test() {
         DefaultTableModel dm = new DefaultTableModel();
    dm.setDataVector(new Object[][] { { "button 1", "foo" },
        { "button 2", "bar" } }, new Object[] { "Button", "String" });

    JTable table = new JTable(dm);
    table.getColumn("String").setCellRenderer(new ButtonRenderer());
    table.getColumn("String").setCellEditor(
        new ButtonEditor(new JCheckBox()));
    JScrollPane scroll = new JScrollPane(table);
    getContentPane().add(table);
    setSize(400, 100);
    setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DefaultTableModel dm = new DefaultTableModel();
    dm.setDataVector(new Object[][] { { "button 1", "foo" },
        { "button 2", "bar" } }, new Object[] { "Button", "String" });

    JTable table = new JTable(dm);
    table.getColumn("Button").setCellRenderer(new ButtonRenderer());
    table.getColumn("Button").setCellEditor(
        new ButtonEditor(new JCheckBox()));
    JScrollPane scroll = new JScrollPane(table);
    getContentPane().add(scroll);
    setSize(400, 100);
    setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
//class ButtonRenderer extends JButton implements TableCellRenderer {
//
//  public ButtonRenderer() {
//    setOpaque(true);
//  }
//
//  public Component getTableCellRendererComponent(JTable table, Object value,
//      boolean isSelected, boolean hasFocus, int row, int column) {
//    if (isSelected) {
//      setForeground(table.getSelectionForeground());
//      setBackground(table.getSelectionBackground());
//    } else {
//      setForeground(table.getForeground());
//      setBackground(UIManager.getColor("Button.background"));
//    }
//    setText((value == null) ? "" : value.toString());
//    return this;
//  }
//}
//
///**
// * @version 1.0 11/09/98
// */
//
//class ButtonEditor extends DefaultCellEditor {
//  protected JButton button;
//
//  private String label;
//
//  private boolean isPushed;
//
//  public ButtonEditor(JCheckBox checkBox) {
//    super(checkBox);
//    button = new JButton();
//    button.setOpaque(true);
//    button.addActionListener(new ActionListener() {
//      public void actionPerformed(ActionEvent e) {
//        fireEditingStopped();
//      }
//    });
//  }
//
//  public Component getTableCellEditorComponent(JTable table, Object value,
//      boolean isSelected, int row, int column) {
//    if (isSelected) {
//      button.setForeground(table.getSelectionForeground());
//      button.setBackground(table.getSelectionBackground());
//    } else {
//      button.setForeground(table.getForeground());
//      button.setBackground(table.getBackground());
//    }
//    label = (value == null) ? "" : value.toString();
//    button.setText(label);
//    isPushed = true;
//    return button;
//  }
//
//  public Object getCellEditorValue() {
//    if (isPushed) {
//      // 
//      // 
//      JOptionPane.showMessageDialog(button, label + ": Ouch!");
//      // System.out.println(label + ": Ouch!");
//    }
//    isPushed = false;
//    return new String(label);
//  }
//
//  public boolean stopCellEditing() {
//    isPushed = false;
//    return super.stopCellEditing();
//  }
//
//  protected void fireEditingStopped() {
//    super.fireEditingStopped();
//  }
//}