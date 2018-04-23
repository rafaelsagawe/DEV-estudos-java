import java.util.Scanner;

public class LoopRepetirTexto{
  public static void main(String[] args) {
    int x = 0;

    Scanner in = new Scanner(System.in);
    String texto;
    //int beta;

    System.out.println("Texto que será repetido: ");
    texto = in.String();
    //beta = in.nextInt();
    while (x<=9) {
      x = x + 1;
      System.out.println(x + texto);
    }
  }
}
