package Model.Entities; // Declaração do pacote onde a classe Rectangle está localizada

import Model.Enums.Color; // Importa a enumeração Color para ser utilizada na classe

// Classe Rectangle que herda de Shape
public class Rectangle extends Shape { 
	
	private Double width;  // Largura do retângulo
	private Double height; // Altura do retângulo
	
	// Construtor padrão sem argumentos
	public Rectangle() { 
		super(); // Chama o construtor da classe mãe (Shape)
	}
	
	// Construtor que inicializa a cor, largura e altura do retângulo
	public Rectangle(Color color, Double width, Double height) { 
		super(color); // Passa a cor para a classe mãe (Shape)
		this.width = width;
		this.height = height;
	}
	
	// Método getter para obter a largura
	public Double getWidth() { 
		return width;
	}
	
	// Método setter para definir a largura
	public void setWidth(Double width) { 
		this.width = width;
	}
	
	// Método getter para obter a altura
	public Double getHeight() { 
		return height;
	}
	
	// Método setter para definir a altura
	public void setHeight(Double height) { 
		this.height = height;
	}
	
	// Implementação do método abstrato area() definido em Shape
	@Override
	public Double area() { 
		return width * height; // Retorna a área do retângulo (base * altura)
	}
}