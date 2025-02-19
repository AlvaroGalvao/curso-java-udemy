package Applications; // Define o pacote onde a classe está localizada

import java.io.BufferedReader; // Importa a classe BufferedReader para leitura otimizada de caracteres
import java.io.FileReader; // Importa a classe FileReader para leitura de arquivos
import java.io.IOException; // Importa a exceção IOException para tratamento de erros de I/O

public class Aula32 {
	
	public static void main(String[] args) {
		
		// Caminho do arquivo que será lido
		String path = "C:\\temp\\in.txt";
		
		// Declaração dos objetos FileReader e BufferedReader
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// Instancia o FileReader com o caminho do arquivo
			fr = new FileReader(path);
			// Instancia o BufferedReader para melhorar a leitura do arquivo
			br = new BufferedReader(fr);
			
			// Lê a primeira linha do arquivo
			String line = br.readLine();
			
			// Continua lendo enquanto houver linhas (linha != null)
			while (line != null) {
				System.out.println(line); // Imprime a linha lida no console
				line = br.readLine(); // Lê a próxima linha
			}
		}
		catch (IOException e) { // Captura exceções de I/O
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			// No bloco finally, garante que os recursos sejam fechados mesmo em caso de erro
			try {
				if (br != null) { // Se o BufferedReader foi instanciado, fecha-o
					br.close();
				}
				if (fr != null) { // Se o FileReader foi instanciado, fecha-o
					fr.close();
				}
			}
			catch (IOException e) {
				// Imprime o stack trace em caso de erro ao fechar os recursos
				e.printStackTrace();
			}
		}
	}
}