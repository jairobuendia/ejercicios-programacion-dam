/*
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 *
 */

/*
 * @author JairoBuendia
 */
import java.util.Scanner;
public class ejercicio5T7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] n; //se define el array
    n = new int[10]; //se define la longuitud el array
    
//    int [] n = {23,45,21,22,3,4,253,111,32,98};
    System.out.println("Introduce 10 números: ");
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Número [" + i + "]: ");
      n[i] = Integer.parseInt(s.nextLine());
      
    }
    int max = n[1];
    for (int i : n) {  //bucle que recorre todo el array para sacar el máximo
      if (i > max){
        max = i;
      }
    }
    
    int min = n[1];
    for (int i : n) {  //bucle que recorre todo el array para sacar el mínimo
      if (i < min){
        min = i;
      }
    }
    System.out.println("El máximo del array es: " + max);
    System.out.println("El mínimo del array es: " + min);
    
 }
}

