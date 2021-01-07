
import java.util.Scanner;

//Ejercicio 4 examen
// Implementa un programa que solicite al usuario un número entero largo y positivo. Dicho programa
// obtendrá dos enteros largos a partir de él, y los presentará por pantalla. Uno de ellos contendrá los
// dígitos pares en el mismo orden en el que aparecen en el número de partida, y el otro contendrá los
// dígitos impares en orden inverso al que aparecen en el número de partida.

/**
 *
 * @author Jairo Buendia 1DAM 16/12/2020
 */


public class Ex02jbl4 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el número largo positivo: ");
    long num = Long.parseLong(s.nextLine());
    long aux = num;
    long pares = 0;
    long impares = 0;
    int antes = 0;
    while( aux > 0 ){
      if ( (aux % 10) % 2 != 0 ){
        impares = (impares * 10) + (aux % 10);
      }else{
        pares = (pares * 10) + (aux % 10);
        antes++;
      }
      aux /= 10;
    }
    aux = pares;
    pares = 0;
    int despues = 0;
    while( aux > 0 ){
      pares = (pares * 10) + (aux % 10);
      despues++;
      aux /= 10;
    }
    if( antes != despues ){
      pares *= 10;
    }
    System.out.println("Las cifras pares del número " + num + " son: " + pares);
    System.out.println("Las cifras impares del número " + num + " son (en orden inverso): " + impares);

  }
 
}