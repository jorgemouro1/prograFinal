package Colas.Supermarket;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AppSupermercado {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean meterdatos = true;
    int opcion = 0;
    // creo a cola
    Queue<Cliente> clientillos = new LinkedList<>();

    // menu
    while (meterdatos) {
      System.out.println("---------- Benvido ao supermercado Copito ----------");
      System.out.println("1. Engadir cliente.");
      System.out.println("2. Atender cliente.");
      System.out.println("3. Amosar cola.");
      System.out.println("0. Saír do programa.");
      System.out.println("----------------------------------------------------");
      System.out.print("Introduce unha opción: ");
      opcion = sc.nextInt();

      switch (opcion) {
        case 1:
          // metemos o id
          System.out.print("Introduce o ID do novo cliente: ");
          int idUsuario = sc.nextInt();
          sc.nextLine();

          // metemos o nome
          System.out.print("Introduce o nome do novo cliente: ");
          String nomeUsuario = sc.nextLine();

          // creamos obxecto e añadimos
          Cliente c1 = new Cliente(nomeUsuario, idUsuario);
          clientillos.add(c1);
          break;

        case 2:
          sc.nextLine();
          // mostramos o primeiro elemento e sacámolo da cola
          if (clientillos.isEmpty()) {
            System.out.println("A cola está baldeira");
          } else {
            System.out.println("O primeiro da cola é " + clientillos.poll() + " retirando...");
          }
          break;
        case 3:
          sc.nextLine();
          // imos mostrando cada elemento
          if (clientillos.isEmpty()) {
            System.out.println("A cola está baldeira");
          } else {
            for (Cliente clientillo : clientillos) {
              System.out.println(clientillo.toString());
            }
          }
          break;
        case 0:
          sc.nextLine();
          meterdatos = false;
          break;

        default:
          System.out.println("Mete un número coma é debido");
          break;
      }
    }
    sc.close();
  }
}
