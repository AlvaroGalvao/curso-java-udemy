package Applications;

import java.time.Instant; // Importação para a classe Instant, que representa um ponto no tempo (data e hora) com precisão de milissegundos.
import java.time.LocalDate; // Importação para a classe LocalDate, que representa uma data (ano, mês, dia).
import java.time.LocalDateTime; // Importação para a classe LocalDateTime, que representa uma data e hora (ano, mês, dia, hora, minuto, segundo).
import java.time.ZoneId; // Importação para a classe ZoneId, que representa o fuso horário de uma região.
import java.time.format.DateTimeFormatter; // Importação para a classe DateTimeFormatter, usada para formatar e analisar datas e horas.

public class Aula12 {

    public static void main(String[] args) {

        // Criação de instâncias para diferentes tipos de data e hora
        LocalDate d04 = LocalDate.parse("2022-07-20"); // Análise de string para LocalDate (ano-mês-dia)
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Análise de string para LocalDateTime (ano-mês-diaTtempo)
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Análise de string para Instant (ponto no tempo UTC)

        // Definição de formatos para as datas e horas
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de data com dia, mês e ano
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formato de data e hora (minuto)
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Formato com fuso horário do sistema
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // Formato padrão ISO para data e hora
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // Formato ISO para Instant (ponto no tempo)

        // Exibição das datas formatadas
        // d04 é uma LocalDate e será formatada com o formato definido em fmt1
        System.out.println("d04 = " + d04.format(fmt1)); // Método format() da classe LocalDate
        System.out.println("d04 = " + fmt1.format(d04)); // Usando DateTimeFormatter diretamente
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Passando diretamente o formato desejado
        
        // d05 é uma LocalDateTime e será formatada com os formatos fmt1, fmt2 e fmt4
        System.out.println("d05 = " + d05.format(fmt1)); // Formatação com apenas a data
        System.out.println("d05 = " + d05.format(fmt2)); // Formatação com data e hora (minuto)
        System.out.println("d05 = " + d05.format(fmt4)); // Formatação com o formato ISO de data e hora

        // d06 é um Instant e será formatado com fmt3 (com fuso horário) e fmt5 (padrão ISO)
        System.out.println("d06 = " + fmt3.format(d06)); // Formatação com o fuso horário do sistema
        System.out.println("d06 = " + fmt5.format(d06)); // Formatação no formato ISO para Instant
        System.out.println("d06 = " + d06.toString()); // Exibindo o valor de Instant usando o método toString() padrão
    }
}