package Instrumentos;

public class Guitarra extends Instrumento {

  @Override
  public void tocar() {
    System.out.println("Strum strum 👌");
  }

  public void afinarCorda(int corda) {
    System.out.println("Estase a afinar a corda número " + corda);
  }

  public Guitarra(String nome, String familia) {
    super(nome, familia);
    this.setFamilia("Corda");

  }

  public Guitarra() {
    this.setFamilia("Corda");
  }

}
