package Restaurantes;

public class ProbaRestaurantes {
  public static void main(String[] args) {
    Pizzeria p1 = new Pizzeria(15);
    Hamburgueseria h1 = new Hamburgueseria(6);
    Kebab k1 = new Kebab(7);

    String pedidoPiza = "Piza grande con champiñon e gosendo";
    p1.prepararPedido(pedidoPiza);
    System.out.println("Prezo da pisa: " + p1.calcularPrezo(pedidoPiza));

    System.out.println("-------------------------");

    String pedidoKebab = "Kebab con extra de salsa e carne de burro";
    k1.prepararPedido(pedidoKebab);
    System.out.println("Prezo do kebab: " + k1.calcularPrezo(pedidoKebab));

    System.out.println("-------------------------");

    String pedidoHamburguesa = "güoper choper con queixo";
    h1.prepararPedido(pedidoHamburguesa);
    System.out.println("Prezo da hamburguesa: " + h1.calcularPrezo(pedidoHamburguesa));

  }
}
