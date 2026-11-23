import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    double limite = 50000;   // monto considerado sospechoso
    int revisadas = 0;
    double sospechoso = 0;
    boolean haySospechoso = false;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Monto de la operación (S/): ");
      double monto = sc.nextDouble();
      revisadas++;
      if(monto > limite){
        sospechoso = monto;
        haySospechoso = true;
        break;
      }
    }
    if(haySospechoso){
      System.out.println("Monto sospechoso: S/ " + sospechoso);
    }
    System.out.println("Número de operaciones revisadas: " + revisadas);
  } // Fin del método main
} // Fin de la clase Ejercicio17
