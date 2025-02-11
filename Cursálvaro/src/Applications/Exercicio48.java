package Applications; // Pacote onde a classe está localizada

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

import Model.Entities.Pessoa;
import Model.Entities.PessoaFisica;
import Model.Entities.PessoaJuridica;

public class Exercicio48 {
	
	public static void main(String[] args) {
		
		// Define o locale para US, garantindo que o separador decimal será um ponto
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// Lista para armazenar os contribuintes (pessoas físicas e jurídicas)
		List<Pessoa> list = new ArrayList<>();
		
		// Solicita o número de contribuintes
		System.out.print("Enter the number of tax payers: ");
		int n = scan.nextInt();
		
		// Loop para coletar os dados de cada contribuinte
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c): ");
			char ch = scan.next().charAt(0); // Lê o primeiro caractere para determinar o tipo de contribuinte
			
			// Lê os dados básicos: nome e renda anual
			System.out.print("Name: ");
			scan.nextLine(); // Consome a quebra de linha pendente
			String nome = scan.nextLine();
			System.out.print("Anual income: ");
			Double rendaAtual = scan.nextDouble();
			
			// Verifica se é pessoa física ou jurídica e coleta os dados específicos
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double gastosSaude = scan.nextDouble();
				list.add(new PessoaFisica(nome, rendaAtual, gastosSaude));
			} else {
				System.out.print("Number of employees: ");
				int numeroFuncionarios = scan.nextInt();
				list.add(new PessoaJuridica(nome, rendaAtual, numeroFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		// Variável para armazenar o total de impostos arrecadados
		Double impostoTotal = 0.0;
		
		// Percorre a lista de contribuintes e exibe o imposto pago por cada um
		for (Pessoa pessoa : list) {
			System.out.println(
					pessoa.getNome()
					+ ": $ "
					+ String.format("%.2f", pessoa.imposto()));
			impostoTotal += pessoa.imposto(); // Soma o imposto ao total
		}
		
		// Exibe o total de impostos arrecadados
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", impostoTotal);
		
		scan.close(); // Fecha o scanner para evitar vazamento de recursos
	}
}