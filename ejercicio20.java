package practicaArreglos;
public class ejercicio20 {
	public static final int MAX=14,MAXVALOR=9,MINVALOR=0;
	public static final double probabilidad=0.6;
	public static void main(String [] args) {
		int [] arrA = {0,4,5,6,3,0,1,2,3,0,2,3,2,0};
		int [] arrB = {0,1,2,3,0};
		mostrarArreglo(arrA);
		buscarPatron(arrA,arrB);
		mostrarArreglo(arrA);
	}
	
	public static void buscarPatron(int [] arrA, int [] arrB) {
		int iniA = 0,finA=-1,iniB=0,finB=-1;
		iniB=buscarIni(arrB,finB+1);
		finB=buscarFin(arrB,iniB);
		while(iniA<MAX) {
			iniA=buscarIni(arrA,finA+1);
			if(iniA<MAX) {
				finA=buscarFin(arrA,iniA);
				if(esIgual(arrA,iniA,finA,arrB,iniB,finB)) {
					eliminarSec(arrA,iniA,finA);
				}
				iniA=finA;
			}
		}
	}
	
	public static boolean esIgual(int[]arrA,int iniA,int finA,int[]arrB,int iniB,int finB) {
		if((finA-iniA+1)==(finB-iniB+1)) {
			while((iniA<=finA)&&(arrA[iniA]==arrB[iniB])){
				iniA++;
				iniB++;
			}
			return iniA>finA;
		}
		else {
			return false;
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
	
	
	public static void mostrarArreglo(int[] arr) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.print(arr[pos]+"|");
		}
		System.out.println();
	}

}
