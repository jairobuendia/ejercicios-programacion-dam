/*
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 *
 */

/*
 * @author JairoBuendia
 */
import java.util.Scanner;
public class ejercicio9T7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int aumento = 1;
    
    int[] numeros; //se define el array
    numeros = new int[8]; //se define la longuitud el array
    
    for (int i = 0; i < 8; i++) {
       System.out.print("Indica el número " + aumento + ": ");
       numeros[i] = Integer.parseInt(s.nextLine());
       aumento ++;
    }
    
    for (int numero : numeros) {
      if (numero % 2 == 0) {
        System.out.print("\"par\"" + numero + " ");
      } else {
        System.out.print("\"impar\"" + numero + " ");
      }
      
    }
   
  }
}