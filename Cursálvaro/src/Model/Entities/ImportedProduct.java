package Model.Entities; // Define o pacote onde a classe está localizada

// A classe ImportedProduct herda da classe Product1
public class ImportedProduct extends Product1 {
	
	// Atributo específico para a taxa alfandegária do produto importado
	private Double customsFee;
	
	// Construtor padrão (sem argumentos)
	public ImportedProduct() {
		super(); // Chama o construtor da classe pai (Product1)
	}
	
	// Construtor com parâmetros para inicializar os atributos
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price); // Chama o construtor da classe pai
		this.customsFee = customsFee;
	}
	
	// Getter para obter o valor da taxa alfandegária
	public Double getCustomsFee() {
		return customsFee;
	}
	
	// Setter para definir o valor da taxa alfandegária
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// Método que calcula o preço total do produto (preço base + taxa alfandegária)
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	// Sobrescreve o método priceTag para exibir o preço total e a taxa alfandegária
	@Override
	public String priceTag() {
		return getName()  // Obtém o nome do produto
				+ " $" 
				+ String.format("%.2f", totalPrice()) // Exibe o preço total (incluindo a taxa)
				+ " (Customs fee: $" 
				+ String.format("%.2f", customsFee) // Exibe a taxa alfandegária separadamente
				+ ")";
	}
}