public class Directivos extends Empregado {

  public Directivos() {
  }

  public Directivos(String nome) {
    super(nome);
  }

  @Override
  public String toString() {
    return super.toString() + " --> Directivo";
  }

}
