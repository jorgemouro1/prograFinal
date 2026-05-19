import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopiarCaracteres {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o nome do primeiro ficheiro (imos copiar ese a outro): ");
    String nomeF1 = sc.nextLine();
    File f1 = new File(nomeF1);

    System.out.print("Introduce o nome do segundo ficheiro (a onde queres copiar): ");
    String nomeNovo = sc.nextLine();
    File f2 = new File(nomeNovo);

    try {
      FileReader fr = new FileReader(f1);
      FileWriter fw = new FileWriter(f2);

      int valor;

      while ((valor = fr.read()) != -1) {
        char caracter = (char) valor;
        fw.write(caracter);
      }

      fr.close();
      fw.close();
    } catch (IOException e) {
      System.out.println("imposível");
    }

    sc.close();
  }
}
