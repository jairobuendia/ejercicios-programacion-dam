package ejercicios;

/**
 *
 * @author Jairo Buendía
 */
public class Coche extends Vehiculo {
  
  private String color;

  public Coche(String color) {
    this.color = color;
    Vehiculo.vehiculosCreados ++;
  }

  
  public void quemaRueda(){
    System.out.println("Fiauuuuuuuuu...");
  }
  
  
}

