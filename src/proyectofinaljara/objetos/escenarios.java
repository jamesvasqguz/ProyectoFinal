package proyectofinaljara.objetos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import proyectofinaljara.Gui.Iu.*;

/**
 *
 * @author jara
 */
public class escenarios implements Cloneable, Serializable{
    private String nombreEscenario;
    private int terrenos [][];
    private int valorM;
    private int valorN;
    private List<enemigo> enemigos = new ArrayList<>();

    public escenarios(String nombreEscenario, int[][] terrenos, int valorM, int valorN) {
        this.nombreEscenario = nombreEscenario;
        this.terrenos = terrenos;
        this.valorM = valorM;
        this.valorN = valorN;
    }

    public List<enemigo> getEnemigos() {
        return enemigos;
    }

    public void agregarEnemigos(enemigo enemigo) {
        this.enemigos.add(enemigo);
    }
    
    public int getValorM() {
        return valorM;
    }

    public void setValorM(int valorM) {
        this.valorM = valorM;
    }

    public int getValorN() {
        return valorN;
    }

    public void setValorN(int valorN) {
        this.valorN = valorN;
    }

    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public int[][] getTerrenos() {
        return terrenos;
    }

    public void setTerrenos(int[][] terrenos) {
        this.terrenos = terrenos;
    }
    
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
    
    /*
    imprime la matriz en pantalla con colores
    */
     public void asignarColorImprimir(int i, int j, int terrenoAnterior, JLabel[][] matrizLbl, int[][] matriz){
                switch (matriz[i][j]) {
                   case 1:
                       matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/0.jpg"));
                       break;
                   case 2:
                       matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/2.jpg"));
                       break;
                   case 3:
                       matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/1.jpg"));
                       break;
                   case 4:
                        switch (terrenoAnterior) {
                            case 1:
                                matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/Jugador_Campo.png"));
                                break;
                            case 2:
                                matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/Jugador_Lago.png"));
                                break;
                            case 3:
                                matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/Jugador_Montaña.png"));
                                break;
                            default:
                                matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/0.jpg"));
                        }
                        break;
                    case 5:
                        matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/Enemigo.png"));
                        break;
                    case 6:
                        matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/Enemigo_Destruido.png"));
                        break;
                    case 7:
                        matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/0.jpg"));//Bonus
                        break;
                    case 8:
                        matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/Boot.png"));
                        break;
                    default:
                        matrizLbl[i][j].setIcon(new ImageIcon("Imagenes/0.jpg"));
                }
    }

}
