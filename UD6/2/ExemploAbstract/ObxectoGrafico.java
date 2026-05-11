package ExemploAbstract;

// Clase abstracta: non se pode instanciar directamente
abstract class ObxectoGrafico {

  // Atributos comúns a todos os obxectos gráficos
  protected int x;
  protected int y;

  // Constructor
  public ObxectoGrafico(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Método abstracto: cada subclase debe implementalo
  public abstract void debuxar();

  // Método non abstracto: compártese entre todas as subclases
  public void mover(int despX, int despY) {
    x += despX;
    y += despY;
    System.out.println("Obxecto movido a posición (" + x + ", " + y +
        ")");
  }
}
