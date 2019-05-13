/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinaljara.Gui.Iu;

import proyectofinaljara.Archivos;
import proyectofinaljara.objetos.*;
/**
 *
 * @author jara
 */
public class DialogCargarONuevo extends javax.swing.JDialog {
    private DialogoNuevoJuego dialogoNuevoJuego; 
    private DialogCargarJuego dialogCargarJuego;
    /**
     * Creates new form DialogCargarONuevo
     */
    public DialogCargarONuevo(java.awt.Frame parent, boolean modal, Archivos<escenarios> archivoEscenarios, Archivos<vehiculos> archivoVehiculo, Archivos<jugador> archivoJugador, FrameEscritorio frameEscritorio, Archivos<arma> archivoArma) {
        super(parent, modal);
        this.dialogoNuevoJuego = new DialogoNuevoJuego(parent, true, archivoEscenarios, archivoVehiculo, archivoJugador, frameEscritorio, archivoArma);
        this.dialogCargarJuego = new DialogCargarJuego(parent, true, archivoJugador, frameEscritorio);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenida = new javax.swing.JLabel();
        lblPartida = new javax.swing.JLabel();
        botonNuevo = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblBienvenida.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblBienvenida.setText("Bienvenido:");

        lblPartida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPartida.setText("Partida:");

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonCargar.setText("Cargar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblBienvenida))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCargar)
                            .addComponent(botonNuevo)
                            .addComponent(lblPartida))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCargar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        dialogoNuevoJuego.setVisible(true);
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        dialogCargarJuego.setVisible(true);
    }//GEN-LAST:event_botonCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblPartida;
    // End of variables declaration//GEN-END:variables
}