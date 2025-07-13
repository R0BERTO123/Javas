import java.util.Scanner;

public class ClassificaçaoLivre {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome do filme?");
        String nomeFilme = scanner.nextLine();

        System.out.println("Qual é a classificação do filme?");
        int classsificaçao = scanner.nextInt();

        System.out.println("Qual é a idade da primera pessoa?");
        int idadePessoa1 = scanner.nextInt();

        System.out.println("Qual é a idade da segunda pessoa?");
        int idadePessoa2 = scanner.nextInt();

        boolean daPraAsssistir = true;

        if(classsificaçao!=0){
        daPraAsssistir = classsificaçao <= idadePessoa1 && classsificaçao <= idadePessoa2; 
        }

        System.out.println("Vamos assistir um filme? "+daPraAsssistir);


    }
}
