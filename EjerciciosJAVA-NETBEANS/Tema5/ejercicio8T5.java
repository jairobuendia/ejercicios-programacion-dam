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
public class ejercicio8T5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   
   
    int multi = 0;
    int num = 0;
    
    Scanner s = new Scanner(System.in);
    System.out.println("Indica el número de la tabla que deseas mostrar(1-9): ");
    num = s.nextInt();
    System.out.println("Tabla de multiplicar del " + num);
    int resul = 0;
   
    while (multi != 11) {
      resul = num *  multi;
      System.out.println(num + " x " + multi + " = " +resul);
      multi = multi + 1;
      
    }
  }
  
}
