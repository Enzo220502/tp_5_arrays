package practicaArreglos;
import java.util.Random;
public class ejercicio6 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main (String []args) {
		int [] arrEnteros = new int [MAX];
		int cantPares = 0;
		cargaAleatoriaEnteros(arrEnteros);
		cantPares = buscarCantPares (arrEnteros);
		mostrarCant(arrEnteros,cantPares);
	}
	
	public static void cargaAleatoriaEnteros(int[]arrEnteros) {
		Random r = new Random();
		for(int pos = 0; pos<MAX; pos++) {
			arrEnteros [pos] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
		}
	}
	
	public static int buscarCantPares (int [] arrEnteros) {
		int contador = 0;
		for(int pos = 0;pos<MAX;pos++) {
			if((arrEnteros[pos]%2)==0) {
				contador++;
			}
		}
		return contador;
	}
	
	public static void mostrarCant(int [] arrEnteros, int cantPares) {
		System.out.println("Se encontraron "+cantPares+" numeros pares en el siguiente arreglo");
		for(int pos = 0;pos <MAX; pos++) {
			System.out.print(arrEnteros[pos]+"|");
		}
		
	}
}
