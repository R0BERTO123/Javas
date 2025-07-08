import java.util.Scanner;

public class SignoLibra {
    
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite o nome do mês");
        String mes = scanner.nextLine();

        System.out.println("Digite o dia do nacimento");
        int dia = scanner.nextInt();

        boolean libra = false;

        mes = mes.toUpperCase();

        if(mes.equals("SETEMBRO") && dia>=23){

            libra =true;

        }
        if(mes.equals("OUTUBRO") && dia<=22){

            libra =true;
        }

        System.out.println("É do signo de Libra? "+libra);

        scanner.close();

    }
}
