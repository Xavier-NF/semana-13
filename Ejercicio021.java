import java.util.Scanner;

public class Ejercicio021 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int validas = 0;
    double suma = 0, maxima = -Double.MAX_VALUE, minima = Double.MAX_VALUE;
    for(int i=1; i<=100; i=i+1){
      System.out.print("Ingrese la nota " + i + " (0 a 20): ");
      double nota = sc.nextDouble();
      if(nota < 0 || nota > 20){
        continue;
      }
      validas++;
      suma = suma + nota;
      if(nota > maxima){ maxima = nota; }
      if(nota < minima){ minima = nota; }
    }
    if(validas > 0){
      System.out.println("Promedio: " + suma / validas);
      System.out.println("Nota máxima: " + maxima);
      System.out.println("Nota mínima: " + minima);
    }else{
      System.out.println("No hubo notas válidas.");
    }
  } // Fin del método main
} // Fin de la clase Ejercicio021
