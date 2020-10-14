Algoritmo ejercicio4sueldo
	Definir horas Como Real;
	
	Escribir Sin Saltar"Por favor, introduce las horas trabajadas esta semana: ";
	Leer horas;
	
	Si horas <= 40 Entonces
		Escribir "Su sueldo es de: ",horas * 12, " euros";
	FinSi
	
	Si horas > 40 Entonces
		Escribir "Su sueldo es de: ",(horas *12) + ((horas - 40) * 16), "euros";
	FinSi
	
FinAlgoritmo
