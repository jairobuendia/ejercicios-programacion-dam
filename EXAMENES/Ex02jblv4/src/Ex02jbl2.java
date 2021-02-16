/*
 * Ejercicio 2 examen
*/

/**
 *
 * @author Jairo Buendía 1 DAM 10/02/2021
 */
public class Ex02jbl2 {

  public static void main(String[] args) {
    int[] a = {3, 8, 1, 9, 33, 3, 9, 10, 12};
    pintaArray(extraePares(a));
    pintaArray(extraeImpares(a));
    pintaArray(colocaParesEImpares(a));
    
    int[] b = {11, 7, 5, 21};
    pintaArray(extraePares(b));
    pintaArray(extraeImpares(b));
    pintaArray(colocaParesEImpares(b));
    
  }
  
  
  public static int[] extraePares(int[] array){
    int variable = 0;
    int i = 0;
    int[] aux = new int[array.length];
    for (int j = 0; j < array.length; j++) {
      if (array[j] % 2 == 0){
        aux[i] = array[j];
        variable ++;
        i ++;
      }
    }
    if(variable != 0){
      int[] aux2 = new int[variable];
      for(int g=0; g<variable; g++){
        aux2[g] = aux[g];
      }
      return aux2;
    }else{
      int[] aux2 = {-1};
      return aux2;
    }
  }
  
    
  public static int[] extraeImpares(int[] array){
    int variable = 0;
    int i = 0;
    int[] aux = new int[array.length];
    for (int j = 0; j < array.length; j++) {
      if (array[j] % 2 == 1){
        aux[i] = array[j];
        variable ++;
        i ++;
      }
    }
    if(variable != 0){
      int[] aux2 = new int[variable];
      for(int g=0; g<variable; g++){
        aux2[g] = aux[g];
      }
      return aux2;
    }else{
      int[] aux2 = {-1};
      return aux2;
    }
  }

  
  public static int[] colocaParesEImpares(int[] array){
    int [] pares = extraePares(array);
    int [] impares = extraeImpares(array);
    int cantidad = pares.length + impares.length;
    int [] aux = new int [cantidad];
    int salida0 = pares.length;
    int salida1 = impares.length;
    
    if(pares[0] == -1){
      salida0 = 0;
    }
    
    if (impares[0] == -1){
      salida1 = 0;
    }
    
    for (int i = 0; i < salida0; i++) {
      aux[i] = pares[i];
    }
    
    for(int i = 0; i < salida1; i++){
      aux[i+pares.length] = impares[i] ;
    }
    return aux;
  }
  
  
  
  public static void pintaArray(int[] a) {
    for (int elem : a) {
      System.out.print(elem + " ");
    }
    System.out.println();
  }
  
  
}
