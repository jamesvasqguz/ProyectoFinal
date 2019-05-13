
package proyectofinaljara.objetos;

import java.io.Serializable;

/**
 *
 * @author jara
 */
public class enemigo implements Serializable{
    private vehiculos vehiculo;
    private int posicionX;
    private int posicionY;

    public enemigo(vehiculos vehiculo, int posicionX, int posicionY) {
        this.vehiculo = vehiculo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    
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
