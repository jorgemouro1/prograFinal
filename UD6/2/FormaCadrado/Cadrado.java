package FormaCadrado;

public class Cadrado extends Forma {
  private double lado;

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  public Cadrado(double lado) {
    this.lado = lado;
  }

  @Override
  double calcularArea() {
    double area = lado * lado;
    return area;
  }

}
