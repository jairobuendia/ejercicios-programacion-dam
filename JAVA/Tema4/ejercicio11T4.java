/**
 * Realiza un programa que calcule el tiempo que falta para la medianoche con los valores dados.
 * @author Jairo Buendia
 */
public class ejercicio11T4 { 
  public static void main(String[] args) {
    
    System.out.print("Indica la hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("Indica el minuto: ");
    int minuto = Integer.parseInt(System.console().readLine());

    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
    
    System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + segundosHastaMedianoche + " segundos.");
    
  }
}
