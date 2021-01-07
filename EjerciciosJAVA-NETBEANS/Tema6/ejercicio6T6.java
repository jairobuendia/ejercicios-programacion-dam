
import java.util.Scanner;

//Ejercicio 6 Tema 6
// Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
// el programa dirá cuántas oportunidades quedan y si el número introducido es
// menor o mayor que el número secreto.


public class ejercicio6T6 {
  public static void main(String args[]) {
  Scanner s = new Scanner(System.in);
  int numIntro = 0;
  int numAleat = (int) (Math.random()*100)+1;
  int intentos = 5;
    System.out.println(numAleat);
    do {
      System.out.print("Introduce el número entero para adivinar entre 0 y 100: ");
      numIntro = Integer.parseInt(s.nextLine());
      if ( numAleat > numIntro ){
        intentos --;
        System.out.println("El número secreto es mayor que el numero introducido.");
        System.out.println("Te quedan " + intentos + " intentos.");
      } else if ( numAleat < numIntro ) {
        intentos --;
        System.out.println("El número secreto es menor que el numero introducido.");
        System.out.println("Te quedan " + intentos + " intentos.");
      } else if ( numAleat == numIntro ) {
        System.out.println("Acertaste crack!!!");
        if ( intentos > 0) {
        System.out.println("Y con " + intentos + " intentos de sobra. :)))");
        }
        intentos = 0;
      }
      
    } while (intentos > 0);
    
   
  }
}