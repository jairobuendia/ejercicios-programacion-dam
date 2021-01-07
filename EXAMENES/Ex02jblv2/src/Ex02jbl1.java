//Ejercicio 1 examen
// Realiza un programa que muestre por pantalla números enteros aleatorios impares entre el 2 y el 200
// ambos incluidos. El programa debe parar cuando se genera un número primo. Se debe mostrar la
// cantidad de impares aleatorios que se han generado.

/**
 *
 * @author Jairo Buendia 1DAM 16/12/2020
 */


public class Ex02jbl1 {
  public static void main(String args[]) {
   int numGenerados;
   int cantidadImpares = 0;
   long parar = 2000;
   boolean esPrimo = true;
    for (int i = 0; i < parar ; i++) {
      numGenerados = (int) (Math.random()* (201 - 2 )) + 2;
      if (numGenerados % 2 == 1){
        cantidadImpares ++;
        System.out.print(numGenerados + " ");
        //mira si el numero es primo
        for (int j = 2; j < numGenerados; j++) {
          if ((numGenerados % j) == 0) {
            esPrimo = false;
          }
        }
        if (esPrimo) {
          parar = 0;
        } else {
            
        }
        
      } 
      
    }
    System.out.println("");
    System.out.println("Se han generado " + cantidadImpares + " números impares aleatorios.");
   
  }
 
}