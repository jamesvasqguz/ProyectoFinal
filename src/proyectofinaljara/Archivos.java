package proyectofinaljara;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jara
 */
public class Archivos<T> {
    /**
     * Metodo booleano para crear un archivo de los objetos
     * @param archivo
     * @param pathInicial
     * @param pathNombreArchivo
     * @param tipoDeArchivoPath
     * @return 
     */
    public  boolean crearArchivo(T archivo, String pathInicial,  String pathNombreArchivo, String tipoDeArchivoPath) {
        File file = new File(pathInicial + "(" + pathNombreArchivo + ")" + tipoDeArchivoPath );
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);) {
            outputStream.writeObject(archivo);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
            
        }
        return true;
    }
    /**
     * Metodo que permite leer el archivo de los objetos
     * @param pathInicial
     * @param pathNombreArchivo
     * @param tipoDeArchivoPath
     * @return 
     */
    public T leerArchivo(String pathInicial, String pathNombreArchivo, String tipoDeArchivoPath){
        File file =  new File( pathInicial + "(" + pathNombreArchivo + ")" + tipoDeArchivoPath);
        try (FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);) {
            return (T) inputStream.readObject();
        } catch (IOException e) {
            System.out.println(pathNombreArchivo);
            System.out.println("Error de conexion con el archivo");
        } catch (ClassNotFoundException e) {
            System.out.println("El objeto no tiene la forma de una pieza");
        }
        return null;
    }
    /**
     * Metodo que permite leer la lista de los objetos 
     * @param tipoDeArchivoPath
     * @return 
     */
    public  List<T> leerListaDeArchivos(String tipoDeArchivoPath) {
        //averiguar en que carpeta estoy
        //encontrar un listado con todos los archivos de esta carpeta
        //por cada archivo ver si termina en .bin
        //	si es verdadero entonces ingresarlo a la lista
        //	sin no no hacer nada
        File folder = new File(".");
        List<T> list = new ArrayList<>();
        if (folder.isDirectory()) {
            String[] files = folder.list();
            for (String fileName : files) {
                if (fileName.endsWith(tipoDeArchivoPath)) {
                    File childFile = new File(fileName);
                    try (FileInputStream fileInputStream = new FileInputStream(childFile); ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);) {
                        list.add((T) inputStream.readObject());
                    } catch (IOException e) {
                        System.out.println("Error de conexion con el archivo");
                        System.out.println("Error en leer el archivo");				
                    } catch (ClassNotFoundException e) {
                        System.out.println("El objeto no tiene la forma de un " + tipoDeArchivoPath );
                    }
                }
            }
        }
        return list;
    }
    
}
