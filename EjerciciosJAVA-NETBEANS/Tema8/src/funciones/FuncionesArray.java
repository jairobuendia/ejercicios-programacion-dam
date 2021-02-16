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
  
  //Convierte un array en String
  public static String convierteArrayEnString (int[] a){
    String arrayEnString = "";
    for (int i : a) {
      arrayEnString = arrayEnString + i;
    }
    return arrayEnString;
  }
  
  
  //Genera un array de numeros enteros aleatorios
  public static int[] generaArrayInt (int tamano, int min, int max){
    int [] array = new int[tamano];
    for(int i=0; i<tamano; i++){
      array[i] = (int)(Math.random() * (max + 1 - min) + min);
    }
    return array;
  }

  //Te dice el minimo valor de un array
  public static long  minimoArrayInt (int[]arr){
    long min = Long.MAX_VALUE;
    for(int i=0; i<arr.length; i++){
      if(min > arr[i]){
        min = arr[i];
        } 
    }
    return min;
  }
  
  //Te dice el máximo valor de un array
  public static long  maximoArrayInt (int[]arr){
    long max = Long.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
        } 
    }
    return max;
  }
  
  
  //Calcula la media de los datos enteros de un Array
  public static long mediaArrayInt (int[]arr){
    long media = 0;
    for(int i=0; i<arr.length; i++){
      media += arr[i]; 
    }
    return media/(arr.length);
  }
  
  
  //Dice si un número está en un array o no
  public static boolean estaEnArrayInt (int[]array, int numBuscar){
    for(int i: array){
      if(i == numBuscar){
        return true;
      }
    }
    return false;
  }
  
  
  //Dice la posicion de un número en el Array
  public static int posicionEnArray (int[]array, int numBuscar){
    for(int i=0; i<array.length; i++){
      if(array[i] == numBuscar){
        return i;
      }
    }
    return -1;
  }
  
  
  //Voltea un array de numeros enteros
  public static int[] volteaArrayInt(int[]array){
    int aux = 0;
    for(int i=0; i<array.length/2; i++){
      aux = array[i];
      array[i] = array[array.length-1-i];
      array[array.length-1-i] = aux;
    }
    return array;
  }
  
  
  //Rota n posiciones a la derecha los números de un array
  public static int[] rotaDerechaArrayInt(int[]array, int numRotacion){
    int aux = 0;
    for(int j=0; j<numRotacion; j++){
      aux = array[array.length-1];
      for(int i=array.length-1; i>0; i--){
        array[i] = array[i - 1];
      }
      array[0] = aux;
    }
    return array;
  }
  
  //Rota n posiciones a la izquierda los números de un array
  public static int[] rotaIzquierdaArrayInt(int[]array, int numRotacion){
    int aux = 0;
    for(int j=0; j<numRotacion; j++){
      aux = array[0];
      for(int i=0; i<array.length-1; i++){
        array[i] = array[i + 1];
      }
      array[array.length-1] = aux;
    }
    return array;
  }
  
  //Filtra los primos de un array
  public static int[] filtraPrimos(int[] array){
    int variable = 0;
    int[] aux = new int[array.length];
    for(int num: array){
      if(FuncionesMatematicas.esPrimo(num)) aux[variable++] = num;
    }
    if(variable != 0){
      int[] result = new int[variable];
      for(int i=0; i<variable; i++){
        result[i] = aux[i];
      }
      return result;
    }else{
      int[] result = {-1};
      return result;
    }
  }
  
  
  //Filtra los numeros capicua de un array
  public static int[] filtraCapicua(int[] arr){
    int variable = 0;
    int[] aux = new int[arr.length];
    for(int item: arr){
      if(FuncionesMatematicas.esCapicua(item)) aux[variable++] = item;
    }
    if(variable != 0){
      int[] result = new int[variable];
      for(int i=0; i<variable; i++){
        result[i] = aux[i];
      }
      return result;
    }else{
      int[] result = {-1};
      return result;
    }
  }
  
  //Concatena dos arrays
  public static int[] concatena(int[] array1, int[] array2){
    int[] resultado = new int[array1.length + array2.length];
    for(int i = 0; i < array1.length; i++){
      resultado[i] = array1[i];
    }
    for(int i = 0; i < array2.length; i++){
      resultado[i+array1.length] = array2[i];
    }
    return resultado;
  }
  
  //Genera aleatorio de los valores de un Array (entero)
  public static int aleatorioDeArray(int[] a){
    return a[(int)(Math.random() * (a.length))];
  }
  
  //Mezcla dos arrays de forma alterna prmero a y despues b
  public static int[] mezcla(int[] a, int[] b){
    int[] resultado = new int[a.length + b.length];
    int contadorA = 0;
    int contadorB = 0;
    int contadorResultado = 0;
    do{
      if(contadorA < a.length){
        resultado[contadorResultado++] = a[contadorA];
        contadorA++;
      }
      if(contadorB < b.length){
        resultado[contadorResultado++] = b[contadorB];
        contadorB++;
      }
    }while(contadorResultado < a.length + b.length);
    return resultado;
  }
  
  //Saca un int de las veces que sale un digito en un array
  public static int ocurrenciasArray(int digito, int[] a){
    int resultado = 0;
    for(int i=0; i<a.length; i++){
      resultado += FuncionesMatematicas.ocurrenciasInt(digito, a[i]);
    }
    return resultado;
  }
  
  //Convierte un string en array diviendolo en carácteres
  public static String[] extraerStringEnArray(String x){
    int carac = x.length();
    String [] array = new String [carac];
    for (int i = 0; i < carac; i++) {
      array[i] = "" + x.charAt(i);
    }
    return array;
  }
  
  //Elimina  los repetidos en un array "string"
   public static String[] sinRepetirString(String[] s){
    boolean comprobar = false;
    int contador = 0;
    String[] array = new String[s.length];
    for(int i=0; i<s.length; i++){
      comprobar = false;
      for(int j=0; j<array.length; j++){
        if(s[i] == array[j]){
          comprobar = true;
        }
      }
      if(!comprobar) array[contador++] = s[i];
    }
    String[] result = new String[contador];
    for(int i=0; i<contador; i++){
      result[i] = array[i];
    }
    return result;
  }
  
  //PINTA ARRAY CON INDICE BIEN FRESCO
  public static void pintaArrayConIndice(int arrayEntrada[]) {
    final int N = arrayEntrada.length;
    System.out.print("┌────────┬");

    for (int i = 1; i < N; i++) {
      System.out.print("─────┬");
    }
    System.out.print("─────┐\n");
    System.out.print("│ Índice ");
    for (int i = 0; i < N; i++) {
      System.out.printf("│%5d", i);
    }
    System.out.println("│");
    System.out.print("├────────┼");
    for (int i = 1; i < N; i++) {
      System.out.print("─────┼");
    }
    System.out.print("─────┤\n");
    System.out.print("│ Valor  ");

    for (int i = 0; i < N; i++) {
      System.out.printf("│%5d", arrayEntrada[i]);
    }

    System.out.println("│");
    System.out.print("└────────┴");
    for (int i = 1; i < N; i++) {
      System.out.print("─────┴");
    }
    System.out.print("─────┘\n");

  }
  
  
  //AÑADE AL FINAL DE ARRAY EL NUMERO QUE SE INDIQUE
  public static int[] anidaIntFinalArray(int[]v, int num ){
    int[] result = new int[v.length + 1];
    for(int j=0; j<result.length-1; j++){
      result[j] = v[j];
    }
    result[result.length-1] = num;
    return result;
  }
  
  
  public static int[] eliminaRepetidosArray(int[] v){
    int[] result = new int[0];
    for(int i=0; i<v.length; i++){
      if(!estaEnArrayInt(result, v[i])){
        result = anidaIntFinalArray(result, v[i]);
      }
    }
    return result;
  }
  
  
  
}
