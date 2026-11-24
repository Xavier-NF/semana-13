import java.util.Scanner;

public class Ejercicio030 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántos pagos va a ingresar? ");
    int n = sc.nextInt();
    double[] vistos = new double[n];
    int unicos = 0;
    double total = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Pago " + i + ": ");
      double pago = sc.nextDouble();
      boolean repetido = false;
      for(int j=0; j<unicos; j=j+1){
        if(vistos[j] == pago){
          repetido = true;
        }
      }
      if(repetido){
        continue;
      }
      vistos[unicos] = pago;
      unicos++;
      total = total + pago;
    }
    System.out.println("Total acumulado: " + total);
    System.out.println("Cantidad de pagos únicos: " + unicos);
  } // Fin del método main
} // Fin de la clase Ejercicio030