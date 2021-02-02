package funciones;

/**
 *
 * @author Jairo Buendía López
 */
public class FuncionesArray {

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
