package practicaArreglos;
public class ejercicio22 {
	public static final int MAXA=10,MAXPR=5;
	public static void main(String []args) {
		int [] arrA = {0,2,4,0,2,3,4,0,9,0};
		int [] arrP = {0,2,3,4,0};
		int [] arrR = {0,1,1,1,0};
		mostrarArreglo(arrA,MAXA);
		reemplazarAporR(arrA,arrP,arrR);
		mostrarArreglo(arrA,MAXA);
	}
	
	public static void reemplazarAporR(int [] arrA,int [] arrP,int [] arrR) {
		int iniA=0,finA=-1,iniP=0,finP=-1,iniR=0,finR=-1;
		iniP=buscarIni(arrP,finP+1,MAXPR);
		finP=buscarFin(arrP,iniP,MAXPR);
		iniR=buscarIni(arrR,finR+1,MAXPR);
		finR=buscarFin(arrR,iniR,MAXPR);
		while(iniA<MAXA) {
			iniA=buscarIni(arrA,finA+1,MAXA);
			if(iniA<MAXA) {
				finA=buscarFin(arrA,iniA,MAXA);
				if(finA<MAXA && esIgualAP(arrA,iniA,finA,arrP,iniP,finP)) {
					sustituir(arrA,iniA,finA,arrR,iniR,finR);
				}
			}
		}
	}
	
	public static int buscarIni(int[]arr,int pos,int MAXIMO) {
		while(pos<MAXIMO&&arr[pos]==0) {
			pos++;
		}
		return pos;
	}
	
	public static int buscarFin(int[]arr,int pos,int MAXIMO) {
		while(pos<MAXIMO && arr[pos]!=0) {
			pos++;
		}
		return pos-1;
	}
	
	public static boolean esIgualAP(int[]arrA,int iniA,int finA,int[]arrP,int iniP,int finP) {
		while((iniA<=finA && iniP<=finP) && arrA[iniA] == arrP[iniP]) {
			iniA++;
			iniP++;
		}
		return (iniA>finA);
	}
	
	public static void sustituir(int[]arrA,int iniA,int finA,int[]arrR,int iniR,int finR) {
		while(iniA<=finA) {
			arrA[iniA]=arrR[iniR];
			iniA++;
			iniR++;
		}
	}
	
	public static void mostrarArreglo(int[]arrA,int MAXIMO) {
		for(int pos=0;pos<MAXIMO;pos++) {
			System.out.print(arrA[pos]+"|");
		}
		System.out.println();
	}
}
