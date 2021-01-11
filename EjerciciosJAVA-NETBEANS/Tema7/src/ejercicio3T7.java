/*
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 *
 */

/*
 * @author JairoBuendia
 */
import java.util.Scanner;
public class ejercicio3T7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] n; //se define el array
    n = new int[10]; //se define la longuitud el array
    int num;
    int contador = 10;
    for (int i = 0; i < 10; i++) {
      System.out.println("Introduce 10 números: ");
      num = Integer.parseInt(s.nextLine());
      n[i] = num;
      contador --;
      System.out.println("Te quedan " + contador + " números.");
      System.out.println("-------------------------");
    }
    
    int reduccion = 9;
    for (int i = 0; i < 10; i++) {
      System.out.print(n[reduccion]+ " ");
      reduccion --;
      
    }
      
  }
}

