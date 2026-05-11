// Clase principal: probas
public class Main {
    public static void main(String[] args) {
        // Creamos unha receita
        Receita receita = new Receita("Tortilla de patacas");

        // Engadimos ingredientes
        receita.engadirIngrediente(new Ingrediente("Ovos", 4, "unidades"));
        receita.engadirIngrediente(new Ingrediente("Patacas", 500, "gramos"));
        receita.engadirIngrediente(new Ingrediente("Aceite de oliva", 50, "mililitros"));
        receita.engadirIngrediente(new Ingrediente("Sal", 5, "gramos"));

        // Engadimos instrucións
        receita.engadirInstrucion(new Instrucion(1, "Pelar e cortar as patacas en láminas finas."));
        receita.engadirInstrucion(new Instrucion(2, "Fritir as patacas ata que estean brandas."));
        receita.engadirInstrucion(new Instrucion(3, "Bater os ovos e mesturar coas patacas."));
        receita.engadirInstrucion(new Instrucion(4, "Cociñar a mestura na tixola ata dourar por ambos lados."));

        // Amosamos a receita completa
        receita.mostrarReceita();
    }
}
