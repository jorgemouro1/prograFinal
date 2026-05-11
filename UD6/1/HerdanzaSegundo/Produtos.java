/*
metodo q permita mostrar a información do obxecto public void mostrarInfo() en todos os casos. 
Crear unha clase ProbaAgro co método main() onde se cre un obxecto de cada tipo e se amosen os 
datos de cada un dos obxectos creados. */
public class Produtos {
  private String dataCaducidade;
  private int numeroLote;

  public String getDataCaducidade() {
    return dataCaducidade;
  }

  public void setDataCaducidade(String dataCaducidade) {
    this.dataCaducidade = dataCaducidade;
  }

  public int getNumeroLote() {
    return numeroLote;
  }

  public void setNumeroLote(int numeroLote) {
    this.numeroLote = numeroLote;
  }

  public Produtos(String dataCaducidade, int numeroLote) {
    this.dataCaducidade = dataCaducidade;
    this.numeroLote = numeroLote;
  }

  public Produtos() {
  }

  public void mostrarInfo() {
    System.out.println("Info xeral produto: ");
    System.out.println("Data de caducidade: " + this.getDataCaducidade());
    System.out.println("Numero de lote:" + +this.getNumeroLote());
  }
}
