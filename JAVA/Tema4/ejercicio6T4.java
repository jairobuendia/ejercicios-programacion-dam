/**
 * Realiza un programa que calcule el tiempo que tarda en caer un objeto desde una altura.
 * @author Jairo Buendia
 */
public class ejercicio6T4 { 
  public static void main(String[] args) {
    
    double g = 9.81;
    
    System.out.print("Indica la altura en (m) desde la que cae el objeto: ");
    Double altura = Double.parseDouble(System.console().readLine());
    
    double solucion = Math.sqrt(2*altura/g);
    
    System.out.printf("El objeto tarda %.2f segundos en caer.\n", solucion);
  }
}
