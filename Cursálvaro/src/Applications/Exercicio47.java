package Applications; // Define o pacote onde esta classe está localizada

// Importação das classes necessárias
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.text.ParseException;

// Importação das classes do pacote Entities (assumindo que essas classes existem)
import Model.Entities.Product1;
import Model.Entities.ImportedProduct;
import Model.Entities.UsedProduct;

public class Exercicio47 {
    
    public static void main(String[] args) throws ParseException {
        
        // Define o local padrão para os Estados Unidos (formatação de números e datas)
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato de data esperado
        
        // Lista para armazenar os produtos criados
        List<Product1> list = new ArrayList<>();
        
        // Solicita ao usuário o número de produtos a serem cadastrados
        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();
        
        // Loop para capturar os dados de cada produto
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Commom, used or imported (c/u/i)? "); // Define o tipo de produto
            char ch = scan.next().charAt(0); // Captura o primeiro caractere digitado
            
            System.out.print("Name: ");
            scan.nextLine(); // Consumir a quebra de linha pendente
            String name = scan.nextLine(); // Captura o nome do produto
            
            System.out.print("Price: ");
            double price = scan.nextDouble(); // Captura o preço do produto
            
            // Verifica o tipo de produto informado e cria o objeto correspondente
            if (ch == 'c') {
                // Produto comum
                list.add(new Product1(name, price));
            } 
            else if (ch == 'u') {
                // Produto usado - necessita da data de fabricação
                System.out.print("Manufacture Date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(scan.next()); // Captura e converte a data
                list.add(new UsedProduct(name, price, manufactureDate));
            } 
            else {
                // Produto importado - necessita da taxa alfandegária
                System.out.print("Customs fee: ");
                double customsFee = scan.nextDouble(); // Captura o valor da taxa
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }
        
        // Exibe as etiquetas de preço de cada produto
        System.out.println();
        System.out.println("PRICE TAGS:");
        
        for (Product1 prod : list) {
            System.out.println(prod.priceTag()); // Chama o método que retorna a etiqueta de preço do produto
        }
        
        // Fecha o scanner para evitar vazamento de recursos
        scan.close();
    }
}