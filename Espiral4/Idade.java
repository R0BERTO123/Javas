package Espiral4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Idade {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu  ano de nacimento");
        int ano = scanner.nextInt();

        int chamarFuncao = CalculaIdade(ano);

        System.out.println(chamarFuncao);
    }

    static int CalculaIdade(int a){
        LocalDateTime data = LocalDateTime.now();
        int anoAtual = data.getYear();
        int suaIdade = anoAtual - a ;
        return suaIdade;
    }
}
