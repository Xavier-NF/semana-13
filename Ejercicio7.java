import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int total = 0, horas = 0;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Producción de la hora " + i + " (0 para terminar): ");
      int produccion = sc.nextInt();
      if(produccion == 0){
        break;
      }
      total = total + produccion;
      horas++;
    }
    System.out.println("Total producido: " + total);
    System.out.println("Cantidad de horas registradas: " + horas);
  } // Fin del método main
} // Fin de la clase Ejercicio7