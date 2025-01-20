package Applications;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula14 {
	
	public static void main(String[] args) {
		
		// Declara e inicializa uma data apenas com ano, mês e dia
		LocalDate d04 = LocalDate.parse("2022-07-20");
		// Declara e inicializa uma data com ano, mês, dia, hora, minuto e segundo
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		// Declara e inicializa um instante de tempo em UTC
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		// Calcula a data correspondente a uma semana atrás
		LocalDate pastWeekDate = d04.minusDays(7);
		// Calcula a data correspondente a uma semana à frente
		LocalDate nextWeekDate = d04.plusDays(7);
		
		// Calcula o mesmo para datas com hora (LocalDateTime)
		LocalDateTime pastWeekDateTime = d05.minusDays(7);
		LocalDateTime nextWeekDateTime = d05.plusDays(7);
		
		// Calcula o mesmo para instantes UTC (Instant)
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		// Exibe as datas calculadas
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);
		
		System.out.println("pastWeekDateTime = " + pastWeekDateTime);
		System.out.println("nextWeekDateTime = " + nextWeekDateTime);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		// Calcula a diferença em dias entre datas ou instantes
		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		// Exibe a diferença de tempo em dias
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}