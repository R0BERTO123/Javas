import java.util.Scanner;

public class boasVindas {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo");
        String nomeCompleto = scanner.nextLine();

        String primeroNome = nomeCompleto.split(" ")[0];

        System.out.println("Bem vindo "+primeroNome);



        
    }
    
}
