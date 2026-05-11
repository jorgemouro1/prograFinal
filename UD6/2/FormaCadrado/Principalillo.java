package FormaCadrado;

public class Principalillo {
  public static void main(String[] args) {
    Cadrado ca1 = new Cadrado(5.5);
    Circulo ci1 = new Circulo(7.1);

    System.out.println("Área do cadrado de lado " + ca1.getLado() + " : " + ca1.calcularArea() + " 👌");
    System.out.println("Área do circulo de radio " + ci1.getRadio() + " : " + ci1.calcularArea() + " 👌");
  }
}
