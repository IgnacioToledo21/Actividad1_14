package aed.actividad1_14;

/*
Ejercicio 5: Propagacion de excepciones
Programa con dos métodos.
Uno de los metodos debe lanzar una excepcion y el otro metodo debe manejarla
usando throws.
*/
public class BateriaEjerciciosExcepciones5 {
    public static void main(String[] args) {
        try {
             metodo1();   
            } catch (ArithmeticException e) {
                System.out.println("Error: Excepcion captura en main.");
            }
    }
    
    public static void metodo1() throws ArithmeticException {
        metodo2();
    }
    
    public static void metodo2() throws ArithmeticException {
        int resultado = 10 / 0; //Genera una ArithemticExcepcion
    }
}
