package Applications;

import java.util.Scanner; // Importação para leitura de entradas do usuário
import java.util.Locale; // Importação para configurar o padrão de localização

// Programa para calcular a média das alturas informadas pelo usuário
public class Aula07 {

	public static void main(String[] args) {
		
		// Define o padrão de localização para os Estados Unidos (para formatação de números decimais com ponto)
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// Solicita ao usuário a quantidade de alturas que serão medidas
		System.out.println("Digite a quantidade de alturas que serão medidas:");
		int quantidade = scan.nextInt(); // Lê o número de entradas a serem fornecidas
		
		// Declara um vetor para armazenar as alturas informadas
		double[] vect = new double[quantidade];
		double soma = 0.0; // Variável para acumular a soma das alturas
		
		// Loop para coletar as alturas e calcular a soma
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite a altura:");
			vect[i] = scan.nextDouble(); // Lê cada altura e armazena no vetor
			soma += vect[i]; // Adiciona o valor ao acumulador
		}
		
		// Calcula a média das alturas
		double media = soma / quantidade;
		
		// Exibe a média das alturas com duas casas decimais
		System.out.printf("A média das alturas é: %.2f%n", media);
		
		// Fecha o Scanner para liberar recursos
		scan.close();
	}
}
