import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int validos = 0;
    String productoError = "";
    boolean hayError = false;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Nombre del producto: ");
      String producto = sc.next();
      System.out.print("Stock de " + producto + ": ");
      int stock = sc.nextInt();
      if(stock < 0){
        productoError = producto;
        hayError = true;
        break;
      }
      validos++;
    }
    if(hayError){
      System.out.println("Producto con error: " + productoError);
    }
    System.out.println("Cantidad de registros válidos: " + validos);
  } // Fin del método main
} // Fin de la clase Ejercicio15