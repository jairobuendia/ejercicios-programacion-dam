/*
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
 * y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacenar los cuadrados de los valores que hay en el array
 * numero. En el array cubo se deben almacenar los cubos de los valores que hay en
 * numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
 * columnas.
 *
 */

/*
 * @author JairoBuendia
 */
import java.util.Scanner;
public class ejercicio4T7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num; //se define el array de numeros
    int[] cuadrado;  //se define el array de numeros
    int[] cubo; //se define el array de numeros
    num = new int[20]; //se define la longuitud el array
    cuadrado = new int [20]; //se define el array de numeros
    cubo = new int [20]; //se define el array de numeros
    
    for (int i = 0; i < 20; i++) {
      num[i]= (int) (Math.random()*100)+1;
      cuadrado[i]= num[i] * num [i];
      cubo[i]= num[i] * num[i] * num[i];
    }
    System.out.println("------------------------------");
    System.out.println("NUMERO|CUADRADO|CUBO   |");
    System.out.println("------------------------------");
    for (int i = 0; i < 20; i++) {
      System.out.printf("%6d %8d %7d \n",num[i], cuadrado[i], cubo[i]);
      
    }
    System.out.println("------------------------------");
    
 }
}


