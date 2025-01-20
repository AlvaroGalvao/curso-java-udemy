package Applications;

import java.util.Scanner;

// Classe que lê uma quantidade especificada de números e calcula a soma deles.
public class Aula03 {

    public static void main(String[] args) {
        
        // Criação de um objeto Scanner para ler os dados inseridos pelo usuário.
        Scanner scan = new Scanner(System.in);
        
        // Solicita ao usuário a quantidade de números que serão somados.
        System.out.println("Digite a quantidade de números que serão somados:");
        int qtdNumeros = scan.nextInt(); // Lê a quantidade de números.
        
        // Informa ao usuário quantos números ele deverá inserir para a soma.
        System.out.printf("Digite os %d números que serão somados:%n", qtdNumeros);
        
        // Inicializa a variável soma que será responsável por armazenar o total.
        int soma = 0;
        
        // Loop que irá iterar para somar a quantidade de números informada pelo usuário.
        for (int i = 0; i < qtdNumeros; i++) {
            int x = scan.nextInt(); // Lê o valor atual do número a ser somado.
            soma += x; // Adiciona o valor de x à soma.
        }
        
        // Exibe o resultado da soma dos números inseridos.
        System.out.printf("SOMA = %d%n", soma);
        
        // Fechamento do objeto Scanner para liberar os recursos.
        scan.close();
    }
}