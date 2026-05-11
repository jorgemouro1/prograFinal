package Instrumentos;

public class Flauta extends Instrumento {

  @Override
  public void tocar() {
    System.out.println("Fiu fiu👌");
  }

  public void limpar() {
    System.out.println("Flauta limpa👌Que bom");
  }

  public Flauta(String nome, String familia) {
    super(nome, familia);
    this.setFamilia("Vento");
  }

  public Flauta() {
    this.setFamilia("Vento");
  }

}
