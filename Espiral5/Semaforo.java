package Espiral5;

import java.util.Scanner;

public class Semaforo {

    static String CorSemaforo(String c){
        
        if (c.equals("VERMELHO")) {
            return "Espere";
        }

        if (c.equals("VERDE")) {
            return "Atravesse";
        }

        if (c.equals("ROXO")) {
            return "Farol inoperante";
        }
                return "Erro";
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String cor = CorSemaforo(scanner.nextLine().toUpperCase());

        System.out.println(cor);
        
        scanner.close();
    }
}
