package Applications;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;

public class Aula13 {
    
    public static void main(String[] args) {
        
        // Criação de uma data do tipo LocalDate
        // A data é representada por ano, mês e dia
        LocalDate d04 = LocalDate.parse("2022-07-20");

        // Criação de uma data e hora do tipo LocalDateTime
        // A data é representada por ano, mês, dia, hora, minuto, segundo
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

        // Criação de um Instant, que é um ponto no tempo, representado como uma data/hora no UTC
        // O "Z" no final do Instant indica que é no fuso horário UTC (zero offset)
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        
        // Converte o Instant para LocalDate, utilizando o fuso horário do sistema local
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

        // Converte o Instant para LocalDate, utilizando o fuso horário de Portugal
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        // Converte o Instant para LocalDateTime, utilizando o fuso horário do sistema local
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

        // Converte o Instant para LocalDateTime, utilizando o fuso horário de Portugal
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        
        // Exibe as datas convertidas para diferentes fusos horários
        System.out.println("r1 = " + r1); // Data no fuso horário do sistema local
        System.out.println("r2 = " + r2); // Data no fuso horário de Portugal
        System.out.println("r3 = " + r3); // Data e hora no fuso horário do sistema local
        System.out.println("r4 = " + r4); // Data e hora no fuso horário de Portugal
        
        // Exibe o dia, mês e ano de 'd04' (LocalDate)
        System.out.println("d04 dia = " + d04.getDayOfMonth()); // Dia do mês de 'd04'
        System.out.println("d04 mês = " + d04.getMonthValue()); // Mês de 'd04'
        System.out.println("d04 ano = " + d04.getYear()); // Ano de 'd04'
        
        // Exibe a hora e os minutos de 'd05' (LocalDateTime)
        System.out.println("d05 hora = " + d05.getHour()); // Hora de 'd05'
        System.out.println("d05 minutos = " + d05.getMinute()); // Minutos de 'd05'
        
        // Exibe a hora e minuto no formato 'hora:minuto' para 'd05'
        System.out.printf("d05 horário = %dh%d\n", d05.getHour(), d05.getMinute());
    }
}