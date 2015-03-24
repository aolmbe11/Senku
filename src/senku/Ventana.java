package senku;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.time.StopWatch;

/**
 *
 * @author Angel
 */
public class Ventana extends javax.swing.JFrame {

    private Senku senku = new Senku();

    private ResourceBundle bundle;

    private static int variante;

    public static final int FRANCESA = 1;
    public static final int ALEMANA = 2;
    public static final int ASIMETRICA = 3;
    public static final int DIAMANTE = 4;

    private static StopWatch reloj = new StopWatch();

    private static String duracion;

    private void limpiarCampos() {
        jT_ColumnaActual.setText("");
        jT_FilaActual.setText("");
        jT_NuevaColumna.setText("");
        jT_NuevaFila.setText("");
    }

    public static int getVariante() {
        return variante;
    }

    public static String getDuracion() {
        return duracion;
    }

    public Ventana() {
        Locale.setDefault(Locale.ENGLISH);
        bundle = ResourceBundle.getBundle("senku/resources/strings", Locale.ENGLISH);
        initComponents();
        senku.crearPatronClasico();
        jTextArea1.append(senku.pintarTablero());

    }

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
        botonReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("senku/resources/strings"); // NOI18N
        jLabel1.setText(bundle.getString("filaOrigen")); // NOI18N

        jLabel2.setText(bundle.getString("filaDestino")); // NOI18N

        jLabel3.setText(bundle.getString("columOrien")); // NOI18N

        jLabel4.setText(bundle.getString("columDestino")); // NOI18N

        botonMover.setText(bundle.getString("mover")); // NOI18N
        botonMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoverActionPerformed(evt);
            }
        });

        botonDeshacer.setText(bundle.getString("deshacer")); // NOI18N
        botonDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeshacerActionPerformed(evt);
            }
        });

        botonListaMovimientos.setText(bundle.getString("listaMovimientos")); // NOI18N
        botonListaMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaMovimientosActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Versión Francesa", "Versión Alemana", "Versión Asimétrica", "Diamante" }));

        botonCambiarNivel.setText(bundle.getString("cambiarNivel")); // NOI18N
        botonCambiarNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarNivelActionPerformed(evt);
            }
        });

        botonReiniciar.setText(bundle.getString("reiniciar")); // NOI18N
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jT_FilaActual, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jT_ColumnaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonListaMovimientos))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jT_NuevaColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jT_NuevaFila, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(botonReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonMover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonDeshacer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCambiarNivel)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
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
                        .addComponent(botonMover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCambiarNivel)
                            .addComponent(botonDeshacer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonListaMovimientos)
                            .addComponent(botonReiniciar))
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoverActionPerformed
        int filaActual = 0;
        int nuevaFila = 0;
        int columActual = 0;
        int nuevaColum = 0;

        // Obtener hora de inicio partida.
        if (!reloj.isStarted()) {
            reloj.start();

        }

        try {
            filaActual = Integer.valueOf(jT_FilaActual.getText());
            nuevaFila = Integer.valueOf(jT_NuevaFila.getText());
            columActual = Integer.valueOf(jT_ColumnaActual.getText());
            nuevaColum = Integer.valueOf(jT_NuevaColumna.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, bundle.getString("mensajeEnteros"));
        }

        try {
            senku.mover(filaActual, nuevaFila, columActual, nuevaColum);
            if (senku.isMovimientoValido()) {
                jTextArea1.setText(senku.pintarTablero());
            } else {
                JOptionPane.showMessageDialog(this, bundle.getString("mensajeMovimientoErroneo"));
            }
        }catch(ArrayIndexOutOfBoundsException e){
            //JOptionPane.showMessageDialog(this, bundle.getString("mensajePosiciones"));
        }


    }//GEN-LAST:event_botonMoverActionPerformed

    private void botonDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeshacerActionPerformed
        try {
            senku.deshacerMovimiento();
            senku.pintarTablero();
            jTextArea1.setText(senku.pintarTablero());
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, bundle.getString("mensajeNoMasMovimientos"));
        }
    }//GEN-LAST:event_botonDeshacerActionPerformed

    private void botonListaMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaMovimientosActionPerformed
        senku.listaMovimientosToXML();
    }//GEN-LAST:event_botonListaMovimientosActionPerformed

    private void botonCambiarNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarNivelActionPerformed
        String ruta = "";

        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                ruta = "/senku/niveles/nivel1.txt";
                variante = FRANCESA;
                break;
            case 1:
                ruta = "/senku/niveles/nivel2.txt";
                variante = ALEMANA;
                break;
            case 2:
                ruta = "/senku/niveles/nivel3.txt";
                variante = ASIMETRICA;
                break;
            case 3:
                ruta = "/senku/niveles/nivel4.txt";
                variante = DIAMANTE;
                break;
        }

        senku = new Senku(ruta);
        senku.cambiarVersion(ruta);
        jTextArea1.setText(senku.pintarTablero());


    }//GEN-LAST:event_botonCambiarNivelActionPerformed

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        // Obtener hora de fin de partida
        reloj.stop();
        duracion = reloj.toString();

        senku.guardarDatosPartida();

        this.limpiarCampos();

        senku.crearPatronClasico();
        jTextArea1.setText(senku.pintarTablero());
        reloj.reset();

    }//GEN-LAST:event_botonReiniciarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        senku.guardarDatosPartida();
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JButton botonReiniciar;
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
