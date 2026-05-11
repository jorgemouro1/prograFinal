package Composicion2;

public class Produto {
  private String nome;
  private double prezo;
  private int stock;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPrezo() {
    return prezo;
  }

  public void setPrecio(double prezo) {
    this.prezo = prezo;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public Produto(String nome, double prezo, int stock) {
    this.nome = nome;
    this.prezo = prezo;
    this.stock = stock;
  }

  @Override
  public String toString() {
    return "Nome=" + nome + ", precio=" + prezo + ", stock=" + stock;
  }

}
