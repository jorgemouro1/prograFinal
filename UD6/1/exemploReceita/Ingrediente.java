// Clase Ingrediente
// Representa un ingrediente con nome, cantidade e unidade
class Ingrediente {
    private String nome;
    private double cantidade;
    private String unidade;

    public Ingrediente(String nome, double cantidade, String unidade) {
        this.nome = nome;
        this.cantidade = cantidade;
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public double getCantidade() {
        return cantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    @Override
    public String toString() {
        return cantidade + " " + unidade + " de " + nome;
    }
}
