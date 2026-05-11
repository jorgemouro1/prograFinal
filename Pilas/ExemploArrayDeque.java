package Pilas;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploArrayDeque {
  public static void main(String[] args) {
    Deque<String> pila = new ArrayDeque<>();
    // push() → engadir
    pila.push("A");
    pila.push("B");
    pila.push("C");
    System.out.println("Pila: " + pila);
    // peek() → ver último
    System.out.println("Último elemento (peek): " + pila.peek());
    // pop() → retirar
    System.out.println("Retirado (pop): " + pila.pop());
    System.out.println("Pila despois do pop: " + pila);
    // isEmpty() → comprobar baleira
    System.out.println("Está baleira? " + pila.isEmpty());
  }
}