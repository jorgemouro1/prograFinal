package VehiculoAbs;

public class VehiculoAbstracto {
  public static void main(String[] args) {
    Avion a1 = new Avion("Gosino", "Tordoia", 5, 55);
    Bicicleta b1 = new Bicicleta("Alberteiro", "Gosendeiro", 1000, 100, true);
    Coche c1 = new Coche("sql", "server", 100);

    System.out.println("Métodos de avión: ");
    a1.acelerar(1);
    a1.frear(10);
    a1.voar();

    System.out.println("----------------------------");

    System.out.println("Métodos de bicicleta: ");
    b1.acelerar(2);
    b1.frear(9);
    b1.pedalear();

    System.out.println("----------------------------");

    System.out.println("Métodos de coche: ");
    c1.acelerar(3);
    c1.frear(8);

    System.out.println("----------------------------");

    System.out.println("Velocidade máxima dos vehículos:");
    System.out.println("Avión: " + a1.getVelocidadeMaxima());
    System.out.println("Bici: " + b1.getVelocidadeMaxima());
    System.out.println("Coche: " + c1.getVelocidadeMaxima());

  }
}
