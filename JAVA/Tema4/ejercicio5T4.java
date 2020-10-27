/**
 * Realiza un programa que resuelva una ecuación de primer grado (tipo ax + b = 0)
 *
 * @author Jairo Buendia
 */
public class ejercicio5T4 { 
  public static void main(String[] args) {
    
    System.out.print("Indica el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Indica el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());
    
    if (a == 0) {
      System.out.println("No existe solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
