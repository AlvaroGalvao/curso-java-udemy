package Model.Entities; // Define o pacote onde a classe está localizada

import java.text.SimpleDateFormat; // Importa a classe para formatação de data
import java.util.ArrayList; // Importa a classe para manipulação de listas
import java.util.Date; // Importa a classe para manipulação de datas
import java.util.List; // Importa a interface List

public class Post { // Declaração da classe Post
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	// Criação de um objeto para formatação de data no formato "dia/mês/ano horas:minutos:segundos"
	
	private Date moment; // Data e hora do post
	private String title; // Título do post
	private String content; // Conteúdo do post
	private Integer likes; // Quantidade de likes no post
	
	private List<Comment> comments = new ArrayList<>();
	// Lista de comentários associados ao post
	
	// Construtor padrão sem argumentos
	public Post() {		
	}
	
	// Construtor que inicializa o post com os dados fornecidos
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	// Métodos getters e setters para acessar e modificar os atributos
	
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Integer getLikes() {
		return likes;
	}
	
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comment> getComments() {
		return comments;
	}
	
	// Método para adicionar um comentário ao post
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	// Método para remover um comentário do post
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	// Método toString para exibir o post formatado
	public String toString() {
		StringBuilder sb = new StringBuilder(); // Utiliza StringBuilder para otimizar a concatenação de strings
		sb.append(title + "\n"); // Adiciona o título ao StringBuilder
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n"); // Formata e adiciona a data e hora
		sb.append(content + "\n"); // Adiciona o conteúdo do post
		sb.append("Comments:\n"); // Adiciona a seção de comentários
		for (Comment c : comments) { // Percorre a lista de comentários
			sb.append(c.getText() + "\n"); // Adiciona cada comentário ao StringBuilder
		}
		return sb.toString(); // Retorna a string formatada
	}
}