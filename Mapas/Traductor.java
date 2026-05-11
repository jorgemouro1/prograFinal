package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Traductor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // creamos o mapa e imoslle metendo valores
    Map<String, String> diccionario = new HashMap<>();
    diccionario.put("Leite", "Leche");
    diccionario.put("Ola", "Hola");
    diccionario.put("Anso", "Ángel");
    diccionario.put("Sosendo", "Gosendo");
    diccionario.put("Alberte", "Alberto");
    diccionario.put("Salgado", "Salado");
    diccionario.put("Xaba", "Java");
    diccionario.put("Gorxe", "Jorge");

    // variable para salir do programa, ponse a true
    boolean salir = false;
    while (!salir) {
      // menu que mostra as opcions
      System.out.println("------ Benvido ao traductor para feigo ------");
      System.out.println("1. Engadir un novo termo. ");
      System.out.println("2. Buscar un termo de forma exacta. ");
      System.out.println("3. Buscar un termo que comece por un texto. ");
      System.out.println("4. Modificar un termo. ");
      System.out.println("5. Mostrar o mapa. ");
      System.out.println("0. Saír. ");
      System.out.print("Introduce a opción que queiras: ");
      int opcion = sc.nextInt();

      switch (opcion) {
        // engadir un novo termo ao diccionario
        case 1:
          sc.nextLine();
          // pedímolo
          System.out.print("Introduce o termo en galego: ");
          // gardámolo
          String textoGalego = sc.nextLine();
          // miramos se está ou non. se está, para. se non, sigue pedindo o termo en
          // castelán e engádeo
          if (diccionario.containsKey(textoGalego)) {
            System.out.println("O termo xa está no diccionario, pon outro.");
          } else {
            System.out.print("Introduce o termo en castelán: ");
            String textoCastelan = sc.nextLine();
            diccionario.put(textoGalego, textoCastelan);
            System.out.println("O termo " + textoGalego + " foi engadido");
          }

          break;

        case 2:
          // buscar un termo de forma exacta
          sc.nextLine();
          System.out.print("Introduce o termo que queres buscar (en galego): ");
          String buscadorExacto = sc.nextLine();

          // se non encontra ningun da erro
          if (!diccionario.containsKey(buscadorExacto)) {
            System.out.println("Non se atopou o valor");
          } else { // se encontra, da o valor en galego e despois en castelan
            System.out.println(buscadorExacto + " --> " + diccionario.get(buscadorExacto));
          }
          break;

        case 3:
          // buscar un termo que comece por un texto
          sc.nextLine();
          System.out.print("Introduce o texto que queres buscar (en galego): ");
          String buscadorTexto = sc.nextLine();
          // contador para ver se encontra coincidencias ou non
          int contadorcillo = 0;

          // bucle para ir recorrendo os elementos e que vaia mirando se empeza polo texto
          // q metemos
          for (Map.Entry<String, String> buscador : diccionario.entrySet()) {
            String textilloGalego = buscador.getKey();
            String textilloCastelan = buscador.getValue();
            if (textilloGalego.startsWith(buscadorTexto)) {
              System.out.println(textilloGalego + " --> " + textilloCastelan);
              contadorcillo++;
            }
            // se o contador sigue a 0 significa que non encontrou ningun
          }
          if (contadorcillo == 0) {
            System.out.println("Non se atopou ningunha coincidencia");
          }
          break;

        case 4:
          // modificar un termo
          sc.nextLine();
          // pedimos o valor
          System.out.print("Introduce o valor que queres cambiar: ");
          String novaClave = sc.nextLine();
          // se non existe no mapa, xa non deixa modificalo
          if (!diccionario.containsKey(novaClave)) {
            System.out.println("O termo non existe, engádeo primeiro se queres modificar.");
          } else {
            // se si que existe pide en castelan, gardamos o valor e modificamolo
            System.out.print("Introduce o valor en castelán: ");
            String novoCastelan = sc.nextLine();
            diccionario.put(novaClave, novoCastelan);
            System.out.println("Cambiouse a tradución de " + novaClave + " a " + novoCastelan);
          }
          break;

        case 5:
          // bucle para recorrer e mostrar os elementos de forma visual
          for (Map.Entry<String, String> entrada : diccionario.entrySet()) {
            String galeguillo = entrada.getKey(); // a clave (DNI)
            String castelanillo = entrada.getValue(); // o valor (salario)
            System.out.println(galeguillo + " -> " + castelanillo);
          }
          break;
        case 0:
          System.out.println("Saíndo...");
          salir = true;
          break;

        default:
          System.out.println("Pon un valor coma é debido");
          break;
      }
    }

    sc.close();
  }
}
