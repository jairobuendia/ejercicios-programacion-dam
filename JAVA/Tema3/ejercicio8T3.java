/**
 * Calcula el sueldo a base de las horas trabajadas
 *
 * @author Jairo Buendia
 */
public class ejercicio8T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Indica las horas trabajadas: ");
    linea = System.console().readLine();
    int horas = Integer.parseInt( linea );
    int sueldo = (horas * 12);
    
    System.out.println("El sueldo final es de: " + sueldo );


  }
}
