
package View;

import Controller.DesastreController;
import Controller.DonacionController;
import Controller.DonanteController;
import Model.Donacion;
import Model.Donante;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class PanelDonacion extends javax.swing.JPanel {

    String IdInsertadoModificarDonacion;
    
    public PanelDonacion() {
        initComponents();
        mostrarDonaciones();
        DesastreController desController = new DesastreController();
        desController.llenarComboBoxDesastres(cboDesastres);
        btnAplicarCambiosDonacion.setVisible(false); // Ocultar el botón al iniciar
        btnNuevaDonacion.setVisible(false); // Ocultar el botón al iniciar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtCantidadDonacion = new javax.swing.JTextField();
        txtFechaDonacion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        txtTipoDonacion = new javax.swing.JTextField();
        cboDesastres = new javax.swing.JComboBox<>();
        btnModificarDonacion = new javax.swing.JButton();
        btnAplicarCambiosDonacion = new javax.swing.JButton();
        btnNuevaDonacion = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 102));

        Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DONACION", "CANTIDAD", "FECHA "
            }
        ));
        jScrollPane1.setViewportView(Table3);

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR DONACION");

        txtCantidadDonacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANTIDAD DONADA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        txtCantidadDonacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadDonacionActionPerformed(evt);
            }
        });
        txtCantidadDonacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadDonacionKeyTyped(evt);
            }
        });

        txtFechaDonacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA DE SU DONACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        txtFechaDonacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaDonacionKeyTyped(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        txtTipoDonacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DONACION ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        txtTipoDonacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoDonacionActionPerformed(evt);
            }
        });
        txtTipoDonacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoDonacionKeyTyped(evt);
            }
        });

        cboDesastres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESASTRE A DONAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        cboDesastres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDesastresActionPerformed(evt);
            }
        });

        btnModificarDonacion.setText("Modificar");
        btnModificarDonacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDonacionActionPerformed(evt);
            }
        });

        btnAplicarCambiosDonacion.setText("Aplicar Cambios");
        btnAplicarCambiosDonacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarCambiosDonacionActionPerformed(evt);
            }
        });

        btnNuevaDonacion.setText("Nueva Donacion");
        btnNuevaDonacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaDonacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cboDesastres, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaDonacion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCantidadDonacion)
                            .addComponent(txtTipoDonacion))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificarDonacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAplicarCambiosDonacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnNuevaDonacion)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTipoDonacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidadDonacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFechaDonacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboDesastres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnTerminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAplicarCambiosDonacion)
                    .addComponent(btnModificarDonacion))
                .addGap(18, 18, 18)
                .addComponent(btnNuevaDonacion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
     private void mostrarDonaciones() {

        DefaultTableModel model = (DefaultTableModel) Table3.getModel();
        model.setRowCount(0);
        DonacionController donacionController = new DonacionController();
        List<Donacion> donaciones = donacionController.listarDonaciones();

        // Limpiar la tabla antes de mostrar los nuevos datos
        // Limpiar las filas existentes
        // Agregar las donaciones a la tabla
        for (Donacion donacion : donaciones) {
            Object[] row = {
                donacion.getIdDonacion(),
                donacion.getTipo(), // Puedes ajustar esto según los campos que quieras mostrar
                donacion.getCantidad(),
                donacion.getFecha()
            };
            model.addRow(row); // Añadir la fila a la tabla
        }
    }

     private void actualizarTabla() {
        DonacionController controller = new DonacionController();
        List<Donacion> donaciones = controller.listarDonaciones();

        // Limpia la tabla antes de actualizar
        DefaultTableModel model = (DefaultTableModel) Table3.getModel();
        model.setRowCount(0); // Elimina las filas existentes

        // Agregar las donaciones al modelo de la tabla
        for (Donacion d : donaciones) {
            model.addRow(new Object[]{
                d.getIdDonacion(),
                d.getTipo(),
                d.getCantidad(),
                d.getFecha()
            });
        }
    }
     
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Obtener los datos del formulario
        String tipo = txtTipoDonacion.getText();
        String cantidad = txtCantidadDonacion.getText();
        String fechaTexto = txtFechaDonacion.getText().trim();
        String nombreD = cboDesastres.getSelectedItem().toString();
        
        if (tipo.isEmpty() || cantidad.isEmpty() || fechaTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }
        
        String dni = JOptionPane.showInputDialog(null, "Por favor, ingrese el DNI:");
       
        if (dni != null && !dni.trim().isEmpty()) {
            
        Date fecha;
        try {
            fecha = Date.valueOf(fechaTexto); // Formato 'yyyy-MM-dd'
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Formato de fecha inválido. Use 'yyyy-MM-dd'.");
            return;
        }

       
        // Agregar la donación a la base de datos
        DonacionController donacionController = new DonacionController();
        int id_donante = donacionController.obtenerIdDonantePorDni(dni);
        int id_desastre = donacionController.obtenerIdDesastrePorNombreDesastre(nombreD);
        
        donacionController.agregarDonacion(id_donante, id_desastre, tipo, cantidad, fecha);
        // Limpiar los campos de texto
        txtCantidadDonacion.setText("");
        txtFechaDonacion.setText("");
        txtTipoDonacion.setText("");
        // Ocultar el botón Agregar
        btnAgregar.setVisible(false);

        // Mostrar el botón Nuevo Desastre
        btnNuevaDonacion.setVisible(true);
        
        
            try {
                donacionController.listarDonacionesGeneral();
            } catch (SQLException ex) {
                Logger.getLogger(PanelDonacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
        }
        
        
       mostrarDonaciones();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCantidadDonacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadDonacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadDonacionActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
            ProyectoVista ventanaPrincipal = (ProyectoVista) SwingUtilities.getWindowAncestor(this);
    
    // Hacer visible el JFrame
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.mostrarPanelTablas();
    // Mostrar los botones "Siguiente" y "Listar"
        ventanaPrincipal.mostrarBotones();

    // Cerrar el panel actual (PanelTabla)
        this.setVisible(false);       
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void txtTipoDonacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoDonacionKeyTyped
        char c = evt.getKeyChar();
        // Permitir solo letras (a-z, A-Z)
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume(); // Evita números y caracteres especiales
        }
    }//GEN-LAST:event_txtTipoDonacionKeyTyped

    private void txtCantidadDonacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadDonacionKeyTyped
             char c = evt.getKeyChar();

        // Permitir letras (a-z, A-Z), números (0-9) y espacios
        if (!Character.isLetter(c) && !Character.isDigit(c) && c != KeyEvent.VK_SPACE) {
            evt.consume(); // Evita caracteres especiales
        }
    }//GEN-LAST:event_txtCantidadDonacionKeyTyped

    private void btnModificarDonacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDonacionActionPerformed
       IdInsertadoModificarDonacion = JOptionPane.showInputDialog(null, "Por favor, ingresa el ID de la Donacion:");
        
         if (IdInsertadoModificarDonacion != null && !IdInsertadoModificarDonacion.trim().isEmpty()) {
             
         DonacionController donaController =new  DonacionController();
         
         Donacion donacion = donaController.obtenerDonacionPorIdModificar(IdInsertadoModificarDonacion);
         int id_donacion = Integer.parseInt(IdInsertadoModificarDonacion);
         int id_desastre = donaController.obtenerIdDesastrePorIdDonacion(id_donacion);
         
             if (donacion != null) {
                txtTipoDonacion.setText(donacion.getTipo());
                txtCantidadDonacion.setText(donacion.getCantidad());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                txtFechaDonacion.setText(dateFormat.format(donacion.getFecha()));
                cboDesastres.setSelectedIndex(id_desastre - 1);
                
                // Ocultar el botón Agregar
                btnAgregar.setVisible(false);
                btnTerminar.setVisible(false);
                btnNuevaDonacion.setVisible(false);

                 // Hacer visible el botón Aplicar Cambios
                btnAplicarCambiosDonacion.setVisible(true);
             }else{
                 JOptionPane.showMessageDialog(this, "No se encontro un donante con este DNI");
             }
         }else{
             JOptionPane.showMessageDialog(this, "Se cancelo la operacion de modificar");
         }
    }//GEN-LAST:event_btnModificarDonacionActionPerformed

    private void btnAplicarCambiosDonacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarCambiosDonacionActionPerformed
        String tipo = txtTipoDonacion.getText().trim();
        String cantidad = txtCantidadDonacion.getText().trim();
        String fecha = txtFechaDonacion.getText().trim();
        String desastre = cboDesastres.getSelectedItem().toString();
        
        if (tipo.isEmpty() || cantidad.isEmpty() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completa todos los campos");
        }else{
             DonacionController donaController =new DonacionController(); 
             int id_desastre = donaController.obtenerIdDesastrePorNombreDesastre(desastre);
            boolean verificar =  donaController.actualizarDonacion(id_desastre,tipo, cantidad, fecha, IdInsertadoModificarDonacion);
            if (verificar) {
                JOptionPane.showMessageDialog(this, "Se aplicaron los cambios correctamente del Donante");
                mostrarDonaciones();
                
                // Mostrar el botón Agregar
                btnAgregar.setVisible(true);
                btnTerminar.setVisible(true);
                btnNuevaDonacion.setVisible(false);
                btnAplicarCambiosDonacion.setVisible(false);
            }
        }
        // Limpiar los campos de texto después de agregar
        txtCantidadDonacion.setText("");
        txtFechaDonacion.setText("");
        txtTipoDonacion.setText("");
    }//GEN-LAST:event_btnAplicarCambiosDonacionActionPerformed

    private void cboDesastresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDesastresActionPerformed
        
    }//GEN-LAST:event_cboDesastresActionPerformed

    private void btnNuevaDonacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaDonacionActionPerformed
        // Limpiar los campos de texto
        txtTipoDonacion.setText("");
        txtCantidadDonacion.setText("");
        txtFechaDonacion.setText("");

        // Hacer visibles los botones Agregar y Terminar
        btnAgregar.setVisible(true);
        btnTerminar.setVisible(true);
        // Ocultar el botón Nuevo Desastre
        btnNuevaDonacion.setVisible(false);

        // Ocultar el botón de Aplicar Cambios
        btnAplicarCambiosDonacion.setVisible(false);
    }//GEN-LAST:event_btnNuevaDonacionActionPerformed

    private void txtTipoDonacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoDonacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoDonacionActionPerformed

    private void txtFechaDonacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaDonacionKeyTyped
        char c = evt.getKeyChar();

        // Permitir solo números y la barra '-'
        if (!Character.isDigit(c) && c != '-') {
            evt.consume(); // Evita letras y caracteres especiales
        }

        // Validar la longitud y el formato de fecha
        String currentText = txtFechaDonacion.getText();

        // Limitar a 10 caracteres para el formato YYYY/MM/DD
        if (currentText.length() >= 10) {
            evt.consume(); // Evita que se escriban más caracteres
            JOptionPane.showMessageDialog(this, "Formato de fecha inválido. Use YYYY/MM/DD.");
            return;
        }

        // Validar el formato mientras se escribe
        if ((c == '-' && (currentText.length() == 0 || currentText.charAt(currentText.length() - 1) == '-'))
                || (currentText.length() == 4 && c != '-')) {
            evt.consume(); // Evita errores de formato
            JOptionPane.showMessageDialog(this, "Inserte una fecha válida en formato YYYY-MM-DD.");
        }
    }//GEN-LAST:event_txtFechaDonacionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table3;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAplicarCambiosDonacion;
    private javax.swing.JButton btnModificarDonacion;
    private javax.swing.JButton btnNuevaDonacion;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JComboBox<String> cboDesastres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidadDonacion;
    private javax.swing.JTextField txtFechaDonacion;
    private javax.swing.JTextField txtTipoDonacion;
    // End of variables declaration//GEN-END:variables

}
