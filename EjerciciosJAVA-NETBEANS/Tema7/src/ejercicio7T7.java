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
public class ejercicio7T7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numSustituir; 
    int numNuevo; 
    
    int[] numeros; //se define el array
    numeros = new int[100]; //se define la longuitud el array
    
    for (int i = 0; i < 100; i++) {
      numeros[i] =(int) (Math.random() * 21);
      
    }
    System.out.print("Indica el número el cual quieres sustituir: ");
    numSustituir = Integer.parseInt(s.nextLine());
    
    System.out.print("Indica el número que va a remplazar el anterior: ");
    numNuevo = Integer.parseInt(s.nextLine());
    
    
    for (int numero : numeros) {
      if (numSustituir == numero){
        System.out.print("\""+ numNuevo + "\" ");
      } else
      System.out.print(numero + " ");
      
    }

  }
}