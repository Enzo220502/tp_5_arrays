package practicaArreglos;
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejerciccio10 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String [] args) {
		int [] arrEnteros = new int [MAX];
		int numUsuario;
		cargarAleatorioEnteros(arrEnteros);
		mostrarArreglo(arrEnteros);
		numUsuario = solicitarNum();
		buscarNum(arrEnteros,numUsuario);
		mostrarArreglo(arrEnteros);
	}
	
	public static void cargarAleatorioEnteros(int [] arrEnteros) {
		Random r = new Random();
		for(int pos=0;pos<MAX;pos++) {
			arrEnteros[pos] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
		}
	}
	
	public static int solicitarNum() {
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		int num=0;
		try {
			System.out.println("ingrese un numero entero entre 1 y 10,este sera eliminado de el arreglo de estar incluido en el");
			num = Integer.valueOf(entrada.readLine());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if ((num<1)||(num>10)) {
			solicitarNum();
		}
		return num;
	}
	
	public static void buscarNum(int[]arrEnteros,int numUsuario) {
		int contador = 0;
		for(int i = 0;i<MAX;i++) {
			if(arrEnteros[i]==numUsuario) {
				eliminarOcurrencia(arrEnteros,i);
				contador ++;
				System.out.println("se encontro un "+numUsuario+" en la posicion "+i);
				i=0;
			}
		}
		if(contador==0) {
			System.out.println("no se encontro ningun valor que coincida en el arreglo");
		}
		
	}
	
	public static void eliminarOcurrencia(int[]arrEnteros,int pos) {
		for(int i = pos;i<(MAX-1);i++) {
			arrEnteros[i] = arrEnteros[i+1];
		}
	}
	
	public static void mostrarArreglo(int [] arrEnteros) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.print(arrEnteros[pos]+"|");
		}
		System.out.println();
	}
}
