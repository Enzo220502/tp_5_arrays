package practicaArreglos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio8 {
	public static final int MAX = 10;
	public static void main (String[]args) {
		int[] arrEnteros = {1,2,3,4,5,6,7,8,9,10};
		int posUsuario = 0;
		mostrarArreglo(arrEnteros);
		posUsuario=solicitarPos();
		while((posUsuario<0)||(posUsuario>MAX)) {
			posUsuario=solicitarPos();
		}
		correrAIzquierda(arrEnteros,posUsuario);
		mostrarArreglo(arrEnteros);
	}
	
	public static void mostrarArreglo(int[]arrEnteros) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.print(arrEnteros[pos]+"|");
		}
		System.out.println("");
	}
	
	public static int solicitarPos() {
		int posUsuario = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese una posicion en el arreglo desde la cual hacer el corrimiento");
			posUsuario = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		return posUsuario;
	}
	
	public static void correrAIzquierda(int []arrEnteros, int posUsuario) {
		for(int i = posUsuario;i<(MAX-1);i++) {
			arrEnteros[i] = arrEnteros[i+1];
		}
		arrEnteros[MAX-1] = 0;
	}

}
