package ExemploInterfac;

interface Conectable {
  void conectar(); // Obriga ás clases a definir como se conectan

  void desconectar(); // Obriga ás clases a definir como se desconectan

  boolean estaConectado(); // Obriga a devolver o estado da conexión
}

public class Main {
  public static void main(String[] args) {
    Conectable pc = new Ordenador();
    Conectable mobil = new Smartphone();
    pc.conectar();
    mobil.conectar();
    System.out.println("O ordenador está conectado? " +
        pc.estaConectado());
    System.out.println("O smartphone está conectado? " +
        mobil.estaConectado());
    mobil.desconectar();
    pc.desconectar();
  }
}
