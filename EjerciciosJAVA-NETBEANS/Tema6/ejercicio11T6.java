//Ejercicio 10 Tema 6
// Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
// aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
// final aparecerá el número de suspensos, el número de suficientes, el número
// de bienes, etc.



public class ejercicio11T6 {
  public static void main(String args[]) {
   System.out.println("Notas generadas al azar.......");
   int numNotas = 0;
   int suspensos = 0;
   int suficientes = 0;
   int biens = 0;
   int notables = 0;
   int sobresalientes = 0;
    for (int i = 0; i < 20; i++) {
      numNotas = (int) (Math.random()* 10) + 1;
      if (numNotas >= 1 && numNotas <= 4){
        suspensos = suspensos + 1;
      } else if (numNotas == 5){
        suficientes = suficientes + 1;
      } else if (numNotas == 6){
        biens = biens + 1;
      } else if (numNotas >= 7 && numNotas <= 8){
        notables = notables + 1;
      } else if (numNotas >= 9 && numNotas <= 10){
        sobresalientes = sobresalientes + 1;
      } else {
        System.out.println("HOLA Q ASHE");
      }
        
    }
    System.out.println("Hay " + suspensos + " suspensos");
    System.out.println("Hay " + suficientes + " suficiente");
    System.out.println("Hay " + biens + " bien");
    System.out.println("Hay " + notables + " notable");
    System.out.println("Hay " + sobresalientes + "sobresalientes");
    System.out.println("TOTAL === " + (suspensos + suficientes + biens + notables + sobresalientes));
 
  }
}
