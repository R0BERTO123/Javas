package Espiral5;

import java.util.Scanner;

public class Febre {
    static String SitucacaoFebre(double temp) {

        if (temp >= 41)
            return "Hipertermia";

        else if (temp >= 37.6)
            return "Febre Alta";

        else if (temp >= 36)
            return "Normal";

        else if(temp<36)
            return "Hipotermia";

        else return null;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String num = scanner.nextLine().replace(",",".");
       
       double temperatura = Double.parseDouble(num);

       String result = SitucacaoFebre(temperatura);

        if (temperatura <=0) System.out.println( "Temperatura inválida.");

        else System.out.printf("Você está com %s.", result);
    }
}
