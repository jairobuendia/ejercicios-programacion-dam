Algoritmo ejercicio13ordenarnumeros
	
	Definir num1, num2, num3 Como Entero;;
	
	Escribir Sin Saltar"Por favor,introduzca el primer numero";
	Leer num1;
	
	Escribir Sin Saltar"Por favor introduzca el segundo numero";
	Leer num2;
	
	Escribir Sin Saltar"Por favor introduzca el tercer numero";
	Leer num3;
	
	Si num1 < num2 Entonces
		Si num1 < num3 Entonces
			Si num2 < num3 Entonces
				Escribir num1;
				Escribir num2;
				Escribir num3;
			Sino
				Escribir num1;
				Escribir num3;
				Escribir num4;
			FinSi
		Sino
			Escribir num3;
			Escribir num1;
			Escribir num2;
		FinSi
	SiNo
		Si num2 < num3 Entonces
			Si num3 < num1 Entonces
				Escribir num2;
				Escribir num3;
				Escribir num1;
			SiNo
				Escribir num2;
				Escribir num1;
				Escribir num3;
			FinSi
		SiNo
			Escribir num3;
			Escribir num2;
			Escribir num1;
		FinSi
	FinSi
	
FinAlgoritmo
