package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jairo Buendia
 */
public class ejercicio2T9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("VEHÍCULOS");
    System.out.println("");
    System.out.println("=========");
    System.out.println("1. Anda con la bicicleta");
    System.out.println("2. Haz el caballito con la bicicleta");
    System.out.println("3. Anda con el coche");
    System.out.println("4. Quema rueda con el coche");
    System.out.println("5. Ver kilometraje de la bicicleta");
    System.out.println("6. Ver kilometraje del coche");
    System.out.println("7. Ver kilometraje total");
    System.out.println("8. Salir");
    System.out.print("Elige una opción (1-8): ");
    int opcion = Integer.parseInt(s.nextLine());
    
    switch(opcion){
      case 1:
        System.out.println("1");
        break;
       case 2:
        System.out.println("2");
        break;
        
    }
    
    
  }
  
}
