package Applications;

import java.util.Scanner;

// Classe que lê valores inteiros do usuário e os soma até que o valor 0 seja inserido.
public class Aula02 {

    public static void main(String[] args) {
        
        // Criação de um objeto Scanner para ler os dados inseridos pelo usuário.
        Scanner scan = new Scanner(System.in);
        
        // Declaração das variáveis para o valor a ser somado e para o resultado da soma.
        int x, soma;
        soma = 0; // Inicializa a soma com 0.

        // Solicitação ao usuário para que ele insira os valores inteiros a serem somados.
        System.out.println("Digite os valores inteiros que serão somados:");
        x = scan.nextInt(); // Lê o primeiro valor inserido pelo usuário.

        // Loop que continua enquanto o usuário não digitar 0.
        while (x != 0) {
            soma += x; // Adiciona o valor de x à soma.
            x = scan.nextInt(); // Lê o próximo valor inserido pelo usuário.
        }
        
        // Exibição do resultado da soma dos valores inseridos pelo usuário.
        System.out.printf("A soma dos valores é: %d%n", soma);
        
        // Fechamento do objeto Scanner para liberar os recursos.
        scan.close();
    }
}