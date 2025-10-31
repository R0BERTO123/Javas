import java.util.Scanner;

public class PontoEncontro {
    
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);

        System.out.println("Qual é o horario de encontro?");
        String encondroSt = scanner.nextLine();

        System.out.println("Qual é o fuso da primera pessoa?");
        int fusoP1 = scanner.nextInt();

        System.out.println("Quanto tempo pra ela chegar?");
        int tempoP1 =scanner.nextInt();

        System.out.println("Qual é o fuso da segunda pessoa?");
        int fusoP2 = scanner.nextInt();

        System.out.println("Quanto tempo pra ela chegar?");
        int tempoP2 =scanner.nextInt();
    }
}
