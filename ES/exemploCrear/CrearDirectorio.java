package exemploCrear;

import java.io.File;

public class CrearDirectorio {
  public static void main(String[] args) {
    try {
      // Declaración de variables
      String directorio = "micarpeta";
      // Ver directorio de traballo
      System.out.println("Directorio de traballo: " +
          System.getProperty("user.dir"));

      // Crear un subdirectorio micarpeta dentro del directorio donde
      // está el archivo .java
      boolean exito = ((new File(directorio)).mkdir());
      if (exito) {
        System.out.println("Directorio: " + directorio + "creado");
      }

    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}