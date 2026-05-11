package Figura;

public class Cadrado extends Figura {
  private double lado;

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
    this.setArea(calcularArea());
  }

  public Cadrado(double lado) {
    this.lado = lado;
    this.setArea(calcularArea());
  }

  public Cadrado(double area, String cor, double lado) {
    super(area, cor);
    this.lado = lado;
  }

  @Override
  double calcularArea() {
    return Math.pow(this.getLado(), 2);
  }

  @Override
  public String toString() {
    return "Cadrado de lado " + lado + " e área " + getArea() + " con cor " + getCor();
  }

}
