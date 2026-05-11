package Exemplo.Propia;

public class DatoNonValidoException extends Exception {
  int errCode; // Código de erro específico da excepción
  String valor; // Valor que causou a excepción
  // Constructor personalizado

  public DatoNonValidoException(String valor, int errCode, String msg) {
    super(msg); // Chamamos ao constructor da clase base Exception para gardar a mensaxe
    this.valor = valor;
    this.errCode = errCode;
  }

  // Método para obter o código de erro
  public int getErrorCode() {
    return this.errCode;
  }
  // Sobrescribimos toString() para mostrar unha representación máis informativa

  public String toString() {
    return "[ERR: " + this.errCode + "] " +
        this.getMessage() + " (value: " + this.valor + ")";
  }
}
