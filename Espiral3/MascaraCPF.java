import java.util.Scanner;

public class MascaraCPF {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
        
      System.out.println("Digite o CPF");
      String cpf = scanner.nextLine();

        cpf = cpf.replace(".","").replace("-", "").replace(" ","");

        cpf = cpf.substring(0, 3)+"." +cpf.substring(3,6)+"." +cpf.substring(6, 9)+"-"+cpf.substring(9, 11);

        System.out.println(cpf);

       
       
      

      
        
        

    }
}
