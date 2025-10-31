import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a data é hora no fuso horario?");
        String dataHora = scanner.nextLine();



        ZonedDateTime localDT = ZonedDateTime.parse(dataHora);

        

        ZonedDateTime horaBrasil = localDT.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));

        DateTimeFormatter formataHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataHoraFinal = horaBrasil.format(formataHora);
        

        System.out.println("Avise o hotel em "+dataHoraFinal+" de Brasil/SãoPaulo");

        scanner.close();
    }


