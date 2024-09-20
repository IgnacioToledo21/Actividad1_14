package aed.actividad1_14;

/**
Ejercicio 3: Uso de multiples catch.
* Programa que maneje multiples excepciones como ArithmeticException y
* NullPointerException en diferentes bloques.
 */
public class BateriaEjerciciosExcepciones3 {
    
    public static void main(String[] args) {
        try {
            int a = 10 / 0; //Genera una ArithmeticException
            String s = null;
            System.out.println(s.length()); //Generara una NUllPointerException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division por cero.");
        } catch (NullPointerException e) {
            System.out.println("Error: Intento de usar un objeto Nulo.");
        }
    }
}
