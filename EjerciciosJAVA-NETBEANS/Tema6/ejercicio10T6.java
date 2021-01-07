//Ejercicio 10 Tema 6
// Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
// El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
// de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
// entre 1 y 40 caracteres.



public class ejercicio10T6 {
  public static void main(String args[]) {
   System.out.println("Pintando lineas.........");
   //pintar diez lineas
   int numLinea = 0;
   int num;
   String caracter = "";
   //saca 10 lineas 
    for (int i = 0; i < 10; i++) {
      //saca numero de caracter aleatorio y pasa por el switch
     numLinea = (int) (Math.random()* 6) + 1;
      switch (numLinea){
        case 1:
          caracter = "*";
          break;
        case 2:
          caracter = "-";
          break;
        case 3:
          caracter = "=";
          break;
        case 4:
          caracter = ".";
          break;
        case 5:
          caracter = "|";
          break;
        case 6:
          caracter = "@";
          break;
          }
      //calcula la longitud de la linea
      num = (int) (Math.random()* 40) + 1;
      for (int j = 0; j < num; j++) {
        System.out.print(caracter);
      }
      System.out.println("");
          
      }
     
    }
 
  }
