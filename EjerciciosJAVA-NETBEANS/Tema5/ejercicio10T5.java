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
public class ejercicio10T5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int cont = 0;
    double nums;
    System.out.println("Introduce números positivos para calcular una media (si pone un número negativo el programa se para): ");
    
    double total = 0;
    double numero = 0;
    while (cont == 0){
      nums = s.nextDouble();
      numero++;
      total = total + nums;
      
      if (nums < 0){
        cont = cont + 1;
        total = total - nums;
      }
    }
    double resul = total / (numero - 1);
    System.out.println("La media de los números introducidos es: " + resul );
    
    
  }
  
}
