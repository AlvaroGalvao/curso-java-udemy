package Applications;

import java.util.Scanner; // Importação para leitura de entradas do usuário
import java.util.Locale; // Importação para configurar o padrão de localização
import Entities.Produto3; // Importação da classe Produto3, que representa um produto com nome e preço

// Programa para calcular a média dos preços de produtos registrados pelo usuário
public class Aula08 {

	public static void main(String[] args) {
		
		// Define o padrão de localização para os Estados Unidos (para formatação de números decimais com ponto)
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// Solicita ao usuário a quantidade de produtos a serem registrados
		System.out.println("Digite a quantidade de produto que será registrado:");
		int quantidade = scan.nextInt(); // Lê o número de produtos a serem registrados
		
		// Cria um vetor para armazenar objetos do tipo Produto3
		Produto3[] vect = new Produto3[quantidade];
		double soma = 0.0; // Variável para acumular a soma dos preços
		
		// Loop para registrar os produtos
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite o nome e o valor do produto:");
			scan.nextLine(); // Consumir a quebra de linha pendente
			String nome = scan.nextLine(); // Lê o nome do produto
			double preco = scan.nextDouble(); // Lê o preço do produto
			
			// Cria um novo objeto Produto3 com os valores informados e o adiciona ao vetor
			vect[i] = new Produto3(nome, preco);
			
			// Soma o preço do produto ao total
			soma += vect[i].getPreco();
		}
		
		// Calcula a média dos preços
		double media = soma / vect.length;
		
		// Exibe a média dos preços com duas casas decimais
		System.out.printf("A média dos preços é: %.2f%n", media);
		
		// Fecha o Scanner para liberar recursos
		scan.close();
	}
}