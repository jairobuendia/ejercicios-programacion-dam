
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
public class ejercicio11T5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;
    System.out.println("Introduce un número entero: ");
    num = s.nextInt();
    
    System.out.println("Número\tNum2\tNum3");
    System.out.println("------\t------\t------");
    int cont = 0;
    while (cont != 5) {

    num = num + 1;
    System.out.println(num + "\t" + (num * num) + "\t" + (num * num * num));
    cont ++;  
    }
  }
  
}
