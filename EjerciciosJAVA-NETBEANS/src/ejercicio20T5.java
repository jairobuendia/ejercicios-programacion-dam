import java.util.Scanner;

public class ejercicio20T5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un la altura de la pirámide: ");
    int altura = Integer.parseInt(sc.nextLine());
    System.out.print("Introduzca un carácter: ");
    String caracter = sc.nextLine();
    sc.close();

    int espacios = altura - 1;
    int caracteresPintar = 1;
    //bucle por cada linea
    for (int i = 0; i < altura; i++) {
      //bucle para los espacios
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      
      //bucle para los caracteres
      for (int h = 0; h < caracteresPintar; h++) {
        if (h == 0 || h == caracteresPintar - 1) {
          System.out.print(caracter);
        } else {
          if (i == altura - 1) {
            System.out.print(caracter);
          } else {
            System.out.print(" ");
          }

        }
      }
      espacios--;
      caracteresPintar = caracteresPintar + 2;
      System.out.println();
    }
  }
}