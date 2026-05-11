class Gato implements Animal {
  public Gato() {
    System.out.println("> construtor de Gato");
  }

  public String fala() {
    return "Miau!!";
  }
}

class Can implements Animal {
  public Can() {
    System.out.println("> construtor de Perro");
  }

  public String fala() {
    return "Guau!!";
  }
}

public class Fauna {
  public static void main(String[] args) {
    /// ...
    // Creamos un array de animais (de calquera tipo) Superclase.
    Animal[] lista = new Animal[3]; // referencias á superclase
    lista[0] = new Gato();
    lista[1] = new Can(); // Engadimos ao array varias instancias das

    // distintas subclases
    for (Animal a : lista) {
      System.out.println(a.fala());
    }
  }
}