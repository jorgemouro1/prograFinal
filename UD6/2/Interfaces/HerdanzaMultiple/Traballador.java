package HerdanzaMultiple;

public class Traballador implements Subordinado, Xefe {

  // redefinimos os métodos
  @Override
  public void executarTarefas() {
    System.out.println("Subordinado: Estou a executar gosendos 👌");
  }

  @Override
  public void informar() {
    System.out.println("Subordinado: Informo que mañán non hai traballo 👌 ");
  }

  @Override
  public void darOrdes() {
    System.out.println("Sefe: Ordénoche que fagas o teu traballo 👌");
  }

  @Override
  public void planificarProxecto() {
    System.out.println("Sefe: Moi bom, planificamos un proxecto para mañán 👌");
  }

}
