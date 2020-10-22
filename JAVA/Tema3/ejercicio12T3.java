/**
 * Calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 *
 * @author Jairo Buendia
 */
public class ejercicio12T3 { 
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce la nota del primer examen: ");
    linea = System.console().readLine();
    double nota1 = Double.parseDouble( linea );
    
    System.out.print("Introduce la nota media que deseas: ");
    linea = System.console().readLine();
    double notaMediaDeseada = Double.parseDouble( linea );
    
    double notaSegundoExamen = (notaMediaDeseada - (nota1 * 0.4) ) / 0.6;
    
    
    System.out.println("En el segundo examen deberías sacar un: " + notaSegundoExamen);
  
  
  }
}
