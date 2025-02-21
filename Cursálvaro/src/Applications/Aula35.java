package Applications; // Define o pacote onde a classe está localizada.

import java.io.File; // Importa a classe File para manipulação de arquivos e diretórios.
import java.util.Scanner; // Importa a classe Scanner para entrada de dados pelo usuário.

public class Aula35 { // Declaração da classe pública Aula35.

    public static void main(String[] args) { // Método principal que inicia a execução do programa.

        Scanner scan = new Scanner(System.in); // Instancia um Scanner para capturar entrada do usuário.

        // Solicita ao usuário que insira um caminho de pasta.
        System.out.println("Enter a folder path: ");
        String strPath = scan.nextLine(); // Lê o caminho digitado pelo usuário.

        File path = new File(strPath); // Cria um objeto File representando o caminho informado.

        // Lista todos os diretórios dentro do caminho fornecido.
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder); // Exibe os diretórios encontrados.
        }

        // Lista todos os arquivos dentro do caminho fornecido.
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file); // Exibe os arquivos encontrados.
        }

        // Cria um novo diretório chamado "subdir" dentro do caminho especificado.
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success); // Indica se a criação do diretório foi bem-sucedida.

        scan.close(); // Fecha o Scanner para evitar vazamento de recursos.
    }
}