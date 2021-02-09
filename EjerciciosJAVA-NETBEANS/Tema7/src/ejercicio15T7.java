
import java.util.Scanner;

/*
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
 * un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
 * “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
 * como máximo e intente de nuevo”. Para el grupo que llega, se busca
 * siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
 * busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
 * dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
 * las mesas se cargan con valores aleatorios entre 0 y 4.  Cada vez que se sientan
 * nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
 * pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
 * programa se ilustra a continuación:
 */

/**
 *
 * @author Jairo Buendia
 */
public class ejercicio15T7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos variables
    int numeroPersonas;
    int[] mesasAleatorio = new int[10];
    int salida = 0;
    
    //llenamos las mesas con aleatorios entre 0 y 4
    for (int i = 0; i < 10; i++) {
       mesasAleatorio[i] =(int) (Math.random() * 4);
    }
    
    do {    
      
      //pintamos la primera vez las mesas
      System.out.println("\n┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
      System.out.print("│Mesa nº: ");
      for (int i = 1; i < 11; i++) {
       System.out.printf("│ %2d ", i);
      }
      System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
    
      System.out.print("│Ocupación");
      for (int m : mesasAleatorio) {
        System.out.printf("│ %2d ", m);
      }
      System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
      System.out.print("¿Cúantos son? (Introduzca -1 para salir del programa): ");
      numeroPersonas = Integer.parseInt(s.nextLine());
      
      if (numeroPersonas > 4){
        System.out.print("Lo siento, no admitimos grupos de " +numeroPersonas+ ", haga grupos de 4 personas como máximo e intente de nuevo.");
        System.out.println("");
      } else {
        for (int i = 0; i < 10 ; i++) {
          if (mesasAleatorio[i] == 0){
            mesasAleatorio[i] = numeroPersonas;
            System.out.println("Por favor, sientesé en la mesa número " + (i + 1));
            i = 10;
            
          }
        }
        for (int j = 0; j < 10; j++) {
          if (mesasAleatorio[j] + numeroPersonas <= 4){
            mesasAleatorio[j] = mesasAleatorio[j] + numeroPersonas;
            System.out.println("Tendrán que compartir mesa. Por favor, sientesé en la mesa número " + (j +1));
            j=10;
          }
        }
//        for (int h= 0; h < 10; h++) {
//          System.out.println("Lo siento, en estos momentos no queda sitio.");
//          }
//        }
          
         
          
        }
        
      
      
    } while (numeroPersonas != -1);
    System.out.println("Gracias. Hasta pronto");
    

  }
  
}
