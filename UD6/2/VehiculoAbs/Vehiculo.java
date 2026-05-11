package VehiculoAbs;

public abstract class Vehiculo {
  private String marca;
  private String modelo;
  private double velocidadeMaxima;

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public final double getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  public final void setVelocidadeMaxima(double velocidadeMaxima) {
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public Vehiculo(String marca, String modelo, double velocidadeMaxima) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public Vehiculo() {
  }

  public abstract void acelerar(int intensidade);

  public abstract void frear(int intensidade);
}
