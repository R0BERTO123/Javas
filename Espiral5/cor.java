package Espiral5;
import java.util.Scanner;

public class cor {

    static String CombinarCores(String c1, String c2){

        boolean c1Primaria = c1.equals("VERMELHO") || c1.equals("AMARELO") || c1.equals("AZUL");
        boolean c2Primaria = c2.equals("VERMELHO") || c2.equals("AMARELO") || c2.equals("AZUL");
    
        if (c1Primaria && c2Primaria) {
    
            if ((c1.equals("VERMELHO") && c2.equals("AMARELO")) ||
                (c1.equals("AMARELO") && c2.equals("VERMELHO"))) {
                return "Laranja";
            }
    
            else if ((c1.equals("VERMELHO") && c2.equals("AZUL")) ||
                     (c1.equals("AZUL") && c2.equals("VERMELHO"))) {
                return "Roxo";
            }
    
            else if ((c1.equals("AMARELO") && c2.equals("AZUL")) ||
                     (c1.equals("AZUL") && c2.equals("AMARELO"))) {
                return "Verde";
            }
        }
    
        return null;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cor1 = scanner.nextLine().toUpperCase().replace(" ", "");
        String cor2 = scanner.nextLine().toUpperCase().replace(" ", "");

        String combinar = CombinarCores(cor1, cor2);

       // boolean corPrimaria = CorPrimaria(combinar);

        if (combinar != null) System.out.printf("A combinação das cores é: %s", combinar);

        else System.out.println("Apenas cores primárias são aceitas");


    }
}
