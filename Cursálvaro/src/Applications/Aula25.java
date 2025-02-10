package Applications;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Aula25 {
	
	public static void main(String[] args) {
		// Criação de um objeto Scanner para entrada de dados do usuário
		Scanner scan = new Scanner(System.in);
		
		// Lê uma linha de entrada, divide em partes separadas por espaço e armazena em um array de Strings
		String[] vect = scan.nextLine().split(" ");
		
		try {
			// Solicita ao usuário um número inteiro representando a posição no array
			int position = scan.nextInt();
			// Exibe o elemento da posição informada pelo usuário
			System.out.println(vect[position]);
		}
		// Captura a exceção caso o usuário informe uma posição fora dos limites do array
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}
		// Captura a exceção caso o usuário informe um valor inválido (não inteiro)
		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		// Exibe uma mensagem final, independentemente de ter ocorrido exceção ou não
		System.out.println("End of program");
		
		// Fecha o scanner para evitar vazamento de recursos
		scan.close();		
	}
}