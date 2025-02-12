package Applications; // Define o pacote onde a classe está localizada.

import java.util.Date; // Importa a classe Date para manipulação de datas.
import java.util.Scanner; // Importa Scanner para entrada de dados do usuário.
import java.text.SimpleDateFormat; // Importa SimpleDateFormat para formatação de datas.
import java.text.ParseException; // Importa ParseException para tratamento de erros na conversão de datas.

import Model.Entities.Reservation; // Importa a classe Reservation do pacote Model.Entities.

public class Aula28SolucaoMuitoRuim { // Nome da classe (indicando que esta solução não é ideal).
	
    public static void main(String[] args) throws ParseException {
		
        Scanner scan = new Scanner(System.in); // Criação do Scanner para entrada de dados.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Formato de data esperado pelo usuário.
		
        // Solicita o número do quarto.
        System.out.print("Room number: ");
        int number = scan.nextInt();
		
        // Solicita e lê as datas de check-in e check-out.
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scan.next()); // Converte a entrada do usuário para um objeto Date.
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scan.next());
		
        // Verifica se a data de check-out é posterior à de check-in.
        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date.");
        } 
        else {
            // Cria uma nova reserva com os dados fornecidos.
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation); // Exibe os detalhes da reserva.
			
            System.out.println();
            System.out.println("Enter data to update the reservation:"); // Solicita atualização da reserva.
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scan.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scan.next());
			
            Date now = new Date(); // Obtém a data atual.
            
            // Verifica se as novas datas são futuras.
            if (checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates.");
            } 
            // Verifica novamente se a data de check-out é posterior à de check-in.
            else if (!checkOut.after(checkIn)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date.");
            } 
            else {
                // Atualiza as datas da reserva e exibe a nova reserva.
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }
        }
        scan.close(); // Fecha o Scanner para evitar vazamento de recursos.
    }
}