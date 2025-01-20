package Applications;

import java.util.Scanner; // Importação para a classe Scanner, usada para entrada de dados pelo usuário

// Programa que manipula uma matriz NxN e realiza algumas operações sobre ela
public class Aula10 {

	public static void main(String[] args) {
		
		// Criação de um objeto Scanner para ler entradas do usuário
		Scanner scan = new Scanner(System.in);
		
		// Solicita ao usuário o tamanho da matriz (valor de N)
		System.out.println("A matriz será NxN, informe o valor de N: ");
		int n = scan.nextInt(); // Lê o valor de N, que define as dimensões da matriz
		int[][] mat = new int[n][n]; // Criação da matriz de tamanho NxN
		
		// Loop para preencher a matriz com valores fornecidos pelo usuário
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				// Solicita ao usuário o valor para a posição i,j da matriz
				System.out.printf("Informe o valor da coordenada %dx%d: %n", i, j);
				mat[i][j] = scan.nextInt(); // Lê o valor e armazena na matriz
			}
		}
		
		// Exibe os valores da diagonal principal da matriz
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " "); // A diagonal principal tem i == j
		}
		System.out.println(); // Pula uma linha para organização da saída
		
		// Conta a quantidade de números negativos na matriz
		int qtdNeg = 0; // Inicializa a contagem de números negativos
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				// Verifica se o elemento na posição i,j é negativo
				if (mat[i][j] < 0) {
					qtdNeg++; // Incrementa o contador de números negativos
				}
			}
		}
		
		// Exibe a quantidade de números negativos encontrados na matriz
		System.out.printf("Quantidade de números negativos = %d%n", qtdNeg);
		
		// Fecha o Scanner para liberar recursos
		scan.close();
	}
}