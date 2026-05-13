package exemplos;

import java.io.*;

public class VerDir {
  public static void main(String[] args) {
    String dir = ".";
    File f = new File(dir); // Creamos o File que representa ao directorio
    String[] archivos = f.list(); // Lístase o directorio
    System.out.printf("Ficheros en el directorio actual: %d %n",
        archivos.length);
    for (int i = 0; i < archivos.length; i++) {
      File f2 = new File(f, archivos[i]); // Créase un File por cada ficheiro ou directorio interior
      System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b %n", archivos[i], f2.isFile(),
          f2.isDirectory());
    }
  }
}
