package proyectofinaljara.objetos;

import java.io.Serializable;

/**
 *
 * @author jara
 */

/**
 * Clase arma
 */
public class arma implements Cloneable, Serializable{
    //Atributos de la clase arma
    private final String nombreDelArma;
    private int municiones;
    private final int municionesParaResetearEnemigo;
    private final int calibreDeBala;
    private final int precio;
    private final String calidad;
    private int danio;
    private final int CALIDAD_BASICA = 4;
    private final int CALIDAD_ESPECIAL = 3;
    private final int CALIDAD_EPICA = 2;
    private final int CALIDAD_LEGENDARIA = 1;

    /**
     * Constructor de la clase arma 
     * @param nombreDelArma
     * @param municiones
     * @param calibreDeBala
     * @param calidad
     * @param precio 
     */
    public arma(String nombreDelArma, int municiones, int calibreDeBala, String calidad, int precio) {
        this.nombreDelArma = nombreDelArma;
        this.municiones = municiones;
        this.calibreDeBala = calibreDeBala;
        this.calidad = calidad;
        this.precio = precio;
        municionesParaResetearEnemigo = municiones;
    }

    /**Metodo para clonar el arma:
    *Se utiliza para realizar una copia del arma y asignarsela al jugador cuando la compre.
    */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object objeto = null; 
        try {
            objeto = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar");
        }
        return objeto;
    }

    public int getMunicionesParaResetearEnemigo() {
        return municionesParaResetearEnemigo;
    }
    
    public String getNombreDelArma() {
        return nombreDelArma;
    }

    public int getMuniciones() {
        return municiones;
    }

    public void setMuniciones(int municiones) {
        this.municiones = municiones;
    }

    public int getCalibreDeBala() {
        return calibreDeBala;
    }

    public int getPrecio() {
        return precio;
    }

    public String getCalidad() {
        return calidad;
    }

    public int getDanio() {
        return danio;
    }

    private void setDanio(int danio) {
        this.danio = danio;
    }
    /**
     * metod que calcula el dañio de la bala 
     * @param calidad 
     */
    public void calcularDanioPorBala(int calidad) {
        switch (calidad) {
            case 1:
                setDanio((getCalibreDeBala()/CALIDAD_BASICA) + 1);
                break;
            case 2:
                setDanio((getCalibreDeBala()/CALIDAD_ESPECIAL) + 2);
                break;
            case 3:
                setDanio((getCalibreDeBala()/CALIDAD_EPICA) + 3);
                break;
            case 4:
                setDanio((getCalibreDeBala()/CALIDAD_LEGENDARIA) + 4);
                break;
            default:
                throw new AssertionError();
        }
    }
    /**
     * metodo que muestra la informacion del arma
     */
    public void mostrarInformacionArma() {
        calcularDanioPorBala(comprobarCalidad(calidad));
        System.out.println("\nNombre del Arma: " + getNombreDelArma());
        System.out.println("Calidad: " + getCalidad());
        System.out.println("Calibre: " + getCalibreDeBala() + "mm");
        System.out.println("Precio: " + getPrecio());
        System.out.println("Daño por ataque: " + getDanio());
        System.out.println("Municiones: " + getMuniciones());
    }
    /**
     * metodo que comprueba la calidad del arma
     * @param calidad
     * @return 
     */
        public  int  comprobarCalidad(String calidad) {
        if (calidad.equalsIgnoreCase("Básica")) {
            return  1;
        } else if (calidad.equalsIgnoreCase("Especial")) {
            return 2;
        } else if (calidad.equalsIgnoreCase("Épica")) {
            return 3; 
        } else {
            return 4;
        }
    }
}
