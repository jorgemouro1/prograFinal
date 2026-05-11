package Herdanza;

/*
 * Crear un programa principal que faga o seguinte:
 *  Crear un obxecto Coche
 *  Asignar valores a todos os atributos (herdados e propios)
 *  Chamar ao método propio (mostrarCoche()) e ao método herdado
 * (mostrarInfo())
 */
public class Principalillo {
  public static void main(String[] args) {
    Coche c1 = new Coche("GosendoCar👌", 2025, 25);
    c1.mostrarCoche();
    c1.mostrarInfo();
  }
}
