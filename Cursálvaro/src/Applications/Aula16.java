package Applications;

// Importação das bibliotecas necessárias para manipulação de datas e horários
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Aula16 {

    public static void main(String[] args) {
        
        // Criação de um objeto SimpleDateFormat para formatar datas no formato "dd/MM/yyyy HH:mm:ss"
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        // Criação de uma instância de Date a partir de um Instant, utilizando uma string de data no formato ISO 8601
        // A data e hora fornecidas são "2018-06-25T15:42:07Z", que representa 25 de junho de 2018, às 15:42:07 UTC
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        
        // Exibe a data formatada conforme o padrão especificado acima
        System.out.println(sdf.format(d));
        
        // Criação de uma instância de Calendar (uma classe mais flexível para manipulação de datas e horas)
        Calendar cal = Calendar.getInstance();
        
        // Definindo o valor de "cal" para o valor de "d" (a data e hora original)
        cal.setTime(d);
        
        // Adicionando 4 horas à data original
        cal.add(Calendar.HOUR_OF_DAY, 4);
        
        // Atualizando a variável "d" com a nova data e hora (com as 4 horas adicionadas)
        d = cal.getTime();
        
        // Obtendo o minuto atual da data/calendário
        int minutes = cal.get(Calendar.MINUTE);
        
        // Obtendo o mês atual da data/calendário. O mês começa em 0 (janeiro é 0), então somamos 1 para ajustar
        int month = 1 + cal.get(Calendar.MONTH);
        
        // Exibe a nova data, já com as 4 horas adicionadas, formatada
        System.out.println(sdf.format(d));
        
        // Exibe os minutos da nova data
        System.out.printf("Minutes: %s%n", minutes);
        
        // Exibe o mês da nova data
        System.out.printf("Month: %s%n", month);        
    }
}