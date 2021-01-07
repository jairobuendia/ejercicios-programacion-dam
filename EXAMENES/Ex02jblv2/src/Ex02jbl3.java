
import java.util.Scanner;

//Ejercicio 3 examen
// Implementa un programa que genere el "desglose del IVA" para una
// serie de productos adquiridos en una tienda. El programa ha de solicitar, de
// manera reiterada, los siguientes datos para cada producto que se adquiera:

/**
 *
 * @author Jairo Buendia 1DAM 16/12/2020
 */
public class Ex02jbl3 {

  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.println("FACTURA TIENDA");
   System.out.println("==============");
   String nombre = "";
   double precioUnidad = 0;
   int cantidad = 0;
   int IVA = 0;
   double IVA4 = 0;
   double IVA10 = 0;
   double IVA21 = 0;
   double total = 0;
   do{
      System.out.print("Introduzca el nombre del artículo ('fin' para salir): ");
      nombre = s.nextLine();
      //comprueba que no introduzca la palabra fin
      if( !(nombre.equals("fin"))){
        System.out.print("Precio por unidad para " + nombre + " (IVA incluido): ");
        precioUnidad = Double.parseDouble(s.nextLine());
        System.out.print("Cantidad de unidades de " + nombre + " : ");
        cantidad = Integer.parseInt(s.nextLine());
        System.out.print("Tipo de IVA aplicado a " + nombre + " (4,10,21): ");
        IVA = Integer.parseInt(s.nextLine());
        switch (IVA){
          case 4:
            IVA4 += (((precioUnidad * cantidad) * 100) / 104);  
          break;
          case 10:
            IVA10 += (((precioUnidad * cantidad) * 100) / 110);
          break;
          case 21:
            IVA21 += (((precioUnidad * cantidad) * 100) / 121);
          break;
          default:
        }
        total += cantidad * precioUnidad;
      }
    }while(!(nombre.equals("fin")));
    System.out.println();
    System.out.printf("%-35s %8.2f\n", "TOTAL:", total);
    for( int i = 0; i < 45; i++){
      System.out.print("-");
    }
    System.out.println();
    System.out.printf("%-24s %8.2f %-4s %5.2f\n", "Base imponible   4%:",IVA4,"IVA:", IVA4 * 0.04);
    System.out.printf("%-24s %8.2f %-4s %5.2f\n", "Base imponible  10%:",IVA10,"IVA:", IVA10 * 0.10);
    System.out.printf("%-24s %8.2f %-4s %5.2f\n", "Base imponible  21%:",IVA21,"IVA:", IVA21 * 0.21);
  }
}



  
//    
//    //comprueba la entrada por teclado
//    Scanner s = new Scanner(System.in);
//    System.out.println("Introduze el nombre del artículo  ('fin' para salir): ");
//     cant = Integer.parseInt(s.nextLine());
//    while (cant < 20) {      
//      System.out.println("El pedido mínimo es de 20 paquetes. Inténtelo de nuevo. ");
//      cant = Integer.parseInt(s.nextLine());
//    }
//    System.out.println("Número de colores de la impresión de la taza: ");
//    int numColor = Integer.parseInt(s.nextLine());
//    while (numColor <= 0 ) {      
//       System.out.println("Número de colores de la impresión de la taza: ");
//       numColor = Integer.parseInt(s.nextLine());
//    }
//    System.out.println("1)Llavero de plástico \n2)Llavero metálico: ");
//    int tipo = Integer.parseInt(s.nextLine());
//    while (tipo < 1 || tipo > 2) {      
//      System.out.println("1)Llavero de plástico \n2)Llavero metálico: ");
//      tipo = Integer.parseInt(s.nextLine());
//    }
//    
//  }
//  
//}