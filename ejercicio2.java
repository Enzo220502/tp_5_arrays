package practicaArreglos;
import java.util.Random;
public class ejercicio2 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[]args) {
		int [] arrEnteros = new int [MAX];
		int promedio = 0;
		double resultado;
		cargarArregloAleatorio(arrEnteros);
		resultado = calcularPromedio(arrEnteros,promedio);
		mostrarArreglo(arrEnteros);
		mostrarPromedio(resultado);
		
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
	
	public static void mostrarPromedio(double resultado) {
		System.out.println("El promedio del arreglo previamente cargado es = "+ resultado); 
	}
	
	public static void mostrarArreglo(int [] arrEnteros) {
		for (int pos = 0; pos<MAX;pos++) {
			System.out.println(arrEnteros[pos]);		
		}
		
	}
}
