package exemplos;

import java.io.*;

public class ExemploConsola {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Introduce o teu nome: ");
    String nome = br.readLine();
    System.out.print("Introduce a túa idade: ");
    int idade = Integer.parseInt(br.readLine());
    System.out.println("Ola " + nome + ", tes " + idade + " anos.");
  }
}
