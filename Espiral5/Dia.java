package Espiral5;

import java.util.Scanner;

public class Dia {

    static String DiaSemana(int d) {
        if (d == 0) {
            return "Domingo";
        } else if (d == 1) {
            return "Segunda";
        } else if (d == 2) {
            return "Terça";
        } else if (d == 3) {
            return "Quarta";
        } else if (d == 4) {
            return "Quinta";
        } else if (d == 5) {
            return "Sexta";
        } else if (d == 6) {
            return "Sábado";
        }
        return null;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dia = scanner.nextInt();

        String diaSemana = DiaSemana(dia);

        if (diaSemana == null) {
            System.out.println("Dia da semana inválido.");
        } else {
            System.out.printf("O dia %d é %s.", dia, diaSemana);
        }
    }
}
