
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
public class ejercicio19T5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //pedir datos
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la altura de la piramide: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println("Introduce el carácter de la piramide: ");
    String carac = s.nextLine();
    
    System.out.println("-------------------------------------");
    
    int espacios = altura;
    int relleno = 1;
    
    //cada linea por altura
    for (int i = 0; i < altura; i++) {
      //espaciado entre caracteres
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
        
      }
      for (int j = 0; j < relleno; j++) {
        System.out.print(carac);
      }
      
      System.out.println("");
      espacios --;
      relleno += 2;      
    }
    
    
    
    
    
  }
  
}
