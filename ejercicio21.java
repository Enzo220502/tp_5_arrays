package practicaArreglos;
public class ejercicio21 {
	public static final int MAX = 10;
	public static void main(String[] args) {
		int [] arr = {0,2,4,2,0,4,3,2,1,0};
		mostrarArreglo(arr);
		eliminarDesc(arr);
		mostrarArreglo(arr);
	}
	
	public static void eliminarDesc(int[]arr) {
		int ini =0,fin = -1;
		while(ini<MAX) {
			ini=buscarIni(arr,fin+1);
			if(ini<MAX) {
				fin=buscarFin(arr,ini);
				if((fin<MAX)&&(esDesc(arr,ini,fin))) {
					eliminarSec(arr,ini,fin);
					fin=ini;
				}
			}
		}
	}
	
	public static boolean esDesc(int[] arr,int ini,int fin) {
		while((fin>ini)&&(arr[fin]<arr[fin-1])) {
			fin--;
		}
		return (ini==fin);
	}
	
	public static void eliminarSec(int [] arr,int ini, int fin) {
		for(int i=ini;i<=fin;i++) {
			corrimientoIzq(arr,ini);
		}
	}
	
	public static void corrimientoIzq(int[]arr,int pos) {
		for(int i=pos;i<(MAX-1);i++) {
			arr[i]=arr[i+1];
		}
	}
	
	public static int buscarIni(int[]arr,int pos) {
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
	
	public static void mostrarArreglo(int[]arr) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.print(arr[pos]+"|");
		}
		System.out.println();
	}
}
