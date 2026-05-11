package Exemplo;

public class DivisionPorCero {
  public static void main(String[] args) {
    try {
      int numerador = 10;
      int denominador = 1;
      int resultado = numerador / denominador; // ← Aquí salta a excepción
      System.out.println("Resultado: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Erro: Non se pode dividir entre cero.");
      System.out.println("Detalles: " + e.getMessage());
    } finally {
      System.out.println("Bloque 'finally' executado.");
    }
    System.out.println("Programa rematado correctamente.");
  }
}
