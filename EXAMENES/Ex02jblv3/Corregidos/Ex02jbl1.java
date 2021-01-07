
import java.util.Scanner;

/*
 * Ejercicio 1
 */

/**
 *
 * @author Jairo Buendia 1DAM 18/11/2020
 */
public class Ex02jbl1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, introduzca la altura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    while (altura <= 2 || (altura % 2) != 1 ) {
      System.out.println("Datos incorrectos, la altura debe ser un número impar mayor o igual que 3. ");
      altura = Integer.parseInt(s.nextLine());
    }
    System.out.println("---------------------------------");
    int partedearriba = (altura - 3) / 2;
    
    //System.out.println(paloshorizontales);
    //System.out.println(partedearriba);
    
    
    //pintar primera linea
    System.out.println("*    *   ****   *        **** ");
    //System.out.println("");
    //pintar parte de arriba
    for (int i = 0; i < partedearriba; i++) {
     System.out.println("*    *  *    *  *       *    *");
     }
     
    //pintar parte central
    System.out.println("******  *    *  *       ******");
    
    //pintar parte de abajo
    for (int i = 0; i < partedearriba; i++) {
     System.out.println("*    *  *    *  *       *    *");
     }
    
    //Pintar última línea
    System.out.println("*    *   ****   ******  *    * ");
    System.out.println("---------------------------------");
  }
  
}
