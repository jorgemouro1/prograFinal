package Conxuntos;

import java.util.HashSet;

public class OrdeSet {
  public static void main(String[] args) {
    boolean inserido;
    HashSet<String> conxunto = new HashSet<>();
    conxunto.add("Manuel");
    conxunto.add("Ana");
    conxunto.add("Diego");
    for (String valor : conxunto) {
      System.out.println(valor);
    }
    // Intentamos inserir un nome que xa existe no conxunto
    inserido = conxunto.add("Manuel");
    if (!inserido) {
      System.out.println("Non se inseriu o nome.");
    }
    System.out.println(conxunto);
  }
}