package ExemploHerencia.Persoillas;

public class Persoa {
  private String nif;
  private String nome;

  public Persoa() {
    System.out.println("Executando o construtor de Persoa");
  }

  public Persoa(String nif, String nome) {
    this.nif = nif;
    this.nome = nome;
  }
  // Resto de métodos
}
