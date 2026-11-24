import java.util.Scanner;

public class Ejercicio028 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántas velocidades va a ingresar? ");
    int n = sc.nextInt();
    int validas = 0;
    double suma = 0, mayor = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Velocidad " + i + " (km/h): ");
      double v = sc.nextDouble();
      if(v < 20){
        continue;
      }
      validas++;
      suma = suma + v;
      if(v > mayor){ mayor = v; }
    }
    if(validas > 0){
      System.out.println("Velocidad promedio: " + suma / validas + " km/h");
      System.out.println("Mayor velocidad: " + mayor + " km/h");
    }else{
      System.out.println("No hubo velocidades válidas.");
    }
  } // Fin del método main
} // Fin de la clase Ejercicio028