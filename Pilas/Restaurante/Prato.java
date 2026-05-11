package Pilas.Restaurante;

import java.util.Stack;

public class Prato {
  private int ID;
  private String tipo;

  public Prato(int iD, String tipo) {
    ID = iD;
    this.tipo = tipo;
  }

  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    ID = iD;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String toString() {
    String cadeaToString = "ID: " + this.getID() + " Tipo: " + this.getTipo();
    return cadeaToString;
  }

  public static void mostrarPililla(Stack<Prato> pila) {
    for (int i = pila.size() - 1; i >= 0; i--) {
      System.out.println("│ " + pila.get(i) + " │");
    }
    System.out.println("\n");
  }
}
