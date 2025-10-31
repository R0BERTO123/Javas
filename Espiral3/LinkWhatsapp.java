import java.util.Scanner;

public class LinkWhatsapp {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de telefone");
        String numero = scanner.nextLine();

        numero = numero.replace(" ", "").replace("-", "").replace("(11)","11").replace("+","");

        String link ="https://api.whatsapp.com/send?phone="+numero;

        System.out.println(link);

        scanner.close();
    }
}
