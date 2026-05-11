package VehiculoAbs;

public class Bicicleta extends Vehiculo {
  private int numMarchas;
  private boolean tenSuspension;

  public int getNumMarchas() {
    return numMarchas;
  }

  public void setNumMarchas(int numMarchas) {
    this.numMarchas = numMarchas;
  }

  public boolean isTenSuspension() {
    return tenSuspension;
  }

  public void setTenSuspension(boolean tenSuspension) {
    this.tenSuspension = tenSuspension;
  }

  public Bicicleta(String marca, String modelo, double velocidadeMaxima, int numMarchas, boolean tenSuspension) {
    super(marca, modelo, velocidadeMaxima);
    this.numMarchas = numMarchas;
    this.tenSuspension = tenSuspension;
  }

  public Bicicleta(int numMarchas, boolean tenSuspension) {
    this.numMarchas = numMarchas;
    this.tenSuspension = tenSuspension;
  }

  @Override
  public void acelerar(int intensidade) {
    System.out.println("A bici está acelerando " + intensidade + " km/h");
  }

  @Override
  public void frear(int intensidade) {
    System.out.println("A bici está frenando " + intensidade + " km/h");
  }

  public void pedalear() {
    System.out.println("Moi bom, estás pedaleando👌");
  }
}
