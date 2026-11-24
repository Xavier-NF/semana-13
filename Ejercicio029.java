import java.util.Scanner;

public class Ejercicio029 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántas palabras va a ingresar? ");
    int n = sc.nextInt();
    int validas = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Palabra " + i + ": ");
      String palabra = sc.next();
      if(palabra.length() < 5){
        continue;
      }
      validas++;
    }
    System.out.println("Cantidad de palabras válidas: " + validas);
  } // Fin del método main
} // Fin de la clase Ejercicio029