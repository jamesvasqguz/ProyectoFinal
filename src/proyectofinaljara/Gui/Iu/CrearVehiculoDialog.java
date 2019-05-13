package proyectofinaljara.Gui.Iu;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectofinaljara.Archivos;
import proyectofinaljara.objetos.*;
/**
 *
 * @author jara
 */
public class CrearVehiculoDialog extends javax.swing.JDialog {
    private jugador jugador;
    private vehiculos vehiculo;
    private Archivos<vehiculos> archivosVehiculos;
    private Archivos<arma> archivosArma;
    private DialogImagenesAviones imagenesAviones;
    private DialogImagenesTanques imagenesTanques;
    /**
     * Creates new form CrearVehiculoDialog
     */
    public CrearVehiculoDialog(java.awt.Frame parent, boolean modal, jugador jugador, Archivos<vehiculos> archivosVehiculos, Archivos<arma> archivosArma) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.archivosArma = archivosArma;
        this.jugador = jugador;
        this.archivosVehiculos = archivosVehiculos;
        this.imagenesAviones  = new DialogImagenesAviones(parent, true, this);
        this.imagenesTanques  = new DialogImagenesTanques(parent, true, this);
        lblValidar.setVisible(false);
    }

    public void agregarLblImagen(String url) {
        this.lblImagen.setIcon(new  ImageIcon(url));
         lblImagen.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenido = new javax.swing.JLabel();
        lblCrear = new javax.swing.JLabel();
        lblNombreDelVehiculo = new javax.swing.JLabel();
        txtNombreDelVehiculo = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();
        lblTipoDeVehiculo = new javax.swing.JLabel();
        botonCrear = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        lblValidar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBienvenido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBienvenido.setText("Bienvenido:");

        lblCrear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCrear.setText("Comienza a crear: ");

        lblNombreDelVehiculo.setText("Nombre del Vehiculo:");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avion", "Tanque" }));

        lblTipoDeVehiculo.setText("Tipo de Vehiculo:");

        botonCrear.setText("Crear");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        botonAgregar.setText("Agregar Imagen");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        lblValidar.setForeground(new java.awt.Color(255, 0, 0));
        lblValidar.setText("Todos los campos necesarios.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreDelVehiculo)
                            .addComponent(lblTipoDeVehiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
                                .addComponent(lblValidar))
                            .addComponent(txtNombreDelVehiculo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBienvenido)
                            .addComponent(lblCrear)
                            .addComponent(botonAgregar)
                            .addComponent(botonCrear))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreDelVehiculo)
                            .addComponent(txtNombreDelVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoDeVehiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblValidar)
                        .addGap(27, 27, 27)))
                .addComponent(botonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCrear)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        // TODO add your handling code here:
        if (txtNombreDelVehiculo.getText().isEmpty() || lblImagen.getIcon() == null) {
            lblValidar.setVisible(true);
        } else {
            try {
                if (comboBox.getSelectedItem().toString().equalsIgnoreCase("Avion")) {
                    vehiculo = new avion(txtNombreDelVehiculo.getText(), lblImagen, false);
                } else {
                    vehiculo = new tanque(txtNombreDelVehiculo.getText(), lblImagen, false);
                }
                vehiculo.agregarValoresIniciales();
                agregarArmas(vehiculo);
                jugador.agregarVehiculosEnBatallas((vehiculos)vehiculo.clone());
                if (vehiculo instanceof avion) {
                    archivosVehiculos.crearArchivo((vehiculos)vehiculo.clone(), "Avion", vehiculo.getNombreVehiculo(), ".ve");
                } else {
                    archivosVehiculos.crearArchivo((vehiculos)vehiculo.clone(), "Tanque", vehiculo.getNombreVehiculo(), ".ve");
                }
                JOptionPane.showMessageDialog(this, "Creado");
                txtNombreDelVehiculo.setText("");
                lblImagen.setVisible(false);
                this.setVisible(false);
            } catch (CloneNotSupportedException ex) {
                System.out.println("No se puede Clonar");
            }
        }
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        if (comboBox.getSelectedItem().toString().equalsIgnoreCase("Avion")) {
            imagenesAviones.setVisible(true);
        } else {
            imagenesTanques.setVisible(true);
        }
        this.lblImagen.setIcon(lblImagen.getIcon());
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void agregarArmas(vehiculos vehiculo) {
        Random random = new Random();
        vehiculo.agregarArmas(archivosArma.leerListaDeArchivos(".arm").get(random.nextInt(archivosArma.leerListaDeArchivos(".arm").size())));
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCrear;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreDelVehiculo;
    private javax.swing.JLabel lblTipoDeVehiculo;
    private javax.swing.JLabel lblValidar;
    private javax.swing.JTextField txtNombreDelVehiculo;
    // End of variables declaration//GEN-END:variables
}