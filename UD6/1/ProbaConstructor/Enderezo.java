class Enderezo {
  private String rúa;
  private String cidade;

  // Constructor
  public Enderezo(String rúa, String cidade) {
    this.rúa = rúa;
    this.cidade = cidade;
  }

  // Constructor copia
  public Enderezo(Enderezo outro) {
    this.rúa = outro.rúa;
    this.cidade = outro.cidade;
  }

  public void setRúa(String rúa) {
    this.rúa = rúa;
  }

  public String getRúa() {
    return rúa;
  }

  public String getCidade() {
    return cidade;
  }

  @Override
  public String toString() {
    return rúa + ", " + cidade;
  }
}
