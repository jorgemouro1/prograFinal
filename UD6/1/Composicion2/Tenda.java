package Composicion2;

import java.util.ArrayList;

public class Tenda {
  private String nome;
  private ArrayList<Produto> produtos;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Produto> getProdutos() {
    return produtos;
  }

  public void setProdutos(ArrayList<Produto> produtos) {
    this.produtos = produtos;
  }

  public Tenda(String nome) {
    this.nome = nome;
    this.produtos = new ArrayList<>();
  }

  // metodo para engadir produtos
  public void engadirProduto(Produto p) {
    produtos.add(p);
  }

  // metodo para ir mostrando cada produto
  public void mostrarTenda() {
    System.out.println("Tenda " + this.getNome());
    System.out.println("Produtos disponhíveis: ");
    for (Produto p : produtos) {
      System.out.println("- " + p);
    }
  }

  // metodo para mostrar o valor total do stock
  public double valorStock() {
    double total = 0;
    for (Produto p : produtos) {
      total += p.getPrezo() * p.getStock();
    }
    return total;
  }

  @Override
  public String toString() {
    return "nome=" + nome + ", produtos=" + produtos;
  }
}
