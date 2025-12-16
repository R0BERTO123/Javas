package Espiral4;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a base?");
        double base  = scanner.nextDouble();

        System.out.println("Qual é a altura?");
        double altura = scanner.nextDouble();

        double area = Area(base, altura);


        System.out.printf("A área com dimensão (%.0fx%.0f) é %.0f",base,altura,area);
    }

    static double Area(double b , double a){
        double areaR = b * a;
        return areaR;
    }
}
