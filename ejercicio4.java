package practicaArreglos;
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio4 {
	public static final int MAX = 10;
	public static void main(String[]args) {
		char [] arrChar = new char [MAX];
		char charUsuario;
		cargarArregloAleatorioChar(arrChar);
		charUsuario = solicitarCaracter();
		buscarPosCharUsuario(arrChar , charUsuario);
		imprimirArreglo(arrChar);
	}
	
	public static void cargarArregloAleatorioChar (char [] arrChar) {
		Random r = new Random ();
		for (int pos = 0;pos<MAX;pos++) {
			arrChar[pos] = (char)(r.nextInt(26)+'a');
		}
	}
	
	public static char solicitarCaracter() {
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		char usuario = 'a';
		try {
			System.out.println("Ingrese el caracter a buscar en el arreglo,en caso de ser un caracter invalido se le asignara un caracter a");
			usuario = entrada.readLine().charAt(0);
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		if ((usuario>='a')||(usuario<='z')){
			return usuario;
		}
		else {
		return 'a';
	}

		
	}
	
	public static void buscarPosCharUsuario(char [] arrChar , char charUsuario) {
		int contador = 0;
		for(int pos = 0;pos<MAX;pos++) {
			if(arrChar[pos]==charUsuario) {
				contador++;
				System.out.println("Se encontro una "+charUsuario+ " en la posicion "+pos);
			}
		}
		if(contador == 0) {
			System.out.println("No se encontro ningun caracter "+charUsuario+" en el arreglo");
	}
	}
	
	public static void imprimirArreglo( char [] arrChar) {
		for (int pos = 0;pos<MAX;pos++) {
			System.out.print(arrChar [pos] +"|");
		}
	}
}
