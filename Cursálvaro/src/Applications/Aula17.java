package Applications;

// Importações necessárias
import java.util.Date; // Classe para manipulação de datas
import Model.Entities.Order; // Classe Order definida no pacote Entities
import Model.Enums.OrderStatus; // Enum OrderStatus definido no pacote Entities.Enums

/**
 * Classe principal do programa Aula17.
 * Demonstra a criação e manipulação de objetos da classe Order e do enum OrderStatus.
 */
public class Aula17 {
    
    public static void main(String[] args) {
        
        // Cria uma nova instância de Order com ID 1080, a data atual e o status PENDING_PAYMENT.
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        
        // Imprime no console os detalhes do pedido, utilizando o método toString() da classe Order.
        System.out.println(order);
        
        // Define uma variável os1 com o status DELIVERED do enum OrderStatus.
        OrderStatus os1 = OrderStatus.DELIVERED;
        
        // Obtém o status DELIVERED do enum OrderStatus a partir de uma string.
        // Utiliza o método valueOf, que converte uma string para o valor correspondente do enum.
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        
        // Imprime no console o status os1.
        System.out.println(os1);
        
        // Imprime no console o status os2.
        System.out.println(os2);        
    }
}