package misfunciones;
/**
 * 
 *
 * @author Jairo Buendia
 */
public class Dibujo {
  
  /**
  * 
  * @param longitud indica la longitud de la que se va a realizar la línea
  * @return la línea de la longitud indicada
  */
  public static String linea (int longitud){
    String resultado = "";
    for (int i = 0; i < longitud; i++) {
      resultado = resultado + "*";
      
    }
    return resultado;
  }
  
  
}
