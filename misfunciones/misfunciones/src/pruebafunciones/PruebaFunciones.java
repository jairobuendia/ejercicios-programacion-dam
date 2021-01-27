package pruebafunciones;
import java.util.Scanner;
import misfunciones.Dibujo;

/**
 *
 * @author JAiro Buendia
 */
public class PruebaFunciones {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);  
    System.out.print(Dibujo.linea(8));
    
    System.out.print("Introduzca el primer número: ");
    double primerNum = Double.parseDouble(s.nextLine());
    
    System.out.print("Introduzca el segundo número: ");
    double segundoNum = Double.parseDouble(s.nextLine());
    
    System.out.print("Introduzca el tercer número: ");
    double tercerNum = Double.parseDouble(s.nextLine());
    
    System.out.println(media(primerNum, segundoNum, tercerNum));
    
    
    double[] notas = {4.6, 2, 42, 3.5, 98};
    System.out.println(mediaArray(notas));
  }
  
  
  // Funciones
  public static double media(double numero1, double numero2, double numero3) {
    double media = (numero1 + numero2 + numero3) / 3;
    return media;
  }
  
  //mediaArray
  public static double mediaArray (double[] numeros) {
    double suma = 0;
    for (double numero : numeros) {
      suma = suma + numero;
    }
    double media = suma / numeros.length;
    
    return media;
    
  }
  
}
