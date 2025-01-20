package Entities;

// Classe que representa a entidade Produto2, que contém informações sobre o nome, valor e quantidade de um produto.
public class Produto2 {

    // Atributos privados da classe Produto2: nome (String), valor (double) e quantidade (int).
    private String nome;
    private double valor;
    private int quantidade;

    // Construtor padrão da classe Produto2, sem parâmetros.
    public Produto2() {
    }

    // Construtor da classe Produto2, utilizado para inicializar os atributos nome, valor e quantidade.
    // Recebe três parâmetros: nome (String), valor (double) e quantidade (int).
    public Produto2(String nome, double valor, int quantidade) {
        this.nome = nome;           // Inicializa o atributo nome com o valor passado.
        this.valor = valor;         // Inicializa o atributo valor com o valor passado.
        this.quantidade = quantidade;  // Inicializa o atributo quantidade com o valor passado.
    }

    // Construtor da classe Produto2, utilizado para inicializar os atributos nome e valor.
    // Recebe dois parâmetros: nome (String) e valor (double).
    public Produto2(String nome, double valor) {
        this.nome = nome;   // Inicializa o atributo nome com o valor passado.
        this.valor = valor; // Inicializa o atributo valor com o valor passado.
    }

    // Métodos de encapsulamento (getter e setter) para o atributo nome.
    public String getNome() {
        return nome;  // Retorna o nome do produto.
    }

    public void setNome(String nome) {
        this.nome = nome;  // Modifica o nome do produto.
    }

    // Métodos de encapsulamento (getter e setter) para o atributo valor.
    public Double getValor() {
        return valor;  // Retorna o valor do produto.
    }

    public void setValor(Double valor) {
        this.valor = valor;  // Modifica o valor do produto.
    }

    // Método getter para o atributo quantidade.
    public int getQuantidade() {
        return quantidade;  // Retorna a quantidade do produto.
    }

    // Fim dos métodos de encapsulamento.

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