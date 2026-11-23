import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int total = 0, suma = 0;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Respuesta del 1 al 5 (0 para terminar): ");
      int respuesta = sc.nextInt();
      if(respuesta == 0){
        break;
      }
      total++;
      suma = suma + respuesta;
    }
    System.out.println("Total de respuestas: " + total);
    if(total > 0){
      System.out.println("Promedio de satisfacción: " + (double) suma / total);
    }
  } // Fin del método main
} // Fin de la clase Ejercicio9