package Exercicios.Array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayApp {
  public static void main(String[] args) {
    // creo o array e métolle valores
    int[] arraycillo = { 1, 2, 3, 4 };
    // flag para o while
    boolean meterdatos = false;
    Scanner sc = new Scanner(System.in);
    // bloque try para meter o while
    while (!meterdatos) {
      try {
        System.out.println("Introduce un número enteiro > 0 e < 4");
        int posicion = sc.nextInt();
        System.out.println("Elemento na posición " + posicion + ": " + arraycillo[posicion]);
        meterdatos = true;
        // catch para fora de limites
      } catch (IndexOutOfBoundsException a) {
        System.out.println("Debe ser un número entre 0 e 4");
      } catch (InputMismatchException i) { // catch para se se mete un tipo de dato incorrecto
        sc.nextLine();
        System.out.println("Debes meter un número enteiro");
      } catch (Exception e) {
        System.out.println("Excepción atopada");
      }
    }

    sc.close();
  }
}
