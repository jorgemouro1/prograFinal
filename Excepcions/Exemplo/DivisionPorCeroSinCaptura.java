package Exemplo;

public class DivisionPorCeroSinCaptura {
  public static void main(String[] args) {
    int numerador = 10;
    int denominador = 0;
    // Isto provocará unha ArithmeticException
    int resultado = numerador / denominador;
    System.out.println("Resultado: " + resultado); // Nunca se chega a executar
    System.out.println("Programa rematado correctamente."); // Tampouco
  }
}