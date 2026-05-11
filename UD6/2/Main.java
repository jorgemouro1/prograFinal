// Primeira interface
interface Volador {
  void voar();

  default void describir() {
    System.out.println("Pode voar.");
  }
}

// Segunda interface
interface Nadador {
  void nadar();

  default void describir() {
    System.out.println("Pode nadar.");
  }
}

// Clase que implementa as dúas interfaces
class Pato implements Volador, Nadador {
  @Override
  public void voar() {
    System.out.println("O pato está a voar.");
  }

  @Override
  public void nadar() {
    System.out.println("O pato está a nadar.");
  }

  // Resolver o conflito dos métodos por defecto "describir"
  @Override
  public void describir() {
    // Podemos chamar explicitamente aos métodos por defecto das

    Volador.super.describir();
    Nadador.super.describir();
    System.out.println("É un pato, polo tanto pode facer ambas cousas!");
  }
}

// Clase principal para probar
public class Main {
  public static void main(String[] args) {
    Pato p = new Pato();
    p.voar();
    p.nadar();
    p.describir();
  }
}