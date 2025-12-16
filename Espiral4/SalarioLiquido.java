package Espiral4;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário base");
        double salalarioBase = scanner.nextDouble();

        System.out.println("Qual é o bônus mensal?");
        double bonusM = scanner.nextDouble();

        System.out.println("Qual é o total de descontos?");
        double totalD = scanner.nextDouble();

        double salarioL = CalcularSalarioLiquido(salalarioBase,bonusM,totalD);

        System.out.println("eu salário líquido é de R$ "+salarioL);
    }

    static double CalcularSalarioLiquido(double s, double b , double t){
    double totalBonus = s*(b/100);
    double ganhos = s + totalBonus;
    double salarioLiquido = ganhos - t;
    return salarioLiquido ;
    }
}
