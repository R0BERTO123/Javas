package Espiral5;

import java.util.Scanner;

class Ingresso {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipo = scanner.nextLine().toUpperCase();
        int quantidade = scanner.nextInt();

        double total = CalcularValorIngresso(quantidade, tipo);

        System.out.printf("O total a pagar é R$ %.2f", total);

        scanner.close();

        
    }

    static double CalcularValorIngresso(int quantidade, String tipo) {

        if (tipo.equals("INTEIRA")) {
            return quantidade * 28.50;
        }

        if (tipo.equals("MEIA")) {
            return (quantidade * 28.50) / 2;
        }

        return 0;
    }
}
