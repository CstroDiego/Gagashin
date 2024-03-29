/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.gagashin.ui;

import com.formdev.flatlaf.FlatDarculaLaf;
import mx.itson.gagashin.entidades.Cliente;
import mx.itson.gagashin.persistencia.ClienteDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/** Interfaz gráfica para el listado de cliente
 * @author Alan Fernando Romero Hernandez
 * @author Diego Castro Arce
 * */
public class ClienteListado extends javax.swing.JFrame {

  /** Inicializa los componentes de la interfaz */
  public ClienteListado() {

    initComponents();
  }

  /**
   * Carga los clientes en la tabla
   *
   * @param filtro Nombre o Apellido del cliente
   */
  public void cargar(String filtro) {
    List<Cliente> list = ClienteDAO.obtenerTodos(filtro);
    DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
    modelo.setRowCount(0);
    for (Cliente c : list) {
      modelo.addRow(
          new Object[] {
            c.getId(),
            c.getNombre(),
            c.getApellido(),
            c.getDireccion(),
            c.getTelefono(),
            c.getEmail(),
            c.getCredito(),
            c.getIntereses()
          });
    }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();
    jProgressBar1 = new javax.swing.JProgressBar();
    imgLogo = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblClientes = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    txtFiltro = new javax.swing.JTextField();
    btnBuscar = new javax.swing.JButton();
    jMenuBar2 = new javax.swing.JMenuBar();
    btnClientes = new javax.swing.JMenu();
    btnAgregarCliente = new javax.swing.JMenuItem();
    btnEditarCliente = new javax.swing.JMenuItem();
    btnEliminarCliente = new javax.swing.JMenuItem();
    btnCuenta = new javax.swing.JMenu();
    btnMovimientos = new javax.swing.JMenuItem();

    jMenu1.setText("File");
    jMenuBar1.add(jMenu1);

    jMenu2.setText("Edit");
    jMenuBar1.add(jMenu2);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Gagashin bank");
    setBackground(new java.awt.Color(60, 60, 60));
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setResizable(false);
    addWindowListener(
        new java.awt.event.WindowAdapter() {
          public void windowOpened(java.awt.event.WindowEvent evt) {
            formWindowOpened(evt);
          }
        });

    imgLogo.setIcon(
        new javax.swing.ImageIcon(
            getClass().getResource("/mx/itson/gagashin/assets/Logo (TB).png"))); // NOI18N
    imgLogo.setBorderPainted(false);
    imgLogo.setContentAreaFilled(false);
    imgLogo.setFocusPainted(false);
    imgLogo.setFocusable(false);

    tblClientes.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null}
            },
            new String[] {
              "ID",
              "Nombre",
              "Apellido",
              "Dirección",
              "Teléfono",
              "Email",
              "Credito",
              "Tasa de intereses"
            }));
    jScrollPane1.setViewportView(tblClientes);

    jLabel2.setText("Listado de clientes");

    jLabel1.setText("Buscar cliente:");

    btnBuscar.setText("Buscar");
    btnBuscar.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBuscarActionPerformed(evt);
          }
        });

    btnClientes.setText("Cliente");

    btnAgregarCliente.setText("Agregar");
    btnAgregarCliente.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAgregarClienteActionPerformed(evt);
          }
        });
    btnClientes.add(btnAgregarCliente);

    btnEditarCliente.setText("Editar");
    btnEditarCliente.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEditarClienteActionPerformed(evt);
          }
        });
    btnClientes.add(btnEditarCliente);

    btnEliminarCliente.setText("Eliminar");
    btnEliminarCliente.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEliminarClienteActionPerformed(evt);
          }
        });
    btnClientes.add(btnEliminarCliente);

    jMenuBar2.add(btnClientes);

    btnCuenta.setText("Cuenta");

    btnMovimientos.setText("Ver movimientos");
    btnMovimientos.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnMovimientosActionPerformed(evt);
          }
        });
    btnCuenta.add(btnMovimientos);

    jMenuBar2.add(btnCuenta);

    setJMenuBar(jMenuBar2);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(
                                jScrollPane1,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                888,
                                Short.MAX_VALUE)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(jLabel2)
                                                    .addGap(129, 129, 129))
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))
                                    .addComponent(imgLogo))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addComponent(txtFiltro)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscar)))
                    .addContainerGap()));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                            .addComponent(
                                imgLogo,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                txtFiltro,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                    .addGap(18, 18, 18)
                    .addComponent(
                        jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addContainerGap()));

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void btnBuscarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnBuscarActionPerformed
    cargar(txtFiltro.getText());
  } // GEN-LAST:event_btnBuscarActionPerformed

  private void btnMovimientosActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnMovimientosActionPerformed
    int renglon = tblClientes.getSelectedRow();
    if (renglon >= 0) {
      int id = (int) tblClientes.getValueAt(renglon, 0);
      MovimientosListado movimientosListado = new MovimientosListado(id);
      movimientosListado.setVisible(true);
    } else {
      JOptionPane.showMessageDialog(this, "Seleccione un cliente");
    }
    cargar("");
  } // GEN-LAST:event_btnMovimientosActionPerformed

  private void formWindowOpened(
      java.awt.event.WindowEvent evt) { // GEN-FIRST:event_formWindowOpened
    tblClientes.getColumnModel().getColumn(0).setPreferredWidth(0);
    tblClientes.getColumnModel().getColumn(0).setMinWidth(0);
    tblClientes.getColumnModel().getColumn(0).setMaxWidth(0);
    tblClientes.removeColumn(tblClientes.getColumnModel().getColumn(6));

    cargar("");
  } // GEN-LAST:event_formWindowOpened

  private void btnAgregarClienteActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnAgregarClienteActionPerformed
    ClienteFormulario clienteFormulario = new ClienteFormulario(this, true, 0);
    clienteFormulario.setVisible(true);
    cargar("");
  } // GEN-LAST:event_btnAgregarClienteActionPerformed

  private void btnEditarClienteActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnEditarClienteActionPerformed
    int renglon = tblClientes.getSelectedRow();

    if (renglon >= 0) {
      String id = tblClientes.getModel().getValueAt(renglon, 0).toString();
      ClienteFormulario clienteFormulario = new ClienteFormulario(this, true, Integer.parseInt(id));
      clienteFormulario.setVisible(true);
    } else {
      JOptionPane.showMessageDialog(
          this, "Debe seleccionar un cliente", "Error", JOptionPane.ERROR_MESSAGE);
    }
    cargar("");
  } // GEN-LAST:event_btnEditarClienteActionPerformed

  private void btnEliminarClienteActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnEliminarClienteActionPerformed
    int renglon = tblClientes.getSelectedRow();
    if (renglon >= 0) {
      String id = tblClientes.getModel().getValueAt(renglon, 0).toString();
      int resp =
          JOptionPane.showConfirmDialog(
              null, "¿Estás seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
      if (resp == JOptionPane.YES_OPTION) {
        ClienteDAO.eliminar(Integer.parseInt(id));
        JOptionPane.showMessageDialog(
            null,
            "CLiente eliminado de la base de datos",
            "Exito!",
            JOptionPane.INFORMATION_MESSAGE);
      } else {
        JOptionPane.showMessageDialog(
            null,
            "No se ha borrado ningún registro de la base de datos",
            "Error",
            JOptionPane.WARNING_MESSAGE);
      }
    } else {
      JOptionPane.showMessageDialog(
          this, "Debe seleccionar un cliente", "Error", JOptionPane.ERROR_MESSAGE);
    }
    cargar("");
  } // GEN-LAST:event_btnEliminarClienteActionPerformed

  /**
   * Método principal de la clase.
   *
   * @param args Los argumentos de la clase.
   */
  public static void main(String args[]) {

    try {
      UIManager.setLookAndFeel(new FlatDarculaLaf());
    } catch (Exception ex) {
      System.err.println("Failed to initialize LaF");
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new ClienteListado().setVisible(true);
          }
        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuItem btnAgregarCliente;
  private javax.swing.JButton btnBuscar;
  private javax.swing.JMenu btnClientes;
  private javax.swing.JMenu btnCuenta;
  private javax.swing.JMenuItem btnEditarCliente;
  private javax.swing.JMenuItem btnEliminarCliente;
  private javax.swing.JMenuItem btnMovimientos;
  private javax.swing.JButton imgLogo;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuBar jMenuBar2;
  private javax.swing.JProgressBar jProgressBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblClientes;
  private javax.swing.JTextField txtFiltro;
  // End of variables declaration//GEN-END:variables
}
