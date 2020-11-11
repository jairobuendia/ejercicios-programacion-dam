
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    altura = s.nextInt();
    System.out.print("Introduzca el número de trozos: ");
    trozos = s.nextInt();
    
    int resul = (altura % trozos);
 
    
    while (resul != 0){
      System.out.println("No puede haber más trozos que pisos en la pirámide. Vuelva a intentarlo.");
      System.out.print("Introduzca la altura de la pirámide: ");
      altura = s.nextInt();
      System.out.print("Introduzca el número de trozos: ");
      trozos = s.nextInt();
      resul = (altura % trozos);
    }
  }
  
}
