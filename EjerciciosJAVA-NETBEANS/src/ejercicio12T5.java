
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
public class ejercicio12T5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce el número que quieres que se calcule la serie Fibonacci: ");
    double num;
    num = s.nextDouble();
    
    int num1 = 0;
    int num2 = 1;
    int numt = 1;
    
    if ( num <= 0 ){
      System.out.println("El dato introducido no es correcto.");
    } else if ( num == 1){
      System.out.println("0");
    } else if ( num == 2 ){
      System.out.println("0 1");
    }
    
    System.out.print("0 1 ");
    
    for (int i = 3; i <= num; i++) {
      
      System.out.print( numt +" ");
      num1 = num2;
      num2 = numt;
      numt = num1 + num2;
      
    }
  }
  
}
