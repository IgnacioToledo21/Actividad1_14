package aed.actividad1_14;

/*
Ejercicio 6: Crear una excepcion personalizada.
Se crea una excepcion personalizada llamada MiExcepcion.
Se lanza esta excepcion cuando se produce una condicion particular en el codigo.
*/

class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}

public class BateriaEjerciciosExcepciones6 {
    public static void main(String[] args) {
        try {
            lanzarExcepcionPersonalizada(5);
        } catch (MiExcepcion e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
        }
    }
    
    public static void lanzarExcepcionPersonalizada(int numero) throws MiExcepcion {
        if(numero < 10) {
            throw new MiExcepcion ("El numero es menor que 10.");
        }
        System.out.println("Numero válido.");
    }

}
