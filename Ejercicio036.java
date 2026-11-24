import java.util.Scanner;

public class Ejercicio036 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántos salarios va a ingresar? ");
    int n = sc.nextInt();
    int validos = 0;
    double suma = 0, mayor = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Salario " + i + ": ");
      double salario = sc.nextDouble();
      if(salario < 0){
        continue;
      }
      validos++;
      suma = suma + salario;
      if(salario > mayor){ mayor = salario; }
    }
    if(validos > 0){
      System.out.println("Promedio salarial: " + suma / validos);
      System.out.println("Salario más alto: " + mayor);
    }else{
      System.out.println("No hubo salarios válidos.");
    }
  } // Fin del método main
} // Fin de la clase Ejercicio036