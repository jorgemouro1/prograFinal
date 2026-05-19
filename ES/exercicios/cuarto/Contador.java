/*
Crear un programa que conte o número de liñas e caracteres que se atopan nun ficheiro de
texto. O nome do ficheiro pasarase por teclado. Crearase outro ficheiro de texto cuxo nome 
tamén se lle pide ao usuario, que almacenará a información acerca dos cálculos que fixo o programa.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o nome do ficheiro que queres contar: ");
    String nomeArchivo = sc.nextLine();
    // creamos o archivo 1, que vai ser de onde imos contar
    File f1 = new File(nomeArchivo);
    System.out.print("Introduce o nome do ficheiro para crear: ");
    String nomeNovo = sc.nextLine();
    // creamos a direccion do 2 q é onde imos meter os datos
    File f2 = new File(nomeNovo);

    // contadores
    int contadorLineas = 0;
    int numCaracteres = 0;

    try {
      BufferedReader br = new BufferedReader(new FileReader(f1));
      PrintWriter pw = new PrintWriter(f2);

      String linea;
      while ((linea = br.readLine()) != null) {
        // por cada volta, conta as liñas e de cada liña conta a lonxitude q ven sendo
        // os caracteres
        contadorLineas++;
        numCaracteres += linea.length();
      }
      // e despois mete os datos no outro arquivo 👌
      pw.println("Num liñas: " + contadorLineas + "👌");
      pw.println("Num caracteres: " + numCaracteres + "👌");

      // pechamos
      br.close();
      pw.close();

    } catch (IOException e) {
      System.out.println("Erro de entrada e saída");
    }
    sc.close();
  }
}
