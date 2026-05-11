package Pilas;

import java.util.Stack;

public class DemoPila {
  public static void main(String[] args) {
    Stack<String> pila = new Stack<>();
    System.out.println(" Engadimos A");
    pila.push("A");
    mostrarPila(pila);
    System.out.println(" Engadimos B");
    pila.push("B");
    mostrarPila(pila);
    System.out.println(" Engadimos C");
    pila.push("C");
    mostrarPila(pila);
    System.out.println(" Quitamos un elemento (pop)");
    pila.pop();
    mostrarPila(pila);
    System.out.println(" Quitamos outro elemento (pop)");
    pila.pop();
    mostrarPila(pila);
  }

  // Método auxiliar para debuxar a pila
  private static void mostrarPila(Stack<String> pila) {
    System.out.println("PILA:");
    for (int i = pila.size() - 1; i >= 0; i--) {
      System.out.println("│ " + pila.get(i) + " │");
    }
    System.out.println("└───┘\n");
  }
}
