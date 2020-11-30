//Ejercicio 1 Tema 6
// Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
//también la suma total (los puntos que suman entre los tres dados).

public class ejercicio1T6 {
  public static void main(String args[]) {
   System.out.println("Tiradas de 3 dados. ");
   int tirada;
   int suma = 0;
    for (int i = 0; i < 3; i++) {
      tirada = (int) (Math.random()*6)+1;
      System.out.print(tirada + " ");
      suma = suma + tirada;
    }
    System.out.println("");
    System.out.println("La suma de los 3 dados es: " + suma);
  }
}
