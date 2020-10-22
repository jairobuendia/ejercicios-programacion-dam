/**
 * Calcula el total de una factura a partir de la base imponible.
 *
 * @author Jairo Buendia
 */
public class ejercicio7T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Indica la base imponible: ");
    linea = System.console().readLine();
    double baseImpo = Integer.parseInt( linea );
    double iva = 0.21;
    double totalFactura = (baseImpo * iva) + baseImpo;
    
    System.out.println("El total de la factura es: " + totalFactura );


  }
}
