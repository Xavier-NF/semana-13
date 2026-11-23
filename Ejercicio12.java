import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int total = 0;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Nombre del estudiante (FIN para terminar): ");
      String nombre = sc.nextLine();
      if(nombre.equalsIgnoreCase("FIN")){
        break;
      }
      total++;
    }
    System.out.println("Total de asistentes registrados: " + total);
  } // Fin del método main
} // Fin de la clase Ejercicio12