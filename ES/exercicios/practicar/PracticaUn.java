
import java.io.File;
import java.util.Scanner;

public class PracticaUn {
    public static void main(String[] args) {
        boolean sairMenu = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe o nome do directorio co que queres traballar: ");

        String nomeDir = sc.nextLine();
        File f1 = new File(nomeDir);
        int contadorDirec = 0;
        int contadorFile = 0;

        if (f1.isDirectory()) {
            while (!sairMenu) {
                System.out.println("1. Listar contido do devandito directorio");
                System.out.println("2. Crear un directorio novo");
                System.out.println("3. Borrar o devandito directorio");
                System.out.println("4. Renomear o devandito directorio");
                System.out.println("5. Viaxar a outro directorio (devandito)");
                System.out.println("0. Saír");

                System.out.print("Elixe unha opción: ");
                int opcion = sc.nextInt();
                /*
                 * 
                 *  Listar contido: deberá listar o contido do directorio. Por un lado
                 * listaranse os arquivos,
                 * para elo indicarase o número total de arquivos, o nome e tamaño de cada un.
                 * Por outro
                 * lado listaranse os directorios, de maneira que se indique o número total de
                 * directorios e
                 * o nome de cada un deles.
                 */
                switch (opcion) {
                    case 1:
                        File[] listilla = f1.listFiles();
                        System.out.println("Directorios: ");

                        contadorDirec = 0;
                        for (File archivillo : listilla) {
                            if (archivillo.isDirectory()) {
                                contadorDirec++;
                            }
                        }

                        System.out.println("Número total: " + contadorDirec);
                        for (File archivillo : listilla) {

                            if (archivillo.isDirectory()) {
                                System.out.println(archivillo);
                            }
                        }

                        System.out.println("Files: ");

                        contadorFile = 0;
                        for (File archivillo : listilla) {
                            if (archivillo.isFile()) {
                                contadorFile++;
                            }
                        }
                        System.out.println("Número total: " + contadorFile);

                        System.out.println("Archivos: ");
                        for (File archivillo : listilla) {
                            if (archivillo.isFile()) {
                                System.out.println(archivillo + ", tamaño: " + archivillo.length());
                            }
                        }
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("Introduce o nome do novo directorio: ");
                        String novoDir = sc.nextLine();
                        File fn = new File(novoDir);

                        if (fn.mkdir()) {
                            System.out.println("Éxito 👌");
                        } else {
                            System.out.println("Non se puido crear");
                        }
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.print("É fiso 👌 que queres borrar o devandito directorio? (S/N): ");
                        String asegurar = sc.nextLine();
                        if (asegurar.equalsIgnoreCase("s")) {
                            if (f1.delete()) {
                                System.out.println("Directorio borrado con éxito, pechando programa 👌");
                                sairMenu = true;
                            } else {
                                System.out.println("Non se pode borrar, ten cousas dentro");
                            }
                        } else {
                            System.out.println("Moi bom, non o borramos logo 👌");
                        }
                        break;
                    case 4:
                        sc.nextLine();
                        System.out.print("Escribe o nome novo deste directorio: ");
                        String novoNome = sc.nextLine();
                        File novoFile = new File(novoNome);

                        if (f1.renameTo(novoFile)) {
                            System.out.println("Éxito 👌");
                            f1 = novoFile;
                        } else {
                            System.out.println("Non se puido renomear🤞");
                        }
                        break;
                    case 5:
                        sc.nextLine();
                        System.out.print("Escribe o nome do directorio ao que queiras viaxar: ");
                        String novaRuta = sc.nextLine();
                        File f2 = new File(novaRuta);

                        if (f2.isDirectory()) {
                            f1 = f2;
                        } else {
                            System.out.println("Non se puido atopar o devandito directorio");
                        }
                        break;
                    case 0:
                        System.out.println("Saíndo do programa, adeus");
                        sairMenu = true;
                        break;

                    default:
                        break;
                }
            }
        } else {
            System.out.println("Non se atopou o devandito directorio");
        }
        sc.close();
    }
}
