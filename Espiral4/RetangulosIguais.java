package Espiral4;

import java.util.Scanner;

public class RetangulosIguais {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual é a base do primero retangulo?");
        double base1 = scanner.nextDouble();

        System.out.println("Qual é a altura do primero retangulo?");
        double altura1 = scanner.nextDouble();

        System.out.println("Qual é a base do segundo retangulo?");
        double base2 = scanner.nextDouble();

        System.out.println("Qual é a altura do segundo retangulo?");
        double altura2 = scanner.nextDouble();

        double area1 = Area(base1, altura1);
        double area2 = Area(base2, altura2); 

       boolean iguais = CompararRetagulos(area1, area2);

        System.out.printf("A área com dimensão (%.0fx%.0f) é %.0f\n",base1,altura1,area1);

        System.out.printf("A área com dimensão (%.0fx%.0f) é %.0f\n",base2,altura2,area2);

        System.out.println("Retângulos são iguais? "+iguais);
 }

    static boolean CompararRetagulos(double R1, double R2){
        boolean compara = R1 == R2;
        return compara;
    }

    static double Area(double b , double a){
        double areaR = b * a;
        return areaR;
    }
}
