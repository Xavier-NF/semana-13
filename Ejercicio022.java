import java.util.Scanner;

public class Ejercicio022 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("¿Cuántas edades va a ingresar? ");
    int n = sc.nextInt();
    int validas = 0, suma = 0;
    for(int i=1; i<=n; i=i+1){
      System.out.print("Edad " + i + ": ");
      int edad = sc.nextInt();
      if(edad < 18 || edad > 65){
        continue;
      }
      validas++;
      suma = suma + edad;
    }
    System.out.println("Cantidad válida de personas: " + validas);
    if(validas > 0){
      System.out.println("Promedio de edad: " + (double) suma / validas);
    }
  } // Fin del método main
} // Fin de la clase Ejercicio022
