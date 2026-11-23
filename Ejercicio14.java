import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int encontrado = 0;
    for(int numero=1; numero<=100000; numero=numero+1){
      if(numero % 17 == 0 && numero % 23 == 0){
        encontrado = numero;
        break;
      }
    }
    System.out.println("Primer número divisible entre 17 y 23: " + encontrado);
  } // Fin del método main
} // Fin de la clase Ejercicio14