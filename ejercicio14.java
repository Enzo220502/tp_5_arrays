package practicaArreglos;
import java.util.Random;
public class ejercicio14 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[]args) {
		int[]arrEnteros = new int [MAX];
		cargarArregloAleatorio(arrEnteros);
		mostrarArreglo(arrEnteros);
		buscarPar(arrEnteros);
		mostrarArreglo(arrEnteros);
	}
	
	public static void cargarArregloAleatorio(int [] arrEnteros) {
		Random r = new Random();
		for(int pos = 0;pos<MAX;pos++) {
			arrEnteros[pos] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
		}
	}
	
	public static void buscarPar(int [] arrEnteros) {
		int pos = 0;
			while(pos<MAX) {
				if(arrEnteros[pos]%2==0) {
					eliminarElemento(arrEnteros,pos);
				}
				else {
					pos++;
				}
			}
	}
	
	public static void eliminarElemento(int [] arrEnteros, int pos) {
		if(pos<(MAX-1)) {
			for(int i = pos;i<(MAX-1);i++) {
				arrEnteros[i] = arrEnteros [i+1];
			}
		}
		else {
			arrEnteros[pos] = 0;
		}
	}
	
	public static void mostrarArreglo(int [] arrEnteros) {
		for(int pos = 0;pos<MAX;pos++) {
			System.out.print(arrEnteros[pos]+"|");
		}
		System.out.println();
	}
}
