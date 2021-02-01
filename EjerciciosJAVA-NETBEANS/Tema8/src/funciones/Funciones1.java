package funciones;

/**
 *
 * @author Jairo Buendía
 */
public class Funciones1 {
  
  //Saca si un numero es primo/true o no primo/false
  /**
   * 
   * @param num Pide un numero long para hayar si es primo o no
   * @return boolean Devuelve true si el numero es primo y false si no lo es
   */
  public static boolean esPrimo (long num){
    int primo = 0;
    for (int i = 1; i <= num ; i++) {
      if (num % i == 0){
        primo ++;
      }
    }
    if (primo == 2){
      return true;
    } else {
      return false;
    }
  }
  
  //Saca si un numero es primo/true o no primo/false
  /**
   * 
   * @param num Pide un numero long para sacar sus cifras
   * @return int Saca los digitos que contiene el numero 
   */
  public static int digitos (long num){
    int contador = 0;
           
    while (num > 0){
      num = num / 10;
      contador ++;
    }
    return contador;
  }
  
  //Voltea el numero indicado
  /**
   * 
   * @param num Pide un numero long para darle la vuelta
   * @return  long Saca el numero indicado dado la vuelta
   */
  
  public static long voltea (long num){
    long invertido = 0;
    long resto = 0;
      
    while (num > 0){
      resto = num % 10;
      invertido = invertido * 10 + resto;
      num /= 10;
    }

    return invertido;
  }
  
  //Mira si un numero es capicua
  /**
   * 
   * @param num Mira si el número es igual dado la vuelta que en la forma original
   * @return boolean Da como true si el número es capicua y false si no lo es
   */
  public static boolean esCapicua (long num){
    if (num == Funciones1.voltea(num)){
      return true;
    } else {
      return false;
    }
  }
  
  //Muestra un array
  public static void muestraArray(int x[]) {
  for (int i = 0; i < x.length; i++) {
    System.out.print(x[i] + " ");
  }
  System.out.println();
  }
  
  //Mira si un numero esta dentro de un array , devuelve true or false
  public static boolean miraNumeroArray (int[] a, int n){
    for (int numero : a) {
      if (numero == n) {
        return true;
      } 
    }
    return false;
  }

  
  
  
}
