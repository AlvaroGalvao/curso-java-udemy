package Applications; // Define o pacote onde a classe está localizada.

import java.io.BufferedWriter; // Importa a classe BufferedWriter para escrita eficiente em arquivos.
import java.io.FileWriter; // Importa a classe FileWriter para manipulação de arquivos.
import java.io.IOException; // Importa a classe IOException para tratamento de erros de entrada e saída.

public class Aula34 { // Declaração da classe pública Aula34.

    public static void main(String[] args) { // Método principal que inicia a execução do programa.

        // Define um array de strings contendo mensagens que serão escritas no arquivo.
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        // Define o caminho do arquivo onde os dados serão gravados.
        String path = "C:\\temp\\out.txt";

        // Usa um bloco try-with-resources para garantir o fechamento do BufferedWriter automaticamente.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { 
            // Itera sobre cada linha do array e escreve no arquivo.
            for (String line : lines) {
                bw.write(line); // Escreve a linha no arquivo.
                bw.newLine(); // Adiciona uma quebra de linha após cada escrita.
            }
        }
        catch (IOException e) { // Captura possíveis exceções de IO.
            e.printStackTrace(); // Imprime o rastreamento do erro no console.
        }
    }
}