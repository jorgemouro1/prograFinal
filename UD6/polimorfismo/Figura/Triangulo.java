package Figura;

public class Triangulo extends Figura {
  private double base;
  private double altura;

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
    this.setArea(calcularArea());
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
    this.setArea(calcularArea());
  }

  public Triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
    this.setArea(calcularArea());
  }

  public Triangulo(double area, String cor, double base, double altura) {
    super(area, cor);
    this.base = base;
    this.altura = altura;
  }

  @Override
  double calcularArea() {
    return (this.getBase() * this.getAltura()) / 2;
  }

  @Override
  public String toString() {
    return "Triangulo de base " + base + ", altura " + altura + " e área " + getArea() + " con cor " + getCor();
  }

}
