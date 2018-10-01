
import java.util.Scanner;

/*
 *	Una progresión es una secuencia de números. Se dividen en dos tipos:
	geométricas y aritméticas. En este examen usaremos series aritméticas. En estas
	series, la diferencia entre dos términos sucesivos cualesquiera es constante. Ejemplo:
	2 - 4 - 6 - 8 - 10 - 12 -...
	En esta serie la diferencia entre cada valor de la serie es 2, y cada número
	de la secuencia se obtiene al sumar 2 al anterior. La fórmula para calcular la suma
	de una serie geométrica es la siguiente:
	

	Donde "n" es la cantidad de términos en la serie, "a1" es el primer término de la serie.
	"an" es el último.

	Serie de prueba, 2 - 5 - 8 - 11 - 14, n = 5, a1 = 2, a[n] = 14
 */

/**
 *
 * @author Equipo Nougat
 */
public class SerieAritmetica {
	private int n;				
	private int a1;				// Declaración de variables usadas
	private int as; 
	private int an;
	private int diferencia;
	private int suma;
	private Scanner sCaptu;		// Declaración de una variable de tipo scanner
	
	public int getDiferencia() {	// Método para la obtención de la diferencia entre cada dato
		return diferencia;
	}
	
	public void setDiferencia(int diferencia){	// Método para la asignación de la diferencia entre cada dato de forma pública
		this.diferencia = diferencia;
	}

	private void setDiferencia() {	// Método privado usado para la obtención de la diferencia entre cada dato
		System.out.println("Ingresa el valor de la diferencia entre cada par de números: ");	// Mensaje mostrado al usuario
		sCaptu = new Scanner (System.in);	// Instanciación de un scanner
		this.diferencia= sCaptu.nextInt(); // Asignación de la variable diferencia con el dato ingresado por el usuario
	}
	
	public int getN() {	// Método para obtener el valor de la variable n
		return n;
	}
	
	public void setN(int n){	// Método público para asignar un valor a la variable n
		this.n = n;
	}

	private void setN() {	// Método privado para asignar un valor a la variable n
		System.out.println("Ingresa el número de datos que tendrá la serie: ");	// Mensaje mostrado al usuario
		sCaptu = new Scanner(System.in);	// Instanciación de un scanner
		this.n = sCaptu.nextInt();		// Asignación de la variable n con el dato ingresado por el usuario
	}
	
	public int getA1() {		// Método para obtener el valor de la variable a1
		return a1;
	}
	
	public void setA1(int a1){	// Método público para la asignación de la variable a1
		this.a1 = a1;
	}
	
	private void setA1() {	// Método privado usado para la asignación de la variable a1
		System.out.println("Ingresa el valor del inicio de la serie: ");// Mensaje para el usuario
		sCaptu = new Scanner (System.in);	// Instanciación del scanner
		this.a1 = sCaptu.nextInt();  // Asignación de la variable a1 con el dato ingresado por el usuario
	}
	
	public int getAn() { // Método para la obtención del valor de la variable an
		return an;
	}

	public void setAn(int an) { // Método público para la asignación de la variable an
		this.an = an;
	}

	public double getSuma() { // Método para la obtención de la variable suma
		return suma;
	}

	public void setSuma(int suma) {	// Método púlbico para la asignación de la variable suma
		this.suma = suma;
	}
	
	public void Inicio(){ // Método usado para ejecutar el programa completo
		setN();
		setA1();
		setDiferencia();
		ImprimirSerie();
		CalculodeSuma();
	}
	
	private void CalculodeSuma(){	// Método usado para realizar el cálculo de la variable suma
		an = as - diferencia;	// Asignación de an para obtener el último valor de la serie
		suma = ((a1 + an)*n)/2;	// Calculo para la obtención de la suma de los datos de la serie
		System.out.println("= " + suma);	// Impresión del valor de la variable suma
	}
	
	private void ImprimirSerie(){	// Método usado para la impresión de la serie
		as = a1;			// Inicializando el acumulador con el valor de a1
		for (int i = 0; i < n; i++) {	// Ciclo repetido el número de veces como tenga datos la serie
			if(i != n - 1){		// Condición para saber si no es el último valor de la serie
				System.out.print(as + " - ");	// Impresión de el acumulador agregando un guión entre cada valor
			}
			else{			// Caso negativo de la condición anterior
				System.out.print(as + " ");	// Impresión del valor del acumulador sin el guión
			}
			as += diferencia;	// Acumulador agregando cada ciclo la diferencia al valor que tenia antes el acumulador
		}
	}
}
