package Exemplo;

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExcepcions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      // Posible ArithmeticException
      System.out.print("Introduce o numerador: ");
      int numerador = sc.nextInt();
      System.out.print("Introduce o denominador: ");
      int denominador = sc.nextInt();
      int resultado = numerador / denominador;
      System.out.println("Resultado da división: " + resultado);
      // Posible ArrayIndexOutOfBoundsException
      int[] numeros = { 1, 2, 3 };
      System.out.print("Introduce un índice (0-2): ");
      int indice = sc.nextInt();
      System.out.println("Valor no índice " + indice + ": " + numeros[indice]);
      // Posible IOException
      System.out.print("Introduce o nome dun ficheiro para abrir: ");
      String nomeFicheiro = sc.next();
      FileReader fr = new FileReader(nomeFicheiro);
      fr.close();
    } catch (ArithmeticException e) {
      System.out.println(" Erro aritmético: non se pode dividir entre cero.");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(" Erro de índice: o índice está fóra do rango válido.");
    } catch (InputMismatchException e) {
      System.out.println(" Erro de entrada: esperábase un número enteiro.");
    } catch (IOException e) {
      System.out.println(" Erro de entrada/saída: non se puido abrir o ficheiro especificado.");
    } catch (Exception e) {
      // Manexador xenérico para calquera outra excepción non prevista
      System.out.println(" Ocorreu unha excepción inesperada: " +
          e.getClass().getName());
      System.out.println("Mensaxe: " + e.getMessage());
    } finally {
      System.out.println(" Bloque 'finally' executado: pechando recursos...");
      sc.close();
    }

    System.out.println("Programa rematado correctamente ");
  }
}
