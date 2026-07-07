import java.util.Scanner;


public class rou {

    static String CombinarCores(String c1, String c2) {

        boolean c1Primaria = c1.equals("VERMELHO") || c1.equals("AMARELO") ||c1.equals("AZUL");

        boolean c2Primaria = c2.equals("VERMELHO") ||  c2.equals("AMARELO") ||c2.equals("AZUL");

        if (!c1Primaria || !c2Primaria) {
            return null;
        }

        if ((c1.equals("VERMELHO") && c2.equals("AMARELO")) ||
            (c1.equals("AMARELO") && c2.equals("VERMELHO"))) {
            return "Laranja";
        }

        if ((c1.equals("VERMELHO") && c2.equals("AZUL")) ||
            (c1.equals("AZUL") && c2.equals("VERMELHO"))) {
            return "Roxo";
        }

        if ((c1.equals("AMARELO") && c2.equals("AZUL")) ||
            (c1.equals("AZUL") && c2.equals("AMARELO"))) {
            return "Verde";
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cor1 = scanner.nextLine().toUpperCase().replace(" ", "");
        String cor2 = scanner.nextLine().toUpperCase().replace(" ", "");

        String resultado = CombinarCores(cor1, cor2);

        if (resultado == null)
            System.out.println("Apenas cores primárias são aceitas.");
        else
            System.out.println("A combinação das cores é: " + resultado);

        scanner.close();
    }
}
