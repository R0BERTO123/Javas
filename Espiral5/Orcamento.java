package Espiral5;

import java.util.Scanner;

public class Orcamento {
    
    static String CalculaGastos(double ganhos, double gastos) {
        if (ganhos > gastos) {
            return "OK";
        } else if (ganhos < gastos) {
            return "NOK";
        }
        return "Oxi";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ganhos = scanner.nextDouble();
        double gastos = scanner.nextDouble();
                
        String resp = CalculaGastos(ganhos, gastos);

        if (resp.equals("OK")) {
            System.out.println("Você está dentro do orçamento!");

        } else if (resp.equals("NOK")) {
            System.out.println("Você está fora do orçamento! Não gaste mais!");
        }

    }
}
