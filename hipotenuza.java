import java.util.Scanner;

public class hipotenuza {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o valor do primeiro cateto");
        double cateto1 = scanner.nextDouble();

        System.out.println("digite o valor do segundo cateto");
        double cateto2 = scanner.nextDouble();

        double hipotenuza = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.printf("A hipotenusa é %.1f",hipotenuza);

        scanner.close();

        
        
    }

    
}
