package practicaArreglos;
import java.util.Random;
public class ejercicio17{
  public static final int MAX = 20;
  public static final int MIN = 0;
  public static final int MAXVALOR = 9;
  public static final int MINVALOR = 1;
  public static final double probabilidad_int = 0.4;
  public static void main(String[] args) {
    int [] arrEnteros = new int [MAX];
    int ini_anteult = 0 , fin_anteult = 0,ini_ult = 0, fin_ult = (MAX-1);
    cargar_arr_aleatorio(arrEnteros);
    mostrarArreglo(arrEnteros);
   	fin_ult = buscarFin(arrEnteros,fin_ult);
    ini_ult = buscarIni(arrEnteros,fin_ult);
    fin_anteult = buscarFin(arrEnteros,(ini_ult-1));
    ini_anteult = buscarIni(arrEnteros,fin_anteult);
    System.out.println("La anteultima secuencia encontrada se encuentra en la posicion de inicio "+ini_anteult+" y fin "+fin_anteult);
  }
  
  public static void cargar_arr_aleatorio(int [] arrEnteros) {
	  Random r = new Random();
	  for(int pos = 0;pos<MAX;pos++) {
		  if(r.nextDouble()<probabilidad_int) {
			  arrEnteros[pos] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
		  }
		  else {
			  arrEnteros[pos] = 0;
		  }
	  }
  }
  
  public static int buscarFin(int [] arrEnteros, int fin){
    int pos = fin;
    while(arrEnteros[pos]==0){
      pos--;
    }
    return pos;
  }
  
  public static int buscarIni(int [] arrEnteros, int fin){
    int pos = fin;
    while(arrEnteros[pos] != 0){
      pos--;
    }
    return (pos+1);
  }
   
  public static void mostrarArreglo(int [] arrEnteros){
    for (int pos = 0; pos<MAX;pos++){
      System.out.print(arrEnteros[pos]+"|");
    }
    System.out.println();
  }
}