package ejercicios;

import java.util.Scanner;


public class ejercicio1ArrayObjetos {

  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Gato[] gato = new Gato[4];
    
    for (int i = 0; i < gato.length; i++) {
      
      gato[i] = new Gato();
      
      System.out.print("Introduzca el nombre del gato/a " + (i+1) + ": ");
      String nombre = s.nextLine();
      gato[i].setNombre(nombre);
      System.out.println("");
      System.out.print("Introduzca la edad del gato/a " + (i+1) + ": ");
      int edad = Integer.parseInt(s.nextLine());
      gato[i].setEdad(edad);
      System.out.println("");
      System.out.print("Introduzca la raza del gato/a " + (i+1) + ": ");
      String raza = s.nextLine();
      gato[i].setRaza(raza);
      System.out.println("");
      
    }
    
    //Bucle que enseña los datos de los gatos
    for (int i = 0; i < gato.length; i++) {
      System.out.println("Gato " + (i+1) + ": ");
      System.out.println("=======");
      System.out.println("Nombre: " + gato[i].getNombre());
      System.out.println("Edad: " + gato[i].getEdad());
      System.out.println("Raza: " + gato[i].getRaza());
      System.out.println("");
    }
    
    
  }
  
}
