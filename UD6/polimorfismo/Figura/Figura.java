package Figura;

public abstract class Figura implements Comparable {
  private double area;
  private String cor;

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public Figura() {
  }

  public Figura(double area, String cor) {
    this.area = area;
    this.cor = cor;
  }

  abstract double calcularArea();

  // cambiamos o método compareTo para decirlle que queremos ordenar por área
  @Override
  public int compareTo(Object obx) {
    Figura outra = (Figura) obx;
    if (this.calcularArea() < outra.calcularArea()) {
      return -1;
    } else if (this.calcularArea() > outra.calcularArea()) {
      return 1;
    } else {
      return 0;
    }
  }
}
