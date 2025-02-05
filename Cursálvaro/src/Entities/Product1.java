package Entities; // Define o pacote onde a classe está localizada

// Classe base (superclasse) para os produtos
public class Product1 {
	
	// Atributos privados para o nome e preço do produto
	private String name;
	private Double price;
	
	// Construtor padrão (sem argumentos)
	public Product1() {
	}
	
	// Construtor com parâmetros para inicializar os atributos
	public Product1(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// Getter para obter o nome do produto
	public String getName() {
		return name;
	}
	
	// Setter para definir o nome do produto
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter para obter o preço do produto
	public Double getPrice() {
		return price;
	}
	
	// Setter para definir o preço do produto
	public void setPrice(Double price) {
		this.price = price;
	}
	
	// Método que retorna uma etiqueta de preço com o nome do produto e seu preço formatado
	public String priceTag() {
		return name  // Obtém o nome do produto
				+ " $" 
				+ String.format("%.2f", price); // Formata o preço com duas casas decimais
	}
}