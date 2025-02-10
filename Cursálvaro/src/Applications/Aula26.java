package Applications;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Aula26 {
	
	public static void main(String[] args) {
		// Inicia a execução chamando o primeiro método
		method1();
		
		// Mensagem indicando o fim do programa
		System.out.println("End of program");
	}
	
	public static void method1() {
		// Indica o início da execução do método 1
		System.out.println("***METHOD1 START***");
		// Chama o segundo método
		method2();
		// Indica o fim da execução do método 1
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		// Indica o início da execução do método 2
		System.out.println("***METHOD2 START***");
		// Criação do objeto Scanner para entrada de dados
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
			// Exibe o rastreamento da pilha para depuração
			e.printStackTrace();
			// Consome a entrada incorreta para evitar loop infinito
			scan.next();
		}
		// Captura a exceção caso o usuário informe um valor inválido (não inteiro)
		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		// Fecha o scanner para evitar vazamento de recursos
		scan.close();
		// Indica o fim da execução do método 2
		System.out.println("***METHOD2 END***");
	}
}