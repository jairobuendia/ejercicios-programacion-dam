/**
 * Realiza un programa que realize un cuestionario y te diga los puntos finales que tienes.
 * @author Jairo Buendia
 */
public class ejercicio12T4 { 
  public static void main(String[] args) {
    
    String respuesta;
    int puntos = 0;
    
    System.out.println("Cuestionario para los más inteligentes de 1 DAM");
    
    //pregunta 1
    System.out.println("¿En que lenguaje de programación estamos trabajando en la asignatura de programación? ");
    System.out.println("a)JAVA\nb)Python\nc)C#");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    respuesta = respuesta.toLowerCase();
  
    
    if (respuesta.equals("a")){
      puntos ++;
    }
    
    //pregunta 2
    System.out.println("¿En que programa editor de código estamos trabajando en Lenguaje de marcas?");
    System.out.println("a)Netbeans\nb)Notepadd++\nc)Visual Studio Code");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    respuesta = respuesta.toLowerCase();
  
    
    if (respuesta.equals("c")){
      puntos ++;
    }
    
    //pregunta 3
    System.out.println("¿Cuál es el lenguaje de estilo que usamos en Lenguaje de marcas?");
    System.out.println("a)HTML\nb)HTML5\nc)CSS");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    respuesta = respuesta.toLowerCase();
  
    
    if (respuesta.equals("c")){
      puntos ++;
    }
    
    //pregunta 4
    System.out.println("¿Cuál es la asignatura que no convalida para DUAL?");
    System.out.println("a)Base de datos\nb)Formación y orientación laboral\nc)Sistemas infórmaticos");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    respuesta = respuesta.toLowerCase();
  
    
    if (respuesta.equals("b")){
      puntos ++;
    }
    
    //pregunta 5
    System.out.println("¿Que significan las siglas DAM?");
    System.out.println("a)Desarrollo aplicaciones multiplataforma\nb)Desarrollo aplicaciones web\nc)Desarrollo de aplicaciones multiuso");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    respuesta = respuesta.toLowerCase();
  
    
    if (respuesta.equals("a")){
      puntos ++;
    }
    
    //resultado final

    System.out.println("Tienes un total de " + puntos + " puntos.");
    
    
  }
}
