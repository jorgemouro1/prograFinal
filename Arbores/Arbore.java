package Arbores;

// Clase Árbore
public class Arbore {
  Nodo raiz;

  Arbore(int v) {
    raiz = new Nodo(v);
  }

  Arbore() {
    raiz = null;
  }

  // Percorrido en-orde (esquerda → raíz → dereita)
  void inOrden(Nodo n) {
    if (n != null) {
      inOrden(n.esquerdo);
      System.out.print(n.valor + " ");
      inOrden(n.dereito);
    }
  }

  public static void main(String[] args) {
    Arbore ar = new Arbore();

    // Crear manualmente a árbore
    ar.raiz = new Nodo(1);
    ar.raiz.esquerdo = new Nodo(2);
    ar.raiz.dereito = new Nodo(3);
    ar.raiz.esquerdo.esquerdo = new Nodo(4);
    ar.raiz.esquerdo.dereito = new Nodo(5);
    // Percorrido
    System.out.print("In-orde: ");
    ar.inOrden(ar.raiz); // saída: 4 2 5 1 3
  }
}