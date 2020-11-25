
import java.util.Scanner;

/*
  * Ejercicio4
 */

/**
 *
 * @author Jairo Buendia 1DAM 18/11/2020
 */
public class Ex02jbl4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un número: ");
    long num = Long.parseLong(s.nextLine());
    System.out.println("------------------------");
   
    long num2 = num;
    //contar digitos del numero
    int digitos = 0;
    while( num !=0 ){
    num = num/10;
    digitos++;
    }
    
    long resul = 0;
    String resulFinal;
    
    //invertir numero
    long invertido = 0, resto;
    while( num2 > 0 ) {
      resto = num2 % 10;
      invertido = invertido * 10 + resto;
      num2 /= 10;
    }
    
    //cambiar numero por caracteres
    for (int i = 0; i < digitos; i++) {
      resul = invertido % 10;
      
      if (resul == 0){
        resulFinal = "O";
      } else if (resul == 1) {
        resulFinal = "I"; 
      } else if (resul == 2) {
        resulFinal = "Z";
      } else if (resul == 3) {
        resulFinal = "B";
      } else if (resul == 4) {
        resulFinal = "A";
      } else if (resul == 5) {
        resulFinal = "S";
      } else if (resul == 6) {
        resulFinal = "G";
      } else if (resul == 7) {
        resulFinal = "L";
      } else if (resul == 8) {
        resulFinal = "H";
      } else  {
        resulFinal = "N";
      }
      

      System.out.print(resulFinal);
      invertido = invertido/ 10;
    }
    
    
    System.out.println(" es el número codificado.");
 
    
  }
  
}
