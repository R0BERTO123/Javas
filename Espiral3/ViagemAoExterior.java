import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ViagemAoExterior {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a data é hora da partida?");
        String dataHoraPartida = scanner.nextLine();

        System.out.println("Qual é o tempo de viagem?");
        int tempoViagem = scanner.nextInt();

        System.out.println("Qual é o fuso horario do destino?");
        int fusoDestino  = scanner.nextInt();

        ZonedDateTime localDT = ZonedDateTime.parse(dataHoraPartida);

        ZonedDateTime tempoChegada = localDT.plusHours(tempoViagem);

        ZoneOffset destino = ZoneOffset.ofHours(fusoDestino);
        ZonedDateTime chegadaDestino = tempoChegada.withZoneSameInstant(destino);

        DateTimeFormatter  formata = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataHoraEstimada = chegadaDestino.format(formata);

        System.out.println("Você chegará em "+dataHoraEstimada);

        scanner.close();

        
    }
}
