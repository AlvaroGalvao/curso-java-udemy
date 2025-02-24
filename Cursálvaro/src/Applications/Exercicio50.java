package Applications;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import Model.Entities.Product2; // Importa a classe Product2 do pacote Model.Entities

public class Exercicio50 {
	
	public static void main(String[] args) {
		
		// Define o locale para US, garantindo o uso de ponto como separador decimal
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// Lista para armazenar os produtos lidos do arquivo
		List<Product2> list = new ArrayList<>();
		
		// Solicita ao usuário o caminho do arquivo de entrada
		System.out.println("Informe o caminho do arquivo: ");
		String sourceFileStr = scan.nextLine();
		
		// Cria um objeto File para representar o arquivo de entrada
		File sourceFile = new File(sourceFileStr);
		// Obtém o diretório pai do arquivo
		String sourceFolderStr = sourceFile.getParent();
		
		// Cria uma subpasta "out" dentro do diretório do arquivo de entrada
		new File(sourceFolderStr + "\\out").mkdir();
		
		// Define o caminho do arquivo de saída dentro da pasta "out"
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		// Bloco try-with-resources para garantir fechamento automático do BufferedReader
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			
			String itemCsv = br.readLine(); // Lê a primeira linha do arquivo
			while (itemCsv != null) { // Loop para ler todas as linhas do arquivo
				
				// Divide a linha lida em um array de Strings usando ";" como separador
				String[] fields = itemCsv.split(";");
				String name = fields[0]; // Nome do produto
				Double price = Double.parseDouble(fields[1]); // Preço do produto
				int quantity = Integer.parseInt(fields[2]); // Quantidade do produto
				
				// Adiciona um novo produto à lista
				list.add(new Product2(name, price, quantity));
				
				itemCsv = br.readLine(); // Lê a próxima linha do arquivo
			}
			
			// Bloco try-with-resources para escrita no arquivo de saída
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				
				// Percorre a lista de produtos e escreve no arquivo de saída
				for (Product2 item : list) {
					bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
					bw.newLine(); // Adiciona uma nova linha no arquivo
				}
				
				// Mensagem indicando que o arquivo foi criado com sucesso
				System.out.println(targetFileStr + " CRIADO!");
				
			} catch (IOException e) {
				System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
			}			
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		
		scan.close(); // Fecha o Scanner
	}
}