package Espiral5;

import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diaSemana = scanner.nextInt();

        String semana = VerSemana(diaSemana);

        if (semana == null)
            System.out.println("Mês Inválido.");

        else
            System.out.printf("Olá %s.", semana);

    }

    static String VerSemana(int dS) {
        if (dS == 1)
            return "Janeiro";
        else if (dS == 2)
            return "Fevereiro";
        else if (dS == 3)
            return "Março";
        else if (dS == 4)
            return "Abriu";
        else if (dS == 5)
            return "Maio";
        else if (dS == 6)
            return "Junho";
        else if (dS == 7)
            return "Julho";
        else if (dS == 8)
            return "Agosto";
        else if (dS == 9)
            return "Setembro";
        else if (dS == 10)
            return "Outubro";
        else if (dS == 11)
            return "Novembro";
        else if (dS == 12)
            return "Dezembro";
        else
            return null;
    }
}
