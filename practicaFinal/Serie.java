/*
2. Crear a clase Serie:

Atributos:
- titulo
- numeroTempadas (por defecto 3)
- prestado (por defecto false)
- xenero
- creador

Métodos:
- construtor por defecto
- getters e setters (excepto de prestado)
- toString()
- entregar()
- devolver()
- isEntregado()
- compareTo() → compara o número de tempadas
 */
public class Serie {
  private String titulo;
  private int numeroTempadas = 3;
  private boolean prestado = false;
  private String xenero;
  private String creador;

  public Serie() {
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getNumeroTempadas() {
    return numeroTempadas;
  }

  public void setNumeroTempadas(int numeroTempadas) {
    this.numeroTempadas = numeroTempadas;
  }

  public boolean isPrestado() {
    return prestado;
  }

  public void setPrestado(boolean prestado) {
    this.prestado = prestado;
  }

  public String getXenero() {
    return xenero;
  }

  public void setXenero(String xenero) {
    this.xenero = xenero;
  }

  public String getCreador() {
    return creador;
  }

  public void setCreador(String creador) {
    this.creador = creador;
  }

  @Override
  public String toString() {
    return "Serie [titulo=" + titulo + ", numeroTempadas=" + numeroTempadas + ", prestado=" + prestado + ", xenero="
        + xenero + ", creador=" + creador + "]";
  }

}
