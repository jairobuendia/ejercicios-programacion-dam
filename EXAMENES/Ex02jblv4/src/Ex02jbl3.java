
import java.util.Scanner;

/*
 * Ejercicio 3 examen
 */

/**
 *
 * @author Jairo Buendía 1 DAM 10/02/2021
 */
public class Ex02jbl3 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int alturaPiramide;
    int contador = 0;
    int contador2 = 1;
    System.out.print("Introduzca la altura de la pirámide: ");
    alturaPiramide = Integer.parseInt(s.nextLine());
    
    
    //pinta cada linea de la piramide
    for (int i = 0; i < alturaPiramide; i++) {
       //pinta los espacios de delante
      for (int j = alturaPiramide - contador; j > 0; j--) {
        System.out.print(" ");
      }
      
      System.out.print(linea(i*2, '*', ' '));
      System.out.println("");
      contador ++;
      
    }
    //pinta la base de la piramide
    for (int i = 0; i < (alturaPiramide*2); i++) {
      System.out.print("*");
      
    }
   
    
  }
  

  //Pinta linea con caracter indicado y espacios entre medio de los caracteres
  public static String linea(int longitud , char extremo, char relleno){
    String resultado = "";
    for(int i=0; i<longitud; i++){
      if(i==0 || i==longitud-1){
        resultado += extremo;
      }else{
        resultado += relleno;
      }
    }
    return resultado;
  }
}
