package Colas;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploCola {
  public static void main(String[] args) {
    Queue<String> cola = new LinkedList<>();
    // Engadir elementos
    cola.add("A");
    cola.add("B");
    cola.offer("C");
    System.out.println("Cola: " + cola);
    // Consultar primeiro (sen retirar)
    System.out.println("Primeiro (peek): " + cola.peek());
    // Retirar elementos
    System.out.println("Retirado (poll): " + cola.poll());
    System.out.println("Cola despois: " + cola);
    // Retirar outro
    System.out.println("Retirado (remove): " + cola.remove());
    System.out.println("Cola final: " + cola);
  }
}