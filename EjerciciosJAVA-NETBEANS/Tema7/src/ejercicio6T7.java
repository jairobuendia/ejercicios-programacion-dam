/*
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.

 *
 */

/*
 * @author JairoBuendia
 */
import java.util.Scanner;
public class ejercicio6T7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
//    int[] num; //se define el array
//    num = new int[15]; //se define la longuitud el array
    
    int [] num = {23,45,21,22,3,4,253,111,32,98,245,11,87,77,25};

//    System.out.println("Introduce 15 números: ");
//    for (int i = 0; i < 15; i++) {
//      System.out.print("Número [" + i + "]: ");
//      num[i] = Integer.parseInt(s.nextLine());
//    }
    for (int i : num) {
      System.out.print(i + " ");
      
    }
    System.out.println("");
    
    int ultimo = num[14];
    
    for (int i = 14; i > 0; i--) {
      num[i] = num[i-1];
    }
    num[0] = ultimo;
    for (int i : num) {
      System.out.print(i + " ");
    }
   
  }
   
}


