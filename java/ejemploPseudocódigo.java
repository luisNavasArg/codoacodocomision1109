SEUDOCÓDIGO A MODO DE EJEMPLO:
INICIO Principal()					// Definimos el inicio del programa
   AlumnoNuevo = nuevo Alumno()			// Llamamos a la clase Alumno, generando							// el objeto AlumnoNuevo
  AlumnoNuevo.obtener()				// Utilizamos el método obtener() de Alumno
   
FIN Principal
CLASE Alumno   					// Creamos la clase alumno
  Atributos						// Definimos sus atributos o propiedades
	NOMBRE : CADENA				// Son tres Nombre, Apellido y Edad
	APELLIDO: CADENA
	EDAD : ENTERO
  METODO Obtener ()					// Dentro de la clase creamos
		Mostrar (“Ingrese nombre”)		// el método Obtener
		Ingresar (NOMBRE)
		Mostrar (“Ingrese apellido”)
		Ingresar (APELLIDO)
		Mostrar (“Ingrese edad”)
		Ingresar (EDAD)
	Hasta que EDAD > 0
 FIN METODO
FIN CLASE
