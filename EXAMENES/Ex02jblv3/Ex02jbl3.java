
import java.util.Scanner;

/*
 * Ejercicio 3
*/

/**
 *
 * @author Jairo Buendia 1DAM 18/11/2020
 */
public class Ex02jbl3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    //comprueba la entrada por teclado
    Scanner s = new Scanner(System.in);
    System.out.println("Introduze la cantidad de paquetes que desea: ");
    int cant = Integer.parseInt(s.nextLine());
    while (cant < 20) {      
      System.out.println("El pedido mínimo es de 20 paquetes. Inténtelo de nuevo. ");
      cant = Integer.parseInt(s.nextLine());
    }
    System.out.println("Número de colores de la impresión de la taza: ");
    int numColor = Integer.parseInt(s.nextLine());
    while (numColor <= 0 ) {      
       System.out.println("Número de colores de la impresión de la taza: ");
       numColor = Integer.parseInt(s.nextLine());
    }
    System.out.println("1)Llavero de plástico \n2)Llavero metálico: ");
    int tipo = Integer.parseInt(s.nextLine());
    while (tipo < 1 || tipo > 2) {      
      System.out.println("1)Llavero de plástico \n2)Llavero metálico: ");
      tipo = Integer.parseInt(s.nextLine());
    }
    
    
    double totalLlaveros = 0;
    double precioUnitario = 0;
    if (cant >= 20 && cant <= 39) {
      totalLlaveros = cant * 4.90;
      precioUnitario = 4.90;
    } else if (cant >=40 && cant <=99) {
      totalLlaveros = cant * 3.90;
      precioUnitario = 3.90;
    } else if (cant >=100) {
      totalLlaveros = cant * 3.20;
      precioUnitario = 3.20;
    }
    
    String  resulfinal;
    double totalColor = 0;
    if (numColor > 3){
    
      totalColor = totalLlaveros * 1.2;
      precioUnitario = precioUnitario * 1.2;
      resulfinal = "más de 3 col.";
    } else {
      totalColor = totalLlaveros;
      resulfinal = "hasta 3 col.";
    }
    
    
    double material = 0;
    if (tipo == 1){
      if (cant < 50){
        material = 2.00;
      } else {
        material = 1.50;
      }
    } else {
      if (cant < 50){
        material = 3.00;
      } else {
        material = 2.50;
      }
    }
  
    // resultado por pantalla
    System.out.println("PROMOCIONES COMERCIALES - PRESUPUESTO");
    System.out.println("----------------------------");
    System.out.printf("Taza (" + resulfinal +")       %4d unid.\n" , cant);
    System.out.printf("Precio unitario            %7.2f €\n" ,precioUnitario);
    System.out.printf("Total tazas                %7.2f €\n" ,totalColor);
    System.out.printf("Llaveros (c.u.)            %7.2f €\n" , material);
    System.out.printf("Total llaveros             %7.2f €\n" , material * cant);
    System.out.printf("Tazas más llaveros         %7.2f €\n" , (totalColor + (material * cant)));
    double IVA = 0;
    IVA = 0.21 * (totalColor + (material * cant));
    System.out.printf("IVA                        %7.2f €\n" , IVA );
    System.out.printf("TOTAL                      %7.2f €\n" , (IVA + totalColor + (material * cant) ));
    
    
     
    
  }
  

  }
  
