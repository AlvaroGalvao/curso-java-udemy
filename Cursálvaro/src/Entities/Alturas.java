package Entities;

// Classe que representa a entidade Alturas, contendo informações sobre nome, idade e altura de uma pessoa.
public class Alturas {

    // Atributos da classe Alturas: nome (String), idade (int) e altura (double).
    private String nome;
    private int idade;
    private double altura;

    // Construtor da classe, utilizado para inicializar os atributos da classe.
    // O construtor recebe três parâmetros: nome (String), idade (int) e altura (double).
    public Alturas(String nome, int idade, double altura) {
        this.nome = nome;        // Inicializa o atributo nome com o valor passado.
        this.idade = idade;      // Inicializa o atributo idade com o valor passado.
        this.altura = altura;    // Inicializa o atributo altura com o valor passado.
    }

    // Método getter para o atributo nome.
    // Retorna o valor do nome da pessoa.
    public String getNome() {
        return nome;
    }

    // Método getter para o atributo idade.
    // Retorna o valor da idade da pessoa.
    public int getIdade() {
        return idade;
    }

    // Método getter para o atributo altura.
    // Retorna o valor da altura da pessoa.
    public double getAltura() {
        return altura;
    }
}