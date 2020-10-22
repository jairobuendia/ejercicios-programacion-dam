/**
 * Calcula el area de un rectángulo!
 *
 * @author Jairo Buendia
 */
public class ejercicio5T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Indica la base del rectángulo: ");
    linea = System.console().readLine();
    int baseRec = Integer.parseInt( linea );
    
    System.out.print("Indica la altura del rectángulo ");
    linea = System.console().readLine();
    int alturaRec = Integer.parseInt( linea );
    
    System.out.println("El área del rectangúlo es: " + (baseRec * alturaRec));



  }
}
