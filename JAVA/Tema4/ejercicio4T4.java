/**
 * Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 *
 * @author Jairo Buendia
 */
public class ejercicio4T4 { 
  public static void main(String[] args) {
    
    System.out.print("Indica las horas trabajadas durante la semana: ");
    
    String linea = System.console().readLine();
    
    int numHoras = Integer.parseInt( linea );
    
    if (numHoras <= 40) {
      int sueldo = numHoras * 12 ;
      System.out.println("El sueldo semanal del trabajdor es de " + sueldo + " euros.");
      
    }
    
    if (numHoras >= 41) {
      int sueldo = numHoras * 16 ;
      System.out.println("El sueldo semanal del trabajdor es de " + sueldo + " euros.");
      
    }
      
    
  }
}
