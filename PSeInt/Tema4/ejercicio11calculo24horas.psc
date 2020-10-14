Algoritmo ejercicio11calculo24horas
	
	Definir hora, minuto, total Como Entero;;
	
	Escribir Sin Saltar"Por favor,introduzca la hora";
	Leer hora;
	
	Escribir Sin Saltar"Por favor introduzca los minutos";
	Leer minuto;
	
	total <- 86400 - ((hora * 60) * 60 + (minuto * 60));
	
	Escribir "Los segundos restantes hasta la medianoche son ", total;
	
FinAlgoritmo
