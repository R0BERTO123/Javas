import java.util.Scanner;

public class mimimi {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um texto");
        String  texto = scanner.nextLine();

        String mimi = texto.replace("a", "i").replace("e", "i").replace("o", "i").replace("u", "i")
        .replace("A", "I").replace("E", "I").replace("O", "I").replace("U", "I")
        .replace("á", "i").replace("é", "i").replace("í", "i").replace("ó", "i").replace("ú", "i")
        .replace("Á", "I").replace("É", "I").replace("Í", "I").replace("Ó", "I").replace("Ú", "I");

        System.out.println(mimi);
            
        
    }


}