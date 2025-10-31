import java.util.Scanner;

public class CorPrimária {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma cor para verificar se ela é primaria");
        String cor = scanner.nextLine();

        cor = cor.toUpperCase();

        boolean primarias = cor.equals("AZUL") || cor.equals("VERMELHO") || cor.equals("AMARELO");

        System.out.println("É cor primária? "+primarias);

    }
}
