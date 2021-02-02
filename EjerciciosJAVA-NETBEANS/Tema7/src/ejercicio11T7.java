
import java.util.Scanner;

/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
 * array resultante.
 */

/**
 *
 * @author JairoBuendia
 */
public class ejercicio11T7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numeros = new int[10];
    boolean esPrimo;
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int primos = 0;
    int noPrimos = 0;
    
    System.out.println("Introduce 10 números por teclado(PULSA INTRO): ");
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = Integer.parseInt(s.nextLine());
      
      // Comprueba si el número es o no primo.
      esPrimo = true;
      for (int j = 2; j < numeros[i] - 1; j++) {
        if (numeros[i] % j == 0) {
          esPrimo = false;
        }
      }
      
      // Si el número es primo, se mete en un array y si
      // no es primo, se mete en otro diferente.
      if (esPrimo) {
        primo[primos++] = numeros[i];
      } else {
        noPrimo[noPrimos++] = numeros[i];
      }
    }
    
    System.out.println("");
    System.out.println("");
    System.out.println("Array inicial");
    System.out.println("-------------");
    System.out.print("Índice\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\n");
    System.out.println("------------------------------------------------------------------------------------------------------------");
    System.out.print("Valor");
    for (int numero : numeros) {
      System.out.print("\t" + numero);
    }
   
     // Los números primos se menten en las primeras
    // posiciones del array original.
    for (int i = 0; i < primos; i++) {
      numeros[i] = primo[i];
    }
    
    // Los números que no son primos se colocan al final.
    for (int i = primos; i < primos + noPrimos; i++) {
      numeros[i] = noPrimo[i - primos];
    }
    
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Array final");
    System.out.println("-----------");
    System.out.print("Índice\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\n");
    System.out.println("------------------------------------------------------------------------------------------------------------");
    System.out.print("Valor");
    for (int numero : numeros) {
      System.out.print("\t" + numero);
    }
    System.out.println("");
  }
  
}
