package Conxuntos.Pelicula;

import java.util.HashSet;
import java.util.Objects;

public class Pelicula {
  private String titulo;
  private int ano;

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public Pelicula(String titulo, int ano) {
    this.titulo = titulo;
    this.ano = ano;
  }

  @Override
  public String toString() {
    return "Titulo: " + this.titulo + ", ano: " + this.ano;
  }

  @Override
  public int hashCode() {
    return Objects.hash(titulo, ano);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Pelicula)) {
      return false;
    }
    Pelicula p = (Pelicula) o;
    return ano == p.ano && Objects.equals(titulo, p.titulo);

  }

  public static void main(String[] args) {
    HashSet<Pelicula> peliculas1 = new HashSet<>();
    HashSet<Pelicula> peliculas2 = new HashSet<>();
    HashSet<Pelicula> soloPeliculas1 = new HashSet<>();
    HashSet<Pelicula> soloPeliculas2 = new HashSet<>();

    // peliculas de jorge normal
    Pelicula p1 = new Pelicula("La vida de Gosendo", 67);
    Pelicula p2 = new Pelicula("Entono el mea culpa", 2007);

    // peliculas de jorgue feigo
    Pelicula p3 = new Pelicula("SMR", 2003);
    Pelicula p4 = new Pelicula("El bombardeo de Sar", 2026);

    // añadimos ao conxunto
    peliculas1.add(p1);
    peliculas1.add(p2);

    peliculas2.add(p1);
    peliculas2.add(p3);
    peliculas2.add(p4);

    // mostramos os conxuntos
    System.out.println("Conxunto 1: " + peliculas1);
    System.out.println("Conxunto 2: " + peliculas2);

    // intersección. metemos solamente os comuns
    HashSet<Pelicula> interseccionPelis = new HashSet<>(peliculas1);
    interseccionPelis.retainAll(peliculas2);
    System.out.println("Intersección: " + interseccionPelis);

    // union. recorremos os 2 conxuntos e imos engadindo todo
    HashSet<Pelicula> unionPelis = new HashSet<>(peliculas1);
    unionPelis.addAll(peliculas2);
    System.out.println("Unión: " + unionPelis);

    // diferencia. imos mirando un conxunto, se o outro non conten esa peli,
    // engadimos esa mesma peli a outro conxunto distinto. tamen se pode facer con
    // removeall
    for (Pelicula peli : peliculas1) {
      if (!(peliculas2.contains(peli))) {
        soloPeliculas1.add(peli);
      }
    }
    for (Pelicula peli : peliculas2) {
      if (!(peliculas1.contains(peli))) {
        soloPeliculas2.add(peli);
      }
    }
    System.out.println("Películas solo do 1: " + soloPeliculas1);
    System.out.println("Películas solo do 2: " + soloPeliculas2);

  };
}
