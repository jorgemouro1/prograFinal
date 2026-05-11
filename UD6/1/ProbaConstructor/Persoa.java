// Clase contedora que ten un Enderezo como atributo
class Persoa {
  private String nome;
  private Enderezo enderezo;

  public Persoa(String nome, Enderezo enderezo) {
    this.nome = nome;
    // Aquí é onde evitamos compartir a referencia: usamos un
    this.enderezo = new Enderezo(enderezo);
  }

  public void setEnderezoRúa(String rúa) {
    enderezo.setRúa(rúa);
  }

  public String getEnderezo() {
    return enderezo.toString();
  }

  public String getNome() {
    return nome;
  }
}