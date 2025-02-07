package Entities; // Pacote onde a classe está localizada

// Classe PessoaFisica que herda da classe abstrata Pessoa
public class PessoaFisica extends Pessoa {
	
	private Double gastosSaude; // Atributo que armazena os gastos com saúde da pessoa
	
	// Construtor padrão (sem parâmetros)
	public PessoaFisica() {
		super(); // Chama o construtor da classe mãe (Pessoa)
	}
	
	// Construtor que inicializa nome, rendaAtual e gastosSaude
	public PessoaFisica(String nome, Double rendaAtual, Double gastosSaude) {
		super(nome, rendaAtual); // Chama o construtor da classe mãe
		this.gastosSaude = gastosSaude;
	}
	
	// Método para obter os gastos com saúde
	public Double getGastosSaude() {
		return gastosSaude;
	}
	
	// Método para definir os gastos com saúde
	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	// Implementação do método abstrato imposto(), herdado da classe Pessoa
	@Override
	public Double imposto() {
		Double imposto;
		
		// Se a renda for menor que 20.000, o imposto é 15% da renda
		if (getRendaAtual() < 20000.0) {
			imposto = getRendaAtual() * 0.15;
		} 
		// Se a renda for 20.000 ou mais, o imposto é 25% da renda
		else {
			imposto = getRendaAtual() * 0.25;
		}
		
		// Desconto de 50% dos gastos com saúde no imposto
		imposto -= gastosSaude * 0.5;
		
		// Se o imposto calculado for negativo, ajusta para 0 (evita valores negativos)
		if (imposto < 0.0) {
			imposto = 0.0;
		}
		
		return imposto;
	}
}