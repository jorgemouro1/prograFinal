import java.io.*;

public class EscribirFichTextoFOS {
  public static void main(String[] args) throws IOException {
    File fichero = new File("FichTexto2.txt"); // declara ficheiro
    // Crear fluxo de saída con UTF-8
    BufferedWriter fic = new BufferedWriter(
        new OutputStreamWriter(new FileOutputStream(fichero), "UTF8"));
    String cadena = "Esto é unha proba con FileWriter";
    char[] cad = cadena.toCharArray(); // converte un String en array de caracteres
    for (int i = 0; i < cad.length; i++)
      fic.write(cad[i]); // escribe cada carácter
    fic.append('*'); // engadir un *
    fic.write(cad); // escribir array de caracteres
    String c = "\n*esto é o ultimo*";
    fic.write(c); // escribir un String
    String prov[] = { "Albacete", "Avila", "Badajoz",
        "Cáceres", "Huelva", "Jaén",
        "Madrid", "Segovia", "Soria", "Toledo",
        "Valladolid", "Zamora" };
    fic.write("\n");
    for (int i = 0; i < prov.length; i++) {
      fic.write(prov[i]);
      fic.write("\n");
    }
    fic.close(); // pechar ficheiro
  }
}
