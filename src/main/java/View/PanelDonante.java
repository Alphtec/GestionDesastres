
package View;

import Controller.DonanteController;
import Model.Donante;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class PanelDonante extends javax.swing.JPanel {
    int idDonante;
    String dniInsertadoModificarDonante;
    
    public PanelDonante() {
        initComponents();
        mostrarDonantes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNombreD = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        btnModificarDonante = new javax.swing.JButton();
        btnRealizarCambiosDonante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPLETE REGISTRO DONANTES");

        txtNombreD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE DEL DONANTE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        txtNombreD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreDKeyTyped(evt);
            }
        });

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUMERO DE TELEFONO\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIRECCION\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
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

        txtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        btnModificarDonante.setText("Modificar");
        btnModificarDonante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDonanteActionPerformed(evt);
            }
        });

        btnRealizarCambiosDonante.setText("Realizar CAMBIOS");
        btnRealizarCambiosDonante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCambiosDonanteActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefono)
                            .addComponent(txtDireccion)
                            .addComponent(txtDNI))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnTerminar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnModificarDonante)
                                .addGap(18, 18, 18)
                                .addComponent(btnRealizarCambiosDonante)
                                .addGap(18, 18, 18))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombreD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnTerminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizarCambiosDonante)
                    .addComponent(btnModificarDonante))
                .addGap(25, 25, 25))
        );

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "TELEFONO", "EMAIL", "DIRECCION", "DNI"
            }
        ));
        jScrollPane1.setViewportView(Table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarCambiosDonanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCambiosDonanteActionPerformed
        String nombre = txtNombreD.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String email = txtEmail.getText().trim();
        String direccion =txtDireccion.getText().trim();

        if (nombre.isEmpty() || telefono.isEmpty() || email.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completa todos los campos");
        }else{
            DonanteController donController =new  DonanteController();
            boolean verificar =  donController.actualizarDonante(nombre, telefono, email, direccion, dniInsertadoModificarDonante);
            if (verificar) {
                JOptionPane.showMessageDialog(this, "Se aplicaron los cambios correctamente del Donante");
                mostrarDonantes();
                
                // Mostrar el botón Agregar
                btnAgregar.setVisible(true);
                btnTerminar.setVisible(true);
            }
        }

    }//GEN-LAST:event_btnRealizarCambiosDonanteActionPerformed

    private void btnModificarDonanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDonanteActionPerformed

        dniInsertadoModificarDonante = JOptionPane.showInputDialog(null, "Por favor, ingresa el DNI del Donante:");

        if (dniInsertadoModificarDonante != null && !dniInsertadoModificarDonante.trim().isEmpty()) {

            DonanteController donController =new  DonanteController();
            Donante donante = donController.obtenerDonantePorDNIModificar(dniInsertadoModificarDonante);

            if (donante != null) {
                txtNombreD.setText(donante.getNombre());
                txtTelefono.setText(donante.getTelefono());
                txtEmail.setText(donante.getEmail());
                txtDireccion.setText(donante.getDireccion());
                
                // Ocultar el botón Agregar
                btnAgregar.setVisible(false);
                btnTerminar.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "No se encontro un donante con este DNI");
            }

        }else{
            JOptionPane.showMessageDialog(this, "Se cancelo la operacion de modificar");
        }

    }//GEN-LAST:event_btnModificarDonanteActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        char c = evt.getKeyChar();

        // Permitir solo números (0-9)
        if (!Character.isDigit(c)) {
            evt.consume(); // Evita caracteres no numéricos
        }

        // Limitar a 8 caracteres
        if (txtDNI.getText().length() >= 8) {
            evt.consume(); // Evita que se ingresen más de 8 caracteres
            return; // Salir del método para evitar el JOptionPane
        }

        // Si se intenta salir con menos de 8 dígitos, mostrar un mensaje
        if (txtDNI.getText().length() == 7 && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            JOptionPane.showMessageDialog(this, "Inserta 8 dígitos", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtDNIKeyTyped

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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Crear un nuevo objeto Donante
        Donante donante = new Donante();
        String nombre = txtNombreD.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();
        String direccion = txtDireccion.getText();
        String dni = txtDNI.getText();

        if (nombre.isEmpty() || telefono.isEmpty() ||email.isEmpty() ||direccion.isEmpty() ||dni.isEmpty()  ) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
            return;
        }

        donante.setNombre(nombre);
        donante.setTelefono(telefono);
        donante.setEmail(email);
        donante.setDireccion(direccion);
        donante.setDni(dni);

        // Agregar el donante a la base de datos
        DonanteController donanteController = new DonanteController();
        int idDonante = donanteController.agregarDonante(donante);

        // Limpiar los campos de texto después de agregar
        txtNombreD.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        txtDireccion.setText("");
        txtDNI.setText("");

        // Mostrar los donantes en la tabla
        mostrarDonantes(); // Esta función actualizará la tabla

        // Actualizar la tabla
        actualizarTablaDonantes();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        char c = evt.getKeyChar();
        // Permitir solo letras y números (a-z, A-Z, 0-9)
        if (!Character.isLetterOrDigit(c)) {
            evt.consume(); // Evita caracteres especiales
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();

        // Permitir solo números (0-9)
        if (!Character.isDigit(c)) {
            evt.consume(); // Evita caracteres no numéricos
        }

        // Limitar a 9 caracteres
        if (txtTelefono.getText().length() >= 9) {
            evt.consume(); // Evita que se ingresen más de 9 caracteres
            return; // Salir del método para evitar el JOptionPane
        }

        // Si se intenta salir con menos de 9 dígitos, mostrar un mensaje
        if (txtTelefono.getText().length() == 8 && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            JOptionPane.showMessageDialog(this, "Inserta 9 dígitos", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreDKeyTyped

        char c = evt.getKeyChar();
        // Permitir solo letras (a-z, A-Z)
        if (!Character.isLetter(c)) {
            evt.consume(); // Evita caracteres no alfabéticos
        }
    }//GEN-LAST:event_txtNombreDKeyTyped

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed
    
    private void mostrarDonantes() {
    DonanteController donanteController = new DonanteController();
    List<Donante> donantes = donanteController.listarDonantes();

    // Limpiar la tabla antes de mostrar los nuevos datos
    DefaultTableModel model = (DefaultTableModel) Table1.getModel();
    model.setRowCount(0); // Limpiar las filas existentes

    // Agregar los donantes a la tabla
    for (Donante donante : donantes) {
        Object[] row = {
            donante.getIdDonante(),
            donante.getNombre(),
            donante.getTelefono(),
            donante.getEmail(),
            donante.getDireccion(),
            donante.getDni()
        };
        model.addRow(row); // Añadir la fila a la tabla
    }
}
    private void actualizarTablaDonantes() {
        DonanteController donanteController = new DonanteController();
        List<Donante> listaDonantes = donanteController.listarDonantes();

        // Modelo de la tabla
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) Table1.getModel();
        modelo.setRowCount(0); // Limpiar la tabla

        // Llenar la tabla con los datos de la lista
        for (Donante donante : listaDonantes) {
            Object[] fila = new Object[6];
            fila[0] = donante.getIdDonante();
            fila[1] = donante.getNombre();
            fila[2] = donante.getTelefono();
            fila[3] = donante.getEmail();
            fila[4] = donante.getDireccion();
            fila[5] = donante.getDni();
            modelo.addRow(fila);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificarDonante;
    private javax.swing.JButton btnRealizarCambiosDonante;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreD;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}