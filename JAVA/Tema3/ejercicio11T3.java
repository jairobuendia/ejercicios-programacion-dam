/**
 * Conversor de KB a MB
 *
 * @author Jairo Buendia
 */
public class ejercicio11T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Indica la cantidad en MB: ");
    linea = System.console().readLine();
    double kilob = Double.parseDouble( linea );
    
    
    double megab = (kilob / 1024);
    
    
    System.out.println( kilob + " KB son " + megab + "MB" );
  
  
  }
}
