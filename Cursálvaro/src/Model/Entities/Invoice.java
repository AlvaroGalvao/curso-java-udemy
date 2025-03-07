package Model.Entities; // Declaração do pacote onde a classe está localizada

// Classe que representa a fatura de um aluguel de veículo
public class Invoice {
    
    private Double basicPayment; // Pagamento básico pelo aluguel
    private Double tax; // Imposto aplicado sobre o pagamento básico
    
    // Construtor padrão sem argumentos
    public Invoice() {
    }
    
    // Construtor que inicializa a fatura com pagamento básico e imposto
    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }
    
    // Método getter para obter o pagamento básico
    public Double getBasicPayment() {
        return basicPayment;
    }
    
    // Método setter para definir o pagamento básico
    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }
    
    // Método getter para obter o imposto
    public Double getTax() {
        return tax;
    }
    
    // Método setter para definir o imposto
    public void setTax(Double tax) {
        this.tax = tax;
    }
    
    // Método que retorna o valor total a ser pago (pagamento básico + imposto)
    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }
}