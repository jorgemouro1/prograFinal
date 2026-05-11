package Exemplo;

import java.io.IOException;

public class ExemploThrowThrows {
  // Declaramos que este método pode lanzar IOException
  public static void comprobarNumero(int numero) throws IOException, ArithmeticException {
    double a = 10 / numero;
  }

  public static void main(String[] args) {
    try {
      comprobarNumero(5); // Todo ben
      comprobarNumero(0); // Xera excepción
    } catch (IOException e) {
      System.out.println("Capturada a excepción: " + e.getMessage());
    } catch (ArithmeticException a) {
      System.out.println("Capturada a excepción: " + a.getMessage());
    }
  }
}
