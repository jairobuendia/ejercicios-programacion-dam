/**
 * Programa que diga cuál es la última cifra de un número
 * entero introducido por teclado.
 * @author Jairo Buendia
 */
public class ejercicio17T4 { 
  public static void main(String[] args) {
    
    System.out.print("Indica un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("Su última cifra es: " + (numero % 10));
    
  }
}
