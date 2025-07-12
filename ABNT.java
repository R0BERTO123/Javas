import java.util.Scanner;

public class ABNT {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome do autor?");
        String autor = scanner.nextLine();

        System.out.println("Qual é o nome da obra?");
        String obra = scanner.nextLine();

        System.out.println("Qual é a cidade?");
        String cidade = scanner.nextLine();

        System.out.println("Qual é a editora?");
        String editora = scanner.nextLine();

        System.out.println("Qual é o ano de lançamento?");
        int ano = scanner.nextInt();

        String ultimoNome = autor.split(" ") [2];

        char primeiraLetra = autor.charAt(0);

        ultimoNome = ultimoNome.toUpperCase();


        System.out.printf("%s, %c. %s. %s: %s, %d.",ultimoNome,primeiraLetra,obra,cidade,editora,ano);
       

        scanner.close();
        
        
    }
}
