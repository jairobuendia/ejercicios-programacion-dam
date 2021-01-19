
import java.util.Scanner;

/*
 * Ejercicio2 examen3
 */

/**
 *
 * @author Jairo Buendia
 */
public class Ejercicio2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la longitud total del puente (un número mayor que 6): ");
    int longiPlat = Integer.parseInt(s.nextLine());
    while (longiPlat <= 6){
      System.out.println("El dato introducido es incorrecto.");
      System.out.print("Introduzca la longitud total del puente (un número mayor que 6): ");
      longiPlat = Integer.parseInt(s.nextLine());
    }
    
    //pintar personas
    int pintarPlat = longiPlat - 4;
    System.out.print("  "); //espacio antes de personas
    for (int i = 0; i < pintarPlat; i++) {
      int personas = (int)(Math.random() * (3) + 1); //saca num alet entre 1 y 3
      switch(personas) {
      case 1:
        System.out.print(" ");
      break;
      case 2:
        System.out.print(" ");
      break;
      case 3:
        System.out.print("&");
      break;
      }
    }
    System.out.println();
    //pintar plataforma
   
    System.out.print("  "); //pinta los espacios delante de la plataforma
    for (int i = 0; i < pintarPlat; i++) { //pinta los caracteres de la plataforma
      System.out.print("*");
    }
    System.out.println(""); //Salto de linea para pasar a las patas
    
    //pintar patas altas
    System.out.print(" "); //espacio pata arriba
    System.out.print("*");
    for (int i = 0; i < pintarPlat; i++) { //pintar espacio entre patas
      System.out.print(" ");
    }
    System.out.print("*"); //pintar patas arribas final
    System.out.print(" "); // espacio pata
    
    System.out.println(""); //salto
    
    //pintar patas bajas
    int pintarPlat2 = longiPlat -2;
    System.out.print("*");
    for (int i = 0; i < pintarPlat2; i++) {
      System.out.print(" ");
    }
    System.out.println("*");
    
    System.out.println("");
    
    
    
  }
  
}
