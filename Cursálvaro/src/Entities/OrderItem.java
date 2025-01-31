package Entities; // Define o pacote da classe

// Classe que representa um item de pedido
public class OrderItem { 
	
	private Integer quantity; // Quantidade do produto no pedido
	private Double price; // Preço unitário do produto
	
	private Product product; // Produto associado ao item do pedido
	
	// Construtor que inicializa os atributos da classe
	public OrderItem(Integer quantity, Double price, Product product) { 
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	// Método getter para obter a quantidade do produto no pedido
	public Integer getQuantity() { 
		return quantity;
	}
	
	// Método setter para modificar a quantidade do produto no pedido
	public void setQuantity(Integer quantity) { 
		this.quantity = quantity;
	}
	
	// Método getter para obter o preço unitário do produto
	public Double getPrice() { 
		return price;
	}
	
	// Método setter para modificar o preço unitário do produto
	public void setPrice(Double price) { 
		this.price = price;
	}
	
	// Método getter para obter o produto associado ao item do pedido
	public Product getProduct() { 
		return product;
	}
	
	// Método setter para modificar o produto associado ao item do pedido
	public void setProduct(Product product) { 
		this.product = product;
	}
	
	// Método que calcula o subtotal do item (quantidade * preço unitário)
	public Double subTotal() { 
		return quantity * price;
	}
	
	// Sobrescrita do método toString para exibir informações do item do pedido formatadas
	@Override
	public String toString() { 
		return product.getName() // Obtém o nome do produto
				+ ", $" 
				+ String.format("%.2f", price) // Formata o preço com duas casas decimais
				+ ", Quantity: " 
				+ quantity 
				+ ", SubTotal: $" 
				+ String.format("%.2f", subTotal()); // Formata o subtotal com duas casas decimais
	}
}