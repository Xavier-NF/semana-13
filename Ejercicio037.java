import java.util.Scanner;

public class Ejercicio037 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántas transacciones va a ingresar? ");
    int n = sc.nextInt();
    double total = 0;
    int validas = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Monto de la transacción " + i + " (S/): ");
      double monto = sc.nextDouble();
      if(monto < 10){
        continue;
      }
      total = total + monto;
      validas++;
    }
    System.out.println("Total procesado: S/ " + total);
    System.out.println("Cantidad de transacciones válidas: " + validas);
  } // Fin del método main
} // Fin de la clase Ejercicio037