/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package mx.itson.gagashin.ui;

import mx.itson.gagashin.persistencia.MovimientoDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;

/** Interfaz grafica para añadir un nuevo movimiento
 * @author Alan Fernando Romero Hernandez
 * @author Diego Castro Arce*/
public class MovimientoFormulario extends javax.swing.JDialog {

  /** El id del cliente */
  int idCliente = 0;

  private int id;

  /**
   * Inicializa el formulario.
   *
   * @param parent El padre de la ventana.
   * @param modal Indica si la ventana es modal o no.
   * @param id El id del movimiento
   * @param idCliente El id del cliente.
   */
  public MovimientoFormulario(java.awt.Frame parent, boolean modal, int id, int idCliente) {
    super(parent, modal);
    this.id = id;
    this.idCliente = idCliente;
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtConcepto = new javax.swing.JTextField();
    filler1 =
        new javax.swing.Box.Filler(
            new java.awt.Dimension(0, 0),
            new java.awt.Dimension(0, 0),
            new java.awt.Dimension(0, 32767));
    jLabel4 = new javax.swing.JLabel();
    btnTipo = new javax.swing.JComboBox<>();
    jLabel2 = new javax.swing.JLabel();
    txtMonto = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    txtFecha = new javax.swing.JFormattedTextField();
    btnGuardar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jLabel1.setText("Registrar nuevo movimiento");

    jLabel3.setText("Concepto:");

    jLabel4.setText("Tipo:");

    btnTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Abono", "Cargo"}));

    jLabel2.setText("Monto:");

    txtMonto.addKeyListener(
        new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtMontoKeyTyped(evt);
          }
        });

    jLabel5.setText("Fecha:");

    btnGuardar.setText("Aceptar");
    btnGuardar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnGuardarActionPerformed(evt);
          }
        });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(jLabel1)
                    .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                layout
                                                    .createSequentialGroup()
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING,
                                                                false)
                                                            .addComponent(
                                                                txtConcepto,
                                                                javax.swing.GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                230,
                                                                Short.MAX_VALUE)
                                                            .addComponent(jLabel2)
                                                            .addComponent(txtMonto))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                    .addComponent(
                                                        filler1,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                layout
                                                    .createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(0, 0, Short.MAX_VALUE)))
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(16, 16, 16)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                btnTipo,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                230,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(jLabel4)))
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(
                                                                txtFecha,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                230,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)))))
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout
                                    .createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(btnGuardar)))
                    .addContainerGap()));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                txtConcepto,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                btnTipo,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(
                                                jLabel5,
                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(
                                                txtMonto,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                txtFecha,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(
                                        filler1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        63,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(btnGuardar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void btnGuardarActionPerformed(
      ActionEvent evt) { // GEN-FIRST:event_btnGuardarActionPerformed
    String fecha = txtFecha.getText();
    String monto = txtMonto.getText();
    String tipo = btnTipo.getSelectedItem().toString();
    String concepto = txtConcepto.getText();

    boolean resultado =
        this.id == 0
            ? MovimientoDAO.guardar(fecha, monto, tipo, concepto, this.idCliente)
            : MovimientoDAO.editar(this.id, fecha, monto, tipo, concepto, this.idCliente);

    if (resultado) {
      JOptionPane.showMessageDialog(
          this,
          "El registro fue guardado correctamente",
          "REGISTRO GUARDADO",
          JOptionPane.INFORMATION_MESSAGE);
      dispose();
    } else {
      JOptionPane.showMessageDialog(
          this, "Ocurrió un error al guardar el registro", "ERROR", JOptionPane.ERROR_MESSAGE);
      dispose();
    }
    // }
  } // GEN-LAST:event_btnGuardarActionPerformed

  private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) { // GEN-FIRST:event_txtMontoKeyTyped
  } // GEN-LAST:event_txtMontoKeyTyped

  /**
   * Metodo principal de la clase
   *
   * @param args Los argumentos que se pasan al metodo principal
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info :
          javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MovimientoFormulario.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MovimientoFormulario.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MovimientoFormulario.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MovimientoFormulario.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            MovimientoFormulario dialog =
                new MovimientoFormulario(new javax.swing.JFrame(), true, 0, 0);
            dialog.addWindowListener(
                new java.awt.event.WindowAdapter() {
                  @Override
                  public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                  }
                });
            dialog.setVisible(true);
          }
        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnGuardar;
  private javax.swing.JComboBox<String> btnTipo;
  private javax.swing.Box.Filler filler1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JTextField txtConcepto;
  private javax.swing.JFormattedTextField txtFecha;
  private javax.swing.JTextField txtMonto;
  // End of variables declaration//GEN-END:variables
}
