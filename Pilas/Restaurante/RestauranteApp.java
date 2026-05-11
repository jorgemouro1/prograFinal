package Pilas.Restaurante;

import java.util.Stack;
import java.util.Scanner;

public class RestauranteApp {
  public static void main(String[] args) {
    // creamos pila
    Stack<Prato> pratos = new Stack<>();
    // scanner
    Scanner sc = new Scanner(System.in);
    boolean acabarMenu = false;
    int opcionMenu = 0;

    // menu
    while (!acabarMenu) {
      System.out.println("--------------------------------------------------------------------------");
      System.out.println("1. Engadir un prato sucio á pila.");
      System.out.println("2. Lavar o prato máis recente e mostrar datos.");
      System.out.println("3. Mostrar todos os pratos sucios da pila, do máis recente ao máis antigo.");
      System.out.println("0. Saír.");
      System.out.print("Introduce unha opción: ");
      opcionMenu = sc.nextInt();

      switch (opcionMenu) {
        case 1:
          // pedimos o id
          System.out.print("Introduce o ID do novo pratillo: ");
          int idPratillo = sc.nextInt();
          sc.nextLine();

          // pedimos o tipo
          System.out.print("Introduce o tipo do novo pratillo: ");
          String tipoPratillo = sc.nextLine();

          // creamos o obxecto co que metiu o usuario
          Prato pr1 = new Prato(idPratillo, tipoPratillo);
          // metemos o obxecto na pila
          pratos.push(pr1);
          break;
        case 2:
          // comprobar que non esté baldeiro
          if (pratos.empty()) {
            System.out.println("Non tes pratos para lavar.");
          } else {
            // se non está baldeiro saca o primeiro e mostra
            System.out.println(pratos.pop());
          }
          break;
        case 3:
          // se está baldeiro non mostra
          if (pratos.empty()) {
            System.out.println("Non tes pratos para mostrar.");
          } else {
            Prato.mostrarPililla(pratos);
          }
          break;
        case 0:
          System.out.println("Saíndo...");
          acabarMenu = true;
          break;

        default:
          System.out.println("Introduce un valor normal");
          break;
      }
    }

    sc.close();
  }
}
