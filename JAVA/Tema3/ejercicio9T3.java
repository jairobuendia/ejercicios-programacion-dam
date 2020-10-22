/**
 * Calcula el volumen de un cono
 *
 * @author Jairo Buendia
 */
public class ejercicio9T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Indica el radio del cono: ");
    linea = System.console().readLine();
    double radioCono = Double.parseDouble( linea );
    
    System.out.print("Indica la altura del cono: ");
    linea = System.console().readLine();
    double alturaCono = Double.parseDouble( linea );
    
    double volumenCono = (((Math.PI * (radioCono * radioCono)) * alturaCono) / 3 );
    
    
    System.out.println("El volumen del cono es: " + volumenCono );
  
  
  }
}
