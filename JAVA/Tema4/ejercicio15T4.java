/**
 * Realiza un programa que haga una piramide con el vertice para el lado que indiques
 * y con el caracter que indiques.
 * @author Jairo Buendia
 */
public class ejercicio15T4 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa hace una pirámide española.");
    System.out.print("Introduzca un carácter de relleno: ");
    String r = System.console().readLine();
    System.out.println("Elija un tipo de pirámide");
    System.out.println("1. Con el vértice hacia arriba");
    System.out.println("2. Con el vértice hacia abajo");
    System.out.println("3. Con el vértice hacia la izquierda");
    System.out.println("4. Con el vértice hacia la derecha");
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch(opcion) {
      case 1:
        System.out.println("\033[31m  " + r);
        System.out.println("\033[33m " + r + r + r);
        System.out.println("\033[31m" + r + r + r + r + r);
        break;
        
      case 2:
        System.out.println("\033[31m"+ r + r + r + r + r);
        System.out.println("\033[33m " + r + r + r);
        System.out.println("\033[31m  " + r);
        break;
        
      case 3:
        System.out.println("\033[31m    " + r);
        System.out.println("\033[31m  " + r + " " + r);
        System.out.println("\033[33m" + r + " " + r + " " + r);
        System.out.println("\033[31m  " + r + " " + r);
        System.out.println("\033[31m    " + r);
        break;
        
      case 4:
        System.out.println("\033[31m"+ r);
        System.out.println("\033[31m"+ r + " " + r);
        System.out.println("\033[33m"+ r + " " + r + " " + r);
        System.out.println("\033[31m"+ r + " " + r);
        System.out.println("\033[31m"+ r);
        break;
      default:
    }
  }
}
