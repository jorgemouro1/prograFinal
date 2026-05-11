package ExemploAbstract;

// Subclase que herda de ObxectoGrafico
class Circulo extends ObxectoGrafico {
  private int radio;

  public Circulo(int x, int y, int radio) {
    super(x, y); // chamamos ao constructor da superclase
    this.radio = radio;
  }

  // Implementación do método abstracto
  @Override
  public void debuxar() {
    System.out.println("Debuxando un círculo en (" + x + ", " + y + ") con radio " + radio);
  }
}
