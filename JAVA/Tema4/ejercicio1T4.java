/**
 * Programa que pida por teclado un dia de la semana y diga que asignatura toca a primera hora ese dia.
 *
 * @author Jairo Buendia
 */
public class ejercicio1T4 { 
  public static void main(String[] args) {
    
    System.out.print("Indica un día de la semana lectivo: ");
    
    String opcion = System.console().readLine();
    
    opcion = opcion.toLowerCase();
    
    switch (opcion) {
     
     case "lunes" :
      System.out.println("Entorno de desarrollo :/ ");
      break;
      
     case "martes" :
      System.out.println("Programación :) ");
      break;
      
     case "miercoles" :
      System.out.println("Programación :) ");
      break;
      
     case "jueves" :
      System.out.println("Programación :) ");
      break;
      
     case "viernes" :
      System.out.println("F.O.L :D ");
      break;
    
     default:
      System.out.println("Ese día no es lectivo o no es correcto.");
      
    }
  
  }
}
