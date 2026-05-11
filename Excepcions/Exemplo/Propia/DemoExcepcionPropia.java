package Exemplo.Propia;

public class DemoExcepcionPropia {
  // Método que valida a idade
  public static void validaIdade(int edad) {
    try {
      if (edad < 18) {
        // Lanzamos a nosa excepción propia con información detallada
        throw new DatoNonValidoException(
            Integer.toString(edad), 101, "Menor de idade👌");
      }
      System.out.println("Idade válida: " + edad);
    } catch (DatoNonValidoException e) {
      System.out.println("→ Capturada DatoNonValidoException👌:");
      System.out.println("Código de erro: " + e.getErrorCode());
      System.out.println("Mensaxe👌: " + e.getMessage());
      System.out.println("Detalle completo: " + e); // chama a toString()
    } catch (Exception e) {
      // Catch xenérico para calquera outra excepción
      System.out.println("→ Excepción xenérica capturada👌:");
      System.out.println(e);
    }

  }

  public static void main(String[] args) {

    validaIdade(15); // provoca a excepción

  }
}