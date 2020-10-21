/**
 * Conversor de euros a pesetas!!
 *
 * @author Jairo Buendia
 */
public class ejercicio2T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Indica la cantidad de euros: ");
    linea = System.console().readLine();
    int euros = Integer.parseInt( linea );
    
    double pesetas = (euros * 166.3860);
    
    System.out.println( euros + " euros son " + pesetas + " pesetas.");



  }
}
