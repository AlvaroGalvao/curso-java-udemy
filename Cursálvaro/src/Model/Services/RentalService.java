package Model.Services; // Declaração do pacote onde a classe está localizada

import java.time.Duration; // Importação para calcular a duração entre datas

import Model.Entities.CarRental; // Importação da classe de aluguel de carro
import Model.Entities.Invoice; // Importação da classe de fatura

// Classe que representa o serviço de aluguel de carros
public class RentalService {
    
    private Double pricePerHour; // Preço do aluguel por hora
    private Double pricePerDay;  // Preço do aluguel por dia
    
    private TaxService taxService; // Serviço de impostos utilizado
    
    // Construtor que recebe os preços e o serviço de impostos
    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }
    
    // Método que processa a fatura do aluguel com base na duração e nos preços
    public void processInvoice(CarRental carRental) {
        
        // Calcula a duração do aluguel em minutos
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0; // Converte os minutos para horas
        
        double basicPayment;
        
        // Se o aluguel for de até 12 horas, cobra por hora (arredondando para cima)
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } 
        // Se o aluguel for maior que 12 horas, cobra por dia (arredondando para cima)
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }
        
        // Calcula o imposto com base no valor do pagamento básico
        double tax = taxService.tax(basicPayment);
        
        // Cria a fatura e associa ao aluguel
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}