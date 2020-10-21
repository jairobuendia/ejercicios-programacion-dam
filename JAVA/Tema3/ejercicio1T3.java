/**
 * Multipliacion con dos numeros dados en pantalla!!
 *
 * @author Jairo Buendia
 */
public class ejercicio1T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Indica el primer número: ");
    linea = System.console().readLine();
    int num1 = Integer.parseInt( linea );
    
    System.out.print("Indica el primer número: ");
    linea = System.console().readLine();
    int num2 = Integer.parseInt( linea );
    
    int resul = (num1 * num2);
    
    System.out.println("El resultado de la multiplicación de ambos números es: " + resul);



  }
}
