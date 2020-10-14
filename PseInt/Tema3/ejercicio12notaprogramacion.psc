Algoritmo ejercicio12notaprogramacion
	
	Definir nota1, notadeseada, resultado Como Real;
	
	
	Escribir Sin Saltar"Por favor, introduzca la nota del primer examen";
	Leer nota1;
	nota1 <- nota1 *0.40;
	
	Escribir Sin Saltar"Por favor,introduzca la nota deseada";
	Leer notadeseada;
	
	nota2 <- (notadeseada - nota1) / 0.60 ;
	
	Escribir "Para tener un ",notadeseada " necesitas sacar un: ", nota2;
FinAlgoritmo
