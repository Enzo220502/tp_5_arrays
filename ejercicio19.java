package practicaArreglos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class ejercicio19 {
	public static final int MAX=20,MAXVALOR=9,MINVALOR=0;
	public static final double probabilidad=0.6;
	public static void main(String [] args) {
		int [] arr = new int [MAX];
		cargar_arr_sec(arr);
		mostrarArreglo(arr);
		int valorUsuario = solicitarValor();
		eliminarTamSim(arr,valorUsuario);
		mostrarArreglo(arr);
	}
	
	public static void eliminarTamSim(int [] arr, int valorUsuario) {
		int ini = 0,fin = -1,tamanio=0;
		while(ini<MAX) {
			ini=buscarIni(arr,fin+1);
			if(ini<MAX) {
				fin=buscarFin(arr,ini);
				tamanio=(fin-ini+1);
				if(tamanio==valorUsuario) {
					eliminarSec(arr,ini,fin);
				}
				ini=fin;
			}
		}
	}
	
	public static int buscarIni(int [] arr,int pos) {
		while(pos<MAX&&arr[pos]==0) {
			pos++;
		}
		return pos;
	}
	
	public static int buscarFin(int [] arr,int pos) {
		while(pos<MAX&&arr[pos]!=0) {
			pos++;
		}
		return pos-1;
	}
	
	public static void eliminarSec (int[] arr,int ini,int fin) {
		for(int i = ini;i<=fin;i++) {
			corrimientoIzq(arr,ini);
		}
	}
	
	public static void corrimientoIzq(int[]arr,int pos) {
		if(pos!=(MAX-1)) {
			for(int i=pos;i<(MAX-1);i++) {
				arr[i]=arr[i+1];
			}
		}
		else {
			arr[pos]=0;
		}
	}
	
	public static int solicitarValor() {
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		int valor=0;
		while(valor<=0) {
			try {
				System.out.println("ingrese el tamanio de la secuencia a eliminar");
				valor = Integer.valueOf(entrada.readLine());
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		return valor;
	}
	
	public static void cargar_arr_sec(int [] arr) {
		Random r=new Random();
		for(int pos=0;pos<MAX;pos++) {
			if(r.nextDouble()<probabilidad) {
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1)-MINVALOR);
			}
			else {
				arr[pos]=0;
			}
		}
	}
	
	public static void mostrarArreglo(int[] arr) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.print(arr[pos]+"|");
		}
		System.out.println();
	}

}
