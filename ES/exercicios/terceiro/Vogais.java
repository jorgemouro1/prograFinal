//Crear un programa que conte o número de vocais que se atopan nun ficheiro de texto. O
// nome do ficheiro pasarase por teclado.

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Vogais {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe o nome do ficheiro: ");
    String nficheirillo = sc.nextLine();
    // metemos o ficheiro para mirar as vogais
    File f1 = new File(nficheirillo);

    try {
      // creamos o filereader para ler
      FileReader fr = new FileReader(f1);
      // contador para aumentalo cada vez q atope unha vogal
      int contador = 0;

      int valor;
      // vai mirando hasta que non queden valores
      while ((valor = fr.read()) != -1) {
        char caracterillo = (char) valor;
        // paso a minuscula
        char minuscula = Character.toLowerCase(caracterillo);
        // miro se encontra aljunha, nese caso suma o contador
        if (minuscula == 'a' || minuscula == 'e' || minuscula == 'i' || minuscula == 'o' || minuscula == 'u') {
          contador++;
        }
      }
      // pecho o reader
      fr.close();
      // mostro
      System.out.println("Número de vogais en " + nficheirillo + ": " + contador);

    } catch (IOException e) {
      System.out.println("Erro de entrada/saída");
    }
    sc.close();
  }
}
