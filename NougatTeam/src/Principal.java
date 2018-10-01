
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo Nougat
 */
public class Principal {
	private static String opcion1 = "1. Imprimir cantidad monetaria";		
	private static String opcion2 = "2. Conversión entre temperaturas";	// Mensajes del menú
	private static String opcion3 = "3. Serie aritmética";			// Predefinidos en variables
	private static String opcion4 = "4. Datos de un alumno del Instituto";

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// Instanciación de un objeto de tipo Scanner
		int i;		// Declaración de variable para saber qué opción eligió el usuario
		boolean datocorrecto;
		do{
		System.out.println("Seleccione la opción que desee: "); 
		System.out.println(opcion1);
		System.out.println(opcion2);		// Impresión del menú en pantalla
		System.out.println(opcion3);
		System.out.println(opcion4);
		i = scan.nextInt();				// Inicialización de la variable i con el valor que el usuario ingresa en la consola
		switch(i){	// Uso de switch para correr diferentes subprogramas para opción mostrada
			case 1:					// Caso 1
				datocorrecto = false;
				System.out.println("Este programa aún está en proceso, intente de nuevo");
				break;				// Salida del switch
				
			case 2:				// Caso 2
				datocorrecto = true;		// Se indica que el dato ingresado ha sido correcto
				Temperatura t = new Temperatura();	// Instanciación de un objeto de tipo Temperatura
				t.Inicio();	// Ejecución del método o subprograma Temperatura();
				break;				// Salida del switch		
				
			case 3:				// Caso 3
				datocorrecto = true;		// Se indica que el dato ingresado ha sido correcto
				SerieAritmetica s = new SerieAritmetica();// Instanciación de un objeto de tipo SerieAritmetica	
				s.Inicio();	// Ejecución del método o subprograma de SerieAritmética
				break;				// Salida del switch
				
			case 4:				// Caso 4
				datocorrecto = true;
				DatosAlumno data = new DatosAlumno();	// Instanciación de un objeto de tipo DatosAlumno
				data.Inicio();				// Ejecución del método o subprograma de DatosAlumno
				break;						// Salida del switch
			
			default:
				datocorrecto = false;
				System.out.println("La opción ingresada es incorrecta, intenta de nuevo.");
				break;
		}
		}while(datocorrecto == false);
		
		
	}
	
}
