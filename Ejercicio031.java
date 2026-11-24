import java.util.Scanner;

public class Ejercicio031 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántos productos va a ingresar? ");
    int n = sc.nextInt();
    int disponibles = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Stock del producto " + i + ": ");
      int stock = sc.nextInt();
      if(stock == 0){
        continue;
      }
      disponibles++;
    }
    System.out.println("Total de productos disponibles: " + disponibles);
  } // Fin del método main
} // Fin de la clase Ejercicio031