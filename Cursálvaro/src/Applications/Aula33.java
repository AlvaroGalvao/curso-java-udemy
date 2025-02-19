package Applications; // Define o pacote em que a classe está localizada

import java.io.BufferedReader; // Importa a classe BufferedReader para leitura otimizada de caracteres
import java.io.FileReader;     // Importa a classe FileReader para ler o arquivo
import java.io.IOException;    // Importa a exceção IOException para tratamento de erros de I/O

public class Aula33 {
	
	public static void main(String[] args) {
		
		// Caminho do arquivo a ser lido
		String path = "C:\\temp\\in.txt";
		
		// Uso do try-with-resources para garantir que o BufferedReader seja fechado automaticamente
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			// Lê a primeira linha do arquivo
			String line = br.readLine();
			
			// Enquanto houver linhas no arquivo, imprime a linha e lê a próxima
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) { // Caso ocorra algum erro na leitura do arquivo
			System.out.println("Error: " + e.getMessage());
		}
	}
}