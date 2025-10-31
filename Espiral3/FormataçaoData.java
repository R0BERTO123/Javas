import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormataçaoData {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data");
        String data = scanner.nextLine();

        int divideAno = Integer.parseInt(data.substring(0,4));
        int divideMes = Integer.parseInt(data.substring(5, 7));
        int divideDia = Integer.parseInt( data.substring(8, 10));
        
        LocalDateTime formata = LocalDateTime.of(divideAno, divideMes,  divideDia, 0, 0);
        
        DateTimeFormatter formataDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada =formata.format(formataDataHora);

        
        System.out.println(dataFormatada);

        scanner.close();
    }
}
