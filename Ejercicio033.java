import java.util.Scanner;

public class Ejercicio033 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántas respuestas va a ingresar? ");
    int n = sc.nextInt();
    int[] frecuencia = new int[6];
    int validas = 0, suma = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Respuesta " + i + " (1 a 5): ");
      int respuesta = sc.nextInt();
      if(respuesta < 1 || respuesta > 5){
        continue;
      }
      frecuencia[respuesta]++;
      validas++;
      suma = suma + respuesta;
    }
    System.out.println("Frecuencia de respuestas:");
    for(int r=1; r<=5; r=r+1){
      System.out.println("  " + r + " -> " + frecuencia[r]);
    }
    if(validas > 0){
      System.out.println("Promedio: " + (double) suma / validas);
    }
  } // Fin del método main
} // Fin de la clase Ejercicio033