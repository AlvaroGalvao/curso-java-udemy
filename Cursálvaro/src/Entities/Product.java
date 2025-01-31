package Entities; // Define o pacote da classe

// Classe que representa um produto genérico
public class Product { 
	
	private String name; // Nome do produto
	private Double price; // Preço do produto
	
	// Construtor da classe, inicializa o nome e o preço do produto
	public Product(String name, Double price) { 
		this.name = name;
		this.price = price;
	}
	
	// Método getter para obter o nome do produto
	public String getName() { 
		return name;
	}
	
	// Método setter para modificar o nome do produto
	public void setName(String name) { 
		this.name = name;
	}
	
	// Método getter para obter o preço do produto
	public Double getPrice() { 
		return price;
	}
	
	// Método setter para modificar o preço do produto
	public void setPrice(Double price) { 
		this.price = price;
	}
}