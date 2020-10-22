/**
 * Realiza operaciones con los dos números dados!
 *
 * @author Jairo Buendia
 */
public class ejercicio4T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Indica el primer número: ");
    linea = System.console().readLine();
    int num1 = Integer.parseInt( linea );
    
    System.out.print("Indica el segundo número: ");
    linea = System.console().readLine();
    int num2 = Integer.parseInt( linea );
    
    System.out.println("La suma de los dos números es: " + (num1 + num2));
    System.out.println("La resta de los dos números es: " + (num1 - num2));
    System.out.println("La multiplicación de los dos números es: " + (num1 * num2));
    System.out.println("La división de los dos números es: " + (num1 / num2));



  }
}
