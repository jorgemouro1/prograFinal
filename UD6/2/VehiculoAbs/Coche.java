package VehiculoAbs;

public class Coche extends Vehiculo {

  public Coche(String marca, String modelo, double velocidadeMaxima) {
    super(marca, modelo, velocidadeMaxima);
  }

  public Coche() {
  }

  @Override
  public void acelerar(int intensidade) {
    System.out.println("O coche está acelerando " + intensidade + " km/h");
  }

  @Override
  public void frear(int intensidade) {
    System.out.println("O coche está frenando " + intensidade + " km/h");
  }

}
