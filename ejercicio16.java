package practicaArreglos;
import java.util.Random;
class ejercicio16 {
  public static final int MAX = 20;
  public static final int MIN = 0;
  public static final int MAXVALOR = 9;
  public static final int MINVALOR = 1;
  public static final double probabilidad_int = 0.4;
  public static void main(String[] args) {
    int [] arrEnteros = new int [MAX];
    int inicio = (MAX-1) , fin = -1;
    cargar_arreglo_sec_ent(arrEnteros);
    mostrarArreglo(arrEnteros);
   	fin = buscarFin(arrEnteros);
    inicio = buscarIni(arrEnteros,fin);
    System.out.println("La ultima secuencia encontrada se encuentra en la posicion de inicio "+inicio+" y fin "+fin);
  }
  
  public static void cargar_arreglo_sec_ent(int [] arrEnteros){
  	Random r = new Random();
    for(int pos = 0;pos<MAX;pos++){
      if(r.nextDouble()>probabilidad_int){
        arrEnteros[pos] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
      }
      else{
        arrEnteros[pos] = 0;
      }
    }	
  }
  
  public static int buscarFin(int [] arrEnteros){
    int pos = (MAX-1);
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