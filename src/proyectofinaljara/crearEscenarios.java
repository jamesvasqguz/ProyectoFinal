package proyectofinaljara;

import proyectofinaljara.objetos.*;

/**
 *
 * @author jara
 */
public class crearEscenarios {
    private int matrizEscenario[][];
    private enemigo enemigo;
    private escenarios escenarioCrear;
    private Archivos<escenarios> archivoEscenario;

    public crearEscenarios(Archivos<escenarios> archivoEscenario) {
        this.archivoEscenario = archivoEscenario;
    }

    public void crearEscenarioMultijudador(int m, int n, String  nombreEscenario, Archivos<vehiculos> agregarAVehiculos, String pathNombreInicial, String tipoDeArchivoPath) {
        matrizEscenario = new int[m][n];
        agregarTerrenos(m, n);
        escenarioCrear = new escenarios(nombreEscenario, matrizEscenario, m, n);
        agregarComodines(m, n);
        agregarJugadorAEscenario(m, n);
        agregarJugadorAEscenario(m, n);
        archivoEscenario.crearArchivo(escenarioCrear, pathNombreInicial, nombreEscenario, tipoDeArchivoPath);
    }
    
    public void agregarTerrenos(int m, int n) {
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizEscenario[i][j] = numerosAleatorios(3);
            }
        }
    }
    
    public void agregarComodines(int m, int n) {
        for (int i = 0; i < (numerosAleatorios(m)); i++) {
            matrizEscenario[numerosAleatorios(m)-1][numerosAleatorios(n-1)-1]  = 7;
        }
    }
    
    /*
    Crea los escenarios mediante una matriz le asigna los valores de los terrenos.
    */
    public void crearEscenariosIniciales(int m, int n, String  nombreEscenario, Archivos<vehiculos> agregarAVehiculos, String pathNombreInicial, String tipoDeArchivoPath){
        matrizEscenario = new int[m][n];
        agregarTerrenos(m, n);
        agregarComodines(m, n);
        escenarioCrear = new escenarios(nombreEscenario, matrizEscenario, m, n);
        agregarEnemigosAEscenario(m, n, agregarAVehiculos);
        agregarJugadorAEscenario(m, n);
        escenarioCrear.setTerrenos(matrizEscenario);
        archivoEscenario.crearArchivo(escenarioCrear, pathNombreInicial, nombreEscenario, tipoDeArchivoPath);
    }
    
    public void agregarEnemigosAEscenario(int m, int n, Archivos<vehiculos> agregarAVehiculos) {
        int valorX;
        int valorY;
        int contador = numerosAleatorios(n+m);
        if (m <= 2 || n <=2 ) {
            if (m <= 2 && n <= 2 ) {
                contador = 1;
            } else {
                contador = 2;
            }
        }
        for (int i = 0; i < contador; i++) {
            valorX = numerosAleatorios(m-1);
            valorY = numerosAleatorios(n-1);
            comprobarPosicionesEnemigos(valorX, valorY, m, n, agregarAVehiculos);
        }
    }
    
    /*
    Comprueba las posiciones de los enemigos; si existe un enemigo o terreno;
    */
    public void comprobarPosicionesEnemigos(int mComprobar, int nComprobar, int mInicial, int nInicial, Archivos<vehiculos> agregarAVehiculos) {
        int valorX = mComprobar;
        int valorY = nComprobar;
        boolean comprobraEnemigo = false;
        while (comprobraEnemigo == false) {
            if (matrizEscenario[valorX][valorY] == 5) {
                valorX = numerosAleatorios(mInicial-1);
                valorY = numerosAleatorios(nInicial-1);
            } else {
                comprobraEnemigo = true;
                enemigo = new enemigo(asignarVehiculoAEnemigo(agregarAVehiculos), valorX, valorY);
                escenarioCrear.agregarEnemigos(enemigo);
                matrizEscenario[valorX][valorY] = 5;
            }
        }
    }
    
    public vehiculos asignarVehiculoAEnemigo(Archivos<vehiculos> agregarVehiculos) {
        try {
            return (vehiculos)agregarVehiculos.leerListaDeArchivos(".ve").get(numerosAleatorios(agregarVehiculos.leerListaDeArchivos(".ve").size())-1).clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar");
        }
        return null;
    }

    private void agregarJugadorAEscenario(int m, int n) {
        int valorX = numerosAleatorios(m)-1;
        int valorY = numerosAleatorios(n)-1;
        boolean comprobar = false;
        while (comprobar == false) {
            if (matrizEscenario[valorX][valorY] == 5 || matrizEscenario[valorX][valorY] == 4) {
                valorX = numerosAleatorios(m)-1;
                valorY = numerosAleatorios(n)-1;
            } else {
                comprobar = true;
                matrizEscenario[valorX][valorY] = 4;
            }
        }
    }
    
    public  int numerosAleatorios(int intervalo){
        return ((int)(Math.random()*intervalo)+1);
    }
}
