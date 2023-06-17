package practicaArreglos;
import java.util.Random;
public class ejercicio18 {
	public static final int MAX=20,MAXVALOR=9,MINVALOR=1;
	public static final double probabilidad_num=0.6;
	public static void main(String [] args) {
		int[]arr=new int [MAX];
		cargarArregloAleatorio(arr);
		mostrarArreglo(arr);
		calcularLongMayor(arr);
	}
	
	public static void calcularLongMayor(int[]arr) {
		int ini=0,fin=-1,ini_may=0,fin_may=0,tam_may=0;
		while(ini<MAX) {
			ini=buscarIni(arr,fin+1);
			if(ini<MAX) {
				fin=buscarFin(arr,ini);
				if(tam_may<(fin-ini+1)) {
					ini_may=ini;
					fin_may=fin;
					tam_may=(fin-ini+1);
				}
				fin=ini;
			}		
		}
		System.out.println("la secuencia de mayor tamanio encontrada esta en inicio= "+ini_may+" y fin= "+fin_may);
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
	
	public static void cargarArregloAleatorio(int[]arr) {
		Random r = new Random();
		for(int pos=0;pos<MAX;pos++) {
			if(r.nextDouble()<probabilidad_num) {
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
			}
			else {
				arr[pos]=0;
			}
		}
	}
	
	public static void mostrarArreglo(int[]arr) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.print(arr[pos]+"|");
		}
		System.out.println();
	}

}
