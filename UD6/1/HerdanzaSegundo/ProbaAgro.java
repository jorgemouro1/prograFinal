public class ProbaAgro {
  public static void main(String[] args) {
    Produtos pNormal = new Produtos("5-2-5025", 15);
    ProdutoConxelado pConx = new ProdutoConxelado("5-10-2050", 20, -5);
    ProdutoFresco pFresco = new ProdutoFresco("21-4-2026", 1, "18-4-2026", "Boqueisón 👌");
    ProdutoRefrixerado pRefrix = new ProdutoRefrixerado("5-5-2026", 16, 92);

    System.out.println("--------------------------");
    pNormal.mostrarInfo();
    System.out.println("--------------------------");
    pConx.mostrarInfo();
    System.out.println("--------------------------");
    pFresco.mostrarInfo();
    System.out.println("--------------------------");
    pRefrix.mostrarInfo();

  }
}
