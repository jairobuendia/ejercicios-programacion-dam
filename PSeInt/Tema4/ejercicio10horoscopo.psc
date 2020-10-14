Algoritmo ejercicio10horoscopo
	
	Definir mes, dia Como Entero;
	
	Escribir " Por favor introduzca su mes de nacimiento.:" ;
	Escribir Sin Saltar "EJ. 1 para enero, 2 para febrero, 3 para marzo.";
	
	Leer mes;
	
	Escribir Sin Saltar "Ahora introduzca el dia:";
	Leer dia;
	
	Segun mes Hacer
		1:
			Si dia < 21 Entonces
				Escribir "Capricornio";
			SiNo
				Escribir "Acuario";
			FinSi
		2:
			Si dia < 20 Entonces
				Escribir "Acuario";
			SiNo
				Escribir "Piscis";
			FinSi
		3:
			Si dia < 21 Entonces
				Escribir "Capricornio";
			SiNo
				Escribir "Acuario";
			FinSi
		4:
			Si dia < 21 Entonces
				Escribir "Capricornio";
			SiNo
				Escribir "Acuario";
			FinSi
	FinSegun
	
	
FinAlgoritmo
