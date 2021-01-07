/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava.netbeans;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejercicio9T5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un número entero: ");
    int num;
    num = s.nextInt();
    int numIntru;
    numIntru = num;
    int numDig = 1;
    
    
    while (numIntru > 10) {
      numIntru = numIntru / 10;
      numDig = numDig + 1;
      
    }
    System.out.println("El número " + num + " tiene " + numDig + " dígitos.");
  }
  
}
