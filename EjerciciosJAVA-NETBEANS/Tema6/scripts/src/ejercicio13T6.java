//Ejercicio 12 Tema 6
// Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
// con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
// convertir un entero en un carácter.
public class ejercicio13T6 {

  public static void main(String[] args) {
    int tirada1;
    int tirada2;
    boolean bol = true;
    while (bol) { 
      tirada1 = (int)(Math.random() * (6) + 1);
      tirada2 = (int)(Math.random() * (6) + 1);
      System.out.println("Tirada dado I: " +tirada1);
      System.out.println("Tirada dado II: " +tirada2);
      System.out.println("--------------------------");
      if (tirada1 == tirada2){
        System.out.println("Terminando...");
        bol = false;
        
      }
      
    }
    
   
  }
  
}