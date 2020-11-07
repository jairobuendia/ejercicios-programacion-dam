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
public class ejercicio7T5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int clave = 0;
    int intentos = 0;
    Scanner s = new Scanner(System.in);
    while (clave != 3251) {
      System.out.println("----------------------------------");
      System.out.println("Indica la clave de la caja fuerte:");
      clave = s.nextInt();
      intentos = intentos + 1;
      
      
      if (intentos == 4 && clave !=3251){
        clave = 3251;
        System.out.println("Lo siento, esa no es la combinación correcta.");
      }
      
      if (clave == 3251 && intentos <= 4 ) {
        System.out.println("La caja fuerte se ha abierto correctamente.");
        
      }
      
    }
  }
  
}
