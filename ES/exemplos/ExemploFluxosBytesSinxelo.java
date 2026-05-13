package exemplos;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ExemploFluxosBytesSinxelo {
  public static void main(String[] args) throws IOException {
    // Datos orixinais en bytes (cadea "Ola")
    byte[] datos = "Ola".getBytes();
    // Creamos un fluxo de entrada desde o array de bytes
    ByteArrayInputStream entrada = new ByteArrayInputStream(datos);
    // Creamos un fluxo de saída en memoria para copiar os datos
    ByteArrayOutputStream saida = new ByteArrayOutputStream();
    int i = entrada.read(); // Lemos un byte
    while (i != -1) { // mentres non sexa fin do fluxo
      saida.write(i); // Escribimos o byte no fluxo de saída
      i = entrada.read(); // Lemos o seguinte byte
    }
    // Convertimos o resultado a String e imprimimos
    System.out.println(saida.toString()); // Saída: Ola
  }
}
