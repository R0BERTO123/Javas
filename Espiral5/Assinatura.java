package Espiral5;
import java.util.Scanner;

public class Assinatura {
    
    static String DiaSemana(int d) {
        if (d == 0) {
            return "Domingo";
        } else if (d == 1) {
            return "Segunda";
        } else if (d == 2) {
            return "Terça";
        } else if (d == 3) {
            return "Quarta";
        } else if (d == 4) {
            return "Quinta";
        } else if (d == 5) {
            return "Sexta";
        } else if (d == 6) {
            return "Sábado";
        }
        return null;

    }

    static String VerMes(int dS) {
        if (dS == 1)
            return "Janeiro";
        else if (dS == 2)
            return "Fevereiro";
        else if (dS == 3)
            return "Março";
        else if (dS == 4)
            return "Abriu";
        else if (dS == 5)
            return "Maio";
        else if (dS == 6)
            return "Junho";
        else if (dS == 7)
            return "Julho";
        else if (dS == 8)
            return "Agosto";
        else if (dS == 9)
            return "Setembro";
        else if (dS == 10)
            return "Outubro";
        else if (dS == 11)
            return "Novembro";
        else if (dS == 12)
            return "Dezembro";
        else
            return null;
    }

     static void MensagemEnvio(int dia, String semanaD,String mes,int ano){
        
        String mensagem = String.format("%s, %d de %s de %d.", semanaD,dia,mes,ano);

        System.out.println("Enviado "+mensagem);
     }
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int dia = scanner.nextInt();
        String semanaD =DiaSemana(scanner.nextInt());
        String mes = VerMes(scanner.nextInt());
        int ano = scanner.nextInt();

        MensagemEnvio(dia, semanaD, mes, ano);


    }
}
