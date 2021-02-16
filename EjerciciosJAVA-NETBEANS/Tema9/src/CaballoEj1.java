/*
 * Ejercicio 1 Tema9
 */

/**
 *
 * @author Jairo Buendia
 */
public class CaballoEj1 {
  String nombre; 
  int altura; //altura en cm
  double peso; //peso en kg
  String raza;

  public CaballoEj1(String nombre, String raza) {
    this.nombre = nombre;
    this.raza = raza;
  }
  
  public CaballoEj1(String nombre, int altura, double peso, String raza) {
    this.nombre = nombre;
    this.altura = altura;
    this.peso = peso;
    this.raza = raza;
  }

  public String getNombre() {
    return nombre;
  }

  public int getAltura() {
    return altura;
  }

  public double getPeso() {
    return peso;
  }

  public String getRaza() {
    return raza;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }
  
  
}
