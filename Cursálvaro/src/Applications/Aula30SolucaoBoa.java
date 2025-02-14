// Pacote onde a classe está localizada
package Applications;

// Importações necessárias para manipulação de datas, entrada do usuário e exceções
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import Model.Entities.Reservation2;
import Model.Exception.DomainException;

// Classe principal que contém o método main para execução do programa
public class Aula30SolucaoBoa {
    
    public static void main(String[] args) {
        
        // Scanner para entrada de dados pelo usuário
        Scanner scan = new Scanner(System.in);
        
        // Formatação de datas no padrão dia/mês/ano
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            // Entrada do número do quarto
	        System.out.print("Room number: ");
	        int number = scan.nextInt();
	        
	        // Entrada das datas de check-in e check-out
	        System.out.print("Check-in date (dd/MM/yyyy): ");
	        Date checkIn = sdf.parse(scan.next());
	        System.out.print("Check-out date (dd/MM/yyyy): ");
	        Date checkOut = sdf.parse(scan.next());
	        
	        // Criação da reserva com os dados fornecidos
	        Reservation2 reservation = new Reservation2(number, checkIn, checkOut);
	        System.out.println("Reservation: " + reservation);
	        
	        // Solicitação de novas datas para atualização da reserva
	        System.out.println();
	        System.out.println("Enter data to update the reservation:");
	        System.out.print("Check-in date (dd/MM/yyyy): ");
	        checkIn = sdf.parse(scan.next());
	        System.out.print("Check-out date (dd/MM/yyyy): ");
	        checkOut = sdf.parse(scan.next());
	        
	        // Atualiza as datas da reserva
	        reservation.updateDates(checkIn, checkOut);
	        
	        // Exibe a reserva atualizada
	        System.out.println("Reservation: " + reservation);
    	}
        // Captura erro de formatação de data
        catch (ParseException e) {
        	System.out.println("Invalid date format!");
        }
        // Captura erros de domínio definidos na classe DomainException
        catch (DomainException e) {
        	System.out.println("Error in reservation: " + e.getMessage());
        }
        // Captura erros inesperados, como entrada inválida de número do quarto
        catch (InputMismatchException e) {
        	System.out.println("Unexpected error!");
        }
        
        // Fecha o Scanner para evitar vazamento de recursos
        scan.close();
    }
}