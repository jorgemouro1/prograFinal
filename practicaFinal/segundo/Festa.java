public class Festa {
  private String lugar;
  private int dia;

  public String getLugar() {
    return lugar;
  }

  public void setLugar(String lugar) {
    this.lugar = lugar;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public Festa() {
    this.setDia(0);
  }

  public Festa(String lugar, int dia) {
    this.lugar = lugar;
    this.dia = dia;
  }

  public void mostrarDatos() {
    System.out.println("Lugar: " + this.getLugar() + ", dia: " + this.getDia());
  }
}
