package Mapas;

import java.util.HashMap;
import java.util.Map;

public class ProbaMapa {
  public static void main(String[] args) {
    // Creamos un mapa de DNI → salario
    Map<String, Double> salarios = new HashMap<>();
    salarios.put("12345678A", 2000.57);
    salarios.put("12121212B", 1950.45);
    salarios.put("23232323C", 1750.30);
    salarios.put("12334343D", 2012.90);
    // Imprimimos directamente (forma compacta)
    System.out.println("Mapa completo: " + salarios);
    // Recorremos o mapa con Map.Entry (forma máis lexible)
    System.out.println("\nListado detallado de salarios:");
    for (Map.Entry<String, Double> entrada : salarios.entrySet()) {
      String dni = entrada.getKey(); // a clave (DNI)
      Double soldo = entrada.getValue(); // o valor (salario)
      System.out.println("DNI: " + dni + " -> Salario: " + soldo);
    }
  }
}