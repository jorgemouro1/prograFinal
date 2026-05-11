public final class Maza extends Froita {
  private String cor;

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public Maza(String nome, String cor) {
    super(nome);
    this.cor = cor;
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Cor: " + this.getCor());
  }

  /*
   * @Override
   * public void comer(){
   * 
   * }
   */
}
