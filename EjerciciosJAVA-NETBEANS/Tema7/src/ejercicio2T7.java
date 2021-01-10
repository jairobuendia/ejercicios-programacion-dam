/*
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 *
 */

/*
 * @author JairoBuendia
 */
public class ejercicio2T7 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //definimos la array
    char [] x = new char[10];
    x[0] = 'a';
    x[1] = 'x';
    x[4] = '@';
    x[6] = ' ';
    x[7] = '+';
    x[8] = 'Q';
    int aumentoarray = 0;
    for (int i = 0; i < 10; i++) {
      System.out.println("Mostrando los elementos de el array... " + x[aumentoarray]);
      aumentoarray ++;
    }
  }
}
