package Applications; // Define o pacote onde a classe está localizada

import java.text.ParseException; // Importa a classe para tratar exceções de parsing de data
import java.text.SimpleDateFormat; // Importa a classe para formatação de data

import Model.Entities.Comment; // Importa a classe Comment
import Model.Entities.Post; // Importa a classe Post

public class Aula19 { // Classe principal que contém o método main
	
	public static void main(String[] args) throws ParseException {
		// Define o formato de data e hora que será utilizado
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// Criação de comentários
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		// Criação do primeiro post com data formatada, título, conteúdo e número de likes
		Post p1 = new Post(
				sdf.parse("21/06/2024 13:05:44"), // Converte a string em um objeto Date
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		
		// Adiciona os comentários ao primeiro post
		p1.addComment(c1);
		p1.addComment(c2);
		
		// Criação de novos comentários
		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("May the force be with you!");
		
		// Criação do segundo post
		Post p2 = new Post(
				sdf.parse("15/01/2025 22:45:51"), // Converte a string em um objeto Date
				"Good night guys!",
				"See you tomorrow!",
				5);
		
		// Adiciona os comentários ao segundo post
		p2.addComment(c3);
		p2.addComment(c4);
		
		// Exibe os posts formatados no console (graças ao método toString() da classe Post)
		System.out.println(p1);
		System.out.println(p2);		
	}
}