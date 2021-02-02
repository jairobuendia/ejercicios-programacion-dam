
import java.util.Scanner;

/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 * necesario.
 */

/**
 *
 * @author Jairo Buendia
 */
public class ejercicio10T7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numerosAleatorios; //se define el array
    numerosAleatorios = new int[20]; //se define la longuitud el array
    
    int[] auxPares = new int[20];
    int[] auxImpares = new int[20];
    int contadorPares = 0;
    int contadorImpares = 0;
    
    for (int i = 0; i < numerosAleatorios.length; i++) {
       numerosAleatorios[i] =(int) (Math.random() * 101);
    }
    
    for (int numerosAleatorio : numerosAleatorios) {
      if (numerosAleatorio % 2 == 0) {
        auxPares[contadorPares] = numerosAleatorio;
        contadorPares++;
      } else {
        auxImpares[contadorImpares] = numerosAleatorio;
        contadorImpares++;
      }
      
    }
    for (int i = 0; i < contadorPares; i++) {
      System.out.print(auxPares[i]+" ");
    }
    for (int i = 0; i < contadorImpares; i++) {
      System.out.print(auxImpares[i]+" ");
    }
  }
  
}
