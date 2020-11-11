
import java.util.Scanner;

/*
 * Ejercicio4
 */

/**
 *
 * @author Jairo Buendia Lopez 11/11/2020 1DAM
 */
public class Ex01jbl3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un número: ");
    long num;
    num = s.nextLong();
    
    // pruebas
    long num1;
    num1 = num;
    
    long dig = 1;
    while (num1 > 10){
      num1 = num1 / 10;
      dig ++;
      
    }
    
    
    if ( dig == num1 ){
      System.out.println("El número recortado es " + num);
    } else {
      //System.out.println("num1: "+ num1);
      //System.out.println("digito: "+ dig);
      while (dig > num1){
        dig = dig - 1;
        num = num/10;
        
        //System.out.println("HOla");
      }
      System.out.println("El número recortado es " + num);
        
    }
    
    
  }
  
}
