import java.util.HashSet;
import java.util.ArrayList;

public class Receita {
  private String nome;
  private HashSet<Ingredientes> ingredientillos;
  private ArrayList<Instrucions> instruccioncillas;

  public HashSet<Ingredientes> getIngredientillos() {
    return ingredientillos;
  }

  public void setIngredientillos(HashSet<Ingredientes> ingredientillos) {
    this.ingredientillos = ingredientillos;
  }

  public Receita(String nome, HashSet<Ingredientes> ingredientillos, ArrayList<Instrucions> instrucioncillas) {
    this.nome = nome;
    this.ingredientillos = new HashSet<Ingredientes>();
    this.instruccioncillas = new ArrayList<Instrucions>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Instrucions> getInstruccioncillas() {
    return instruccioncillas;
  }

  public void setInstruccioncillas(ArrayList<Instrucions> instruccioncillas) {
    this.instruccioncillas = instruccioncillas;
  }

  @Override
  public String toString() {
    return "Receita [nome=" + nome + ", ingredientillos=" + ingredientillos + "]";
  }

  public static void main(String[] args) {
    // creamos os exemplos de ingredientes
    Ingredientes cenoria = new Ingredientes("Cenoria", 5, "u");
    Ingredientes cadelo = new Ingredientes("Cadelo", 1, "u");
    Ingredientes saborido = new Ingredientes("Saborido", 10, "g");

    // creamos exemplos de instrucións
    Instrucions paso1 = new Instrucions("1. cortamos a cebola e sazonamos con saborido");
    Instrucions paso2 = new Instrucions("2. amasamos o cadelo e desplumámolo, adobámolo con cebola e saborido");
    Instrucions paso3 = new Instrucions("3. Vai po forno a 5000ºC xa que é un chihuahua de 600 kg");

    // creamos unha coleccion para cada cousa
    HashSet<Ingredientes> i1 = new HashSet<>();
    ArrayList<Instrucions> ins1 = new ArrayList<>();

    // engadimos
    i1.add(cadelo);
    i1.add(cenoria);
    i1.add(saborido);

    ins1.add(paso1);
    ins1.add(paso2);
    ins1.add(paso3);

    // creamos un obxecto da clase receita coas instruccións e os ingredientes
    Receita cadeloOForno = new Receita("Cadelo con saborido asado", i1, ins1);
    // mostramos
    System.out.println("------------------------");
    System.out.println("Nome: " + cadeloOForno.getNome());
    System.out.println("------------------------");
    System.out.println("Ingredientes:");
    for (Ingredientes ingredientillo : i1) {
      System.out.println(ingredientillo);
    }
    System.out.println("------------------------");
    System.out.println("Instrucións:");
    for (Instrucions instrucioncilla : ins1) {
      System.out.println(instrucioncilla);
    }
    System.out.println("------------------------");
  }

}
