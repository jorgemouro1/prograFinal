package Restaurantes;

public class Kebab implements Restaurante {
  private double prezoK;

  public double getPrezoK() {
    return prezoK;
  }

  public void setPrezoK(double prezoK) {
    this.prezoK = prezoK;
  }

  public Kebab() {
  }

  public Kebab(double prezoK) {
    this.prezoK = prezoK;
  }

  @Override
  public double calcularPrezo(String pedido) {
    String cadeaNova = pedido.toLowerCase();
    if (cadeaNova.contains("extra")) {
      return this.getPrezoK() + 3;
    } else {
      return this.getPrezoK();
    }
  }

  @Override
  public void prepararPedido(String pedido) {
    System.out.println("Preparando pedido de kebab que contén " + pedido + " 👌");
  }

}
