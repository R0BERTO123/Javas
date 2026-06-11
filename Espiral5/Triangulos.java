package Espiral5;

import java.util.Scanner;

class Triangulos {

    static String TipoTriangulo(int lado1, int lado2, int lado3) {

        if (lado1 == lado2 && lado2 == lado3) return "Equilátero";

        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)  return "Isósceles";

        else  return "Escaleno";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lado1 = scanner.nextInt();
        int lado2 = scanner.nextInt();
        int lado3 = scanner.nextInt();

        String tipoTriangulo = TipoTriangulo(lado1,lado2,lado3);

        System.out.println("Esse é um triângulo "+tipoTriangulo);
    }

}


