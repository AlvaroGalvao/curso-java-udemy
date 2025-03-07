package Model.Entities; // Declaração do pacote onde a classe está localizada

import java.time.LocalDateTime; // Importação da classe LocalDateTime para trabalhar com datas e horários

// Classe que representa um aluguel de carro
public class CarRental {
    
    private LocalDateTime start; // Data e hora de início do aluguel
    private LocalDateTime finish; // Data e hora de término do aluguel
    
    private Vehicle vehicle; // Veículo alugado
    private Invoice invoice; // Fatura do aluguel (pode ser nula inicialmente)
    
    // Construtor padrão sem argumentos
    public CarRental() {
    }
    
    // Construtor que inicializa o aluguel com as datas e o veículo correspondente
    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }
    
    // Método getter para obter a data de início do aluguel
    public LocalDateTime getStart() {
        return start;
    }
    
    // Método setter para definir a data de início do aluguel
    public void setStart(LocalDateTime start) {
        this.start = start;
    }
    
    // Método getter para obter a data de término do aluguel
    public LocalDateTime getFinish() {
        return finish;
    }
    
    // Método setter para definir a data de término do aluguel
    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }
    
    // Método getter para obter o veículo alugado
    public Vehicle getVehicle() {
        return vehicle;
    }
    
    // Método setter para definir o veículo alugado
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    // Método getter para obter a fatura do aluguel
    public Invoice getInvoice() {
        return invoice;
    }
    
    // Método setter para definir a fatura do aluguel
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}