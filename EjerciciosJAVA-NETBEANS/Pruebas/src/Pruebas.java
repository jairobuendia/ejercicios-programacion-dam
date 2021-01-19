
import java.util.Scanner;

/*
 * Ejericio1 examen randoms
/**
 *
 * @author JAiro Buendia
 */
public class Pruebas {

  public static void main(String[] args) {
    boolean bol = true;
    int contador = 0;
    int incremento = 1;
    int primo = 0;
    do {
      int num = (int) (Math.random() * (200 - 2 + 1) +2); // genera un numero random entre 2 y 200
      if (num % 2 == 1){ //comprueba que el numero sea inpar y lo pinta
      System.out.print(num + " ");
      contador ++; // aumenta el contador para el resultado final por cada nummero inpar
        for (int i = 0; i < num; i++) { //bucle para sacar numeros primos
        if (num % incremento == 0){ //saca el resto de todos los numeros Ej:(7/1, 7/2, 7/3)
          primo ++; //suma 1 a "primo" si sale el resultado 0
          }
        incremento ++; //incrementa el numero por el que se divide por cada vez
        }
        if(primo == 2){ //comprueba si el valor de "primo" es igual a 2
        System.out.println("");
        System.out.println("Se han generado " + contador + " números impares aleatorios.");
        bol = false;
        }
        incremento = 1; //restaura los valores para el siguiente número
        primo = 0;
      }
    } while (bol);
    
  }
}

