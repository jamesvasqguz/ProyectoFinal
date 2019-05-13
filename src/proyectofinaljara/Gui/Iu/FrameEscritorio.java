package proyectofinaljara.Gui.Iu;

import javax.swing.JOptionPane;
import proyectofinaljara.Archivos;
import proyectofinaljara.crearEscenarios;
import proyectofinaljara.objetos.*;
/**
 *
 * @author jara
 */
public class FrameEscritorio extends javax.swing.JFrame {
    private Archivos<escenarios> archivoEscenario;
    private Archivos<vehiculos> archivoVehiculos;
    private Archivos<arma> archivoArmas;
    private Archivos<jugador> archivoJugador;
    private FrameMenu menuPrincipalFrame;
    private DialogCargarONuevo cargarONuevo;
    private DialogCargarJuego cargarJuego;
    private DialogoNuevoJuego nuevoJuego;
    private jugador jugador;
    /**
     * Creates new form FramePrincipal
     */
    public FrameEscritorio() {
        initComponents();
        this.archivoEscenario = new Archivos<>();
        this.archivoVehiculos = new Archivos<>();
        this.archivoArmas = new Archivos<>();
        this.archivoJugador = new Archivos<>();
        this.setLocationRelativeTo(null);
        this.cargarONuevo = new DialogCargarONuevo(this, true, archivoEscenario, archivoVehiculos, archivoJugador, this, archivoArmas);
        this.cargarJuego = new DialogCargarJuego(this, true, archivoJugador, this);
        this.nuevoJuego  = new DialogoNuevoJuego(this, rootPaneCheckingEnabled, archivoEscenario, archivoVehiculos, archivoJugador, this, archivoArmas);
        this.cargarONuevo.setVisible(true);
        this.menuPrincipalFrame = new  FrameMenu(this, archivoEscenario, archivoArmas, panelDeEscritorio, archivoVehiculos, jugador);
        hiloEscenario();
        this.panelDeEscritorio.add(menuPrincipalFrame);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeEscritorio = new javax.swing.JDesktopPane();
        lblFondoEscritorio = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mostrarMenu = new javax.swing.JMenu();
        menuCargarJuego = new javax.swing.JMenu();
        cargar = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenu();
        menuGuardar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFondoEscritorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinaljara/Gui/imagenes/paneInicio.jpg"))); // NOI18N

        panelDeEscritorio.setLayer(lblFondoEscritorio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelDeEscritorioLayout = new javax.swing.GroupLayout(panelDeEscritorio);
        panelDeEscritorio.setLayout(panelDeEscritorioLayout);
        panelDeEscritorioLayout.setHorizontalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondoEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDeEscritorioLayout.setVerticalGroup(
            panelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondoEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mostrarMenu.setText("Menú");
        mostrarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarMenuMouseClicked(evt);
            }
        });
        menuBar.add(mostrarMenu);

        menuCargarJuego.setText("Juego");
        menuCargarJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCargarJuegoMouseClicked(evt);
            }
        });
        menuCargarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCargarJuegoActionPerformed(evt);
            }
        });

        cargar.setText("Cargar");
        menuCargarJuego.add(cargar);

        nuevo.setText("Nuevo");
        menuCargarJuego.add(nuevo);

        menuGuardar.setText("Guardar");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        menuCargarJuego.add(menuGuardar);

        menuBar.add(menuCargarJuego);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDeEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDeEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMenuMouseClicked
        // TODO add your handling code here:
        menuPrincipalFrame.setJugador(jugador);
        menuPrincipalFrame.setVisible(true);
    }//GEN-LAST:event_mostrarMenuMouseClicked

    private void menuCargarJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCargarJuegoMouseClicked
        // TODO add your handling code here:
        cargarJuego.setVisible(true);
    }//GEN-LAST:event_menuCargarJuegoMouseClicked

    private void menuCargarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCargarJuegoActionPerformed
        // TODO add your handling code here:
        nuevoJuego.setVisible(true);
    }//GEN-LAST:event_menuCargarJuegoActionPerformed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        // TODO add your handling code here:
        if (archivoJugador.crearArchivo(jugador, "Jugador", jugador.getNombreJugador(), ".jdr")) {
            JOptionPane.showMessageDialog(this, "Se han guardado la partida.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar la partida.\nVuelve a intentar.", "Error",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuGuardarActionPerformed

    public jugador getJugador() {
        return jugador;
    }

    public void setJugador(jugador jugador) {
        this.jugador = jugador;
    }

    private void hiloEscenario() {
        Runnable thread = new Runnable() {
            @Override
            public void run(){
                crearArmas();
                crearEsenciarios();
            }
        };
        Thread hilo = new Thread(thread);
        hilo.start();
    }
    private void crearArmas() {
        for (int i = 0; i < 3; i++) {
            arma arma = new arma("Arma_" + i, 15 + (5*i), 10   +(5*i), "Especial", 50+  (5*i));
            arma.calcularDanioPorBala(arma.comprobarCalidad(arma.getCalidad()));
            archivoArmas.crearArchivo(arma, "Arma", arma.getNombreDelArma() + "_" +arma.getCalidad(), ".arm");
        }
        
        
    }
    
    private void crearEsenciarios() {
        crearEscenarios crearEscenario = new crearEscenarios(archivoEscenario);
        crearEscenario.crearEscenariosIniciales(8, 9, "E_1", archivoVehiculos, "Escenario", ".es");
        crearEscenario.crearEscenariosIniciales(4, 4, "E_2", archivoVehiculos, "Escenario", ".es");
        crearEscenario.crearEscenariosIniciales(6, 4, "E_3", archivoVehiculos, "Escenario", ".es");
        crearEscenario.crearEscenarioMultijudador(8, 9, "E_1", archivoVehiculos, "EscenarioMultijugador", ".esm");
        crearEscenario.crearEscenarioMultijudador(4, 4, "E_2", archivoVehiculos, "EscenarioMultijugador", ".esm");
        crearEscenario.crearEscenarioMultijudador(6, 4, "E_3", archivoVehiculos, "EscenarioMultijugador", ".esm");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cargar;
    private javax.swing.JLabel lblFondoEscritorio;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCargarJuego;
    private javax.swing.JMenu menuGuardar;
    private javax.swing.JMenu mostrarMenu;
    private javax.swing.JMenu nuevo;
    private javax.swing.JDesktopPane panelDeEscritorio;
    // End of variables declaration//GEN-END:variables
}