
import java.util.Scanner;

/*
 * Ejercicio4 
 */

/**
 *
 * @author Jairo Buendia
 */
public class Ejercicio4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el número largo positivo: ");
    long num = Long.parseLong(s.nextLine());
    long ultimaCifra;
    long numMostrar = num;
    long num2 = num;
    long invertido = 0;
    long resto;
    
    System.out.print("Las cifras pares del número " + numMostrar + " son: ");
    //le damos la vuelta al número
    while (num > 0){
      resto = num % 10;
      invertido = invertido * 10 + resto;
      num /= 10;
    }
    
    
    //pintamos el numero dado la vuelta sacando la ultima cifra
    while (invertido > 0){
      ultimaCifra = invertido % 10;
      invertido = invertido / 10;
      if (ultimaCifra % 2 == 0){
        System.out.print(ultimaCifra);
      }
    }
    
    System.out.println("");
    System.out.print("Las cifras impares del número " + numMostrar + " son (en orden inverso): ");
    while (num2 > 0){
      ultimaCifra = num2 % 10;
      num2 = num2 / 10;
      if (ultimaCifra % 2 == 1){
        System.out.print(ultimaCifra);
      }
      
    }
  }
  
}
