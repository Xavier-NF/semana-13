import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int cantidad = 0;
    double suma = 0, maxima = -Double.MAX_VALUE, minima = Double.MAX_VALUE;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Ingrese la nota (20 para terminar): ");
      double nota = sc.nextDouble();
      cantidad++;
      suma = suma + nota;
      if(nota > maxima){ maxima = nota; }
      if(nota < minima){ minima = nota; }
      if(nota == 20){
        break;
      }
    }
    System.out.println("Cantidad de notas registradas: " + cantidad);
    System.out.println("Promedio de notas: " + suma / cantidad);
    System.out.println("Nota máxima: " + maxima);
    System.out.println("Nota mínima: " + minima);
  } // Fin del método main
} // Fin de la clase jercicio1
