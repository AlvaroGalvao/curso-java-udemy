package Applications;

import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner scan = new Scanner(System.in);
        
        // Solicita ao usuário o número de linhas da matriz
        System.out.print("Digite a quantidade de linhas que a matriz terá: ");
        int qtdLinhas = scan.nextInt();
        
        // Solicita ao usuário o número de colunas da matriz
        System.out.print("Digite a quantidade de colunas agora: ");
        int qtdColunas = scan.nextInt();
        
        // Declara e inicializa uma matriz bidimensional com as dimensões informadas
        int[][] mat = new int[qtdLinhas][qtdColunas];
        
        // Preenche a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Digite o valor das coordenadas %dx%d: %n", i, j);
                mat[i][j] = scan.nextInt(); // Lê o valor para a posição [i][j]
            }
        }
        
        int numero;
        boolean numeroExiste;
        
        do {
	        // Solicita ao usuário um número para análise na matriz
	        System.out.print("Digite o número que será analisado: ");
	        numero = scan.nextInt();
	        numeroExiste = false;
	        
	        // Verifica se o número existe na matriz
	        for (int i = 0; i < mat.length; i++) {
	        	for (int j = 0; j < mat[i].length; j++) {
	        		if (mat[i][j] == numero) {
	        			numeroExiste = true;
	        			break;
	        		}
	        	}
	        	if (numeroExiste) break;
	        }
	        
	        if (!numeroExiste) {
	        	System.out.println("Número não encontrado na matrix. Tente novamente.");
	        }
        } while (!numeroExiste);
	        
	        // Percorre a matriz para encontrar o número informado
	        for (int i = 0; i < mat.length; i++) {
	            for (int j = 0; j < mat[i].length; j++) {
	                if (mat[i][j] == numero) { // Verifica se o número está na posição atual
	                    System.out.printf("Posição: %d, %d:%n", i, j);
	                    
	                    // Verifica e imprime o elemento à esquerda, se existir
	                    if (j - 1 >= 0) {
	                        System.out.println("Esquerda: " + mat[i][j - 1]);
	                    }
	                    
	                    // Verifica e imprime o elemento à direita, se existir
	                    if (j + 1 <= mat[i].length - 1) {
	                        System.out.println("Direita: " + mat[i][j + 1]);
	                    }
	                    
	                    // Verifica e imprime o elemento acima, se existir
	                    if (i - 1 >= 0) {
	                        System.out.println("Em cima: " + mat[i - 1][j]);
	                    }
	                    
	                    // Verifica e imprime o elemento abaixo, se existir
	                    if (i + 1 <= mat.length - 1) {
	                        System.out.println("Embaixo: " + mat[i + 1][j]);
	                    }
	                }
	            }
	        }
        // Fecha o objeto Scanner para liberar recursos
        scan.close();
    }    
}