Algoritmo ejercicio7baseimponible
	Definir factura, iva, total Como Real;
	
	Escribir "Programa para calcular el total de una factura a partir de la base imponible";
	
	Escribir Sin Saltar"Por favor, introduzca la base imponible";
	Leer factura;
	
	iva <- 1.21;
	
	resultado <- factura * iva;
	
	Escribir "El total de la factura es: ", resultado " euros";
FinAlgoritmo
