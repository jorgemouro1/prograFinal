public class ProdutoRefrixerado extends Produtos {
  private int codOrganismo;

  public int getCodOrganismo() {
    return codOrganismo;
  }

  public void setCodOrganismo(int codOrganismo) {
    this.codOrganismo = codOrganismo;
  }

  public ProdutoRefrixerado(String dataCaducidade, int numeroLote, int codOrganismo) {
    super(dataCaducidade, numeroLote);
    this.codOrganismo = codOrganismo;
  }

  public ProdutoRefrixerado(int codOrganismo) {
    this.codOrganismo = codOrganismo;
  }

  public ProdutoRefrixerado() {
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Info Produto refrixerado: ");
    System.out.println("Código organismo de supervisión alimentaria: " + this.getCodOrganismo());
  }

}
