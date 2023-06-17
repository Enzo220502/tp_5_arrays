package practicaArreglos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio1 {
	final static int MAX = 15;
	public static void main (String[]args) {
		int [] arrUsuario = new int [MAX];
		cargarArrUsuario(arrUsuario);
		mostrarArreglo(arrUsuario);
	}
	
	public static void cargarArrUsuario (int [] arrUsuario ) {
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			for(int pos = 0;pos<MAX;pos++) {
				System.out.println("Ingrese un numero entero entre 1 y 12 para la posicion "+pos+",de estar fuera de este rango se le asignara un 0");
				arrUsuario[pos] = Integer.valueOf(entrada.readLine());
				if((arrUsuario[pos]>12)||(arrUsuario[pos]<1)) {
					arrUsuario[pos] = 0;
				}
			}
		}
		catch(Exception exc){
			System.out.println(exc);
			
		}
	}
	
	public static void mostrarArreglo(int[]arrUsuario) {
		for(int pos = 0;pos<MAX;pos++) {
			System.out.println("Su arreglo en su posicion "+pos+" es igual a = "+arrUsuario[pos]);
		}
	}
}
