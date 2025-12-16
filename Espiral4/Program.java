package Espiral4;

import java.util.Scanner;

public class Program {

    static int Dobrar(int n){
        int dobro = n * 2;
        return dobro;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero");
        int numero = scanner.nextInt();

        int chamarFuncao = Dobrar(numero);

        System.out.println("O dobro de "+ numero+" é "+chamarFuncao);

        scanner.close();


    }
}
