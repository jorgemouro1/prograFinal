package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploDeque {
  public static void main(String[] args) {
    Deque<String> dq = new ArrayDeque<>();
    // Engadir pola cola (cola normal FIFO)
    dq.addLast("A");
    dq.addLast("B");
    dq.addLast("C");
    System.out.println("Deque despois de addLast: " + dq);
    // Consultar extremos
    System.out.println("Primeiro (peekFirst): " + dq.peekFirst());
    System.out.println("Último (peekLast): " + dq.peekLast());
    // Retirar pola cabeza ( o normal en colas)
    System.out.println("Retirado (pollFirst): " + dq.pollFirst());
    System.out.println("Deque: " + dq);
    // Engadir pola cabeza e retirar pola cola non son propias de colas.
    // Pero con ArrayDeque pódense facer porque vale para FIFO e LIFO.
    // Engadir pola cabeza
    dq.addFirst("X");
    System.out.println("Deque despois de addFirst: " + dq);
    // Retirar pola cola
    System.out.println("Retirado (pollLast): " + dq.pollLast());
    System.out.println("Deque: " + dq);
  }
}
