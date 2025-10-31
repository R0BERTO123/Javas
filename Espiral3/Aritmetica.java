import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o termo inicial");
        int a1 = scanner.nextInt();

        System.out.println("Digite a razão");
        int q = scanner.nextInt();

        System.out.println("Digite a posiçao valor");
        int posiçao = scanner.nextInt();

      double progressao = a1*Math.pow(q, posiçao-1);

        System.out.println("O valor do termo na posição "+posiçao+" é "+progressao);

        scanner.close();
    }
}
