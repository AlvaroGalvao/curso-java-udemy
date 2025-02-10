package Applications;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aula27 {
	
	public static void main(String[] args) {
		// Criação de um objeto File para representar o arquivo a ser lido
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			// Inicializa o Scanner para leitura do arquivo
			sc = new Scanner(file);
			// Lê e imprime cada linha do arquivo enquanto houver conteúdo
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		// Captura a exceção caso o arquivo não seja encontrado
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		// Bloco finally garante que o Scanner será fechado, evitando vazamento de recursos
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed!");
		}
	}
}