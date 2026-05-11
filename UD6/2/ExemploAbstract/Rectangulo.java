package ExemploAbstract;

// Outra subclase que tamén herda de ObxectoGrafico
class Rectangulo extends ObxectoGrafico {
  private int ancho;
  private int alto;

  public Rectangulo(int x, int y, int ancho, int alto) {
    super(x, y);
    this.ancho = ancho;
    this.alto = alto;
  }

  // Implementación do método abstracto
  @Override
  public void debuxar() {
    System.out.println("Debuxando un rectángulo en (" + x + ", " + y +
        ") de " + ancho + "x" + alto);
  }
}
