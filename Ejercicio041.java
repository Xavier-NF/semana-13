import java.util.Scanner;

public class Ejercicio041 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int validas = 0, aprobados = 0, desaprobados = 0;
    double suma = 0, maxima = -Double.MAX_VALUE, minima = Double.MAX_VALUE;
    for(int i=1; i<=200; i=i+1){
      System.out.print("Ingrese la nota " + i + " (20 para terminar): ");
      double nota = sc.nextDouble();
      validas++;
      suma = suma + nota;
      if(nota > maxima){ maxima = nota; }
      if(nota < minima){ minima = nota; }
      if(nota >= 11){
        aprobados++;
      }else{
        desaprobados++;
      }
      if(nota == 20){
        break;
      }
    }
    System.out.println("Cantidad de notas válidas: " + validas);
    System.out.println("Promedio: " + suma / validas);
    System.out.println("Nota máxima: " + maxima);
    System.out.println("Nota mínima: " + minima);
    System.out.println("Aprobados: " + aprobados);
    System.out.println("Desaprobados: " + desaprobados);
  } // Fin del método main
} // Fin de la clase Ejercicio041