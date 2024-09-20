package aed.actividad1_14;

/*
Ejercicio 1: Manejo de una excepcion simple(NumberFormatException)
Programa que intente convertir un string a un numero entero.
Si la conversion falla, captura la excepcion y muestra un mnesaje de error.
*/

public class BateriaEjerciciosExcepciones {

    public static void main(String[] args) {
        try {
            String valor = "abc"; //Este valor causara una excepcion
            int numero = Integer.parseInt(valor);
            System.out.print("Numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: No se puede convertir la cadena en un numero. ");
        }
        
    }
}
