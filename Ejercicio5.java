import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    double saldo = 1000;
    int operaciones = 0;
    for(int i=1; i<=1000; i=i+1){
      System.out.println("--- CAJERO AUTOMÁTICO ---");
      System.out.println("1. Consultar saldo");
      System.out.println("2. Depositar");
      System.out.println("3. Retirar");
      System.out.println("4. Salir");
      System.out.print("Seleccione una opción: ");
      int opcion = sc.nextInt();
      if(opcion == 4){
        break;
      }
      if(opcion == 1){
        System.out.println("Su saldo es: " + saldo);
        operaciones++;
      }else if(opcion == 2){
        System.out.print("Monto a depositar: ");
        saldo = saldo + sc.nextDouble();
        operaciones++;
      }else if(opcion == 3){
        System.out.print("Monto a retirar: ");
        double monto = sc.nextDouble();
        if(monto <= saldo){
          saldo = saldo - monto;
          operaciones++;
        }else{
          System.out.println("Saldo insuficiente.");
        }
      }else{
        System.out.println("Opción inválida.");
      }
    }
    System.out.println("Operaciones realizadas: " + operaciones);
    System.out.println("Sesión cerrada. ¡Gracias por usar el cajero!");
  } // Fin del método main
} // Fin de la clase Ejercicio5