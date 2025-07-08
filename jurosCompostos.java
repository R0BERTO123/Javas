import java.util.Scanner;

public class jurosCompostos {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual foi o valor total da compra?");
        double valorCompra = scanner.nextDouble();

        System.out.println("Foi parcelado em quantas vezes?");
        int vezesParcela = scanner.nextInt();

        System.out.println("Qual é a taxa de juros mensal?");
        int taxa = scanner.nextInt();

        double taxaJuros =taxa/100.0;
        double calcula = Math.pow(1+taxaJuros,vezesParcela);
        double valorTotal =valorCompra *calcula;
        double parcela =valorTotal/vezesParcela;
        

       
        System.out.printf("Sua compra ficará R$ %.2f em %dx de R$ %.2f por mês.",valorTotal,vezesParcela,parcela);

        scanner.close();
    }
    
}
