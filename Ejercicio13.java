import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int meta = 500, totalVendido = 0, ventas = 0;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Entradas vendidas en esta venta: ");
      int cantidad = sc.nextInt();
      totalVendido = totalVendido + cantidad;
      ventas++;
      if(totalVendido >= meta){
        System.out.println("¡Meta de " + meta + " entradas alcanzada!");
        break;
      }
    }
    System.out.println("Total vendido: " + totalVendido);
    System.out.println("Número de ventas realizadas: " + ventas);
  } // Fin del método main
} // Fin de la clase Ejercicio13