package practicaArreglos;
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio9 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main (String[]args) {
		int [] arrEnteros = new int [MAX];
		int valorUsuario = 0;
		cargaAleatoriaEnteros(arrEnteros);
		mostrarArreglo(arrEnteros);
		valorUsuario = obtenerValorUsuario();
		insertarValorEnArreglo(arrEnteros,valorUsuario);
		mostrarArreglo(arrEnteros);
	}
	
	public static void cargaAleatoriaEnteros(int [] arrEnteros) {
		Random r = new Random();
		for(int pos = 0;pos<MAX;pos++) {
			arrEnteros [pos] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
		}
	}
	
	public static int obtenerValorUsuario() {
		int valorUsuario = 0; 
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.println("ingrese un numero entero a insertar en la posicion 0");
			valorUsuario = Integer.valueOf(entrada.readLine());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return valorUsuario;
	}
	
	public static void mostrarArreglo(int [] arrEnteros) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.print(arrEnteros[pos]+"|");
		}
		System.out.println();
	}
	
	public static void insertarValorEnArreglo(int[]arrEnteros,int valorUsuario) {
		int pos=0;
		corrimientoDerecha(arrEnteros,pos);
		arrEnteros[pos] = valorUsuario;
	}
	
	public static void corrimientoDerecha(int [] arrEnteros,int pos) {
		int indice = MAX-1;
		for (int i = indice;i>pos;i--) {
			arrEnteros[i]=arrEnteros[i-1];
		}
	}
}	
