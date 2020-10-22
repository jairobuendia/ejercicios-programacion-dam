/**
 * Calcula el area de un triángulo!
 *
 * @author Jairo Buendia
 */
public class ejercicio6T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Indica la base del triángulo: ");
    linea = System.console().readLine();
    int baseTri = Integer.parseInt( linea );
    
    System.out.print("Indica la altura del triángulo: ");
    linea = System.console().readLine();
    int alturaTri = Integer.parseInt( linea );
    
    int areaTri = (baseTri * alturaTri) / 2;
    
    System.out.println("El área del triángulo es: " + areaTri );



  }
}
