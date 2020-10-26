/**
 * Programa que dado un número del 1 a 7 escribe el correspondiente 
 * nombre del día de la semana.
 * 
 *
 * @author Jairo Buendia
 */
public class ejercicio3T4 { 
  public static void main(String[] args) {
    
    System.out.print("Indica un número del 1 al 7: ");
    
     int opcion = Integer.parseInt(System.console().readLine());
    
    
    switch (opcion) {
     
     case 1 :
      System.out.println("Lunes ");
      break;
      
     case 2 :
      System.out.println("Martes ");
      break;
      
     case 3 :
      System.out.println("Miercoles ");
      break;
      
     case 4 :
      System.out.println("Jueves ");
      break;
      
     case 5 :
      System.out.println("Viernes ");
      break;
      
     case 6 :
      System.out.println("Sábado ");
      break;
      
     case 7 :
      System.out.println("Domingo ");
      break;
    
     default:
      System.out.println("Ese número no es correcto.");
      
    }
  
  }
}
