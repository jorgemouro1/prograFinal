package Instrumentos;

public class XestionInstrumentos {
  public static void main(String[] args) {
    // creamos os obxectos e poñémoslle nome (a familia ponse sola porq antes no
    // construtor metemos o set)
    Instrumento g1 = new Guitarra();
    g1.setNome("guitarrilla");

    Instrumento p1 = new Piano();
    p1.setNome("pianillo");

    Instrumento f1 = new Flauta();
    f1.setNome("flautilla");

    Instrumento b1 = new Bateria();
    b1.setNome("bacenilla");

    // creamos o array e metemos os obxectos dentro
    Instrumento[] instrumentillos = { g1, p1, f1, b1 };

    System.out.println("-------------------------");

    // recorremos o array e mostramos e tocamos o instrumento
    for (int i = 0; i < instrumentillos.length; i++) {
      instrumentillos[i].mostrarDatos();
      instrumentillos[i].tocar();
    }

    System.out.println("-------------------------");
    // volvemos a recorrelo e imos a cada elemento aplicándolle o seu método propio
    for (int i = 0; i < instrumentillos.length; i++) {
      if (instrumentillos[i] instanceof Guitarra) {
        ((Guitarra) instrumentillos[i]).afinarCorda(3);
      } else if (instrumentillos[i] instanceof Piano) {
        ((Piano) instrumentillos[i]).abrirTapa();
      } else if (instrumentillos[i] instanceof Flauta) {
        ((Flauta) instrumentillos[i]).limpar();
      } else if (instrumentillos[i] instanceof Bateria) {
        ((Bateria) instrumentillos[i]).axustarTambores();
      } else {
        System.out.println("👌");
      }
    }
  }
}
