package Exercicios.Xeracion;

public class AppExcepcion {
  public static void main(String[] args) {
    try {
      throw new Exception("Isto é unha excepción");
    } catch (Exception e) {
      System.out.println("Produciuse unha excepción: " + e.getMessage());
    } finally {
      System.out.println("Executado por gosendo aínda que non haxa erros");
    }
  }
}
