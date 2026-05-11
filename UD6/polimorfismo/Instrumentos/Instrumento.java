package Instrumentos;

public abstract class Instrumento {
  // atributos
  private String nome;
  private String familia;

  // construtor
  public Instrumento(String nome, String familia) {
    this.nome = nome;
    this.familia = familia;
  }

  public Instrumento() {
  }

  // getters e seters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getFamilia() {
    return familia;
  }

  public void setFamilia(String familia) {
    this.familia = familia;
  }

  // método abstracto q temos q redefinir
  public abstract void tocar();

  // método mostrar dateiros
  public void mostrarDatos() {
    System.out.println("Nome👌: " + this.getNome() + " familia👌: " + this.getFamilia());
  }
}
