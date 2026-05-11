package Figura;

import java.util.Arrays;

public class AppFigura {
  public static void main(String[] args) {
    // creamos triangulos
    Figura t1 = new Triangulo(5, 4);
    t1.setArea(t1.calcularArea());
    t1.setCor("vermello 👌");

    Figura t2 = new Triangulo(10, 5);
    t2.setArea(t2.calcularArea());
    t2.setCor("azul 👌");

    Figura t3 = new Triangulo(7, 6);
    t3.setArea(t3.calcularArea());
    t3.setCor("verde 👌");

    // creamos cadrados
    Figura c1 = new Cadrado(5);
    c1.setArea(c1.calcularArea());
    c1.setCor("branco👌");

    Figura c2 = new Cadrado(6);
    c2.setArea(c2.calcularArea());
    c2.setCor("verde👌");

    Figura c3 = new Cadrado(7);
    c3.setArea(c3.calcularArea());
    c3.setCor("marron👌");

    // creamos circulos
    Figura ci1 = new Circulo(5);
    ci1.setArea(ci1.calcularArea());
    ci1.setCor("azul😢");

    Figura ci2 = new Circulo(1);
    ci2.setArea(ci2.calcularArea());
    ci2.setCor("vermello👍");

    Figura ci3 = new Circulo(10);
    ci3.setArea(ci3.calcularArea());
    ci3.setCor("amarelo👌");

    // meto todo no array
    Figura[] figuras = { t1, t2, t3, c1, c2, c3, ci1, ci2, ci3 };

    // mostramos o array tal e como o metemos
    System.out.println("----------------------");
    System.out.println("Array desordenado:");
    System.out.println("----------------------");

    for (int i = 0; i < figuras.length; i++) {
      System.out.println(figuras[i]);
    }

    // ahora ordenamos, como fixemos o compareto na clase figura xa o sort o chama e
    // se ocupa de ver como ordenalos
    Arrays.sort(figuras);
    System.out.println("----------------------");
    System.out.println("Array ordenado por área");
    System.out.println("----------------------");

    // volvemos a mostrar e vemos que están ordenados
    for (int i = 0; i < figuras.length; i++) {
      System.out.println(figuras[i]);
    }

    System.out.println("----------------------");
    System.out.println("Cambiamos a cor a negro aos que teñen área > 4, e xa de paso mostramos");
    System.out.println("----------------------");
    for (int i = 0; i < figuras.length; i++) {
      if (figuras[i].getArea() > 4) {
        figuras[i].setCor("negro");
      }
      System.out.println(figuras[i]);
    }
  }
}
