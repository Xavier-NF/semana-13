import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(java.util.Locale.US);
    String clave = "IngenieroCachimbo";
    int intentoAcceso = 0;
    for(int intento=1; intento<=5; intento=intento+1){
      System.out.print("Intento " + intento + " - Ingrese la contraseña: ");
      String ingresada = sc.next();
      if(ingresada.equals(clave)){
        intentoAcceso = intento;
        break;
      }
    }
    if(intentoAcceso > 0){
      System.out.println("Accedió en el intento: " + intentoAcceso);
      System.out.println("ACCESO CONCEDIDO");
    }else{
      System.out.println("ACCESO DENEGADO");
    }
  } // Fin del método main
} // Fin de la clase Break02Acceso