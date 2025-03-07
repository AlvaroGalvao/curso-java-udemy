package Applications; // Declaração do pacote onde a classe está localizada

import java.time.LocalDateTime; // Importação para trabalhar com data e hora
import java.time.format.DateTimeFormatter; // Importação para formatar data e hora
import java.util.Locale; // Importação para definir configurações regionais
import java.util.Scanner; // Importação para entrada de dados pelo console

import Model.Entities.CarRental; // Importação da classe de aluguel de carro
import Model.Entities.Vehicle; // Importação da classe de veículo
import Model.Services.BrazilTaxService; // Importação do serviço de imposto brasileiro
import Model.Services.RentalService; // Importação do serviço de aluguel

// Classe principal que executa o programa
public class Aula37 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); // Define a localidade padrão para os EUA (ponto decimal em números)
        Scanner scan = new Scanner(System.in); // Criação do scanner para entrada de dados
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Define o formato da data/hora
        
        // Entrada de dados do aluguel
        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String carModel = scan.nextLine(); // Lê o modelo do carro
        
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(scan.nextLine(), fmt); // Lê e formata a data/hora de retirada
        
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scan.nextLine(), fmt); // Lê e formata a data/hora de devolução
        
        // Criação do objeto CarRental com os dados informados
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        
        // Entrada de dados dos preços
        System.out.print("Entre com o preço por hora: ");
        Double pricePerHour = scan.nextDouble(); // Lê o preço por hora
        
        System.out.print("Entre com o preço por dia: ");
        Double pricePerDay = scan.nextDouble(); // Lê o preço por dia
        
        // Criação do serviço de aluguel com os preços e o serviço de imposto brasileiro
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        
        // Processamento da fatura com base no aluguel
        rentalService.processInvoice(cr);
        
        // Exibição dos resultados da fatura
        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
        
        scan.close(); // Fecha o scanner
    }
}
