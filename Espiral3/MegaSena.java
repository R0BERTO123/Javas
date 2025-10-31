//import java.text.Collator;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.List;
import java.util.Random;
//import java.util.Set;

public class MegaSena {
    
    public static void main(String[] args){


        Random random = new Random();

        int numeroAleatorio1 = random.nextInt(60)+1;
        System.out.println(numeroAleatorio1);

        int numeroAleatorio2 = random.nextInt(60)+1;
        System.out.println(numeroAleatorio2);

       int numeroAleatorio3 = random.nextInt(60)+1;
        System.out.println(numeroAleatorio3);

       int numeroAleatorio4 = random.nextInt(60)+1;
        System.out.println(numeroAleatorio4);

       int numeroAleatorio5 = random.nextInt(60)+1;
        System.out.println(numeroAleatorio5);

       int numeroAleatorio6 = random.nextInt(60)+1;
        System.out.println(numeroAleatorio6);

        /* Nao repete os numeros é coloca em ordem crecente💀
        Random random = new Random();

        Set<Integer> numeroUnico = new HashSet<>(); //Cria um Set (conjunto) que guarda os números sorteados sem repetir

        for(; numeroUnico.size() <6 ;){
            int numero = random.nextInt(60)+1;
            numeroUnico.add(numero); 
        }
      
        List<Integer> ordem = new ArrayList<>(numeroUnico); //Cria uma lista a partir do conjunto, para poder ordenar os números.
        Collections.sort(ordem); //Ordena a lista em ordem crescente.


        for(int numeros : ordem){
        System.out.println(numeros);
        }
    */
    }
}
