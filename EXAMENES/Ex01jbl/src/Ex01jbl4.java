
import java.util.Scanner;

/*
 * Ejercicio4
 */

/**
 *
 * @author Jairo Buendia Lopez 11/11/2020 1DAM
 */
public class Ex01jbl4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura = 0;
    int trozos = 0;
    System.out.print("Introduzca la altura de la pirámide: ");
    altura = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el número de trozos: ");
    trozos = Integer.parseInt(s.nextLine());
    
    int resul = (altura % trozos);
 
    
    while (resul != 0){
      System.out.println("No puede haber más trozos que pisos en la pirámide. Vuelva a intentarlo.");
      System.out.print("Introduzca la altura de la pirámide: ");
      altura = Integer.parseInt(s.nextLine());
      System.out.print("Introduzca el número de trozos: ");
      trozos = Integer.parseInt(s.nextLine());
      resul = (altura % trozos);
    }
    
    int lineastrozos = altura / trozos;
    int espacios = altura;
    int longitudLinea = 1;
    
    System.out.println("Hola q ashe");
    //Pinta los trozos
    for (int t = 0; t < trozos; t++) {
      //Pinta las lineas de los trozos
      for (int l = 0; l < lineastrozos; l++) {
        //Pinta los espacios de la izquierda de la línea
        for (int i = 0; i < espacios; i++) {
          System.out.print(" ");
          
        }
        //Pinta los asteriscos
        for (int a = 0; a < longitudLinea; a++) {
          System.out.print("*");
        }
        System.out.println();
        espacios --;
        longitudLinea +=2;
      }
      System.out.println("");
    }
    
  }
  
}
