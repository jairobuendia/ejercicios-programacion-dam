
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class ejercicio14T5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la base: ");
    int base;
    base = s.nextInt();
    
    System.out.println("Introduzca el exponente: ");
    int expo;
    expo = s.nextInt();
    
    while (expo == 0 || expo < 0) {
      System.out.println("Has introducido un exponente no válido. Tiene que ser entero y positivo.");
      System.out.println("Vuelve a introducirlo de nuevo:");
      expo = s.nextInt();
    }
    
    int resul;
    
    for (int i = 0; i > expo; i++) {
      resul = base * expo;  
    }
    
    System.out.println("La potencia " + base + "*" + expo + " = " + resul );
  }
  
}
