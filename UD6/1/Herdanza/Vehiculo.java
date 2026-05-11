/*
Crear un programa en Java que modele vehículos utilizando herdanza simple, onde existe
unha clase base: Vehiculo, que representa calquera tipo de vehículo. Terá como atributos:
 String marca
 int anoFabricacion
E como métodos:
 mostrarInfo() → imprime a marca e o ano */
package Herdanza;

public class Vehiculo {
  private String marca;
  private int anoFabricacion;

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getAnoFabricacion() {
    return anoFabricacion;
  }

  public void setAnoFabricacion(int anoFabricacion) {
    this.anoFabricacion = anoFabricacion;
  }

  public Vehiculo(String marca, int anoFabricacion) {
    this.marca = marca;
    this.anoFabricacion = anoFabricacion;
  }

  public Vehiculo() {
  }

  public void mostrarInfo() {
    System.out.println("INFO --> Marca: " + this.getMarca() + ", ano: " + this.getAnoFabricacion());
  }
}
