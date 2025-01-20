package Entities;

// Classe que representa a entidade Produto3, que contém informações sobre o nome e o preço de um produto.
public class Produto3 {

    // Atributos privados da classe Produto3: nome (String) e preco (double).
    private String nome;
    private double preco;

    // Construtor da classe Produto3, utilizado para inicializar os atributos nome e preco.
    // Recebe dois parâmetros: nome (String) e preco (double).
    public Produto3(String nome, double preco) {
        this.nome = nome;    // Inicializa o atributo nome com o valor passado.
        this.preco = preco;  // Inicializa o atributo preco com o valor passado.
    }

    // Método getter para o atributo preco.
    // Retorna o preço do produto.
    public double getPreco() {
        return preco;
    }

    // Método getter para o atributo nome.
    // Retorna o nome do produto.
    public String getNome() {
        return nome;
    }
}