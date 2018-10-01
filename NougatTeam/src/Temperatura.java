
import java.util.Scanner;

/*
	
 */

/**
 *
 * @author Equipo Nougat
 */
public class Temperatura {
	
	private String Formula1 = "C = 5(F - 32)/9)";	// Formulas de las conversiones de temperatura
	private String Formula2 = "F = 9C/5 + 32";	// Definidas previamente en variables privadas
	private String Formula3 = "K = C + 273";
	private char de; // Declaración de la variable "de" usada para identificar el tipo de dato entrante
	private char a; // Declaración de la variable "a", usada ara identificar el tipo de dato saliente
	private double A;	// Declaración de la variable "A", usada para guardar el valor de la temperatura de salida
	private double D; // Declaración de la variable D, usada para guardar el valor de la temperatura de entrada
	private Scanner scan = new Scanner(System.in);	// Declaración de un objeto de tipo Scanner usado para leer los valores ingresados por el usuario
	
	public void Inicio(){			// Método inicio, donde se llamará a los diferentes métodos, creando un método capaz de correr el programa sólo con una linea de código
		ImprimirMenu();
		LimpiarEscaner();
		setDe();
		LimpiarEscaner();
		setD();
		LimpiarEscaner();
		seta();
		ImprimirResultado();
	}
	
	private void LimpiarEscaner(){   // Método para "limpiar" el buffer de entrada en el scanner
		scan = new Scanner(System.in);
	}

	public double getA() {		// Obtención de la variable A pública
		return A;
	}

	public void setA(double A) {	// Asignación de valor tipo doble a la variable A método público
		this.A = A;
	}

	public double getD() {		// Obtención de la variable D pública
		return D;
	}

	public void setD() {			// Método para la asignación de la variable D
		System.out.println("Ingrese la temperatura: ");	// Mensaje mostrado en pantalla
		this.D = scan.nextDouble();		// Asignación de la variable D con lo que el usuario ingresa en la consola
	}

	public char getDe() { // Método para la obtención de la variable "de"
		return de;
	}

	public void setDe() { // Método para la asignación de la variable "de"
		System.out.println("Ingrese el tipo de temperatura de entrada: (C = Celsius / F = Fahrenheit / K = Kelvin) ");	//Mensaje mostrado en pantalla
		this.de = scan.nextLine().charAt(0);	// Asignación de la variable de con la información o valor que sea ingresado por el usuario
	}

	public char geta() { // Método para la obtención de la variable "a"
		return a;
	}

	public void seta() {	// Método para la asignación de la variable "a"
		System.out.println("Ingrese el tipo de temperatura de salida: (C = Celsius / F = Fahrenheit / K = Kelvin)");	//Mnesaje mostrado en pantalla
		this.a = scan.nextLine().charAt(0);	// Asignación de la variable a con la información o valor que sea ingresado por el usuario.
	}
	
	private void ImprimirMenu(){	// Método usado para la impresión del menú
		System.out.println("Las fórmulas son las siguientes: ");
		System.out.println("1. " + Formula1);
		System.out.println("2. " + Formula2);
		System.out.println("3. " + Formula3);
	}
	
	private void ImprimirResultado(){		// Método de conversiones e impresiones de los datos con la infomación que ingresó el usuario
		if(de == 'C' && a == 'F'){		// Condición de si el tipo inicial es Celsius y el final Fahrenheit
			 A = ((9*D)/5) + 32;		// Calculo para la obtención de temperatura en Fahrenheit
			 System.out.println(D + " C equivale a " + A + " F");	// Impresión de la equivalencia
		}
		else if(de == 'C' && a == 'K'){	// Condición de si el tipo inicial es Celsius y el final Kelvin
			 A = D + 273;			// Calculo para la obtención de temperatura en Kelvin
			 System.out.println(D + " C equivale a " + A + " K");	// Impresión de la equivalencia
		}
		else if(de == 'F' && a == 'C'){	// Condición de si el tipo inicial es Fahrenheit y el final Celsius
			 A = (5*(D - 32))/9;		// Calculo para la obtención de temperatura en Celsius
			 System.out.println(D + " F equivale a " + A + " C");	// Impresión de la equivalencia
		}
		else if(de == 'F' && a == 'K'){ // Condición de si el tipo inicial es Fahrenheit y el final Kelvin
			 A = ((5*(D - 32))/9) + 273;	// Calculo para la obtención de temperatura en Kelvin
			 System.out.println(D + " F equivale a " + A + " K"); // Impresión de la equivalencia
		}
		else if(de == 'K' && a == 'C'){ // Condición de si el tipo inicial es Kelvin y el final Celsius
			 A = D - 273;			// Calculo para la obtención de temperatura en Celsius
			 System.out.println(D + " K equivale a " + A + " C");	// Impresión de la equivalencia
		}
		else if(de == 'K' && a == 'F'){	// Condición de si el tipo inicial es Kelvin y el final Fahrenheit
			 A = ((9*(D - 273))/5) + 32;	// Calculo para la obtención de temperatura en Fahrenheit
			 System.out.println(D + " K equivale a " + A + " F");	// Impresión de la equivalencia
		}
	}
	
}
