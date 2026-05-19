import java.io.*;

public class EscribirFichTextoPW {
  public static void main(String[] args) throws IOException {
    File fichero = new File("FichTexto3.txt");
    // PrintWriter con FileWriter
    PrintWriter pw = new PrintWriter(new FileWriter(fichero));
    String cadena = "Esto é unha proba con PrintWriter y FileWriter";
    pw.print(cadena); // escribir string
    pw.println('*'); // engadir *
    pw.println(cadena);
    String prov[] = { "Albacete", "Avila", "Badajoz",
        "Cáceres", "Huelva", "Jaén",
        "Madrid", "Segovia", "Soria", "Toledo",
        "Valladolid", "Zamora" };
    for (String p : prov) {
      pw.println(p);
    }
    pw.close();
  }
}
