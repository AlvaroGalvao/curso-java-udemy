package Model.Entities; // Declaração do pacote onde a classe Circle está localizada

import Model.Enums.Color; // Importa a enumeração Color para ser utilizada na classe

// Classe Circle que herda de Shape
public class Circle extends Shape { 
	
	private Double radius; // Raio do círculo
	
	// Construtor padrão sem argumentos
	public Circle() { 
		super(); // Chama o construtor da classe mãe (Shape)
	}
	
	// Construtor que inicializa a cor e o raio do círculo
	public Circle(Color color, Double radius) { 
		super(color); // Passa a cor para a classe mãe (Shape)
		this.radius = radius;
	}
	
	// Método getter para obter o raio
	public Double getRadius() { 
		return radius;
	}
	
	// Método setter para definir o raio
	public void setRadius(Double radius) { 
		this.radius = radius;
	}
	
	// Implementação do método abstrato area() definido em Shape
	@Override
	public Double area() { 
		return Math.PI * radius * radius; // Retorna a área do círculo (π * r²)
	}
}