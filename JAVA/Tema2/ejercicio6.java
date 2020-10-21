/**
 * Calcular total de una factura a partir de base imponible!
 *
 * @author Jairo Buendia
 */
public class ejercicio6 { // Clase principal
  public static void main(String[] args) {
    double baseimponible = 44;
    double iva = 1.21;
    double ivafactura = baseimponible * 0.21;
    System.out.println("Base imponible:\t\t" + baseimponible);
    System.out.println("IVA:\t\t\t" + ivafactura);
    System.out.println("Total factura\t\t" + baseimponible * iva);


  }
}
