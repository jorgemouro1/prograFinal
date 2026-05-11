public class ProdutoFresco extends Produtos {
  private String dataEnvasado;
  private String paisOrixe;

  public String getDataEnvasado() {
    return dataEnvasado;
  }

  public void setDataEnvasado(String dataEnvasado) {
    this.dataEnvasado = dataEnvasado;
  }

  public String getPaisOrixe() {
    return paisOrixe;
  }

  public void setPaisOrixe(String paisOrixe) {
    this.paisOrixe = paisOrixe;
  }

  public ProdutoFresco(String dataCaducidade, int numeroLote, String dataEnvasado, String paisOrixe) {
    super(dataCaducidade, numeroLote);
    this.dataEnvasado = dataEnvasado;
    this.paisOrixe = paisOrixe;
  }

  public ProdutoFresco(String dataEnvasado, String paisOrixe) {
    this.dataEnvasado = dataEnvasado;
    this.paisOrixe = paisOrixe;
  }

  public ProdutoFresco() {
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Info produto fresco: ");
    System.out.println("Data de envasado: " + this.getDataEnvasado());
    System.out.println("País de orixe: " + this.getPaisOrixe());
  }

}
