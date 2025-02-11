package Applications; // Declaração do pacote onde a classe está localizada.

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Model.Entities.Employee;
import Model.Entities.OutsourcedEmployee;

public class Exercicio46 { // Declaração da classe principal.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define o padrão de localização para os Estados Unidos (para formatação numérica).
        Scanner scan = new Scanner(System.in); // Criação do objeto Scanner para entrada de dados.

        List<Employee> list = new ArrayList<>(); // Lista para armazenar os funcionários cadastrados.

        System.out.print("Enter the number of employees: ");
        int n = scan.nextInt(); // Lê o número de funcionários.

        for (int i = 1; i <= n; i++) { // Loop para entrada dos dados de cada funcionário.
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = scan.next().charAt(0); // Verifica se o funcionário é terceirizado.

            System.out.print("Name: ");
            scan.nextLine(); // Consome a quebra de linha pendente do next().
            String name = scan.nextLine(); // Lê o nome do funcionário.

            System.out.print("Hours: ");
            int hours = scan.nextInt(); // Lê a quantidade de horas trabalhadas.

            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble(); // Lê o valor por hora do funcionário.

            if (ch == 'y') { // Caso o funcionário seja terceirizado:
                System.out.print("Additional charge: ");
                double additionalCharge = scan.nextDouble(); // Lê a taxa adicional do funcionário terceirizado.
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge)); // Adiciona um funcionário terceirizado à lista.
            } else {
                list.add(new Employee(name, hours, valuePerHour)); // Adiciona um funcionário comum à lista.
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for (Employee emp : list) { // Percorre a lista e exibe os pagamentos de cada funcionário.
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment())); // Mostra o nome e pagamento formatado.
        }

        scan.close(); // Fecha o Scanner para evitar vazamento de recursos.
    }
}