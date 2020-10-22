/**
 * Conversor de MB a KB
 *
 * @author Jairo Buendia
 */
public class ejercicio10T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Indica la cantidad en MB: ");
    linea = System.console().readLine();
    double megab = Double.parseDouble( linea );
    
    
    double kilob = (megab * 1024);
    
    
    System.out.println( megab + " MB son " + kilob + "KB" );
  
  
  }
}
