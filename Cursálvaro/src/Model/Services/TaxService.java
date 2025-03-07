package Model.Services; // Declaração do pacote onde a interface está localizada

// Interface que define um serviço de cálculo de imposto
public interface TaxService {
    
    // Método abstrato para calcular o imposto com base em um valor informado
    double tax(double amount);
}