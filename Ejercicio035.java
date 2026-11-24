import java.util.Scanner;

public class Ejercicio035 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    char[] clave = {'A', 'C', 'B', 'D', 'A', 'B', 'C', 'D', 'A', 'B'};
    int validas = 0, aciertos = 0;
    System.out.println("Ingrese las respuestas (A, B, C, D o - si no respondió):");
    for(int i=0; i<clave.length; i=i+1){
      System.out.print("Pregunta " + (i + 1) + ": ");
      char respuesta = Character.toUpperCase(sc.next().charAt(0));
      if(respuesta == '-'){
        continue;
      }
      validas++;
      if(respuesta == clave[i]){
        aciertos++;
      }
    }
    System.out.println("Número de respuestas válidas: " + validas);
    if(validas > 0){
      System.out.println("Porcentaje de aciertos: " + (aciertos * 100.0 / validas) + " %");
    }
  } // Fin del método main
} // Fin de la clase Ejercicio035