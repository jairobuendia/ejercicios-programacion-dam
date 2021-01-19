
import java.util.Scanner;

/*
 * Ejercicio3 examen3
 */

/**
 *
 * @author Jairo Buendia
 */
public class Ejercicio3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //definimos las variables
    System.out.println("FACTURA TIENDA");
    System.out.println("==============");
    String articulo;
    double precioUnidad = 0.00;
    int cantidadUnidad = 0;
    int cantidadIVA = 0;
    double total;
    double total2;
    boolean bol = true;
    
    do {      
      System.out.print("Introduzca el nombre del artículo ('fin' para salir): ");
      articulo = s.nextLine();
      if (articulo.equals("fin")){
        bol = false;
      }
      if (bol){
      System.out.print("Precio por unidad para " +articulo+ " (IVA incluido): ");
      precioUnidad = Double.parseDouble(s.nextLine());
      System.out.print("Cantidad de unidades de " +articulo+ ": ");
      cantidadUnidad = Integer.parseInt(s.nextLine());
      System.out.print("Tipo de IVA aplicado a  " +articulo+ " (4,10,21): ");
      cantidadIVA = Integer.parseInt(s.nextLine());
      }
      total = precioUnidad * cantidadUnidad;
      total2 = total;
      
    } while (bol);
    System.out.println("TOTAL:                       " +total);
    
    
  }
  
}
