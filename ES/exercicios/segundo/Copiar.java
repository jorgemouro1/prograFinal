package segundo;
// Crear un programa que copie o contido dun ficheiro de texto noutro ficheiro de texto que

// se creará. Os nomes dos dous ficheiros pediránselle ao usuario.

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Copiar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o nome do primeiro ficheiro (imos copiar ese a outro): ");
    String nomeF1 = sc.nextLine();
    File f1 = new File(nomeF1);

    System.out.print("Introduce o nome do segundo ficheiro (a onde queres copiar): ");
    String nomeNovo = sc.nextLine();
    File f2 = new File(nomeNovo);

    try {
      BufferedReader bf = new BufferedReader(new FileReader(f1));
      PrintWriter pw = new PrintWriter(new FileWriter(f2));

      String linea;
      while ((linea = bf.readLine()) != null) {
        pw.println(linea);
      }
      bf.close();
      pw.close();
    } catch (IOException e) {
      System.out.println("Erro de entrada e saída");
    }

    sc.close();
  }
}
