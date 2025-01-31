package Applications; // Define o pacote da classe

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.util.Scanner;

import Entities.Client;
import Entities.Order1;
import Entities.OrderItem;
import Entities.Product;
import Entities.Enums.OrderStatus;

// Classe principal que executa a aplicação
public class Exercicio45 { 
	
	public static void main(String[] args) throws ParseException { 
		
		// Define a localização para formato numérico e monetário dos EUA (ponto decimal)
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato da data
		
		// Captura os dados do cliente
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("Email: ");
		String email = scan.next();
		System.out.print("BirthDate (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(scan.next()); // Converte a entrada em um objeto Date
		
		// Instancia um novo cliente com os dados informados
		Client client = new Client(name, email, birthDate);
		
		// Captura os dados do pedido
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scan.next()); // Converte a string informada para enum
		
		// Cria um novo pedido com a data atual, status e cliente associado
		Order1 order = new Order1(new Date(), status, client);
		
		// Captura os itens do pedido
		System.out.print("How many items to this order? ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) { 
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			scan.nextLine(); // Consome a quebra de linha pendente
			String productName = scan.nextLine(); // Captura o nome do produto
			System.out.print("Product price: ");
			Double productPrice = scan.nextDouble(); // Captura o preço do produto
			
			// Cria um novo produto com os dados informados
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = scan.nextInt(); // Captura a quantidade do produto no pedido
			
			// Cria um novo item do pedido com o produto, preço e quantidade
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			// Adiciona o item ao pedido
			order.addItem(orderItem);
		}
		
		// Exibe o resumo do pedido
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		scan.close(); // Fecha o scanner para evitar vazamento de recursos
	}
}