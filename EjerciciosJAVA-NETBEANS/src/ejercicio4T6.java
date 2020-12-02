//Ejercicio 4 Tema 6
// Muestra 20 numeros aleatorios entre 0 y 10 (ambos incluidos) separados por espacio.

public class ejercicio4T6 {
  public static void main(String args[]) {
   System.out.println("Muestra 20 números aleatorios entre 0 y 10. ");
   System.out.println("--------------------------------------------");
   int num = 0;
    for (int i = 0; i < 20; i++) {
      num = (int) (Math.random()*6)+1;
      System.out.print(num + " ");
      
    }
    System.out.println("");
  }
}
