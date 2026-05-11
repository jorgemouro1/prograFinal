public class Oficiais extends Operarios {

  public Oficiais() {
  }

  public Oficiais(String nome) {
    super(nome);
  }

  @Override
  public String toString() {
    return super.toString() + " --> Oficial";
  }

}
