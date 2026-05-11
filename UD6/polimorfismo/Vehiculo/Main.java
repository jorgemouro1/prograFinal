package Vehiculo;

import java.util.Scanner;

class Vehiculo {
  void mover() {
    System.out.println("O vehículo está a moverse");
  }
}

class Coche extends Vehiculo {
  @Override
  void mover() {
    System.out.println("O coche está a conducir na estrada");
  }
}

class Barco extends Vehiculo {
  @Override
  void mover() {
    System.out.println("O barco está a navegar no mar");
  }
}

class Avion extends Vehiculo {
  @Override
  void mover() {
    System.out.println("O avión está a voar nos ceos");
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Vehiculo v1;
    boolean meterdatos = false;
    while (!meterdatos) {
      System.out.print("Di que tipo de vehiculo queres: Coche (C), Barco (B), Avión (A): ");
      String cadenilla = sc.nextLine();
      if (cadenilla.toLowerCase().equals("c")) {
        v1 = new Coche();
        meterdatos = true;
        v1.mover();
      } else if (cadenilla.toLowerCase().equals("b")) {
        v1 = new Barco();
        v1.mover();
        meterdatos = true;
      } else if (cadenilla.toLowerCase().equals("a")) {
        v1 = new Avion();
        v1.mover();
        meterdatos = true;
      } else {
        System.out.println("Non válido, introduce A, B ou C👌.");
      }
    }
    sc.close();

  }
}
