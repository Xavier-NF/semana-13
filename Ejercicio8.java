import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    String[] codigos = {"XYZ789", "DEF456", "QWE321", "ABC123", "GHI000", "JKL555"};
    int posicion = -1, revisados = 0;
    for(int i=0; i<codigos.length; i=i+1){
      revisados++;
      if(codigos[i].equals("ABC123")){
        posicion = i + 1;
        break;
      }
    }
    if(posicion != -1){
      System.out.println("Código encontrado en la posición: " + posicion);
    }else{
      System.out.println("Código no encontrado.");
    }
    System.out.println("Cantidad de códigos revisados: " + revisados);
  } // Fin del método main
} // Fin de la clase Ejercicio8