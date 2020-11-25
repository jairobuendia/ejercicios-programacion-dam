
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
    int paloshorizontales = (altura /2) + 1;
    int partedearriba = (altura / 2) - 1;
    
    //System.out.println(paloshorizontales);
    //System.out.println(partedearriba);
    
    
    //pintar primera linea
    System.out.println("*    *   ****   *        **** ");
    //System.out.println("");
    //pintar parte de arriba
    int espacios = 4;
    for (int i = 0; i < partedearriba; i++) {
     System.out.print("*");
     //pintar espacios
     for (int j = 0; j < 4; j++) {
       System.out.print(" ");
        
     }
      System.out.println("*");
     
      
    }
    //pintar parte central
    System.out.println("******");
    
    //pintar parte de abajo
    for (int i = 0; i < partedearriba; i++) {
     System.out.print("*");
     //pintar espacios
     for (int j = 0; j < 4; j++) {
       System.out.print(" ");
        
     }
      System.out.println("*");
     
      
    }
    
   
    //System.out.println("");
    System.out.println("*    *   ****   ******  *    * ");
    System.out.println("---------------------------------");
  }
  
}
