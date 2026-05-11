package Figura;

public class Circulo extends Figura {
  private double radio;

  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
    this.setArea(calcularArea());
  }

  public Circulo(double radio) {
    this.radio = radio;
    this.setArea(calcularArea());
  }

  public Circulo(double area, String cor, double radio) {
    super(area, cor);
    this.radio = radio;
  }

  @Override
  double calcularArea() {
    return (Math.PI * (Math.pow(radio, 2)));
  }

  @Override
  public String toString() {
    return "Circulo de radio " + radio + " e área " + getArea() + " con cor " + getCor();
  }

}
