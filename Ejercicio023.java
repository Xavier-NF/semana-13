import java.util.Scanner;

public class Ejercicio023 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántas ventas va a ingresar? ");
    int n = sc.nextInt();
    double total = 0;
    int validas = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Monto de la venta " + i + ": ");
      double venta = sc.nextDouble();
      if(venta < 0){
        continue;
      }
      total = total + venta;
      validas++;
    }
    System.out.println("Total vendido: " + total);
    System.out.println("Cantidad de ventas válidas: " + validas);
  } // Fin del método main
} // Fin de la clase Ejercicio023