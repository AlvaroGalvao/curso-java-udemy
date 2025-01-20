package Applications;

import java.util.Scanner; // Importação para leitura de entradas do usuário
import java.util.Locale; // Importação para configurar o padrão de localização
import Entities.Produto; // Importação da classe Produto, que contém as propriedades e métodos do produto

// Programa para gerenciar um produto, incluindo cadastro, adição e remoção de estoque
public class Aula05 {

    public static void main(String[] args) {
        
        // Define o padrão de localização para os Estados Unidos (para uso de ponto em números decimais)
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        // Instanciação de um objeto da classe Produto
        Produto produto1 = new Produto();
        
        // Solicita ao usuário os dados iniciais do produto
        System.out.println("Digite os dados do produto:");
        System.out.print("Digite o nome: ");
        produto1.nome = scan.nextLine(); // Lê o nome do produto
        
        System.out.print("Digite o valor do produto: ");
        produto1.valor = scan.nextDouble(); // Lê o valor do produto
        
        System.out.print("Digite a quantidade do produto: ");
        produto1.quantidade = scan.nextInt(); // Lê a quantidade em estoque
        
        // Exibe as informações do produto com base nos dados fornecidos
        System.out.println(produto1);
        
        // Solicita ao usuário uma quantidade para adicionar ao estoque
        System.out.println("Digite a quantidade do produto que será adicionado ao estoque:");
        produto1.addProduto(scan.nextInt()); // Chama o método para adicionar produtos ao estoque
        System.out.println(produto1); // Exibe o estado atualizado do produto
        
        // Solicita ao usuário uma quantidade para remover do estoque
        System.out.println("Digite a quantidade do produto que será retirado do estoque:");
        produto1.removeProduto(scan.nextInt()); // Chama o método para remover produtos do estoque
        System.out.println(produto1); // Exibe o estado atualizado do produto
        
        // Fecha o scanner para liberar recursos
        scan.close();
    }
}