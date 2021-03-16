package ejercicios;

/**
 *
 * @author Jairo Buendía
 */
public class Bicicleta extends Vehiculo {
  
  private String tipo;

  public Bicicleta(String tipo) {
    this.tipo = tipo;
    Vehiculo.vehiculosCreados ++;
  }
 
  public void HazCaballito(){
    System.out.println("Estoy haciendo el caballito...");
  }
  
  
}

