// Clase Receita
// Usa composición: contén varios Ingredientes e Instrucións
import java.util.ArrayList;

class Receita {
    private String nome;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Instrucion> instrucions;

    public Receita(String nome) {
        this.nome = nome;
        this.ingredientes = new ArrayList<>();
        this.instrucions = new ArrayList<>();
    }

    // Engadir un ingrediente
    public void engadirIngrediente(Ingrediente i) {
        ingredientes.add(i);
    }

    // Engadir unha instrución
    public void engadirInstrucion(Instrucion i) {
        instrucions.add(i);
    }

    // Mostrar a receita completa
    public void mostrarReceita() {
        System.out.println("=== Receita: " + nome + " ===");
        System.out.println("Ingredientes:");
        for (Ingrediente i : ingredientes) {
            System.out.println(" - " + i);
        }

        if (!instrucions.isEmpty()) {
            System.out.println("\nInstrucións:");
            for (Instrucion ins : instrucions) {
                System.out.println(ins);
            }
        }
    }
}
