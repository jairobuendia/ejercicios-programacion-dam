//Ejercicio 3 Tema 6
// Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
// de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
public class ejercicio3T6 {
  public static void main(String args[]) {
   System.out.println("Programa que te da una carta aleatoria de la baraja española. ");
   System.out.println("---------------------------------------");
   
   //elige tipo de carta (oros, copas, espadas y bastos)
   int numTipo = (int) (Math.random()*4)+1;
   String tipo = "";
   switch(numTipo){
     case 1:
      tipo = "Oros";
      break;
     case 2:
      tipo = "Copas";
      break;
     case 3:
      tipo = "Espadas";
      break; 
     case 4:
      tipo = "Bastos";
      break;     
   }
   //System.out.println(tipo);
   
   //elige el numero de la carta (2-7) (sota, caballo, rey, as)
   int numCarta = (int) (Math.random()*10)+1;
   String carta = "";
   switch(numCarta){
     case 8:
      carta = "Sota";
      break;
     case 9:
      carta = "Caballo";
      break;
     case 10:
      carta = "Rey";
      break; 
     case 1:
      carta = "As";
      break;
     default:
      carta = String.valueOf(numCarta);
   }
    System.out.println("La carta elegida al azar es: " + carta + " de " + tipo);
  }
}
