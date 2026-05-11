package ExemploInterfac;

// Clase que implementa a interface Conectable
class Ordenador implements Conectable {
  private boolean conectado = false;

  @Override
  public void conectar() {
    conectado = true;
    System.out.println("Ordenador conectado á rede.");
  }

  @Override
  public void desconectar() {
    conectado = false;
    System.out.println("Ordenador desconectado da rede.");
  }

  @Override
  public boolean estaConectado() {
    return conectado;
  }
}