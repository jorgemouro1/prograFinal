package ExemploInterfac;

// Outra clase que tamén implementa Conectable
class Smartphone implements Conectable {
  private boolean conectado = false;

  @Override
  public void conectar() {
    conectado = true;
    System.out.println("Smartphone conectado por Wi-Fi.");
  }

  @Override
  public void desconectar() {
    conectado = false;
    System.out.println("Smartphone desconectado da Wi-Fi.");
  }

  @Override
  public boolean estaConectado() {
    return conectado;
  }
}