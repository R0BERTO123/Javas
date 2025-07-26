import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AnoNovo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data é hora");
        String dataHoraString = scanner.nextLine();

        System.out.println("Digite o fuso");
        int fuso = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Qual é a cidade?");
        String cidade = scanner.nextLine();

        System.out.println("Qual é o fuso da cidade?");
        int fusoCidade = scanner.nextInt();

        DateTimeFormatter formataDataHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        

        LocalDateTime dataHoraLocal = LocalDateTime.parse(dataHoraString,formataDataHora);
        ZoneOffset fusoZoned = ZoneOffset.ofHours(fuso);

        OffsetDateTime dataHoraComFusoLocal = dataHoraLocal.atOffset(fusoZoned);

        ZoneOffset fusoCidadeZoned = ZoneOffset.ofHours(fusoCidade);

        OffsetDateTime dataHoraCidadeComFusoLocal = dataHoraComFusoLocal.withOffsetSameInstant(fusoCidadeZoned);

        boolean jaEAnoNovo = dataHoraCidadeComFusoLocal.getMonthValue() ==1 && dataHoraCidadeComFusoLocal.getDayOfMonth()==1;

        System.out.println("Já é Ano Novo em "+cidade+"? "+jaEAnoNovo);

        scanner.close();
       

    }
}
