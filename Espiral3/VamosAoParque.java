import java.util.Scanner;

public class VamosAoParque {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatuda para verificar se está um tempo agradavel");
        double temperatuda = scanner.nextDouble();

        boolean agradavel = temperatuda<=30 || temperatuda>=23;

        System.out.println("Vamos ao parque? "+agradavel);

       

       
    }
}
