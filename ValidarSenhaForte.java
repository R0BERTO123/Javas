import java.util.Scanner;

public class ValidarSenhaForte {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha");

        String senha = scanner.nextLine();

        boolean validar = senha.length() >= 6 && senha.matches(".*[@!#$%^&*()].*");
        
        System.out.println("A senha cumpre os requisitos? "+validar);
    }
}
