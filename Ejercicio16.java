import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    double minimo = 9.5, maximo = 10.5;   // rango permitido en mm
    int revisadas = 0;
    double incorrecta = 0;
    boolean hayIncorrecta = false;
    for(int i=1; i<=1000; i=i+1){
      System.out.print("Medida de la pieza " + i + " (mm): ");
      double medida = sc.nextDouble();
      revisadas++;
      if(medida < minimo || medida > maximo){
        incorrecta = medida;
        hayIncorrecta = true;
        break;
      }
    }
    if(hayIncorrecta){
      System.out.println("Medida incorrecta: " + incorrecta + " mm");
    }
    System.out.println("Cantidad de piezas revisadas: " + revisadas);
  } // Fin del método main
} // Fin de la clase Ejercicio16