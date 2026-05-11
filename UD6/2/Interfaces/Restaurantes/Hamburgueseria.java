package Restaurantes;

public class Hamburgueseria implements Restaurante {
  private double prezoH;

  public double getPrezoH() {
    return prezoH;
  }

  public void setPrezoH(double prezoH) {
    this.prezoH = prezoH;
  }

  public Hamburgueseria(double prezoH) {
    this.prezoH = prezoH;
  }

  public Hamburgueseria() {
  }

  @Override
  public double calcularPrezo(String pedido) {
    String cadeaNova = pedido.toLowerCase();

    if (cadeaNova.contains("doble") && cadeaNova.contains("queixo")) {
      return this.getPrezoH() + 6;
    } else if (cadeaNova.contains("doble") || cadeaNova.contains("queixo")) {
      return this.getPrezoH() + 3;
    } else {
      return this.getPrezoH();
    }
  }

  @Override
  public void prepararPedido(String pedido) {
    System.out.println("Preparando pedido de hamburguesa que contén " + pedido + " 👌");
  }

}
