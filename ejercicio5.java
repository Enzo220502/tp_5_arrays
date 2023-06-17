package practicaArreglos;
import java.util.Random;
public class ejercicio5 {
	public static final int MAX = 4;
	public static void main (String[]args) {
		char [] arrChar = new char [MAX];
		cargarArregloAleatorioChar(arrChar);
		mostrarArr(arrChar);
		invertirArr(arrChar);
		mostrarArr(arrChar);
	}
	
	public static void cargarArregloAleatorioChar(char [] arrChar) {
		Random r = new Random();
		for(int pos = 0;pos<MAX;pos++) {
			arrChar[pos]=(char)(r.nextInt(26)+'a');
		}
	}
	
	public static void mostrarArr(char [] arrChar) {
		for(int pos = 0;pos<MAX;pos++) {
			System.out.println(arrChar[pos]+"|");
		}
	}
	
	public static void invertirArr(char[]arrChar) {
		char contenedor = 'a';
		for(int i=0,j=(MAX-1);i<(MAX/2);i++,j--) {
			contenedor = arrChar[i];
			arrChar[i] = arrChar[j];
			arrChar[j] = contenedor;
		}
	}
}
