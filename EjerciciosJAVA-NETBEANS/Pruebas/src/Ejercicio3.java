
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
    double precioUnidad = 0;
    int cantidadUnidad = 0;
    int cantidadIVA = 0;
    double totalIVA4 = 0;
    double totalIVA10 = 0;
    double totalIVA21 = 0;
    double IVA4 = 0;
    double IVA10 = 0;
    double IVA21 = 0;
    double total = 0;
    double precio = 0;
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
        switch (cantidadIVA){
          case 4:
            precio = precioUnidad * cantidadUnidad;
            totalIVA4 = totalIVA4 + precio;
            break;
          case 10:
            precio = precioUnidad * cantidadUnidad;
            totalIVA10 = totalIVA10 + precio;
            break;
          case 21:
            precio = precioUnidad * cantidadUnidad;
            totalIVA21 = totalIVA21 + precio;
            break;
        }
      }
    } while (bol);
    total = totalIVA21 + totalIVA10 + totalIVA4;
    IVA4 = totalIVA4 / 1.04;
    IVA10 = totalIVA10 / 1.1;
    IVA21 = totalIVA21 / 1.21;
    System.out.printf("TOTAL:                          %5.2f\n" ,total);
    System.out.printf("-------------------------------------\n");
    System.out.printf("Base imponible  4%%:  %4.2f IVA:  %4.2f\n",IVA4 ,(totalIVA4 * 0.04));
    System.out.printf("Base imponible 10%%:  %4.2f IVA:  %4.2f\n",IVA10 ,totalIVA10 * 0.1);
    System.out.printf("Base imponible 21%%: %4.2f IVA:  %4.2f\n",IVA21 ,totalIVA21 * 0.21);
    
    
  }
  
}
