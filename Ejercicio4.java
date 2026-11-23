import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("Ingrese un número: ");
    int numero = sc.nextInt();
    boolean esPrimo = numero > 1;
    int divisor = 0;
    for(int d=2; d<=numero/2; d=d+1){
      if(numero % d == 0){
        esPrimo = false;
        divisor = d;
        break;
      }
    }
    if(esPrimo){
      System.out.println(numero + " es primo.");
    }else{
      System.out.println(numero + " NO es primo.");
      if(divisor > 0){
        System.out.println("Primer divisor encontrado: " + divisor);
      }
    }
  } // Fin del método main
} // Fin de la clase Ejercicio4