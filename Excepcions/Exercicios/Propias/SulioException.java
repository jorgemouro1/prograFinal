package Exercicios.Propias;

public class SulioException extends Exception {

  private String mensaxe;

  public SulioException(String mensaxe) {
    this.mensaxe = mensaxe;
  }

  public String getMensaxe() {
    return mensaxe;
  }

  public void setMensaxe(String mensaxe) {
    this.mensaxe = mensaxe;
  }

}
