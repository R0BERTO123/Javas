
import java.util.Scanner;

class calculadora {

    static double Calculadora(double n1 , double n2 , String op){

        double resultado = 0;

        if (op.equals("soma") || op.equals("1")){
            resultado = n1+n2;
        }
        else if (op.equals("subtração") || op.equals("2")) {
            resultado = n1-n2;
        }
        else if (op.equals("multiplicação") || op.equals("3")) {
            resultado = n1*n2;
        }
        else if (op.equals("divisão") || op.equals("4")) {
            resultado = n1/n2;
        }
        else if (op.equals("resto") || op.equals("5")) {
            resultado = n1%n2;
        }
        else if (op.equals("potência") || op.equals("6")) {
            resultado = Math.pow(n1, n2);
        }
        return resultado;
    }

    static void ExibirResultado(double n1, double n2 , String op, double resultado){

        
    }

   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        double n1 = Double.parseDouble(scanner.nextLine().replace(",", "."));
        double n2 = Double.parseDouble(scanner.nextLine().replace(",", "."));
        


        System.out.println("Qual é a operação?");

        System.out.println(
                        ":: MENU ::\r\n" + //
                        "1. Soma\r\n" + //
                        "2. Subtração\r\n" + //
                        "3. Multiplicação\r\n" + //
                        "4. Divisão\r\n" + //
                        "5. Resto\r\n" + //
                        "6. Potência");

         

        String op =scanner.nextLine().toLowerCase();

       double resultado =  Calculadora(n1,n2,op); 

        ExibirResultado(n1, n2 , op, resultado);

            
        
        



    }
}