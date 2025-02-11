package Model.Entities; // Pacote onde a classe está localizada

// Classe PessoaJuridica que herda da classe abstrata Pessoa
public class PessoaJuridica extends Pessoa {
	
	private Integer numeroFuncionarios; // Atributo que armazena o número de funcionários da empresa
	
	// Construtor padrão (sem parâmetros)
	public PessoaJuridica() {
		super(); // Chama o construtor da classe mãe (Pessoa)
	}
	
	// Construtor que inicializa nome, rendaAtual e numeroFuncionarios
	public PessoaJuridica(String nome, Double rendaAtual, Integer numeroFuncionarios) {
		super(nome, rendaAtual); // Chama o construtor da classe mãe
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	// Método para obter o número de funcionários
	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	
	// Método para definir o número de funcionários
	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	// Implementação do método abstrato imposto(), herdado da classe Pessoa
	@Override
	public Double imposto() {
		Double imposto;
		// Se a empresa tiver menos de 11 funcionários, o imposto é 16% da renda
		if (numeroFuncionarios < 11) {
			imposto = getRendaAtual() * 0.16;
		} 
		// Se tiver 11 funcionários ou mais, o imposto é reduzido para 14% da renda
		else {
			imposto = getRendaAtual() * 0.14;
		}
		return imposto;
	}
}