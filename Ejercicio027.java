import java.util.Scanner;

public class Ejercicio027 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántos correos va a ingresar? ");
    int n = sc.nextInt();
    String lista = "";
    for(int i=1; i<=n; i=i+1){
      System.out.print("Correo " + i + ": ");
      String correo = sc.next();
      if(!correo.contains("@")){
        continue;
      }
      lista = lista + correo + "\n";
    }
    System.out.println("Correos válidos:");
    System.out.print(lista);
  } // Fin del método main
} // Fin de la clase Ejercicio027