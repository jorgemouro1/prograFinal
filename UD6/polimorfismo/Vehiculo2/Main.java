package Vehiculo2;

class Vehiculo {
  void mover() {
    System.out.println("O vehículo está a moverse");
  }
}

class Coche extends Vehiculo {
  @Override
  void mover() {
    System.out.println("O coche conduce pola estrada");
  }

  void tocarBocina() {
    System.out.println("O coche fai bip bip");
  }
}

class Barco extends Vehiculo {
  @Override
  void mover() {
    System.out.println("O barco navega no mar");
  }

  void anclar() {
    System.out.println("O barco está ancorado");
  }
}

public class Main {
  public static void main(String[] args) {
    // Polimorfismo: referencia ampla (Vehiculo) apuntando a subclases
    Vehiculo v1 = new Coche();
    Vehiculo v2 = new Barco();
    // Só podemos chamar métodos de Vehiculo (superclase)
    v1.mover(); // chama a versión sobrescrita en Coche
    v2.mover(); // chama a versión sobrescrita en Barco
    // v1.tocarBocina(); // Erro de compilación: tocarBocina non está
    // v2.anclar(); // Erro de compilación: anclar non está en

    // Para chamar métodos específicos, hai que facer un cast
    ((Coche) v1).tocarBocina(); // funciona, tipo real é Coche
    ((Barco) v2).anclar(); // funciona, tipo real é Barco
  }
}
