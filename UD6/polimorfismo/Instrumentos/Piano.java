package Instrumentos;

public class Piano extends Instrumento {

  // redefinimos
  @Override
  public void tocar() {
    System.out.println("Plink plonk👌");
  }

  // método propio
  public void abrirTapa() {
    System.out.println("Tapa do piano aberta👌");
  }

  public Piano(String nome, String familia) {
    super(nome, familia);
    this.setFamilia("Corda");
  }

  public Piano() {
    this.setFamilia("Corda");
  }

}
