import java.util.Scanner;

public class Ejercicio025 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    System.out.print("Ingrese una palabra: ");
    String palabra = sc.next().toLowerCase();
    System.out.print("Vocales encontradas: ");
    for(int i=0; i<palabra.length(); i=i+1){
      char letra = palabra.charAt(i);
      if(letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u'){
        continue;
      }
      System.out.print(letra + " ");
    }
    System.out.println();
  } // Fin del método main
} // Fin de la clase Ejercicio025