import java.util.Scanner;

public class LoopComEntrada{
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int x;
    int y = 10;
    System.out.println("Quantas repetições? ");
    x = entrada.nextInt();
    x = x + 1;
    while (x==y) {
    System.out.println(x + " - Olá, sou seu primeiro looping");
    }
  }

}
