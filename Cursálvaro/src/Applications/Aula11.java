package Applications;

import java.time.Instant; // Importação para a classe Instant, que representa um ponto no tempo (data e hora)
import java.time.LocalDate; // Importação para a classe LocalDate, que representa uma data (ano, mês, dia)
import java.time.LocalDateTime; // Importação para a classe LocalDateTime, que representa uma data e hora (ano, mês, dia, hora, minuto, segundo)
import java.time.format.DateTimeFormatter; // Importação para a classe DateTimeFormatter, usada para formatar e analisar datas e horas

public class Aula11 {

    public static void main(String[] args) {
        
        // Definição de formatos para datas e horas
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato para data sem hora
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formato para data com hora e minuto
        
        // Criação de instâncias representando a data e hora atuais
        LocalDate d01 = LocalDate.now(); // Data atual
        LocalDateTime d02 = LocalDateTime.now(); // Data e hora atual
        Instant d03 = Instant.now(); // Momento atual em tempo UTC (milissegundos desde 1970-01-01T00:00:00Z)
        
        // Análise de datas a partir de strings
        LocalDate d04 = LocalDate.parse("2022-07-20"); // Análise de string para LocalDate (ano-mês-dia)
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Análise de string para LocalDateTime (ano-mês-diaTtempo)
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Análise de string para Instant com UTC (data e hora)
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // Análise de string para Instant com fuso horário específico
        
        // Análise de datas com formatos personalizados (fmt1 e fmt2)
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // Análise de string para LocalDate com formato "dd/MM/yyyy"
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); // Análise de string para LocalDateTime com formato "dd/MM/yyyy HH:mm"
        
        // Criação de datas e horas usando o método of
        LocalDate d10 = LocalDate.of(2022, 07, 20); // Criação de LocalDate com ano, mês e dia
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30); // Criação de LocalDateTime com ano, mês, dia, hora e minuto
        
        // Exibição dos valores das variáveis utilizando o método toString() implicitamente chamado
        System.out.println("d01 = " + d01); // Exibe a data atual
        System.out.println("d02 = " + d02.toString()); // Exibe a data e hora atuais
        System.out.println("d03 = " + d03.toString()); // Exibe o instante atual
        System.out.println("d04 = " + d04.toString()); // Exibe a data analisada
        System.out.println("d05 = " + d05.toString()); // Exibe a data e hora analisada
        System.out.println("d06 = " + d06.toString()); // Exibe o instante analisado
        System.out.println("d07 = " + d07.toString()); // Exibe o instante analisado com fuso horário
        System.out.println("d08 = " + d08.toString()); // Exibe a data analisada com formato personalizado
        System.out.println("d09 = " + d09.toString()); // Exibe a data e hora analisada com formato personalizado
        System.out.println("d10 = " + d10.toString()); // Exibe a data criada
        System.out.println("d11 = " + d11.toString()); // Exibe a data e hora criada
    }
}