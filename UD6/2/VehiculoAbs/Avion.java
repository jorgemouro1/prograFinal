package VehiculoAbs;

public class Avion extends Vehiculo {
  private int numMotores;

  public int getNumMotores() {
    return numMotores;
  }

  public void setNumMotores(int numMotores) {
    this.numMotores = numMotores;
  }

  public Avion(String marca, String modelo, double velocidadeMaxima, int numMotores) {
    super(marca, modelo, velocidadeMaxima);
    this.numMotores = numMotores;
  }

  public Avion(int numMotores) {
    this.numMotores = numMotores;
  }

  @Override
  public void acelerar(int intensidade) {
    System.out.println("O avión está acelerando " + intensidade + " km/h");

  }

  @Override
  public void frear(int intensidade) {
    System.out.println("O avión está frenando " + intensidade + " km/h");
  }

  public void voar() {
    System.out.println("Moi bom, estás voando👌");
  }
}
