package Estudante;

import java.util.Arrays;

public class AppEstudante2 {
  public static void main(String[] args) {

    Estudante[] arrayEstudantes = new Estudante[3];
    arrayEstudantes[0] = new Estudante("Eva", 24);
    arrayEstudantes[1] = new Estudante("Xan", 22);
    arrayEstudantes[2] = new Estudante("Miguel", 28);
    Arrays.sort(arrayEstudantes);
    for (Estudante est : arrayEstudantes) {
      System.out.println(est.getNome() + " " + est.getIdade());
    }
  }
}
