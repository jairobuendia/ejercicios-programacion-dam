package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jairo Buendia
 */
public class ejercicio2T9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int kms = 0;
    boolean salida = true;
    Bicicleta trek = new Bicicleta("carretera");
    Coche dacia = new Coche("blanco");
    
    while (salida) {
    System.out.println("");
    System.out.println("=========");
    System.out.println("VEHÍCULOS");
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
        System.out.print("¿Cuantós kms vas a recorrer? ");
        kms = Integer.parseInt(s.nextLine());
        trek.recorre(kms);
        break;
       case 2:
        trek.HazCaballito();
        break;
       case 3:
         System.out.print("¿Cuantós kms vas a recorrer? ");
         kms = Integer.parseInt(s.nextLine());
         dacia.recorre(kms);
         break;
       case 4:
         dacia.quemaRueda();
         break;
       case 5:
         System.out.println("El kilometraje de la bicicleta es: " + trek.getKilometraje());
         break;
       case 6:
         System.out.println("El kilometraje de la bicicleta es: " + dacia.getKilometraje());
         break;
       case 7:
         System.out.println("El kilometraje total de los vehiculos es: " + Vehiculo.getKmTotales());
         break;
       case 8:
         System.out.println("Saliendo...");
         salida = false;
         break;
    }
    }
    
    
    
  }
  
}
