package Applications;

import java.util.Scanner; // Importação para leitura de entradas do usuário
import java.util.Locale; // Importação para configurar o padrão de localização
import Entities.Produto2; // Importação da classe Produto2, que contém atributos e métodos relacionados ao produto

// Programa para gerenciar um produto, utilizando construtores, getters e setters
public class Aula05ComConstrutor {

    public static void main(String[] args) {
        
        // Define o padrão de localização para os Estados Unidos (para uso de ponto em números decimais)
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        /* Comentário explicativo:
         * Com a sobrecarga de construtores na classe Produto2, é possível criar instâncias de diferentes formas:
         * - Com todos os atributos iniciais (nome, valor, quantidade)
         * - Sem quantidade (assumindo um valor padrão, como 0)
         * - Por instanciamento simples, utilizando um construtor sem parâmetros
         * Exemplo: Produto2 p = new Produto2(); */
        
        // Solicita ao usuário os dados iniciais do produto
        System.out.println("Digite os dados do produto:");
        System.out.print("Digite o nome: ");
        String nome = scan.nextLine(); // Lê o nome do produto
        
        System.out.print("Digite o valor do produto: ");
        Double valor = scan.nextDouble(); // Lê o valor do produto
        
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scan.nextInt(); // Lê a quantidade inicial do produto em estoque
        
        // Cria o objeto Produto2 utilizando o construtor com todos os parâmetros
        Produto2 produto1 = new Produto2(nome, valor, quantidade);
        
        // Atualiza o nome do produto utilizando o método setter
        produto1.setNome("Computer");
        System.out.println("Nome atualizado: " + produto1.getNome()); // Exibe o novo nome do produto
        
        // Atualiza o valor do produto utilizando o método setter
        produto1.setValor(1200.00);
        System.out.println("Preço atualizado: " + produto1.getValor()); // Exibe o novo valor do produto
        
        // Exibe o estado inicial do produto
        System.out.println(produto1);
        
        // Solicita ao usuário uma quantidade para adicionar ao estoque
        System.out.println("Digite a quantidade do produto que será adicionado ao estoque:");
        produto1.addProduto(scan.nextInt()); // Adiciona a quantidade ao estoque
        System.out.println("Quantidade atualizada: " + produto1.getQuantidade()); // Exibe a quantidade atualizada
        System.out.println(produto1); // Exibe o estado atualizado do produto
        
        // Solicita ao usuário uma quantidade para remover do estoque
        System.out.println("Digite a quantidade do produto que será retirado do estoque:");
        produto1.removeProduto(scan.nextInt()); // Remove a quantidade do estoque
        System.out.println("Quantidade atualizada: " + produto1.getQuantidade()); // Exibe a quantidade atualizada
        System.out.println(produto1); // Exibe o estado atualizado do produto
        
        // Fecha o scanner para liberar recursos
        scan.close();
    }
}
