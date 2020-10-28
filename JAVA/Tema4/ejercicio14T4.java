/**
 * Realiza un programa que diga si un numero es par o divisble entre 5.
 * @author Jairo Buendia
 */
public class ejercicio14T4 { 
  public static void main(String[] args) {
    
    System.out.print("Indica un número entero: ");
    int num = Integer.parseInt(System.console().readLine());

    if ((num % 2) == 0) {
      System.out.print("Es par");
    } else {
      System.out.print("Es impar");
    }

    if ((num % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
    
  }
}
