package Model.Entities;

// Importações necessárias
import java.util.Date; // Classe para representar datas e horários
import Model.Enums.OrderStatus; // Enum que define os possíveis status de um pedido

/**
 * Classe que representa um Pedido (Order).
 * Contém informações como ID do pedido, momento da criação e status do pedido.
 */
public class Order {

    // Atributos privados da classe
    private Integer id; // Identificador único do pedido
    private Date moment; // Data e hora em que o pedido foi criado
    private OrderStatus status; // Status atual do pedido, baseado no enum OrderStatus

    /**
     * Construtor padrão.
     * Permite a criação de um objeto sem definir valores iniciais.
     */
    public Order() {
    }

    /**
     * Construtor parametrizado.
     * Inicializa um objeto Order com os valores fornecidos.
     * 
     * @param id O identificador único do pedido.
     * @param moment A data e hora do pedido.
     * @param status O status atual do pedido.
     */
    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    // Métodos Getter e Setter para acessar e modificar os atributos privados

    /**
     * Obtém o identificador único do pedido.
     * 
     * @return O ID do pedido.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define o identificador único do pedido.
     * 
     * @param id O novo ID do pedido.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtém a data e hora do pedido.
     * 
     * @return O momento do pedido.
     */
    public Date getMoment() {
        return moment;
    }

    /**
     * Define a data e hora do pedido.
     * 
     * @param moment A nova data e hora do pedido.
     */
    public void setMoment(Date moment) {
        this.moment = moment;
    }

    /**
     * Obtém o status atual do pedido.
     * 
     * @return O status do pedido.
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * Define o status atual do pedido.
     * 
     * @param status O novo status do pedido.
     */
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    /**
     * Sobrescreve o método toString para fornecer uma representação textual do pedido.
     * 
     * @return Uma string contendo os detalhes do pedido.
     */
    @Override
    public String toString() {
        return "Order [id = " + id + ", moment = " + moment + ", status = " + status + "]";
    }
}