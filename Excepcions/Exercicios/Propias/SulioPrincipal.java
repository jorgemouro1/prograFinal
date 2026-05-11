package Exercicios.Propias;

public class SulioPrincipal {
  public static void main(String[] args) {
    try {
      throw new SulioException("sulio👌👌👌");

    } catch (SulioException e) {
      System.out.println(e.getMensaxe());
    }
  }
}
