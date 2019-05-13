package proyectofinaljara.objetos;

import java.io.Serializable;

/**
 *
 * @author jara
 */

/**
 * Clase enemigo 
 */
public class enemigo implements Serializable{
    // Atributos de la clase enemigo
    private vehiculos vehiculo;
    private int posicionX;
    private int posicionY;

    /**
     * Constructor de la clase enemigo 
     * @param vehiculo
     * @param posicionX
     * @param posicionY 
     */
    public enemigo(vehiculos vehiculo, int posicionX, int posicionY) {
        this.vehiculo = vehiculo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    
    /**
     * Setters and Getters de los atributos de la clase enemigo
     * @return 
     */
    public vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }
    
}
