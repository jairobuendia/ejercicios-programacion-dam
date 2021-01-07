
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
public class ejercicio13T5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce 10 números enteros: ");
    
    int posi = 0;
    int nega = 0;
   
    int cont = 0;
    int num;
    while (cont < 10) {  
    
      
      if ((num=s.nextInt()) < 0) {
        nega ++;
      } else {
        posi ++;
      }
       
      cont ++;
      
    }
   
    System.out.println("Hay " + posi + " números positivos y " + nega + " números negativos.");
  }
  
}
