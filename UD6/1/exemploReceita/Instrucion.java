// Clase Instrucion (opcional)
// Representa un paso da preparación da receita
class Instrucion {
    private int paso;
    private String descricion;

    public Instrucion(int paso, String descricion) {
        this.paso = paso;
        this.descricion = descricion;
    }

    @Override
    public String toString() {
        return "Paso " + paso + ": " + descricion;
    }
}

