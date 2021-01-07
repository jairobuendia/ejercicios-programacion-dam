//Ejercicio 17 Tema 6
// Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
// Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
// serán de 4 unidades. No hay que comprobar que los datos se introducen
// correctamente; podemos suponer que el usuario los introduce bien. Dentro de
// la pecera hay que colocar de forma aleatoria un pececito, que puede estar
// situado en cualquiera de las posiciones que quedan en el hueco que forma el
// rectángulo.

import java.util.Scanner;


public class ejercicio17T6 {
  public static void main(String args[]) {
   Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la pecera (como mínimo 4): ");
    int alturaPecera = Integer.parseInt(s.nextLine());
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int anchoPecera = Integer.parseInt(s.nextLine());
    //GENERAR PECESITO
    int numPecesito1;
    int numPecesito2;
    numPecesito1 = (int) (Math.random()* (anchoPecera -2)) + 1;
    numPecesito2 = (int) (Math.random()* (alturaPecera -2)) + 1;
//    System.out.println("Ancho " + numPecesito1);
//    System.out.println("Altura " + numPecesito2);
    
    //Primera linea de la pecera
    for (int i = 0; i < anchoPecera; i++) {
      System.out.print("*");

    }
    System.out.println("");
    //pintar altura
    int marca = 0;
    int sumaEspacios = 0;
    alturaPecera = alturaPecera - 2;
    int alturaPeceraPez = alturaPecera;
    for (int i = 0; i < alturaPecera; i++) {
      //pinta la columna izquierda por cada linea
      System.out.print("*");
      //mira la linea de la altura del pez
      if (alturaPeceraPez == numPecesito2 ){
        //ESpacios para el pez 
        for (int j = 0; j < numPecesito1 - 1; j++) {
          System.out.print(" ");
          sumaEspacios = sumaEspacios + 1 ;
        }
        System.out.print("&");
        anchoPecera = anchoPecera - 1;
        marca = 1;
        sumaEspacios = sumaEspacios + 1;
        //ESPACIOS DESPUES DEL PEZ
        int resultado = ((anchoPecera -2) - numPecesito1 + 1);
        for (int j = 0; j < resultado ; j++) {
          System.out.print(" ");
        }
      }
      //pintar espacios entre las paredes
      if (marca == 1){
        
      } else {
      for (int j = 0; j < (anchoPecera - 2); j++) {
        System.out.print(" ");
      }
      }
      System.out.println("*");
      if (marca == 1) {
        anchoPecera = anchoPecera + 1;
        marca = 0;
      }
      
      alturaPeceraPez --;
    }
    //Ultima linea de la pecera
    for (int i = 0; i < anchoPecera; i++) {
      System.out.print("*");
    }
    System.out.println("");
 
  }
}