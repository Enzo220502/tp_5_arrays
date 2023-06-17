package practicaArreglos;
import java.util.Random;
public class ejercicio15 {
	public static final int MAX = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double probabilidad_num = 0.6;
	public static void main (String [] args) {
		int [] arrEnteros = new int [MAX];
		int inicio = 0, fin = -1;
		cargar_arreglo_aleatorio_sec(arrEnteros);
		inicio = buscarIni(arrEnteros);
		fin = buscarFin(arrEnteros,inicio);
		System.out.println("Se encontro una secuencia que comienza en "+ inicio + "y termina en "+ fin);
		mostrarArreglo(arrEnteros);
	}
	
	public static void cargar_arreglo_aleatorio_sec(int [] arrEnteros) {
		Random r = new Random();
		for(int pos = 0;pos<MAX;pos++) {
			if(r.nextDouble()<probabilidad_num) {
				arrEnteros[pos] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
			}
			else {
				arrEnteros[pos] = 0;
			}
		}
	}
	
	public static int buscarIni(int [] arrEnteros) {
		int pos = 0;
		while(arrEnteros[pos]==0) {
			pos++;
		}
		return pos;
	}
	
	public static int buscarFin(int [] arrEnteros, int inicio) {
		int pos = inicio;
		while(arrEnteros[pos]!=0) {
			pos++;
		}
		return pos -1;
	}
	
	public static void mostrarArreglo(int[] arrEnteros) {
		for(int pos = 0;pos<MAX;pos++) {
			System.out.print(arrEnteros[pos]+"|");
		}
		System.out.println();
	}

}
