import java.util.Scanner;

public class SenhaPadrao {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
 
        System.out.println("Digite seu CPF");
        String cpf = scanner.nextLine();

        System.out.println("Digite seu numero de telefone");
        String telefone = scanner.nextLine();

        
        
        char  primeraLetra = nome.charAt(0);
        String sobrenome =nome.split(" ") [2];
        char ultimaLetra = sobrenome.charAt(0);

        cpf = cpf.replace(".","").replace("-", "").replace(" ","");

        cpf = cpf.substring(0, 3)+"." +cpf.substring(3,6)+"." +cpf.substring(6, 9)+"-"+cpf.substring(9, 11);

       String tresPrimerosCPF = cpf.substring(0, 3);

       telefone = telefone.replace("11","").replace(" ", "").replace("-","");
       
       String segundaParteTelefone = telefone.substring(5,7);
      
       
        
        System.out.println("Senha criada: "+primeraLetra+ultimaLetra+tresPrimerosCPF+segundaParteTelefone);

        scanner.close();

    }
}
