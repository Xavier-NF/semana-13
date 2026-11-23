import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int lecturas = 0;
    double critica = 0;
    boolean hayCritica = false;
    for(int i=1; i<=100; i=i+1){
      System.out.print("Ingrese la temperatura (°C): ");
      double temperatura = sc.nextDouble();
      lecturas++;
      if(temperatura > 95){
        critica = temperatura;
        hayCritica = true;
        break;
      }
    }
    if(hayCritica){
      System.out.println("Temperatura crítica encontrada: " + critica + " °C");
    }else{
      System.out.println("No se encontró temperatura crítica.");
    }
    System.out.println("Número de lecturas realizadas: " + lecturas);
  } // Fin del método main
} // Fin de la clase Ejercicio3