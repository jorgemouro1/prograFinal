package ExemploAbstract;

public class Main {
  public static void main(String[] args) {
    // Non podemos facer: ObxectoGrafico obj = new ObxectoGrafico(); //
    // Creamos obxectos das subclases
    Circulo c = new Circulo(10, 20, 5);
    Rectangulo r = new Rectangulo(30, 40, 10, 15);
    // Chamamos aos métodos
    c.debuxar();
    c.mover(5, -3);
    r.debuxar();
    r.mover(-10, 10);
  }
}