public class Tecnicos extends Operarios {

  public Tecnicos() {
  }

  public Tecnicos(String nome) {
    super(nome);
  }

  @Override
  public String toString() {
    return super.toString() + " --> Técnico";
  }

}
