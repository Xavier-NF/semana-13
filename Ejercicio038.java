import java.util.Scanner;

public class Ejercicio038 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántos registros va a ingresar? ");
    int n = sc.nextInt();
    int validos = 0;
    double acumulada = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Lluvia del registro " + i + " (mm): ");
      double lluvia = sc.nextDouble();
      if(lluvia < 0){
        continue;
      }
      acumulada = acumulada + lluvia;
      validos++;
    }
    System.out.println("Precipitación acumulada: " + acumulada + " mm");
    if(validos > 0){
      System.out.println("Promedio: " + acumulada / validos + " mm");
    }
  } // Fin del método main
} // Fin de la clase Ejercicio038
