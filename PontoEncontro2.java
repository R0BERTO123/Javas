import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PontoEncontro2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data é hora do ponto");
        String dataHoraPD = scanner.nextLine();

        

        System.out.println("Qual é o fuso horario da pessoa 1?");
        int pessoaFuso1 = scanner.nextInt();

        System.out.println("Quais são as horas para a pessoa 1 chegar no ponto de encontro?");
        int pessoaHorasChegada1 = scanner.nextInt();

        System.out.println("Qual é o fuso horario da pessoa 2?");
        int pessoaFuso2 = scanner.nextInt();

        System.out.println("Quais são as horas para a pessoa 2 chegar no ponto de encontro?");
        int pessoaHorasChegada2 = scanner.nextInt();

        Instant dataHoraPdUTC = Instant.parse(dataHoraPD);
        
        ZoneOffset fusoZoned1 = ZoneOffset.ofHours(pessoaFuso1);
        ZoneOffset fusoZoned2 = ZoneOffset.ofHours(pessoaFuso2);
        
        OffsetDateTime dataHoraComFusoLocal1 = dataHoraPdUTC.atOffset(fusoZoned1);

        OffsetDateTime dataHoraComFusoLocal2 = dataHoraPdUTC.atOffset(fusoZoned2);

        OffsetDateTime  horaDeSaidaPessoa1 = dataHoraComFusoLocal1.minusHours(pessoaHorasChegada1);
        OffsetDateTime horaDeSaidaPessoa2 = dataHoraComFusoLocal2.minusHours(pessoaHorasChegada2);


        DateTimeFormatter formataSaida = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String saidaPessoa1 = horaDeSaidaPessoa1.format(formataSaida);
        String saidaPessoa2 = horaDeSaidaPessoa2.format(formataSaida);

        System.out.println("A primeira pessoa deve sair em "+saidaPessoa1);

        System.out.println("A segunda pessoa deve sair em "+saidaPessoa2);

        
    }
}
