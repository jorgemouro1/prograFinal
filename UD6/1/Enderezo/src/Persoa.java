public class Persoa {
  private String nome;
  private Enderezo enderezo; // atributo privado

  public Persoa(String nome, Enderezo enderezo) {
    this.nome = nome;
    this.enderezo = new Enderezo(enderezo.getRua(),
        enderezo.getCidade()); // gardamos copia
  }

  // Devolver unha copia (seguro)
  public Enderezo obterEnderezoCopia() {
    return new Enderezo(enderezo.getRua(), enderezo.getCidade());
  }

  // Devolver a referencia directa (non seguro)
  public Enderezo obterEnderezoDirecto() {
    return enderezo;
  }

  // Método para actualizar o enderezo
  public void actualizarEnderezo(String novaRua, String novaCidade) {
    enderezo.setRua(novaRua);
    enderezo.setCidade(novaCidade);
  }
}
