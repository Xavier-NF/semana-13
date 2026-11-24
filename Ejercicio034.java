import java.util.Scanner;

public class Ejercicio034 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántos estudiantes va a ingresar? ");
    int n = Integer.parseInt(sc.nextLine());
    int validos = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Nombre del estudiante " + i + ": ");
      String nombre = sc.nextLine();
      System.out.print("¿Está retirado? (S/N): ");
      String retirado = sc.nextLine();
      if(retirado.equalsIgnoreCase("S")){
        continue;
      }
      validos++;
    }
    System.out.println("Cantidad de asistentes válidos: " + validos);
  } // Fin del método main
} // Fin de la clase Ejercicio034