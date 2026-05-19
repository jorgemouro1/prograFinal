/*
1. Crear unha interface chamada Entregable cos métodos:
- entregar()
- devolver()
- isEntregado()
- compareTo(Object a) */
public interface Entregable {
  public void entregar();

  public void devolver();

  public boolean isEntregado();

  public int compareTo(Object a);
}