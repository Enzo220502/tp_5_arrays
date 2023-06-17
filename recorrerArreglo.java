package practicaArreglos;

public class recorrerArreglo {
	public static final int MAX=5;
	public static void main(String[]args) {
		int [] arr = {0,3,3,3,0};
		int ini = 0, fin =-1;
		while (ini <MAX) {
			ini=buscarIni(arr,fin+1);
			if(ini<MAX) {
				fin=buscarFin(arr,ini);
				if(fin<MAX) {	
					if ((ini<MAX)&&(todosIguales(arr,ini,fin))) {
						System.out.println("Se recorrio todo el arreglo,y son todos iguales");
					}
				}	
			}
		}
	}
	
	public static int buscarIni(int[]arr,int pos) {
		while( pos<MAX && (arr[pos]==0)) {
			pos++;
		}
		return pos;
	}
	
	public static int buscarFin(int[]arr,int pos) {
		while(pos<MAX && (arr[pos]!=0)) {
			pos++;
		}
		return pos-1;
	}
	
	public static boolean todosIguales(int[]arr,int ini,int fin) {
			ini++;
			while((ini<fin) && (arr[ini]==arr[ini+1])) {
		}
		return ini==fin;
	}
}
