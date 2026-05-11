public class Empregado {
  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Empregado() {
  }

  public Empregado(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Empregado " + nome;
  }

}
