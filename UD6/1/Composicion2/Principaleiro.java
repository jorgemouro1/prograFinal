package Composicion2;

public class Principaleiro {
  public static void main(String[] args) {
    // creamos a tenda e os productos
    Tenda t1 = new Tenda("A tenda de gosendo");

    Produto p1 = new Produto("Becerro", 10000, 5);
    Produto p2 = new Produto("Anso", 1500, 7);
    Produto p3 = new Produto("Gosendus", 15, 15);
    Produto p4 = new Produto("Gasanda", 5000, 19);
    Produto p5 = new Produto("Gisendo", 16, 2);

    // engadimos os productos a tenda
    t1.engadirProduto(p1);
    t1.engadirProduto(p2);
    t1.engadirProduto(p3);
    t1.engadirProduto(p4);
    t1.engadirProduto(p5);

    // mostrar os producto
    t1.mostrarTenda();

    // calcular valor de stock
    System.out.println("Prezo de stock: " + t1.valorStock());

  }
}
