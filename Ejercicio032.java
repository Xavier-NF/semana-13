import java.util.Scanner;

public class Ejercicio032 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántos días va a ingresar? ");
    int n = sc.nextInt();
    int acumulada = 0, diasValidos = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Producción del día " + i + ": ");
      int produccion = sc.nextInt();
      if(produccion == 0){
        continue;
      }
      acumulada = acumulada + produccion;
      diasValidos++;
    }
    System.out.println("Producción acumulada: " + acumulada);
    if(diasValidos > 0){
      System.out.println("Promedio diario: " + (double) acumulada / diasValidos);
    }
  } // Fin del método main
} // Fin de la clase Ejercicio032