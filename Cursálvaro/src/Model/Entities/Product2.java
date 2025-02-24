package Model.Entities;

public class Product2 {
	
	// Atributos privados da classe
	private String name;
	private Double price;
	private Integer quantity;
	
	// Construtor padrão
	public Product2() {
	}
	
	// Construtor parametrizado
	public Product2(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Métodos getters e setters para acessar e modificar os atributos
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	// Método incorretamente nomeado, deveria ser getQuantity em vez de getNumber
	public Integer getNumber() {
		return quantity;
	}
	
	// Método incorretamente nomeado, deveria ser setQuantity em vez de setNumber
	public void setNumber(Integer quantity) {
		this.quantity = quantity;
	}
	
	// Método que calcula o total com base no preço e na quantidade
	public Double total() {
		return price * quantity;
	}
}