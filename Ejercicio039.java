import java.util.Scanner;

public class Ejercicio039 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int cantidad = 0;
    System.out.println("Números del 1 al 500 sin múltiplos de 2, 3 y 5:");
    for(int numero=1; numero<=500; numero=numero+1){
      if(numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0){
        continue;
      }
      System.out.print(numero + " ");
      cantidad++;
    }
    System.out.println();
    System.out.println("Cantidad encontrada: " + cantidad);
  } // Fin del método main
} // Fin de la clase Ejercicio039