import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    int secreto = (int)(Math.random() * 100) + 1;
    int intentosUsados = 0;
    for(int intento=1; intento<=100; intento=intento+1){
      System.out.print("Adivine el número (1 a 100): ");
      int numero = sc.nextInt();
      intentosUsados = intento;
      if(numero == secreto){
        break;
      }else if(numero < secreto){
        System.out.println("El número es MAYOR.");
      }else{
        System.out.println("El número es MENOR.");
      }
    }
    System.out.println("¡Felicitaciones! Adivinó el número " + secreto);
    System.out.println("Intentos usados: " + intentosUsados);
  } // Fin del método main
} // Fin de la clase Ejercicio6