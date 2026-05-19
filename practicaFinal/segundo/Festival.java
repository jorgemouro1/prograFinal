public class Festival extends Festa {
  private String bandaPrincipal;
  private boolean zonaAcampada;
  private static int numFestivais = 0;

  public String getBandaPrincipal() {
    return bandaPrincipal;
  }

  public void setBandaPrincipal(String bandaPrincipal) {
    this.bandaPrincipal = bandaPrincipal;
  }

  public boolean isZonaAcampada() {
    return zonaAcampada;
  }

  public void setZonaAcampada(boolean zonaAcampada) {
    this.zonaAcampada = zonaAcampada;
  }

  public int getNumFestivais() {
    return numFestivais;
  }

  public Festival() {
    numFestivais++;
  }

  public Festival(String lugar, int dia, String bandaPrincipal, boolean zonaAcampada) {
    super(lugar, dia);
    this.bandaPrincipal = bandaPrincipal;
    this.zonaAcampada = zonaAcampada;
    numFestivais++;
  }

  @Override
  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("Banda principal: " + this.getBandaPrincipal() + ", zona acampada?: " + this.isZonaAcampada());
  }

  public static void mostrarNumFestivais() {
    System.out.println("Número de festivais: " + numFestivais);
  }
}
