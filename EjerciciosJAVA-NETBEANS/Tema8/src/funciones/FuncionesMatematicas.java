package funciones;

/**
 *
 * @author Jairo Buendía
 */
public class FuncionesMatematicas {
  
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
    if (num == FuncionesMatematicas.voltea(num)){
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * 
   * @param x Indica un número long
   * @return el siguiente numero primo al indicado
   */
  
   public static long siguientePrimo(long x){
    boolean check = false;
    do{
      x++;
      if(esPrimo(x)){
        check=true;
      }
    }while(!check);
    return x;
  }
  
  
  /**
   * 
   * @param base introduce long de la base
   * @param exponente introduce int del exponente
   * @return long del resultado de la potencia
   */ 
  public static long potencia(long base, int exponente){
    long aux = base;
    long result = base;
    if(exponente != 0){
      for(int i=1; i<exponente; i++){
        result = result * aux;
      } 
      return result;
    }else{
      return 1;
    }
  }
  
  /**
   * 
   * @param x indicas el numero en long
   * @param pos indicas la posicion en int que quieres sacar de x
   * @return int de la posicion x
   */
  public static int digitoN(long x, int pos){
    return (int)((voltea(x) / potencia(10, pos))%10);
  }
  
  
  /**
   * 
   * @param x long del numero que queremos sacar la posicion
   * @param digitoDeseado int del digito el cual queremos sacar la posición
   * @return int devuelve la posicion en la que se encuentra el digito indicado, si no lo encuentra
   * saca por pantalla -1.
   */
  public static int posicionDeDigito(long x, int digitoDeseado){
    x = voltea(x);
    int dig = digitos(x);
    for(int i=0; i<dig; i++){
      if(digitoDeseado == x%10){
        return i;
      }
      x /= 10;
    }
    return -1;
  }
  
  
  /**
   * 
   * @param x indica el numero en long al cual le vas a quitar numeros por detras
   * @param digitosQuitar número de dígitos en int que vas a quitar a x
   * @return el numero en long quitandole digitosQuitar a x
   */
  public static long quitaPorDetras(long x, int digitosQuitar){
    return x/(potencia(10, digitosQuitar));
  }
  
  /**
   * 
   * @param x indica el numero en long al cual le vas a quitar numeros por delante
   * @param digitosQuitar número de dígitos en int que vas a quitar a x
   * @return el numero en long quitandole digitosQuitar a x
   */
  
  
  public static long quitaPorDelante(long x, int digitosQuitar){    
    return x%(potencia(10, (digitos(x)-digitosQuitar)));
  }
  
  
  /**
   * 
   * @param x numero en long 
   * @param digitoAdd digitos en int que vamos a añadir por detras
   * @return numero en long con los digitos añadidos por detras
   */
  public static long pegaPorDetras(long x, int digitoAdd){
    return (x*10) + digitoAdd;
  }
  
  /**
   * 
   * @param x numero en long 
   * @param digitoAdd digitos en int que vamos a añadir por delante
   * @return numero en long con los digitos añadidos por delante
   */
  public static long pegaPorDelante(long x, int digitoAdd){
    return (digitoAdd * potencia(10, digitos(x))) + x;
  }
  
  
  
  /**
   * 
   * @param x numero en long 
   * @param posInicial primer num por el que va a sacar el trozo
   * @param posFinal ultimo num por el que va a sacar el trozo
   * @return trozo de x por las posiciones posInicial y posFinal
   */
  public static long trozoDeNumero(long x, int posInicial, int posFinal){
    int digitosTotales = digitos(x);
    long result = 0;
    x = voltea(x);
    for(int i=0; i < digitosTotales; i++){
      if( i >= posInicial && i<= posFinal ){
        result = (result * 10) + (x%10); 
      } 
      x/=10;
    }
    return result;
  }
  
  /**
   * 
   * @param x numero long 1
   * @param y numero long 2
   * @return long del conjunto de los dos números
   */
  public static long juntaNumeros(long x, long y){
    return (x * potencia(10,digitos(y))) + y;
  }
  
  
  /**
   * 
   * @param x long del numero en binario
   * @return numero x convertido en decimal (long)
   */
  public static long conversorBinarioDecimal(long x){
    int digitoos = digitos(x);
    int multiplicador = 1;
    int resultado = 0;
    for(int i = 0; i < digitoos; i++){
      if(x%10 == 1){
        resultado += multiplicador;
      }
      multiplicador *= 2;
      x /= 10;
    }
    return resultado;
  }
  
  
  /**
   * 
   * @param x numero long en binario
   * @return numero long en decimal convertido
   */
  public static long conversorDecimalBinario(long x){
    if(x == 0){
      return 0;
    }
    long result = 1;
    while(x > 1){
      result = pegaPorDetras(result, (int)x%2);
      x /= 2;
    }
    result = pegaPorDetras(result, 1);
    result = voltea(result);
    result = quitaPorDetras(result, 1);
    return result;
  }
  
  /**
   * 
   * @param digito el cual quieres ver cuantas veces sale
   * @param n numero en long
   * @return numero de veces que sale el digito en n
   */
  public static int ocurrenciasInt(int digito, long n){ 
    int contador = 0;
    
    for(int i=0; i<digitos(n); i++){
      if(digitoN(n, i) == (long)digito){
        contador++;
      }
    }
    return contador;
  }
  
  /**
   * 
   * @param min numero minimo en int para el aleatorio
   * @param max numero maximo en int para el aleatorio
   * @return un aleatorio entre el min y el max
   */
  public static  int aleatorioInt(int min, int max){
    return (int)(Math.random() * (max + 1 - min) + min);
  }
  
  
  /**
   * 
   * @param n el numero en int del cual vamos a quitar los digitos repetidos
   * @return devuelve un numero en int sin digitos repetidos
   */
  public static int quitaRepetidos(int n) {
		int contador = FuncionesMatematicas.digitos(n);
		int [] array = new int [contador];
		int contadorArray = contador;
		for (int i = contador-1; i >=0; i--) {
			if(!FuncionesArray.estaEnArrayInt(array,n%10 )) {
				array[contadorArray-1] = n%10;
				contadorArray--;
      }
			n/=10;
		}
		int numeroSinRepetido = 0;
		for (int i = 0; i < array.length; i++) {
			numeroSinRepetido = (numeroSinRepetido *10) +  array[i];
		}
		return numeroSinRepetido;
	}
  
  /**
   * 
   * @param n el numero en long del cual vamos a quitar los digitos repetidos
   * @return devuelve un numero en long sin digitos repetidos
   */
	public static long quitaRepetidos(long n) {
		return quitaRepetidos((int)n);
	}
  

  
  
 
  
 
  
 
}
