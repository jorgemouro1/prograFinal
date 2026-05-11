package Conxuntos;

import java.util.HashSet;
import java.util.Objects;

// Clase Persoa con equals() e hashCode() sobrescritos
class Persoa {
  String nome;
  int idade;

  // Constructor
  Persoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // equals() define cando dúas Persoas se consideran iguais
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true; // mesma referencia → son iguais
    if (!(o instanceof Persoa))
      return false; // diferente tipo → non son iguais
    Persoa p = (Persoa) o;
    // comparando nome e idade para igualdade
    return idade == p.idade && Objects.equals(nome, p.nome);
  }

  // hashCode() xera un valor baseado en nome e idade
  // HashSet usa isto para determinar en que "bucket" almacenar o obxecto
  @Override
  public int hashCode() {
    return Objects.hash(nome, idade);
  }

  @Override
  public String toString() {
    return nome + " (" + idade + ")";
  }
}

public class ExemploPersoaComentarios {
  public static void main(String[] args) {
    HashSet<Persoa> set = new HashSet<>();
    // Creamos tres obxectos
    Persoa p1 = new Persoa("Ana", 25);
    Persoa p2 = new Persoa("Luis", 30);
    Persoa p3 = new Persoa("Ana", 25); // Igual que p1 segundo equals() e hashCode()
    // Engadimos p1 ao HashSet
    set.add(p1); // HashSet calcula hashCode() de p1 e engade no bucket correspondente
    // Engadimos p2 ao HashSet
    set.add(p2); // Diferente hashCode() → engádese noutro bucket
    // Engadimos p3 ao HashSet
    set.add(p3);
    // HashSet calcula hashCode() de p3 → coincide co de p1
    // Chama a equals() para comprobar igualdade → retorna true
    // Como é duplicado, p3 NON se engade ao HashSet
    // Imprimimos o HashSet
    System.out.println("HashSet: " + set);
  }
}
