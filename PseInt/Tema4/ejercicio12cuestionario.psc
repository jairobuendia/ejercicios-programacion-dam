Algoritmo ejercicio12cuestionario
	
	Definir respuesta Como Caracter;
	Definir puntos Como Entero;
	
	puntos <- 0;
	
	Escribir "Con la letra C";
	Escribir "¿Cual es la capital mundial de la informatica?" ;
	Leer respuesta;
	
	respuesta <- Mayusculas(respuesta);
	
	Si respuesta = "CAMPANILLAS" Entonces
		puntos <- puntos + 1;
	FinSi
	
	Escribir "Con la letra P";
	Escribir "¿Cual es la asignatura DAM mas divertida?";
	Leer respuesta;
	
	Si respuesta = "Programacion" Entonces
		puntos <- puntos + 1;
	FinSi
	
//	Escribir "Con la letra M";
//	Escribir "¿Cual es la fruta mas sabrosa?";
//	Leer respuesta;
//	
//	Si respuesta = "Mango" Entonces
//		puntos <- puntos + 1;
//	FinSi
	
//	Escribir "Con la letra F";
//	Escribir "¿Cual es la asignatura de la primera hora del Viernes?";
//	Leer respuesta;
//	
//	Si respuesta = "Fol" Entonces
//		puntos <- puntos + 1;
//	FinSi
//	
//	Escribir "Con la letra U";
//	Escribir "¿Nombre del primer ordenador que se comercializo?";
//	Leer respuesta;
//	
//	Si respuesta = "Univac" Entonces
//		puntos <- puntos + 1;
//	FinSi
	
	Escribir "Ha acertado ", puntos, " preguntas";
	
FinAlgoritmo
