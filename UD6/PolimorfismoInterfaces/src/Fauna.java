public class Fauna {
  public static void main(String[] args) {
    /// ...
    // Creamos un array de animais (de calquera tipo) Superclase.
    Animal[] lista = new Animal[2]; // referencias á superclase
    lista[0] = new Gato();
    lista[1] = new Can(); // Engadimos ao array varias instancias das
    // distintas subclases
    for (Animal a : lista) {
      System.out.println(a.fala());
    }

    ((Gato) lista[0]).aranha();
  }
}