package exercicios.primeiro;

import java.io.File;
import java.util.Scanner;

public class AppFicheiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pedimos directorio de partida e creamos un file
        System.out.print("Escribe o nome do directorio: ");
        String nomeDir = sc.nextLine();
        File varArchivo = new File(nomeDir);

        boolean finalizarMenu = false;
        // se o atopa pon o menu
        if (varArchivo.isDirectory()) {
            while (!finalizarMenu) {
                System.out.println("1. Listar contido");
                System.out.println("2. Crear novo directorio");
                System.out.println("3. Borrar directorio");
                System.out.println("4. Renomear o directorio");
                System.out.println("5. Introducir unha nova ruta a un directorio");
                System.out.println("0. Saír");
                System.out.print("Introduce unha opción: ");

                int opcion = sc.nextInt();

                switch (opcion) {
                    case 0:
                        System.out.println("Saíndo...");
                        finalizarMenu = true;
                        break;

                    case 1:
                        // contamos os archivos
                        int contadorArchivos = 0;

                        File[] lista = varArchivo.listFiles();
                        System.out.println("----- Ficheiros no directorio -----");
                        for (int i = 0; i < lista.length; i++) {
                            if (lista[i].isFile()) {
                                contadorArchivos++;
                            }
                        }
                        // mostramos info
                        System.out.println("Número de archivos: " + contadorArchivos);
                        for (int i = 0; i < lista.length; i++) {
                            if (lista[i].isFile()) {
                                System.out.println(lista[i] + " tamaño: " + lista[i].length() + " ");
                            }
                        }

                        int contadorDirectorios = 0;

                        // contar carpetas
                        System.out.println("----- Carpetas no directorio -----");
                        for (int i = 0; i < lista.length; i++) {
                            if (lista[i].isDirectory()) {
                                contadorDirectorios++;
                            }
                        }
                        // mostramos info
                        System.out.println("Número de carpetas: " + contadorDirectorios);
                        for (int i = 0; i < lista.length; i++) {
                            if (lista[i].isDirectory()) {
                                System.out.println(lista[i]);
                            }
                        }
                        break;

                    case 2:
                        sc.nextLine();
                        // pasamos o nome e creamos
                        System.out.print("Introduce o nome do novo directorio: ");
                        String novoDir = sc.nextLine();

                        boolean exito = (new File(novoDir)).mkdir();
                        if (exito) {
                            System.out.println("Creouse o directorio " + novoDir);
                        } else {
                            System.out.println("Non se puido crear o devandito directorio");
                        }
                        break;
                    case 3:
                        // se está vacío bórrase senon non
                        if (varArchivo.delete()) {
                            System.out.println(varArchivo + " foi borrado");
                        } else {
                            System.out.println("Non se puido borrar, ten cousas dentro");
                        }
                        break;

                    case 4:
                        sc.nextLine();
                        // o usuario pasa o novo nome e renomea
                        System.out.print("Escribe o novo nome do directorio: ");
                        String novoNome = sc.nextLine();
                        File varArchivoNovo = new File(novoNome);

                        boolean exitoRename = varArchivo.renameTo(varArchivoNovo);
                        if (exitoRename) {
                            System.out.println("O nome do directorio foi cambiado");
                            varArchivo = varArchivoNovo;
                        } else {
                            System.out.println("Non se puido cambiar o nome");
                        }
                        break;

                    case 5:
                        // metemos o nome, e na variable de antes metemos o cambio
                        sc.nextLine();
                        System.out.print("Escribe o nome do directorio ao que queres cambiar: ");
                        String directorioCambio = sc.nextLine();
                        varArchivo = new File(directorioCambio);

                        break;
                    default:
                        System.out.println("Mete un valor correcto");
                        break;

                }
            }
        } else {
            // se non é un directorio, xa sale
            System.out.println("Non se atopa o directorio");
        }

        sc.close();
    }
}
