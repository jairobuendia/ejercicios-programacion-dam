Algoritmo ejercicio8nota
	
	Definir nota1, nota2, nota3, notamedia Como Real;
	
	Escribir Sin Saltar"Por favor,introduzca su primera nota";
	Leer nota1;
	
	Escribir Sin Saltar"Por favor introduzca su segunda nota";
	Leer nota2;
	
	Escribir Sin Saltar"Por favor introduca su tercera nota";
	Leer nota3;
	
	notamedia <- (nota1 + nota2 + nota3) / 3;
	
	Si notamedia < 5 Entonces
		Escribir "Su nota media es Insuficiente";
	FinSi
	
	Si notamedia >= 5 && notamedia < 6 Entonces
		Escribir "Su nota media es Suficiente";
	FinSi
	
	Si notamedia >= 6 && notamedia < 7 Entonces
		Escribir "Su nota media es Bien";
	FinSi
	
	Si notamedia >= 7 && notamedia < 9 Entonces
		Escribir "Su nota media es Notable";
	FinSi
	
	Si notamedia >= 9 & notamedia <= 10 Entonces
		Escribir "Su nota media es Sobresaliente";
	FinSi
	
FinAlgoritmo
