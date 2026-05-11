public class ExemploConstrutor {
  public static void main(String[] args) {
    Enderezo e1 = new Enderezo("Rúa Principal 123", "Santiago");
    Persoa p1 = new Persoa("Ana", e1);
    // Modificamos o enderezo orixinal
    e1.setRúa("Rúa Secundaria 456");
    // Comprobamos que o enderezo da persoa non se modificou
    System.out.println("Enderezo orixinal: " + e1);
    System.out.println("Enderezo da persoa: " + p1.getEnderezo());
  }
}