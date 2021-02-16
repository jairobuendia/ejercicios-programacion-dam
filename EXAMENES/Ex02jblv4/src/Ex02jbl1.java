/*
 * Ejercicio 1 examen
 */

/**
 *
 * @author Jairo Buendía 1 DAM 10/02/2021
 */
public class Ex02jbl1 {

  public static void main(String[] args) {
    String[] a = {"pera", "uva", "naranja", "mango", "cereza", "lichi", "coco"};
    pintaArray(trozoDeArrayString(a, 2, 5));
    pintaArray(trozoDeArrayString(a, -3, 2));
    pintaArray(trozoDeArrayString(a, 7, 20));
    pintaArray(trozoDeArrayString(a, -7, 0));
    pintaArray(trozoDeArrayString(a, -7, -2));
    pintaArray(trozoDeArrayString(a, 3, 3));
    pintaArray(trozoDeArrayString(a, 6, 5));
    pintaArray(trozoDeArrayString(a, -2, 15));
    
    String[] b = { };
    pintaArray(trozoDeArrayString(b, 0, 2));
    
    String[] c = {"sandía"};
    pintaArray(trozoDeArrayString(c, 0, 2));
    

  }
  
  
  public static String[] trozoDeArrayString(String[] a, int inicio, int fin) {
    if(fin < inicio){
      String[] array = {"0"};
      return array;
    }
    if (inicio < 0 && fin < 0){
      String[] array = {"0"};
      return array;
    }
    if (inicio < 0 || inicio >= a.length){
      inicio = 0;
    }
    if (fin >= a.length){
      fin = a.length -1;
    }
    
		int longitudArray = 0;
		for (int i = inicio; i <= fin; i++) {
			longitudArray++;
		}
		String[] array = new String[longitudArray];
		int contador = 0;
		for (int i = inicio; i <= fin; i++) {
			array[contador++] = a[i];
		}
		return array;
	}
  
  
  public static void pintaArray(String[] a) {
    for (String elem : a) {
      System.out.print(elem + " ");
    }
    System.out.println();
  }
  
}
