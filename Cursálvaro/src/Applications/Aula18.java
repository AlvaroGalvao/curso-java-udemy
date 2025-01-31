// Define o pacote da aplicação
package Applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Departament;
import Entities.HourContract;
import Entities.Worker;
import Entities.Enums.WorkerLevel;

/**
 * A classe `Aula18` representa a aplicação principal que permite ao usuário
 * gerenciar trabalhadores, seus contratos e calcular a renda mensal de um trabalhador.
 */
public class Aula18 {

    /**
     * Método principal que executa o programa.
     * 
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     * @throws ParseException Lançada caso haja erro na conversão de data.
     */
    public static void main(String[] args) throws ParseException {

        // Configura o formato de números para o padrão dos EUA (ponto como separador decimal)
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // Define o formato de datas aceito no programa
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Solicita ao usuário o nome do departamento
        System.out.print("Enter department's name: ");
        String departamentName = scan.nextLine();

        // Solicita os dados do trabalhador
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scan.nextLine(); // Lê o nome do trabalhador
        System.out.print("Level: ");
        String workerLevel = scan.nextLine(); // Lê o nível do trabalhador (JUNIOR, MID_LEVEL ou SENIOR)
        System.out.print("Base salary: ");
        Double baseSalary = scan.nextDouble(); // Lê o salário base do trabalhador

        // Cria um objeto `Worker` com os dados fornecidos
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));

        // Solicita ao usuário o número de contratos associados ao trabalhador
        System.out.print("How many contracts to this worker? ");
        int n = scan.nextInt();

        // Loop para coletar os dados de cada contrato
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next()); // Lê a data do contrato
            System.out.print("Value per hour: ");
            Double valuePerHour = scan.nextDouble(); // Lê o valor por hora
            System.out.print("Duration (hours): ");
            int hours = scan.nextInt(); // Lê a duração do contrato em horas

            // Cria um contrato e associa ao trabalhador
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract); // Adiciona o contrato à lista de contratos do trabalhador
        }

        // Solicita ao usuário o mês e ano para calcular a renda
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scan.next(); // Lê o período no formato MM/YYYY
        int month = Integer.parseInt(monthAndYear.substring(0, 2)); // Extrai o mês
        int year = Integer.parseInt(monthAndYear.substring(3)); // Extrai o ano

        // Exibe os dados do trabalhador e a renda calculada para o período solicitado
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        // Fecha o scanner para liberar os recursos utilizados
        scan.close();
    }
}