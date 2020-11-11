
import java.util.Scanner;

/*
 * Ejercicio 1 examen
 *
 */

/**
 *
 * @author Jairo Buendia Lopez 11/11/2020 1DAM
 */
public class Ex01jbl1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduze la cantidad de polos que desea: ");
    int cant;
    cant = s.nextInt();
    System.out.println("Indica el color: \n 1)Blanco \n 2)Otro color ");
    int color;
    color = s.nextInt();
    System.out.println("Indica el tipo: \n 1)Serigrafia \n 2)Bordado ");
    int tipo;
    tipo = s.nextInt();
    
    double totalTextil = 0;
    double precioUnitario = 0;
    if (cant >= 20 && cant <= 39) {
      totalTextil = cant * 4.90;
      precioUnitario = 4.90;
    } else if (cant >=40 && cant <=99) {
      totalTextil = cant * 3.90;
      precioUnitario = 3.90;
    } else if (cant >=100) {
      totalTextil = cant * 3.20;
      precioUnitario = 3.20;
    }
    
    double totalTextilColor = 0;
    if (color == 2){
    
      totalTextilColor = totalTextil * 1.2;
      precioUnitario = precioUnitario * 1.2;
    } else {
      totalTextilColor = totalTextil;
    }
    
    
    double serigrafia = 0;
    if (tipo == 1){
      if (cant < 50){
        serigrafia = 2.00;
      } else {
        serigrafia = 1.50;
      }
    } else {
      if (cant < 50){
        serigrafia = 3.00;
      } else {
        serigrafia = 2.50;
      }
    }
    
    System.out.println("PEDIDO POLITOS - PRESUPUESTO");
    System.out.println("----------------------------");
    System.out.println("Cantidad de polos\t " + cant);
    System.out.printf("Precio unitario\t\t  %.2f €\n" ,precioUnitario);
    System.out.printf("Total textil\t\t%.2f €\n" ,totalTextilColor);
    System.out.printf("Serigrafía (c.u.)\t  %.2f €\n" , serigrafia);
    System.out.printf("Total serigrafía\t %.2f €\n" , serigrafia * cant);
    System.out.printf("Polo más serigrafía\t%.2f €\n" , (totalTextilColor + (serigrafia * cant)));
    double IVA = 0;
    IVA = 0.21 * (totalTextilColor + (serigrafia * cant));
    System.out.printf("IVA\t\t\t %.2f €\n" , IVA );
    System.out.printf("TOTAL\t\t\t%.2f €\n" , (IVA + totalTextilColor + (serigrafia * cant) ));
    
    
     
    
  }
  
}
