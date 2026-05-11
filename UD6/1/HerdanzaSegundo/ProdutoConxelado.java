public class ProdutoConxelado extends Produtos {
  private int tempRecomendada;

  public int getTempRecomendada() {
    return tempRecomendada;
  }

  public void setTempRecomendada(int tempRecomendada) {
    this.tempRecomendada = tempRecomendada;
  }

  public ProdutoConxelado(String dataCaducidade, int numeroLote, int tempRecomendada) {
    super(dataCaducidade, numeroLote);
    this.tempRecomendada = tempRecomendada;
  }

  public ProdutoConxelado(int tempRecomendada) {
    this.tempRecomendada = tempRecomendada;
  }

  public ProdutoConxelado() {
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Info produto conxelado: ");
    System.out.println("Temperatura recomendada: " + this.getTempRecomendada());
  }

}
