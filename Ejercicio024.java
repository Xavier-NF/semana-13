import java.util.Scanner;

public class Ejercicio024 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.println("Números impares del 1 al 100:");
    for(int numero=1; numero<=100; numero=numero+1){
      if(numero % 2 == 0){
        continue;
      }
      System.out.print(numero + " ");
    }
    System.out.println();
  } // Fin del método main
} // Fin de la clase Ejercicio024