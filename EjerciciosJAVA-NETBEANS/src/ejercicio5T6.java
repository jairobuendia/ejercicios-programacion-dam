//Ejercicio 5 Tema 6
// Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
// separados por espacios. Muestra también el máximo, el mínimo y la media
// de esos números.


public class ejercicio5T6 {
  public static void main(String args[]) {
   System.out.println("Muestra 50 números aleatorios entre 100 y 199. ");
   System.out.println("--------------------------------------------");
   int num = 0;
    for (int i = 0; i < 50; i++) {
      num = (int) (Math.random()* (200 - 100)) + 100;
      System.out.print(num + " ");
      
    }
    System.out.println("");
  }
}