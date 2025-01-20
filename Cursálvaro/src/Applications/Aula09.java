package Applications;

import java.util.ArrayList; // Importação para a classe ArrayList, que é uma implementação da interface List
import java.util.List; // Importação para a interface List, que é implementada pela classe ArrayList
import java.util.stream.Collectors; // Importação para a classe Collectors, usada para coletar os resultados do stream

// Programa que demonstra operações com listas e streams em Java
public class Aula09 {

	public static void main(String[] args) {
		
		// Criação de uma lista do tipo ArrayList que armazenará Strings
		List<String> list = new ArrayList<>();
		
		// Adiciona elementos à lista
		list.add("Alvaro");
		list.add("Alberto");
		list.add("Amanda");
		list.add("Ana Clara");
		list.add("Maria");
		list.add("Valmir");
		list.add("Alex");
		list.add("Graziele");
		list.add("Bob");
		list.add(2, "Vinicius"); // Adiciona o "Vinicius" na posição 2 da lista (index começa em 0)
		
		// Exibe os elementos da lista original
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println(); // Linha em branco para separar as saídas
		
		// Remove elementos da lista que começam com a letra 'V' usando expressão lambda
		list.removeIf(x -> x.charAt(0) == 'V');
		
		// Exibe os elementos da lista após remoção
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println(); // Linha em branco para separar as saídas
		
		// Exibe o índice do elemento "Graziele" na lista
		System.out.println("Index of Graziele: " + list.indexOf("Graziele"));
		
		System.out.println(); // Linha em branco para separar as saídas
		
		// Usa streams para filtrar os elementos que começam com a letra 'A' e os coleta em uma nova lista
		List<String> result = list.stream()
			.filter(x -> x.charAt(0) == 'A') // Filtra os elementos que começam com 'A'
			.collect(Collectors.toList()); // Coleta os resultados em uma nova lista
		
		// Exibe os elementos filtrados
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println(); // Linha em branco para separar as saídas
		
		// Busca o primeiro elemento que começa com 'A' usando streams e retorna "null" caso não encontre nenhum
		String nome = list.stream()
			.filter(x -> x.charAt(0) == 'A') // Filtra os elementos que começam com 'A'
			.findFirst() // Obtém o primeiro resultado encontrado
			.orElse(null); // Retorna null caso não encontre nenhum resultado
		
		// Exibe o nome encontrado ou "null"
		System.out.println(nome);
	}
}