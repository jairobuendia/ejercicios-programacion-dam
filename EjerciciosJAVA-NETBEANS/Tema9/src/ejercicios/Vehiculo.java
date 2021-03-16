package ejercicios;


public class Vehiculo {
  
  public static int kmTotales = 0;
  public static int vehiculosCreados = 0;
  
  private int kilometraje;

  public Vehiculo() {
  }
  
  
  
  public void recorre(int km){
    this.kilometraje += km;
    this.kmTotales += km;
    System.out.println("Estoy recorriendo " + km + " kilómetros.");
  }

  public int getKilometraje() {
    return kilometraje;
  }

  public static int getKmTotales() {
    return kmTotales;
  }
  
 
}
