
import java.util.Scanner;

/*
 * Ejercicio 59
 */

/**
 *
 * @author Jairo Buendia
 */
public class ejercicio59T5 {

 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, introduzca la altura del árbol: ");
    int altura = Integer.parseInt(s.nextLine());
    
    while (altura < 4) {
      System.out.println("Error");
      System.out.println("Introduzca una altura válida(4 mínimo): ");
      altura = Integer.parseInt(s.nextLine());
    } 
    
    int espacios = altura - 2;
    //pinta cada linea
    for (int i = 0; i < altura; i++) {
      
    
    //pinta los espacios
    for (int e = 0; e < espacios; e++) {
      System.out.print("-");
      
      
      
    }
    //pinta los asteriscos
    for (int a = 0; a < altura; a++) {
      System.out.println("^");
      
    }
    espacios --;
    }
  }
  
}
