package Espiral5;

import java.util.Scanner;

public class GramasSorvete {

    static double ValorSorvete(double g) {
        if (g <= 0)
            return -1;

        double preco = 3.50;

        if (g >= 1000)
            preco -= 0.50;

        double valor = (g/100) * preco;

        return valor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gramas = ValorSorvete(scanner.nextDouble());

        if(gramas == -1)System.out.println("Peso inválido");

        else System.out.printf("O total a pagar é R$ %.2f", gramas);
    }
}
