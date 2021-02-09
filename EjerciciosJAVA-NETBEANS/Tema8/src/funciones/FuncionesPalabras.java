package funciones;

/**
 *
 * @author Jairo Buendía
 */
public class FuncionesPalabras {

  public static String convierteEnPalotes(int x){
    String result = "";
    String aux = "";
    int numDigits = FuncionesMatematicas.digitos((long)x);
    for(int i=0; i<numDigits; i++){
      aux = "";
      for(int j=0; j<FuncionesMatematicas.digitoN((long)x, i); j++){
        aux += "|";
      }
      if(i == numDigits-1){
        result = result + aux;
      }else{
        result = result + aux + "-";
      }
    }
    return result;
  }
  
  
  public static String convierteEnMorse(int n) {
		String morse = "";
		int longitud = FuncionesMatematicas.digitos(n);
		String [] arrayMorse = {
			 "_ _ _ _ _  ",". _ _ _ _  ",". . _ _ _  "," . . . _ _  ",". . . . _  ",
			 ". . . . .  ","_ . . . .  ","_ _ . . .  ","_ _ _ . .  ","_ _ _ _ .  "};
		for (int i = 0; i < longitud ; i++) {
			morse = arrayMorse[n % 10] + morse;
			n /= 10;
		}
		return  morse;     
  }
  
  public static String convierteEnPalabras(int n) {
		String palabra = "";
		int longitud = FuncionesMatematicas.digitos(n);
		String [] arrayPalabra = {
			 "cero, ","uno, ","dos, ","tres, ","cuatro, ",
			 "cinco, ","seis, ","siete, ","ocho, ","nueve, "};
		for (int i = 0; i < longitud ; i++) {
			palabra = arrayPalabra[n % 10] + palabra;
			n /= 10;
		}
		return  palabra;     
  }
  
  
  
}
