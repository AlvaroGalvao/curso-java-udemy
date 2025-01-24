package Applications;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.time.Instant;

public class Aula15 {

    public static void main(String[] args) throws ParseException {

        // Define três formatos diferentes para manipulação e formatação de datas.
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // Apenas data no formato dia/mês/ano.
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Data com hora, minuto e segundo.
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // Configura o formato sdf3 para usar o fuso horário GMT.

        // Criação de objetos Date com diferentes inicializações.
        Date x1 = new Date(); // Data e hora atuais do sistema.
        Date x2 = new Date(System.currentTimeMillis()); // Data e hora baseadas no horário atual em milissegundos.
        Date x3 = new Date(0L); // Data correspondente ao marco zero (01/01/1970, 00:00:00 UTC).
        Date x4 = new Date(1000L * 60L * 60L * 5L); // Data cinco horas após o marco zero.

        // Parse de Strings para objetos Date usando os formatos definidos anteriormente.
        Date y1 = sdf1.parse("25/06/2019"); // Data com apenas dia/mês/ano.
        Date y2 = sdf2.parse("25/09/2018 15:42:24"); // Data com dia, mês, ano, hora, minuto e segundo.
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Data no formato ISO 8601 com fuso horário UTC.

        // Imprime os objetos Date diretamente, mostrando o formato padrão (inclui fuso horário local).
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);

        System.out.println("-------------------");

        // Formata e imprime as datas no formato "dd/MM/yyyy".
        System.out.println("x1: " + sdf1.format(x1));
        System.out.println("x2: " + sdf1.format(x2));
        System.out.println("x3: " + sdf1.format(x3));
        System.out.println("x4: " + sdf1.format(x4));
        System.out.println("y1: " + sdf1.format(y1));
        System.out.println("y2: " + sdf1.format(y2));
        System.out.println("y3: " + sdf1.format(y3));

        System.out.println("-------------------");

        // Formata e imprime as datas no formato "dd/MM/yyyy HH:mm:ss".
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3));

        System.out.println("-------------------");

        // Formata e imprime as datas no formato "dd/MM/yyyy HH:mm:ss" com o fuso horário GMT.
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3));
    }
}