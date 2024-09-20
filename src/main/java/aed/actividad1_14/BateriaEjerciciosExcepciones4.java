package aed.actividad1_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
Ejercicio 4: Uso de finally.
* Programa que intente abrir un archivo.
* Independientemente de si lanza una excepcion, debe imprimir un mensaje
* Indicando que ha finalizado la operacion.
 */


public class BateriaEjerciciosExcepciones4 {
    
    public static void main(String[] args) {
        Scanner archivo = null;
        try {
            archivo = new Scanner (new File("archivo_inexistente.txt"));
            while (archivo.hasNextLine()) {
                System.out.println(archivo.nextLine());
            }
        }catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        } finally {
            System.out.println("Operacion finalizada.");
        }
    }
}
