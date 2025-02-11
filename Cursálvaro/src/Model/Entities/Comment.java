package Model.Entities; // Define o pacote onde a classe está localizada

public class Comment { // Declaração da classe Comment
	
	private String text; // Atributo privado que armazena o texto do comentário
	
	// Construtor padrão sem argumentos
	public Comment() {
	}
	
	// Construtor que inicializa o objeto com um texto específico
	public Comment(String text) {
		this.text = text;
	}
	
	// Método getter para obter o texto do comentário
	public String getText() {
		return text;
	}
	
	// Método setter para modificar o texto do comentário
	public void setText(String text) {
		this.text = text;
	}
}