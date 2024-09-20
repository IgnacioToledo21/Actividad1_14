package aed.actividad1_14;

/*
Ejercicio 7: Encadenamiento de excepciones.
Programa que demuestra como encadenar expeciones, lanzando una excepcion
en respuesta a otra excepcion
*/

public class BateriaEjerciciosExcepciones7 {
    
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Excepcion encadenada capturada " + e.getMessage());
            System.out.println("Causa original: " + e.getCause());
        }
    }
    
    public static void metodo1() throws Exception {
        try {
            int resultado = 10 / 0; //Genera una ArithmeticException
        } catch (Exception e) {
            throw new Exception("Error en el metodo1", e);
        }
        System.out.println("Numero válido.");
    }

}
