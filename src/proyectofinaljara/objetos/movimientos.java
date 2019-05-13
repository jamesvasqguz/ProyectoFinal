/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinaljara.objetos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author 50241
 */

/**
 * Clase movimientos 
 * 
 */
public class movimientos implements Runnable{
    //atributos de la clase movimientos
    private vehiculos vehiculo;
    private int valorI;
    private int valorJ;
    private int terrenoAnterior;
    private int caso;
    private int numeroCasillas;
    private int matriz[][];
    private JLabel matrizEnPanatalla[][];

    /**
     * constructor de la clase movimientos
     * @param vehiculo
     * @param valorI
     * @param valorJ
     * @param terrenoAnterior
     * @param caso
     * @param matriz
     * @param matrizEnPanatalla
     * @param numeroCasillas 
     */
    public movimientos(vehiculos vehiculo, int valorI, int valorJ, int terrenoAnterior, int caso, int[][] matriz, JLabel[][] matrizEnPanatalla, int numeroCasillas) {
        this.vehiculo = vehiculo;
        this.numeroCasillas = numeroCasillas;
        this.valorI = valorI;
        this.valorJ = valorJ;
        this.terrenoAnterior = terrenoAnterior;
        this.caso = caso;
        this.matriz = matriz;
        this.matrizEnPanatalla = matrizEnPanatalla;
    }

    /**
     * metodo boleano que comprueba el recorrido
     * @param posicionI
     * @param posicionJ
     * @return 
     */
    public boolean comprobarRecorrido(int posicionI, int posicionJ){
        if (vehiculo instanceof avion) {
            return matriz[posicionI][posicionJ] == 2 || matriz[posicionI][posicionJ] == 5 || matriz[posicionI][posicionJ] == 8;
        } else {
            return matriz[posicionI][posicionJ] == 3 || matriz[posicionI][posicionJ] == 5 || matriz[posicionI][posicionJ] == 8;
        }
    }
    
    /**
    * Metodo que imprime la matriz en pantalla con sus tipos de terrenos 
    */
     public void asignarColorImprimir(int i, int j,  int terrenoAnterior){
                switch (matriz[i][j]) {
                   case 1:
                       matrizEnPanatalla[i][j].setIcon(new ImageIcon("Imagenes/Campo.png"));
                       break;
                   case 2:
                       matrizEnPanatalla[i][j].setIcon(new ImageIcon("Imagenes/Montaña.png"));
                       break;
                   case 3:
                       matrizEnPanatalla[i][j].setIcon(new ImageIcon("Imagenes/Lago.png"));
                       break;
                   case 4:
                        switch (terrenoAnterior) {
                            case 1:
                                matrizEnPanatalla[i][j].setIcon(new ImageIcon("Imagenes/Jugador_Campo.png"));
                                break;
                            case 2:
                                matrizEnPanatalla[i][j].setIcon(new ImageIcon("Imagenes/Jugador_Montaña.png"));
                                break;
                            case 3:
                                matrizEnPanatalla[i][j].setIcon(new ImageIcon("Imagenes/Jugador_Lago.png"));
                                break;
                            default:
                                matrizEnPanatalla[i][j].setIcon(new ImageIcon("Imagenes/Jugador_Campo.png"));
                        }
                        break;
                    case 5:
                        matrizEnPanatalla[i][j].setIcon(new ImageIcon("Imagenes/Enemigo.png"));
                        break;
                    case 6:
                        matrizEnPanatalla[i][j].setIcon(new ImageIcon("Imagenes/Enemigo_Destruido.png"));
                        break;
                    default:
                        matrizEnPanatalla[i][j].setIcon(new ImageIcon("Imagenes/Campo.png"));
                }
     }
    
     /**
      * metodo que pinta cada cuadro matriz[][]
      * @param posicionI
      * @param posicionJ
      * @param terrenoAnterior 
      */
     private void pintarCuadro(int posicionI, int posicionJ, int terrenoAnterior) {
         matriz[posicionI][posicionJ] = terrenoAnterior;
         asignarColorImprimir(posicionI, posicionJ, terrenoAnterior);
     }
     /**
      * metodo que permite mover a los objetos
      * @param posicionI
      * @param posicionJ
      * @param valorCaso
      * @param casillas
      * @throws InterruptedException
      * @throws Exception 
      */
     public void moverse(int posicionI, int posicionJ, int valorCaso, int casillas) throws InterruptedException, Exception{
         Thread.sleep(1000);
        switch (valorCaso) {
            case 1:
                if (!comprobarRecorrido(posicionI-1, posicionJ) && casillas > 0) {
                    pintarCuadro(posicionI, posicionJ, terrenoAnterior);
                    terrenoAnterior = matriz[posicionI-1][posicionJ];
                    matriz[posicionI-1][posicionJ] = 4;
                    asignarColorImprimir(posicionI-1, posicionJ, terrenoAnterior);
                    moverse(posicionI-1, posicionJ, valorCaso, casillas-1);
                } 
                break;
            case 2:
                if (!comprobarRecorrido(posicionI+1, posicionJ) && casillas > 0) {
                    pintarCuadro(posicionI, posicionJ, terrenoAnterior);
                    terrenoAnterior = matriz[posicionI+1][posicionJ];
                    matriz[posicionI+1][posicionJ] = 4;
                    asignarColorImprimir(posicionI+1, posicionJ, terrenoAnterior);
                    moverse(posicionI+1, posicionJ,  valorCaso, casillas-1);
                }
                break;
            case 3:
                if (!comprobarRecorrido(posicionI, posicionJ-1) && casillas > 0) {
                    pintarCuadro(posicionI, posicionJ, terrenoAnterior);
                    terrenoAnterior = matriz[posicionI][posicionJ-1];
                    matriz[posicionI][posicionJ-1] = 4;
                    asignarColorImprimir(posicionI, posicionJ-1, terrenoAnterior);
                    moverse(posicionI, posicionJ-1, valorCaso, casillas-1);
                }
                break;
            case 4:
                if (!comprobarRecorrido(posicionI, posicionJ+1) && casillas > 0) {
                    pintarCuadro(posicionI, posicionJ, terrenoAnterior);
                    terrenoAnterior = matriz[posicionI][posicionJ+1];
                    matriz[posicionI][posicionJ+1] = 4;
                    asignarColorImprimir(posicionI, posicionJ+1, terrenoAnterior);
                    moverse(posicionI, posicionJ+1,  valorCaso,casillas-1);
                }
                break;
        }
     }
     /**
      * metodo del threand que corre el programa
      */
    @Override
    public void run() {
        try {
            moverse(valorI, valorJ, caso, numeroCasillas);
        } catch (Exception e) {
        }
    }
    
}
