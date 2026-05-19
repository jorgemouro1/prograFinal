
import java.util.Objects;

public class FestaGastronomica extends Festa {
  private String produto;
  private double presuposto;

  public String getProduto() {
    return produto;
  }

  public void setProduto(String produto) {
    this.produto = produto;
  }

  public double getPresuposto() {
    return presuposto;
  }

  public void setPresuposto(double presuposto) {
    this.presuposto = presuposto;
  }

  public FestaGastronomica(String lugar, int dia, String produto, double presuposto) {
    super(lugar, dia);
    this.produto = produto;
    this.presuposto = presuposto;
  }

  public FestaGastronomica() {
  }

  public void dobraPresuposto() {
    setPresuposto(presuposto * 2);
    System.out.println("O presuposto foi dobrado por Rueda 👌, que bom");
  }

  @Override
  public int hashCode() {
    return Objects.hash(presuposto);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof FestaGastronomica)) {
      return false;
    }
    if (this == obj)
      return true;

    FestaGastronomica other = (FestaGastronomica) obj;

    if (other.getPresuposto() != this.getPresuposto()) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("Produto: " + this.getProduto() + ", presuposto: " + this.getPresuposto());
  }

}
