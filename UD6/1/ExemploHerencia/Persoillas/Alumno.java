package ExemploHerencia.Persoillas;

public class Alumno extends Persoa {
  private String curso;

  public Alumno() {
    System.out.println("Executando o construtor de Alumno");
  }

  public Alumno(String nif, String nome, String curso) {
    super(nif, nome);
    this.curso = curso;
  }
  // Resto de métodos
}