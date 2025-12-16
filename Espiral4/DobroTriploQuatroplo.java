package Espiral4;

import java.util.Scanner;

public class DobroTriploQuatroplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("digite um numero");
        int numero = scanner.nextInt();

        int dobro = Dobrar(numero);
        int triplo = Triplicar(numero);
        int quatroplo = Quadriplicar(numero);

        System.out.println("O dobro de "+numero+" é "+dobro);
        System.out.println("O triplo de "+numero+" é "+triplo);
        System.out.println("O quádruplo de "+numero+" é "+quatruplo);

        

    }


    static int Dobrar(int n){
        int dobro = n *2;
        return dobro;
    }

    static int Triplicar(int n){
        int triplo = n*3;
        return triplo;
    }

    static int Quadriplicar(int n){
        int quatruplo = n*4;
        return quatruplo;
    }
}