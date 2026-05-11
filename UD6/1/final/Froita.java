public class Froita {
  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Froita(String nome) {
    this.nome = nome;
  }

  public void mostrarInfo() {
    System.out.println("Esta é unha froita chamada [" + this.getNome() + "] 👌");
  }

  public final void comer() {
    System.out.println("Estás comendo froitiña");
  }
}
