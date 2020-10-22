/**
 * Conversor de pesetas a euros!
 *
 * @author Jairo Buendia
 */
public class ejercicio3T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Indica la cantidad de pesetas: ");
    linea = System.console().readLine();
    int pesetas = Integer.parseInt( linea );
    
    double euros = (pesetas * 0.006);
    
    System.out.println( pesetas + " pesetas son " + euros + " euros.");



  }
}
