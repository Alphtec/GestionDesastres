package View;

import Controller.DesastreController;
import Controller.DonanteController;
import Model.Desastre;
import Model.Donante;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class PanelDesastre extends javax.swing.JPanel {
    String IdInsertadoModificarDesastre;
    public PanelDesastre() {
        initComponents();
        mostrarDesastres();
        btnAplicarCambiosDesastre.setVisible(false); // Ocultar el botón al iniciar
        btnNuevoDes.setVisible(false); // Ocultar el botón al iniciar
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNombreDesas = new javax.swing.JTextField();
        txtFechaDesas = new javax.swing.JTextField();
        txtUbicacionDesas = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        btnModificarDesastre = new javax.swing.JButton();
        btnAplicarCambiosDesastre = new javax.swing.JButton();
        btnNuevoDes = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 153));

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "FECHA", "UBICACION"
            }
        ));
        jScrollPane1.setViewportView(Table2);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPLETE REGISTRO NUEVO DESASTRE");

        txtNombreDesas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE DEL DESASTRE\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        txtNombreDesas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreDesasKeyTyped(evt);
            }
        });

        txtFechaDesas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        txtFechaDesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaDesasActionPerformed(evt);
            }
        });
        txtFechaDesas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaDesasKeyTyped(evt);
            }
        });

        txtUbicacionDesas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UBICACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        txtUbicacionDesas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUbicacionDesasKeyTyped(evt);
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

        btnModificarDesastre.setText("Modificar");
        btnModificarDesastre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDesastreActionPerformed(evt);
            }
        });

        btnAplicarCambiosDesastre.setText("Aplicar Cambios");
        btnAplicarCambiosDesastre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarCambiosDesastreActionPerformed(evt);
            }
        });

        btnNuevoDes.setText("Nuevo Desastre");
        btnNuevoDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUbicacionDesas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreDesas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFechaDesas))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificarDesastre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAplicarCambiosDesastre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnNuevoDes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombreDesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFechaDesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUbicacionDesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnTerminar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarDesastre)
                    .addComponent(btnAplicarCambiosDesastre))
                .addGap(31, 31, 31)
                .addComponent(btnNuevoDes)
                .addContainerGap(21, Short.MAX_VALUE))
        );

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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaDesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaDesasActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaDesasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Desastre desastre = new Desastre();
        desastre.setNombreD(txtNombreDesas.getText());
        desastre.setFecha(txtFechaDesas.getText());
        desastre.setUbicacion(txtUbicacionDesas.getText());

        DesastreController desastreController = new DesastreController();
        int idDesastre = desastreController.agregarDesastre(desastre);

        // Limpiar los campos de texto después de agregar
        txtNombreDesas.setText("");
        txtFechaDesas.setText("");
        txtUbicacionDesas.setText("");
        
        // Ocultar el botón Agregar
        btnAgregar.setVisible(false);

        // Mostrar el botón Nuevo Desastre
        btnNuevoDes.setVisible(true);

        // Mostrar los desastres en la tabla
        mostrarDesastres();

        // Actualizar la tabla
        actualizarTablaDesastres();
    }//GEN-LAST:event_btnAgregarActionPerformed

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

    private void txtNombreDesasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreDesasKeyTyped
          char c = evt.getKeyChar();
        // Permitir solo letras (a-z, A-Z)
        if (!Character.isLetter(c)) {
        evt.consume(); // Evita caracteres no alfabéticos
        }
    }//GEN-LAST:event_txtNombreDesasKeyTyped

    private void txtUbicacionDesasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbicacionDesasKeyTyped
            char c = evt.getKeyChar();
        // Permitir solo letras (a-z, A-Z)
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume(); // Evita números y caracteres especiales
        }
    }//GEN-LAST:event_txtUbicacionDesasKeyTyped

    private void btnModificarDesastreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDesastreActionPerformed
        
        IdInsertadoModificarDesastre = JOptionPane.showInputDialog(null, "Por favor, ingresa el ID del Desastre:");
        
         if (IdInsertadoModificarDesastre != null && !IdInsertadoModificarDesastre.trim().isEmpty()) {
             
         DesastreController desController =new DesastreController();    
         Desastre desastre = desController.obtenerDesastrePorIdModificar(IdInsertadoModificarDesastre);
            
             if (desastre != null) {
                txtNombreDesas.setText(desastre.getNombreD());
                txtFechaDesas.setText(desastre.getFecha());
                txtUbicacionDesas.setText(desastre.getUbicacion());
                
                // Ocultar el botón Agregar
                btnAgregar.setVisible(false);
                btnTerminar.setVisible(false);
                 btnNuevoDes.setVisible(false);

                 // Hacer visible el botón Aplicar Cambios
                 btnAplicarCambiosDesastre.setVisible(true);
             }else{
                 JOptionPane.showMessageDialog(this, "No se encontro un donante con este DNI");
             }
         
             
             
         }else{
             JOptionPane.showMessageDialog(this, "Se cancelo la operacion de modificar");
         }
        
    }//GEN-LAST:event_btnModificarDesastreActionPerformed

    private void btnAplicarCambiosDesastreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarCambiosDesastreActionPerformed
        String nombre = txtNombreDesas.getText();
        String fecha = txtFechaDesas.getText();
        String ubicacion = txtUbicacionDesas.getText();
        
        if (nombre.isEmpty() || fecha.isEmpty() || ubicacion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completa todos los campos");
            return;
        }else{
             DesastreController desController =new  DesastreController(); 
            boolean verificar =  desController.actualizarDesastre(nombre, fecha, ubicacion, IdInsertadoModificarDesastre);
            if (verificar) {
                JOptionPane.showMessageDialog(this, "Se aplicaron los cambios correctamente del Desastre");
                mostrarDesastres();
                
                // Mostrar el botón Agregar
                btnAgregar.setVisible(true);
                btnTerminar.setVisible(true);
                btnNuevoDes.setVisible(false);
                btnAplicarCambiosDesastre.setVisible(false);
            }
        }
        // Limpiar los campos de texto después de agregar
        txtNombreDesas.setText("");
        txtFechaDesas.setText("");
        txtUbicacionDesas.setText("");
        
    }//GEN-LAST:event_btnAplicarCambiosDesastreActionPerformed

    private void btnNuevoDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDesActionPerformed
        // Limpiar los campos de texto
        txtNombreDesas.setText("");
        txtFechaDesas.setText("");
        txtUbicacionDesas.setText("");

        // Hacer visibles los botones Agregar y Terminar
        btnAgregar.setVisible(true);
        btnTerminar.setVisible(true);
        // Ocultar el botón Nuevo Desastre
        btnNuevoDes.setVisible(false);

        // Ocultar el botón de Aplicar Cambios
        btnAplicarCambiosDesastre.setVisible(false);
    }//GEN-LAST:event_btnNuevoDesActionPerformed

    private void txtFechaDesasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaDesasKeyTyped
        char c = evt.getKeyChar();

        // Permitir solo números y la barra '/'
        if (!Character.isDigit(c) && c != '/') {
            evt.consume(); // Evita letras y caracteres especiales
        }

        // Validar la longitud y el formato de fecha
        String currentText = txtFechaDesas.getText();

        // Limitar a 10 caracteres para el formato YYYY/MM/DD
        if (currentText.length() >= 10) {
            evt.consume(); // Evita que se escriban más caracteres
            JOptionPane.showMessageDialog(this, "Formato de fecha inválido. Use YYYY/MM/DD.");
            return;
        }

        // Validar el formato mientras se escribe
        if ((c == '/' && (currentText.length() == 0 || currentText.charAt(currentText.length() - 1) == '/'))
                || (currentText.length() == 4 && c != '/')) {
            evt.consume(); // Evita errores de formato
            JOptionPane.showMessageDialog(this, "Inserte una fecha válida en formato YYYY/MM/DD.");
        }
    }//GEN-LAST:event_txtFechaDesasKeyTyped
    
    
    private void mostrarDesastres() {
        DesastreController desastreController = new DesastreController();
        List<Desastre> desastres = desastreController.listarDesastres();

        // Limpiar la tabla antes de mostrar los nuevos datos
        DefaultTableModel model = (DefaultTableModel) Table2.getModel();
        model.setRowCount(0); // Limpiar las filas existentes

        // Agregar los desastres a la tabla
        for (Desastre desastre : desastres) {
            Object[] row = {
                desastre.getIdDesastre(), // Asegúrate de que idDesastre esté disponible en tu clase
                desastre.getNombreD(), // Cambia esto si tu variable se llama diferente
                desastre.getFecha(),
                desastre.getUbicacion()
            };
            model.addRow(row); // Añadir la fila a la tabla
        }
    }
    
    private void actualizarTablaDesastres() {
        DesastreController desastreController = new DesastreController();
        List<Desastre> listaDesastres = desastreController.listarDesastres();

        // Modelo de la tabla
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) Table2.getModel();
        modelo.setRowCount(0); // Limpiar la tabla

        // Llenar la tabla con los datos de la lista
        for (Desastre desastre : listaDesastres) {
            Object[] fila = new Object[4];
            fila[0] = desastre.getIdDesastre();
            fila[1] = desastre.getNombreD();
            fila[2] = desastre.getFecha();
            fila[3] = desastre.getUbicacion();
            modelo.addRow(fila);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAplicarCambiosDesastre;
    private javax.swing.JButton btnModificarDesastre;
    private javax.swing.JButton btnNuevoDes;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFechaDesas;
    private javax.swing.JTextField txtNombreDesas;
    private javax.swing.JTextField txtUbicacionDesas;
    // End of variables declaration//GEN-END:variables
}
