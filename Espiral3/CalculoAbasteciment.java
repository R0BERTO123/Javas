import java.util.Scanner;

public class CalculoAbasteciment {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a capacidade do tanque de combustivel?");
        double capacidadeTanque = scanner.nextDouble();

        System.out.println("Qual é o comsumo do veiculo?");
        double consumoVeiculo = scanner.nextDouble();

        System.out.println("Qual é a distancia da viagem?");
        double distancia =scanner.nextDouble();

        int vezesReabastecer = 1;

        double autonomiaVeiculo = capacidadeTanque *consumoVeiculo;
        boolean daPraChegar = autonomiaVeiculo>=distancia;
        



        if(!daPraChegar){
           
            vezesReabastecer =(int)Math.ceil(distancia/autonomiaVeiculo);
        }

        System.out.println("Você precisará fazer "+vezesReabastecer+" parada(s) para abastecer");

    scanner.close();
    }
    
}
