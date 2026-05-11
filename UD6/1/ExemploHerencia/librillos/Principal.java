package ExemploHerencia.librillos;

public class Principal {
  public static void main(String[] args) {
    Libro meuLibro = new Libro();
    System.out.println(meuLibro.nomeAutor = "Frederick Forsyth");
    System.out.println(meuLibro.titulo = "El manifiesto negro");
    System.out.println(meuLibro.editorial = "Circulo de lectores");
    System.out.println(meuLibro.tipoPortada = "Dura");
    meuLibro.numeroDePaxinas = 575;
  }
}
