package Model.Entities; // Pacote onde a classe está localizada

// Definição de uma classe abstrata chamada Pessoa
public abstract class Pessoa {
	
	private String nome; // Atributo para armazenar o nome da pessoa
	private Double rendaAtual; // Atributo para armazenar a renda atual da pessoa
	
	// Construtor padrão (sem parâmetros)
	public Pessoa() {
	}
	
	// Construtor que inicializa os atributos nome e rendaAtual
	public Pessoa(String nome, Double rendaAtual) {
		this.nome = nome;
		this.rendaAtual = rendaAtual;
	}
	
	// Método para obter o nome da pessoa
	public String getNome() {
		return nome;
	}
	
	// Método para definir o nome da pessoa
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Método para obter a renda atual da pessoa
	public Double getRendaAtual() {
		return rendaAtual;
	}
	
	// Método para definir a renda atual da pessoa
	public void setRendaAtual(Double rendaAtual) {
		this.rendaAtual = rendaAtual;
	}
	
	// Método abstrato que deve ser implementado pelas subclasses para calcular o imposto
	public abstract Double imposto();
}