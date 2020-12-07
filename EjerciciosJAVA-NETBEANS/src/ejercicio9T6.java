//Ejercicio 9 Tema 6
// Realiza un programa que vaya generando números aleatorios pares entre 0
// y 100 y que no termine de generar números hasta que no saque el 24. El
// programa deberá decir al final cuántos números se han generado.



public class ejercicio9T6 {
  public static void main(String args[]) {
   System.out.println("Generando números aleatorios... ");
   System.out.println("--------------------------------------------");
   int num = 0;
   boolean salir = true;
    while (salir != false) {
      num = (int) (Math.random()* 100) + 1;
      //comprobamos si es par
      int resul = num % 2;
      if (resul != 0 ){
        
      } else {
        //miramos si el numero es 24
        if (num == 24) {
        System.out.print("\033[33m" + num);
        salir = false;
        } else {
        System.out.print(num + " ");
        }
      }
    }
   
    System.out.println("");
  }
}