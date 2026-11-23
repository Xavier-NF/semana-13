import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int procesados = 0, numeroUrgente = 0;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Número de pedido: ");
      int pedido = sc.nextInt();
      System.out.print("¿Es urgente? (S/N): ");
      String urgente = sc.next();
      if(urgente.equalsIgnoreCase("S")){
        numeroUrgente = pedido;
        break;
      }
      procesados++;
    }
    System.out.println("Número del pedido urgente: " + numeroUrgente);
    System.out.println("Pedidos procesados: " + procesados);
  } // Fin del método main
} // Fin de la clase Ejercicio19
