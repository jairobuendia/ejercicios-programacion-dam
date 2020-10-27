/**
 * Realiza un programa que calcule la media de 3 notas.
 * @author Jairo Buendia
 */
public class ejercicio7T4 { 
  public static void main(String[] args) {
    
    System.out.print("Indica la nota del primer examen: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Indica la nota del segundo examen: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Indica la nota del tercer examen: ");
    Double nota3 = Double.parseDouble(System.console().readLine());
    
    double solucion = (nota1 + nota2 + nota3) / 3;
  
    System.out.printf("La nota media es de %.2f",solucion);
    

  }
}
