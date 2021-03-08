package ejercicios;

/**
 *
 * @author Jairo Buendía
 */
public class Fraccion {
  private int denominador;
  private int numerador;

  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }
  
  public String toString(){
    return numerador + "/" + denominador;
  }

  public void invierte(){
    System.out.println("Invirtiendo la fracción...");
    System.out.print(denominador);
    System.out.print("/");
    System.out.print(numerador);
    System.out.println("");
  }
  
 
  
}
