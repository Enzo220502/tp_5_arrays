package practicaArreglos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio13 {
	public static final int MAX = 10;
	public static void main (String[]args) {
		int [] arrEnteros = {10,9,8,7,6,5,4,3,2,1};
		int usuarioValor = 0; 
		mostrarArreglo(arrEnteros);
		while((usuarioValor<1)||(usuarioValor>10)) {
			usuarioValor = solicitarEntero();
		}
		insertarElemento(arrEnteros,usuarioValor);
		mostrarArreglo(arrEnteros);
	}
	
	public static int solicitarEntero() {
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		int valorUsuario=0;
		try {
			System.out.println("Ingrese un entero entre 1 y 10,el mismo sera anadido al arreglo");
			valorUsuario = Integer.valueOf(entrada.readLine());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return valorUsuario;
	}
	
	public static void insertarElemento (int [] arrEnteros,int valorUsuario) {
		int pos = 0;
		pos = buscarPosicion(arrEnteros,valorUsuario);
		corrimientoDerecha(arrEnteros,pos);
		arrEnteros[pos]=valorUsuario;
	}
	
	public static int buscarPosicion(int [] arrEnteros,int valorUsuario) {
		int indice  = 0;
		while((arrEnteros[indice]!=valorUsuario)&&(indice<MAX)) {
			indice++;
		}
		return indice;
	}
	
	public static void corrimientoDerecha(int [] arrEnteros,int pos) {
		for(int i =(MAX-1);i>pos;i--) {
			arrEnteros[i] = arrEnteros[i-1];
		}
	}
	
	public static void mostrarArreglo(int [] arrEnteros) {
		for(int pos = 0;pos<MAX;pos++) {
			System.out.print(arrEnteros[pos]+"|");
		}
		System.out.println();
	}
}
