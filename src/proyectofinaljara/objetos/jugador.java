package proyectofinaljara.objetos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jara
 */
/**
 * Clase jugador
 * 
 */
public class jugador implements Cloneable, Serializable {
  private int oro;
    private int contadorGanados;
    private int contadorPerdidos;
    private escenarios escenarioModificado;
    private String nombreJugador;
    private List<vehiculos> vehiculosEnBatallas;
    private List<vehiculos> vehiculosBoots;
    private List<objetos> objetos;

    /**
     * constructor de la clase jugador
     * @param nombreJugador 
     */
    public jugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
        this.oro = 200;
        this.contadorGanados = 0;
        this.contadorPerdidos = 0;
        this.objetos = new ArrayList<>();
        this.vehiculosBoots = new ArrayList<>();
        this.vehiculosEnBatallas = new ArrayList<>();
    }
/**
 * Setter and Getters de todas los atributos de la clase jugador
 */
    public jugador() {
    }

    public escenarios getEscenarioModificado() {
        return escenarioModificado;
    }

    public void setEscenarioModificado(escenarios escenarioModificado) {
        this.escenarioModificado = escenarioModificado;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getContadorGanados() {
        return contadorGanados;
    }

    public void setContadorGanados(int contadorGanados) {
        this.contadorGanados = contadorGanados;
    }

    public int getContadorPerdidos() {
        return contadorPerdidos;
    }

    public void setContadorPerdidos(int contadorPerdidos) {
        this.contadorPerdidos = contadorPerdidos;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public List<vehiculos> getVehiculosEnBatallas() {
        return vehiculosEnBatallas;
    }

    public List<vehiculos> getVehiculosBoots() {
        return vehiculosBoots;
    }

    public List<objetos> getObjetos() {
        return objetos;
    }

    public void agregarVehiculosEnBatallas(vehiculos vehiculo) {
        this.vehiculosEnBatallas.add(vehiculo);
    }

    public void agregarVehiculosBoots(vehiculos vehiculoBoot) {
        this.vehiculosBoots.add(vehiculoBoot);
    }

    public void agregarObjetos(objetos objeto) {
        this.objetos.add(objeto);
    }
    /**
     * Metodo que retorna que no se puede clonar un jugador
     * @return
     * @throws CloneNotSupportedException 
     */
    @Override
    public Object clone() throws CloneNotSupportedException  {
        Object objeto = null; 
        try {
            objeto = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar");
        }
        return objeto;
    }
/**
 * metodo que indica cuando perdio el jugador
 */
    void perdio() {
        this.vehiculosEnBatallas.forEach((vehiculosEnBatalla) -> {
            vehiculosEnBatalla.agregarValoresIniciales();
        });
    }
}
