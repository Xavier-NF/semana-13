import java.util.Scanner;

public class Ejercicio043 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int validos = 0, suma = 0;
    int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
    for(int i=1; i<=10000; i=i+1){
      System.out.print("Ingrese un número entero (999 para terminar): ");
      int numero = sc.nextInt();
      if(numero == 999){
        break;
      }
      if(numero < 0){
        continue;
      }
      validos++;
      suma = suma + numero;
      if(numero > mayor){ mayor = numero; }
      if(numero < menor){ menor = numero; }
    }
    System.out.println("Cantidad de números válidos: " + validos);
    System.out.println("Suma total: " + suma);
    if(validos > 0){
      System.out.println("Promedio: " + (double) suma / validos);
      System.out.println("Número mayor: " + mayor);
      System.out.println("Número menor: " + menor);
    }
  } // Fin del método main
} // Fin de la clase Ejercicio043