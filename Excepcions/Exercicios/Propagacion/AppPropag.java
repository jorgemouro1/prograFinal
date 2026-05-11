package Exercicios.Propagacion;

public class AppPropag {

  public static double dividir(double a, double b) throws IllegalArgumentException {
    // Se o segundo número é 0, non vale
    if (b == 0) {
      throw new IllegalArgumentException("Non se pode dividir entre 0");
    } else {// se o de abaixo non é 0, divide moi bom👌
      return a / b;
    }
  }

  public static void main(String[] args) {
    double num1 = 5;
    double num2 = 0;

    // no try metemos o que queremos executar
    try {
      dividir(num1, num1);
      System.out.println(num1 + " entre " + num1 + " vai bom👌");
      dividir(num1, num2);
    } catch (IllegalArgumentException e) { // e nos catch imos metendo os mensaxes de erro
      System.out.println("ERRO DETECTADO");
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("Erro xenérico atopado");
      System.out.println(e.getMessage());

    }
  }
}
