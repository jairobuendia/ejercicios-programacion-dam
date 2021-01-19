//Ejercicio 12 Tema 6
// Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
// con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
// convertir un entero en un carácter.




public class ejercicio12T6 {
  public static void main(String args[]) throws InterruptedException {
   System.out.println("Bienvenido a MATRIX...");
    System.out.print("\033[32m");
    int linea = 0;
    for (int i = 0; i < 9000; i++) {
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
      linea ++;
      if (linea == 60){
        Thread.sleep(200);
        System.out.println("\033[32m");
        linea = 0;
      }
    }
  }
}