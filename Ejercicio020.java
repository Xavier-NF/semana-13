import java.util.Scanner;

public class Ejercicio020 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int validos = 0, numeroCorrupto = 0;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Estado del paquete " + i + " (1 = válido, 0 = corrupto): ");
      int estado = sc.nextInt();
      if(estado == 0){
        numeroCorrupto = i;
        break;
      }
      validos++;
    }
    System.out.println("Número del paquete corrupto: " + numeroCorrupto);
    System.out.println("Paquetes válidos procesados: " + validos);
  } // Fin del método main
} // Fin de la clase Ejercicio020
