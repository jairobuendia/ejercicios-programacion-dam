/**
 * Realiza un programa que ordene 3 numeros dados por teclado.
 * @author Jairo Buendia
 */
public class ejercicio13T4 { 
  public static void main(String[] args) {
    
    int aux;
    
    System.out.println("Indica los tres números y pulsando INTRO:");
    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());
    
    // ordena los dos primeros números
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    // ordenalos dos últimos números
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    // vuelve a ordenar los dos primeros números
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    System.out.println("Esto son los números ordenados de menor a mayor: " + a + ", " + b + " y " + c + ".");
  }
}
