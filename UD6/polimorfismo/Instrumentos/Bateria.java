package Instrumentos;

public class Bateria extends Instrumento {

  @Override
  public void tocar() {
    System.out.println("Bang Bang👌");
  }

  public void axustarTambores() {
    System.out.println("Tambores axustados👌Super bom");
  }

  public Bateria(String nome, String familia) {
    super(nome, familia);
    this.setFamilia("Percusión");
  }

  public Bateria() {
    this.setFamilia("Percusión");
  }

}
