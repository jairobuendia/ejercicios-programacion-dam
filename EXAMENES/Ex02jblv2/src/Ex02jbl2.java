import java.util.Scanner;

//Ejercicio 2 examen
// Realiza un programa que pinte un puente con las siguientes características

/**
 *
 * @author Jairo Buendia 1DAM 16/12/2020
 */

public class Ex02jbl2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la longuitud total del puente (un número mayor que 6): ");
    int longuitudPuente = Integer.parseInt(s.nextLine());
    
    while (longuitudPuente <=6) {      
      System.out.print("Introduzca la longuitud total del puente (un número mayor que 6): ");
      longuitudPuente = Integer.parseInt(s.nextLine());
    }
    
    //PINTAR PERSONAS PLATAFORMA
    //PINTAR PRIMEROS ESPACIOS
    for (int i = 0; i < 2; i++) {
      System.out.print(" ");
    }
    //NUMERO PERSONAS
    int lugarPersona = longuitudPuente - 4;
    int posicionPersona = 0;
    int posicionSiguiente = 0;
    String caracter = "";
   
    for (int i = 0; i < lugarPersona; i++) {
      posicionPersona = (int) (Math.random()* 3) + 1;
      switch (posicionPersona){
       case 1:
         System.out.print("&");
         break;
       case 2:
         System.out.print(" ");
         break;
       case 3:
        System.out.print(" ");
         break;
      }
    }
    
    System.out.println("");
    
    //PINTAR PLATAFORMA
    int espaciosPlataforma = 2;
    int longuitudPlataforma = longuitudPuente - 4;
      //PINTAR PRIMEROS ESPACIOS PLATAFORMA
    for (int i = 0; i < espaciosPlataforma; i++) {
      System.out.print(" ");
    }
    //pinta la longuitud de la plataforma
    for (int j = 0; j < longuitudPlataforma; j++) {
      System.out.print("*");
    }
    
    System.out.println("");
    //PINTAR PRMERA PATA
    int espaciosPata = longuitudPlataforma;
    //PINTAR PRIMEROS ESPACIOS
    for (int i = 0; i < 1; i++) {
      System.out.print(" ");
    }
    for (int j = 0; j < 1; j++) {
      System.out.print("*"); 
    }
    //PINTAR SEGUNDOS ESPACIOS
    for (int i = 0; i < espaciosPata; i++) {
      System.out.print(" ");
    }
    System.out.print("*");
    System.out.println("");
    
    //PINTAR SEGUNDA PATA
    System.out.print("*"); 
    //PINTAR SEGUNDOS ESPACIOS
    int espaciosPata2 = espaciosPata + 2;
    for (int i = 0; i < espaciosPata2; i++) {
      System.out.print(" ");
    }
    System.out.print("*");
    System.out.println("");
    
    
  }
  
}
