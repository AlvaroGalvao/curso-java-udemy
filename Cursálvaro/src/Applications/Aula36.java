package Applications; // Define o pacote onde a classe está localizada.

import java.util.Scanner; // Importa a classe Scanner para entrada de dados pelo usuário.
import java.io.File; // Importa a classe File para manipulação de arquivos.

public class Aula36 { // Declaração da classe pública Aula36.

    public static void main(String[] args) { // Método principal que inicia a execução do programa.

        Scanner scan = new Scanner(System.in); // Instancia um Scanner para capturar entrada do usuário.

        // Solicita ao usuário que insira um caminho de arquivo.
        System.out.println("Enter a file path: ");
        String strPath = scan.nextLine(); // Lê o caminho digitado pelo usuário.

        File path = new File(strPath); // Cria um objeto File representando o caminho informado.

        // Exibe informações sobre o arquivo ou diretório especificado.
        System.out.println("getName: " + path.getName()); // Retorna o nome do arquivo ou diretório.
        System.out.println("getParent: " + path.getParent()); // Retorna o diretório pai do arquivo ou diretório.
        System.out.println("getPath: " + path.getPath()); // Retorna o caminho completo do arquivo ou diretório.

        scan.close(); // Fecha o Scanner para evitar vazamento de recursos.
    }
}