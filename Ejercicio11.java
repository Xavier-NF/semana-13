import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int procesados = 0;
    int critico = 0;
    boolean hayCritico = false;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Tiempo de respuesta (ms): ");
      int tiempo = sc.nextInt();
      procesados++;
      if(tiempo > 5000){
        critico = tiempo;
        hayCritico = true;
        break;
      }
    }
    if(hayCritico){
      System.out.println("Tiempo crítico: " + critico + " ms");
    }
    System.out.println("Registros procesados: " + procesados);
  } // Fin del método main
} // Fin de la clase Ejercicio11