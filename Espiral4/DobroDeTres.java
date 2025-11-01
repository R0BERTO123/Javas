package Espiral4;

import java.util.Scanner;

public class DobroDeTres {
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três numeros");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        int chamarFuncao1 = Dobrar1(numero1);
        int chamarFuncao2 = Dobrar2(numero2);
        int chamarFuncao3 = Dobrar3(numero3);

        System.out.println("O dobro de "+numero1+" é "+chamarFuncao1);
        System.out.println("O dobro de "+numero2+" é "+chamarFuncao2);
        System.out.println("O dobro de "+numero3+" é "+chamarFuncao3);
        
    }

    static int Dobrar1(int n1){
        int dobro = n1*2;
        return dobro;
    }

    static int Dobrar2(int n2){
        int dobro = n2*2;
        return dobro;
    }

    static int Dobrar3(int n3){
        int dobro = n3*2;
        return dobro;
    }
}
