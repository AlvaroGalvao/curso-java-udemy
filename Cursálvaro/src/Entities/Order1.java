package Entities; // Define o pacote da classe

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import Entities.Enums.OrderStatus; // Importa o enum que representa os status do pedido

// Classe que representa um pedido
public class Order1 { 
	
	// Objeto para formatar a data e hora do pedido
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	
	private Date moment; // Momento em que o pedido foi realizado
	private OrderStatus status; // Status do pedido (exemplo: Pendente, Processando, Enviado)
	
	private Client client; // Cliente associado ao pedido
	private List<OrderItem> items = new ArrayList<>(); // Lista de itens do pedido
	
	// Construtor que inicializa o pedido com data, status e cliente
	public Order1(Date moment, OrderStatus status, Client client) { 
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	// Método getter para obter a data e hora do pedido
	public Date getMoment() { 
		return moment;
	}
	
	// Método setter para modificar a data e hora do pedido
	public void setMoment(Date moment) { 
		this.moment = moment;
	}
	
	// Método getter para obter o status do pedido
	public OrderStatus getStatus() { 
		return status;
	}
	
	// Método setter para modificar o status do pedido
	public void setStatus(OrderStatus status) { 
		this.status = status;
	}
	
	// Método getter para obter o cliente associado ao pedido
	public Client getClient() { 
		return client;
	}
	
	// Método setter para modificar o cliente associado ao pedido
	public void setClient(Client client) { 
		this.client = client;
	}
	
	// Método getter para obter a lista de itens do pedido
	public List<OrderItem> getItems() { 
		return items;
	}
	
	// Método para adicionar um item ao pedido
	public void addItem(OrderItem item) { 
		items.add(item);
	}
	
	// Método para remover um item do pedido
	public void removeItem(OrderItem item) { 
		items.remove(item);
	}
	
	// Método que calcula o valor total do pedido somando os subtotais dos itens
	public Double total() { 
		Double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	// Sobrescrita do método toString para exibir detalhes do pedido de forma formatada
	@Override
	public String toString() { 
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n"); // Formata a data e hora do pedido
		sb.append("Order Status: ");
		sb.append(status + "\n"); // Exibe o status do pedido
		sb.append("Client: ");
		sb.append(client + "\n"); // Exibe os dados do cliente
		sb.append("Order Items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n"); // Lista todos os itens do pedido
		}
		sb.append("Total Price: $");
		sb.append(String.format("%.2f", total())); // Formata o total com duas casas decimais
		return sb.toString();
	}
}