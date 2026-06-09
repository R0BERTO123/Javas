package Espiral5;

import java.util.Scanner;

public class IMC {

    static double TratarString(String s){
        
        s = s.replace(",", ".");

        double d = Double.parseDouble(s);
        return d;
    }

    static double CalcularIMC(double a , double p){

        if(a<0||p<0) return -1;

        return p/(Math.pow(a,2));
    }

    static String CalssificacaoIMC(double imc){

        if(imc >=40) return "Obesidade Grau III";
        
        else if(imc >35 && imc <=39.9) return "Obesidade Grau II";

        else if(imc>30 && imc<=34.9) return "Obesidade Grau I";

        else if(imc>25 && imc<=29.9) return "Sobrepeso";
        
        else if(imc>18.5 && imc<=24.9) return "Peso Normal";

        else if(imc<18.5) return "Abaixo do Peso";

        else return null;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura = TratarString(scanner.nextLine());
        double peso =TratarString( scanner.nextLine());


        double imc = CalcularIMC(altura ,peso);

        String classificacao = CalssificacaoIMC(imc);

        String imcFromat = String.format("%.2f", imc).replace(",", ".");

        System.out.println("Seu IMC é "+imcFromat+".");
        System.out.println("Sua classificação é "+classificacao+".");
       
    }
}