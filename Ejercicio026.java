import java.util.Scanner;

public class Ejercicio026 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántas temperaturas va a ingresar? ");
    int n = sc.nextInt();
    int validas = 0;
    double suma = 0, maxima = -Double.MAX_VALUE, minima = Double.MAX_VALUE;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Temperatura " + i + " (°C): ");
      double t = sc.nextDouble();
      if(t < -10 || t > 50){
        continue;
      }
      validas++;
      suma = suma + t;
      if(t > maxima){ maxima = t; }
      if(t < minima){ minima = t; }
    }
    if(validas > 0){
      System.out.println("Temperatura promedio: " + suma / validas);
      System.out.println("Temperatura máxima: " + maxima);
      System.out.println("Temperatura mínima: " + minima);
    }else{
      System.out.println("No hubo temperaturas válidas.");
    }
  } // Fin del método main
} // Fin de la clase Ejercicio026