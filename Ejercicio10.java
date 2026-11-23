import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int procesados = 0;
    double detectada = 0;
    boolean hayDetectada = false;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Monto de la transferencia (S/): ");
      double monto = sc.nextDouble();
      procesados++;
      if(monto > 100000){
        detectada = monto;
        hayDetectada = true;
        break;
      }
    }
    if(hayDetectada){
      System.out.println("Transferencia detectada: S/ " + detectada);
    }
    System.out.println("Cantidad de registros procesados: " + procesados);
  } // Fin del método main
} // Fin de la clase Ejercicio10