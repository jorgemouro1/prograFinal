import java.io.*;

public class EscribirFichTextoFW {
  public static void main(String[] args) throws IOException {
    File fichero = new File("FichTexto.txt");// declara ficheiro
    FileWriter fic = new FileWriter(fichero); // crear o fluxo de saída
    String cadena = "Esto é unha proba con FileWriter";
    char[] cad = cadena.toCharArray();// convirte un String en array de caracteres
    for (int i = 0; i < cad.length; i++)
      fic.write(cad[i]); // Vaise escribindo un carácter
    fic.append('*'); // engado ao final un *
    fic.write(cad);// escribir un array de caracteres
    String c = "\n*esto é o ultimo*";
    fic.write(c);// escribir un String

    String prov[] = { "Albacete", "Avila", "Badajoz",
        "Cáceres", "Huelva", "Jaén",
        "Madrid", "Segovia", "Soria", "Toledo",
        "Valladolid", "Zamora" };

    fic.write("\n");
    for (int i = 0; i < prov.length; i++) {
      fic.write(prov[i]);
      fic.write("\n");
    }

    fic.close(); // pechar fichero

  }
}