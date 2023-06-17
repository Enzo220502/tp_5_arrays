package practicaArreglos;
import java.util.Random;
public class ejercicio3 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[]args) {
		int [] arrEnteros = new int [MAX];
		int promedio = 0;
		int cantidadMayores = 0;
		double resultado;
		cargarArregloAleatorio(arrEnteros);
		resultado = calcularPromedio(arrEnteros,promedio);
		cantidadMayores = buscarMayoresAPromedio(arrEnteros,resultado);
		mostrarResultados(resultado,cantidadMayores);
		mostrarArreglo(arrEnteros);
		
	}
	
	public static void cargarArregloAleatorio (int [] arrEnteros) {
		Random r = new Random();
		for(int pos = 0; pos<MAX ; pos++) {
			arrEnteros [pos] = (r.nextInt (MAXVALOR-MINVALOR+1)+MINVALOR);
		}
	}
	
	public static double calcularPromedio (int [] arrEnteros, int promedio) {
		double promediofinal;
		for (int pos = 0 ; pos<MAX ; pos++ ) {
			promedio+=arrEnteros [pos];
		}
		promediofinal = Double.valueOf(promedio)/Double.valueOf(MAX);
		return promediofinal;
	}
	
	public static void mostrarResultados(double resultado, int cantidadMayores) {
		System.out.println("El promedio del arreglo previamente cargado es = "+ resultado+"y se encontraron "+cantidadMayores+" elementos en su arreglo mayores a este promedio"); 
	}
	
	public static int buscarMayoresAPromedio(int [] arrEnteros, double resultado) {
		int contador = 0;
		for(int pos = 0; pos<MAX; pos++) {
			if(arrEnteros[pos]>resultado) {
				contador++;
			}
		}
		return contador;
	}
	
	public static void mostrarArreglo(int [] arrEnteros) {
		for (int pos = 0; pos<MAX;pos++) {
			System.out.print(arrEnteros[pos] + "|");
		}
	}
}
