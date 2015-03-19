package senku;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Ventana extends javax.swing.JFrame {

    Senku senku = new Senku();

    public Ventana() {
        initComponents();
        senku.crearPatron();
        jTextArea1.append(senku.pintarTablero());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jT_FilaActual = new javax.swing.JTextField();
        jT_NuevaFila = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jT_ColumnaActual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jT_NuevaColumna = new javax.swing.JTextField();
        botonMover = new javax.swing.JButton();
        botonDeshacer = new javax.swing.JButton();
        botonListaMovimientos = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        botonCambiarNivel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Fila Origen");

        jLabel2.setText("Fila Destino");

        jLabel3.setText("Columna Origen");

        jLabel4.setText("Columna Destino");

        botonMover.setText("Mover");
        botonMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoverActionPerformed(evt);
            }
        });

        botonDeshacer.setText("Deshacer");
        botonDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeshacerActionPerformed(evt);
            }
        });

        botonListaMovimientos.setText("Guardar lista movimientos");
        botonListaMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaMovimientosActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Versión Francesa", "Versión Alemana", "Versión Asimétrica", "Diamante" }));

        botonCambiarNivel.setText("Cambiar Nivel");
        botonCambiarNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarNivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonMover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonDeshacer))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jT_FilaActual, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jT_ColumnaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonCambiarNivel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jT_NuevaColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jT_NuevaFila, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(botonListaMovimientos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT_FilaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_NuevaFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT_ColumnaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_NuevaColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonDeshacer)
                            .addComponent(botonMover))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCambiarNivel))
                        .addGap(66, 66, 66)
                        .addComponent(botonListaMovimientos)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoverActionPerformed
        int filaActual = 0;
        int nuevaFila = 0;
        int columActual = 0;
        int nuevaColum = 0;
        
        try {
            filaActual = Integer.valueOf(jT_FilaActual.getText());
            nuevaFila = Integer.valueOf(jT_NuevaFila.getText());
            columActual = Integer.valueOf(jT_ColumnaActual.getText());
            nuevaColum = Integer.valueOf(jT_NuevaColumna.getText());
        } catch(NumberFormatException e){
            JOptionPane.showConfirmDialog(this, "Debe introducir un número entero");
        }

        senku.mover(filaActual, nuevaFila, columActual, nuevaColum);
        if (senku.isMovimientoValido()) {
            jTextArea1.setText(senku.pintarTablero());
        } else {
            JOptionPane.showMessageDialog(this, "No se puede realizar ese movimiento");
        }


    }//GEN-LAST:event_botonMoverActionPerformed

    private void botonDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeshacerActionPerformed
        try{
            senku.deshacerMovimiento();
            senku.pintarTablero();
            jTextArea1.setText(senku.pintarTablero());
        } catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "No hay más movimientos.");
        }
    }//GEN-LAST:event_botonDeshacerActionPerformed

    private void botonListaMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaMovimientosActionPerformed
        senku.listaMovimientosToXML();
    }//GEN-LAST:event_botonListaMovimientosActionPerformed

    private void botonCambiarNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarNivelActionPerformed
        String ruta = "";
        
        switch(jComboBox1.getSelectedIndex()){
            case 0:
                ruta = "/senku/niveles/nivel1.txt";
                break;
            case 1:
                ruta = "/senku/niveles/nivel2.txt";
                break;
            case 2:
                ruta = "/senku/niveles/nivel3.txt";
                break;
            case 3:
                ruta = "/senku/niveles/nivel4.txt";
                break;
        }
        System.out.println("Ruta" + ruta);
        
        senku = new Senku(ruta); 
        senku.cambiarVersion(ruta);
        jTextArea1.setText(senku.pintarTablero());
        
        
    }//GEN-LAST:event_botonCambiarNivelActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiarNivel;
    private javax.swing.JButton botonDeshacer;
    private javax.swing.JButton botonListaMovimientos;
    private javax.swing.JButton botonMover;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_ColumnaActual;
    private javax.swing.JTextField jT_FilaActual;
    private javax.swing.JTextField jT_NuevaColumna;
    private javax.swing.JTextField jT_NuevaFila;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
