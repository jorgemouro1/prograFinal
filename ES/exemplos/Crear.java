package exemplos;

import java.io.*;

public class Crear {
    public static void main(String[] args) {
        File d = new File("NUEVODIR"); // directorio que creo a partir do actual
        File f1 = new File(d, "FICHERO1.TXT");
        File f2 = new File(d, "FICHERO2.TXT");
        d.mkdir();// CREAR DIRECTORIO
        try {
            if (f1.createNewFile())
                System.out.println("FICHEIRO1 creado correctamente...");
            else
                System.out.println("Non se puido crear FICHERO1...");
            if (f2.createNewFile())
                System.out.println("FICHEIRO2 creado correctamente...");
            else
                System.out.println("Non se puido crear FICHERO2...");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        f1.renameTo(new File(d, "FICHERO1NUEVO"));// renombro FICHERO1
        try {
            File f3 = new File("NUEVODIR/FICHERO3.TXT");
            f3.createNewFile();// crea FICHERO3 en NUEVODIR
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        if (f2.delete())
            System.out.println("Ficheiro borrado ... ");
        else
            System.out.println("Non se puido borrar o ficheiro .. . ");
    }
}