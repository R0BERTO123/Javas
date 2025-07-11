import java.util.Scanner;

public class UltimoNome {
    
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);

        System.out.println("digite seu nome completo");
        String nome = scanner.nextLine();

        String ultimoNome = nome.split(" ") [2];

        System.out.println("Seja bem-vindo "+ultimoNome);
    }
}
