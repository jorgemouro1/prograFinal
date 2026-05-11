package Restaurantes;

public class Pizzeria implements Restaurante {
  private double prezoP;

  public double getPrezoP() {
    return prezoP;
  }

  public void setPrezoP(double prezoP) {
    this.prezoP = prezoP;
  }

  public Pizzeria(double prezoP) {
    this.prezoP = prezoP;
  }

  public Pizzeria() {
  }

  @Override
  public double calcularPrezo(String pedido) {
    String cadeaNova = pedido.toLowerCase();
    // se contén grande ou extra sumámoslle 5 para que esté máis bom
    if (cadeaNova.contains("grande") && cadeaNova.contains("extra")) {
      return this.getPrezoP() + 10;
    } else if (cadeaNova.contains("grande") || cadeaNova.contains("extra")) {
      return this.getPrezoP() + 5;
    } else {
      return this.getPrezoP();
    }
  }

  @Override
  // mostramos unha mensaxe para a piza
  public void prepararPedido(String pedido) {
    System.out.println("Preparando pedido de pipsa🍕 que contén " + pedido + " 👌");
  }

}
