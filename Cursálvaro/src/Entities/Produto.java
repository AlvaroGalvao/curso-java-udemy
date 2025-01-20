package Entities;

// Classe que representa a entidade Produto, que contém informações sobre o nome, valor e quantidade de um produto.
public class Produto {

    // Atributos da classe Produto: nome (String), valor (double) e quantidade (int).
    public String nome;
    public double valor;
    public int quantidade;

    // Método que calcula o valor total do produto, multiplicando o valor unitário pela quantidade.
    // Retorna o valor total de todos os itens do produto em estoque.
    public Double valorTotal() {
        return valor * quantidade;  // Calcula e retorna o valor total.
    }

    // Método que adiciona uma quantidade ao estoque do produto.
    // O parâmetro quantidade (int) representa a quantidade de unidades a ser adicionada ao estoque.
    public void addProduto(int quantidade) {
        this.quantidade += quantidade;  // Aumenta a quantidade de produtos no estoque.
    }

    // Método que remove uma quantidade do estoque do produto.
    // O parâmetro quantidade (int) representa a quantidade de unidades a ser removida do estoque.
    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;  // Diminui a quantidade de produtos no estoque.
    }

    // Sobrescrita do método toString(), que retorna uma representação em formato de String dos dados do produto.
    // Exibe o nome, valor unitário formatado, quantidade em estoque e o valor total formatado.
    public String toString() {
        return nome + ", R$ " + String.format("%.2f", valor) + ", " + quantidade 
            + " unidades, Total: R$ " + String.format("%.2f", valorTotal());  // Retorna os dados do produto formatados.
    }
}