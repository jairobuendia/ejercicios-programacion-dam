package funciones;

/**
 *
 * @author Jairo Buendia
 */
public class FuncioneDibujo {

  public static String linea (int longitud){
    String resultado = "";
    for (int i = 0; i < longitud; i++) {
      resultado = resultado + "*";
      
    }
    return resultado;
  }
}
