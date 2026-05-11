public class Instrucions {
  private String descricion;

  public String getDescricion() {
    return descricion;
  }

  public void setDescricion(String descricion) {
    this.descricion = descricion;
  }

  @Override
  public String toString() {
    return "descricion=" + descricion;
  }

  public Instrucions(String descricion) {
    this.descricion = descricion;
  }

}
