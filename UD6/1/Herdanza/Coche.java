package Herdanza;

/*
Existirá unha clase derivada: Coche, que herda de Vehiculo (porque un coche é un vehículo), con atributos propios:
 int numeroPortas
E un método propio:
 mostrarCoche() → imprime todos os datos do coche, incluíndo os herdados */
public class Coche extends Vehiculo {
  private int numeroPortas;

  public Coche(String marca, int anoFabricacion, int numeroPortas) {
    super(marca, anoFabricacion);
    this.numeroPortas = numeroPortas;
  }

  public Coche(int numeroPortas) {
    this.numeroPortas = numeroPortas;
  }

  public Coche() {
  }

  public int getNumeroPortas() {
    return numeroPortas;
  }

  public void setNumeroPortas(int numeroPortas) {
    this.numeroPortas = numeroPortas;
  }

  public void mostrarCoche() {
    System.out.println("COCHE --> Marca: " + this.getMarca() + " ano de fabricación: " + this.getAnoFabricacion()
        + " numero de portas: " + this.getNumeroPortas());
  }
}
