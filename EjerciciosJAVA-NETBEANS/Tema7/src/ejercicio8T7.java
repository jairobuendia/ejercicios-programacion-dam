/*
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 *
 */

/*
 * @author JairoBuendia
 */
import java.util.Scanner;
public class ejercicio8T7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int aumento = 1;
    
    
    int[] temperaturas; //se define el array
    temperaturas = new int[12]; //se define la longuitud el array
    
    for (int i = 0; i < 12; i++) {
       System.out.print("Temperatura mes " + aumento + ": ");
       temperaturas[i] = Integer.parseInt(s.nextLine());
       aumento ++;
    }
    
    
    System.out.println("");
    System.out.println("Diagrama horizonal");
    System.out.println("------------------------");
    aumento = 1;
    for (int temperatura : temperaturas) {
      System.out.print("\033[37mMes "+ aumento+":\t");
      if (temperatura < 0){
        System.out.print("\033[36m");
        for (int i = temperatura; i < 0; i++) {
        System.out.print("*");
        }
      } else {
        System.out.print("\033[31m");
        for (int i = 0; i < temperatura; i++) {
        System.out.print("*");
        }
      }
      System.out.println("");
      aumento ++;
    }
   
  }
}