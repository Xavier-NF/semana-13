import java.util.Scanner;

public class Ejercicio040 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántos clientes va a ingresar? ");
    int n = Integer.parseInt(sc.nextLine());
    int validos = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.println("Cliente " + i + " (deje vacío un dato si no lo tiene)");
      System.out.print("  Nombre: ");
      String nombre = sc.nextLine().trim();
      System.out.print("  DNI: ");
      String dni = sc.nextLine().trim();
      System.out.print("  Teléfono: ");
      String telefono = sc.nextLine().trim();
      if(nombre.isEmpty() || dni.isEmpty() || telefono.isEmpty()){
        continue;
      }
      validos++;
    }
    System.out.println("Cantidad de clientes válidos: " + validos);
    if(n > 0){
      System.out.println("Porcentaje de registros válidos: " + (validos * 100.0 / n) + " %");
    }
  } // Fin del método main
} // Fin de la clase Ejercicio040