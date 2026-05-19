public class AppFestas {
  public static void main(String[] args) {
    Festa f1 = new FestaGastronomica("boqueison", 5, "chiguaguas", 15000);
    Festa f2 = new FestaGastronomica("santa comba", 15, "tortilla", 50000);
    Festa f3 = new Festival("peregrina", 19, "panorama", false);
    Festa f4 = new Festival("saboi", 25, "chocolate", true);

    Festa[] festillas = { f1, f2, f3, f4 };

    for (int i = 0; i < festillas.length; i++) {
      festillas[i].mostrarDatos();
    }
    Festival.mostrarNumFestivais();
  }
}
