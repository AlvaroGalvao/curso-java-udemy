package Model.Services; // Declaração do pacote onde a classe está localizada

// Classe que representa o serviço de impostos do Brasil
// Implementa a interface TaxService (presumivelmente declarada em outro arquivo)
public class BrazilTaxService implements TaxService {
    
    // Método que calcula o imposto com base no valor informado
    @Override
    public double tax(double amount) {
        if (amount <= 100.0) { // Se o valor for até 100, a taxa é de 20%
            return amount * 0.2;
        } else { // Se o valor for maior que 100, a taxa é de 15%
            return amount * 0.15;
        }
    }
}