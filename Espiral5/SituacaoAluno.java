package Espiral5;

import java.util.Scanner;

public class SituacaoAluno {

    static double TratarNota(String n) {

        n = n.replace(",", ".");

        return Double.parseDouble(n);
    }

    static double CalcularMedia(double nota1, double nota2, double nota3) {

        if (nota1 < 0 || nota1 > 10 ||nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10)return -1;
        
        return (nota1 + nota2 + nota3) / 3;
    }

    static String Situacao(double media, int faltas) {

        if (media < 0 || faltas < 0) {
            return "Parâmetros inválidos.";
        }

        if (faltas > 4) {
            return "Reprovado por Falta";
        }

        if (media >= 8) {
            return "Aprovado com sucesso";
        }

        if (media >= 6) {
            return "Aprovado";
        }

        if (media >= 3) {
            return "Recuperação";
        }

        if (media > 0) {
            return "Reprovado";
        }

        return "Desistente";
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();
        String n3 = scanner.nextLine();

        double nota1 = TratarNota(n1);
        double nota2 = TratarNota(n2);
        double nota3 = TratarNota(n3);

        double media = CalcularMedia(nota1, nota2, nota3);

        int faltas = scanner.nextInt();

        if (media == -1 || faltas < 0)System.out.println("Parâmetros inválidos.");

        else{

        String situacao = Situacao(media, faltas);

        String mediaTexto = Double.toString(media).replace(",", ".");

        
        System.out.println("A média do aluno é " + mediaTexto +".");
        System.out.println("Situação: " + situacao +".");
        
        
    }

        scanner.close();

    }
}
