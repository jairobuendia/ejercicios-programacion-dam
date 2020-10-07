Algoritmo ejercicio2hora
	
	Definir hora Como Entero;
	
	Escribir " Por favor introduzca la hora:" ;
	Escribir Sin Saltar "Formato de 0 a 23";
	
	Leer hora;
	
	Si hora >= 6 y hora <= 12 Entonces
		Escribir "Buenos dias";
	FinSi
	
	Si hora >= 13 & hora <= 20 Entonces
		Escribir "Buenas tardes";
	FinSi
	
	Si hora >= 21 y hora <= 23 Entonces
		Escribir "Buenas noches";
	FinSi
	
	Si hora >= 0 y hora <= 5 Entonces
		Escribir "Buenas noches";
	FinSi
	
	Si hora >= 24 o hora < 0 Entonces
		Escribir "Hora incorrecta";
	FinSi
	
FinAlgoritmo
