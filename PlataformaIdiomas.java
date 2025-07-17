import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PlataformaIdiomas {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);



         System.out.println("Qual é a data é horario atual?");
        String horarioDataAtual = scanner.nextLine();

        System.out.println("Qual é p fuso?");
        int fuso = scanner.nextInt();

       String horarioDataAtualRep = horarioDataAtual.replace("Z", "");

       LocalDateTime dataHora =LocalDateTime.parse(horarioDataAtualRep);

       LocalDateTime ajustado = dataHora.plusHours(fuso);

       DateTimeFormatter  formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatado = ajustado.format(formato);

        System.out.println("Horário local: "+formatado);

        scanner.close();


       /*    
        String data = horarioDataAtualRep.split(" ") [0];
        String horario = horarioDataAtualRep.split(" ")[1];

        int ano =Integer.parseInt( data.substring(0,4));
        int mes = Integer.parseInt(data.substring(5, 7));
        int dia =Integer.parseInt(data.substring(8, 10));

        int hora =Integer.parseInt(horario.substring(0,2));
        int minuto = Integer.parseInt(horario.substring(3, 5));
        int segundo = Integer.parseInt(horario.substring(6, 8));

       // LocalDate  criaData = LocalDate.of(ano, mes, dia);
        LocalTime criaHorario = LocalTime.of(hora, minuto, segundo);         

        LocalTime adicionaFuso = criaHorario.plusHours(fuso);
        String formulaFuso = adicionaFuso.toString();

       hora =Integer.parseInt(formulaFuso.substring(0,2));
        minuto = Integer.parseInt(formulaFuso.substring(3, 5));
        segundo = Integer.parseInt(formulaFuso.substring(6, 8));

        

        LocalDateTime horaDataFormulado = LocalDateTime.of(ano, mes, dia, hora, minuto, segundo);

        DateTimeFormatter horaDataFormuladoFormatada = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String horaDataFormuladoFormatadaEProntaPraDarCerto = horaDataFormulado.format(horaDataFormuladoFormatada);
        
        

       System.out.println("Horário local: "+horaDataFormuladoFormatadaEProntaPraDarCerto);  // 💀
        

       System.out.println(horario);
       System.out.println(minuto);
      System.out.println(segundo);
       */


    }
}
