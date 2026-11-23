import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    String[] nombres = {"Ana", "Luis", "Rosa"};
    int[] puntos = new int[3];
    String ganador = "";
    int puntajeFinal = 0;
    for(int turno=0; turno<1000; turno=turno+1){
      int p = turno % 3;
      System.out.print("Puntos obtenidos por " + nombres[p] + ": ");
      puntos[p] = puntos[p] + sc.nextInt();
      if(puntos[p] >= 100){
        ganador = nombres[p];
        puntajeFinal = puntos[p];
        break;
      }
    }
    System.out.println("Ganador: " + ganador);
    System.out.println("Puntaje final: " + puntajeFinal);
  } // Fin del método main
} // Fin de la clase Ejercicio18