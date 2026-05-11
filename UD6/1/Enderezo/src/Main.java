public class Main {
  public static void main(String[] args) {
    Enderezo e = new Enderezo("Rúa Maior, 1", "Santiago");
    Persoa p = new Persoa("Ana", e);
    // --- Usando copia ---
    Enderezo copiaEnderezo = p.obterEnderezoCopia();
    copiaEnderezo.setRua("Outra Rúa, 5");
    System.out.println("Copia modificada: " + copiaEnderezo.getRua());
    // Outra Rúa, 5
    System.out.println("Enderezo da persoa: " +
        p.obterEnderezoCopia().getRua()); // Rúa Maior, 1 (segue igual)
    // --- Usando referencia directa ---
    Enderezo referenciaEnderezo = p.obterEnderezoDirecto();
    referenciaEnderezo.setRua("Rúa Cambiada, 10");
    System.out.println("Referencia modificada: " +
        referenciaEnderezo.getRua()); // Rúa Cambiada, 10
    System.out.println("Enderezo da persoa: " +
        p.obterEnderezoDirecto().getRua()); // Rúa Cambiada, 10 (modificado!)
  }
}