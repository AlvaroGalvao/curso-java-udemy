package Entities; // Declaração do pacote onde a classe Shape está localizada

import Entities.Enums.Color; // Importa a enumeração Color para ser utilizada na classe

// Definição de uma classe abstrata chamada Shape (forma geométrica)
public abstract class Shape { 
	
	private Color color; // Atributo que armazena a cor da forma
	
	// Construtor padrão sem argumentos
	public Shape() { 
	}
	
	// Construtor que recebe uma cor como parâmetro
	public Shape(Color color) { 
		this.color = color;
	}
	
	// Método getter para obter a cor da forma
	public Color getColor() { 
		return color;
	}
	
	// Método setter para definir a cor da forma
	public void setColor(Color color) { 
		this.color = color;
	}
	
	// Método abstrato para calcular a área da forma
	// Deve ser implementado pelas subclasses concretas
	public abstract Double area(); 
}