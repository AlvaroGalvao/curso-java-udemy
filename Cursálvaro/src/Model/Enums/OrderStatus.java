package Model.Enums;

/**
 * Enumeração que representa os diferentes status de um pedido.
 * Cada constante define um estado específico do ciclo de vida de um pedido.
 */
public enum OrderStatus {
    
    /**
     * Pedido pendente de pagamento.
     */
    PENDING_PAYMENT,
    
    /**
     * Pedido em processamento.
     */
    PROCESSING,
    
    /**
     * Pedido enviado ao cliente.
     */
    SHIPPED,
    
    /**
     * Pedido entregue ao cliente.
     */
    DELIVERED;
}