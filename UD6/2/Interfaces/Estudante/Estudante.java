package Estudante;

public class Estudante implements Comparable {
  private String nome;
  private int idade;

  public Estudante(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int compareTo(Object obx) {
    // Temos que facer o casting para acceder aos atributos de Estudante
    Estudante outroEstudante = (Estudante) obx;
    if (this.idade < outroEstudante.idade) {
      return -1;
    }
    if (this.idade > outroEstudante.idade) {
      return 1;
    }
    return 0;
  }

}
