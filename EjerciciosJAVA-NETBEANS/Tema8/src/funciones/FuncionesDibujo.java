package funciones;

/**
 *
 * @author Jairo Buendia
 */
public class FuncionesDibujo {
  
  //Pinta linea con *
  public static String linea (int longitud){
    String resultado = "";
    for (int i = 0; i < longitud; i++) {
      resultado = resultado + "*";
      
    }
    return resultado;
  }
  
  //Pinta linea con el caracter indicado
  public static String lineaCaracter (int longitud ,String caracter){
    String resultado = "";
    for (int i = 0; i < longitud; i++) {
      resultado = resultado + caracter;
      
    }
    return resultado;
  }
  
  
  //Pinta linea con caracter indicado y espacios entre medio de los caracteres
  public static String lineaEspaciosCentrales(String caracter, int repeticiones){
    String resultado = "";
    for(int i=0; i<repeticiones; i++){
      if(i==0 || i==repeticiones-1){
        resultado += caracter;
      }else{
        resultado += " ";
      }
    }
    return resultado;
  }
}
