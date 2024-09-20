package aed.actividad1_14;

/*
Ejercicio 2:Capturar ArrayIndexOutOfBoundsException.
Programa que intente acceder a un indice fuera de los limites de un array.
Captura la excepcion y muestra un mensaje apropiado.
*/

public class BateriaEjerciciosExcepciones2 {
         
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        try {
           System.out.println("Accediendo al indice 5: " + numeros[5]);//Esto genera una excepcion.           
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: índice fuera de los limites");
                
            }
    }
  
}
