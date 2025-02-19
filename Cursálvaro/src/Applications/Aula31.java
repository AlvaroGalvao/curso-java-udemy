package Applications; // Declaração do pacote ao qual esta classe pertence

import java.util.Scanner; // Importação da classe Scanner para leitura de arquivos
import java.io.File; // Importação da classe File para manipulação de arquivos
import java.io.IOException; // Importação da classe IOException para tratamento de erros

public class Aula31 { // Declaração da classe pública Aula31
	
	public static void main(String[] args) { // Método principal que inicia a execução do programa
		
		// Criação de um objeto File que representa o arquivo a ser lido
		File file = new File("C:\\temp\\in.txt");
		Scanner scan = null; // Declaração da variável Scanner para leitura do arquivo
		
		try {
			scan = new Scanner(file); // Instancia o Scanner para ler o arquivo
			while (scan.hasNextLine()) { // Enquanto houver linhas no arquivo
				System.out.println(scan.nextLine()); // Lê e imprime a próxima linha
			}
		}
		catch (IOException e) { // Captura possíveis erros na abertura/leitura do arquivo
			System.out.println("Error: " + e.getMessage()); // Exibe a mensagem de erro
		}
		finally { // Bloco que sempre será executado, independentemente de exceções
			if (scan != null) { // Verifica se o Scanner foi instanciado
				scan.close(); // Fecha o Scanner para liberar recursos
			}
		}
	}
}