/**
 * Amplía el ejercicio7 para que de el resultado de la nota en calificacion.
 * @author Jairo Buendia
 */
public class ejercicio8T4 { 
  public static void main(String[] args) {
    
    System.out.print("Indica la nota del primer examen: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Indica la nota del segundo examen: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Indica la nota del tercer examen: ");
    Double nota3 = Double.parseDouble(System.console().readLine());
    
    double solucion = (nota1 + nota2 + nota3) / 3;
  
    System.out.printf("La nota media es de %.2f\n",solucion);
    
    if ((solucion <= 4.99) && (solucion >= 0)) {
      System.out.println("Tu nota final es: INSUFICIENTE");
    }
    
    if ((solucion >= 5) && (solucion < 6)) {
      System.out.println("Tu nota final es: SUFICIENTE");
    }
    
    if ((solucion >= 6) && (solucion < 7)) {
      System.out.println("Tu nota final es: BIEN");
    }
    
    if ((solucion >= 7) && (solucion < 9)) {
      System.out.println("Tu nota final es: NOTABLE");
    }
    
    if ((solucion >= 9) && (solucion <= 10)) {
      System.out.println("Tu nota final es: SOBRESALIENTE");
    }

  }
}
