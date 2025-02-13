package Applications; // Define o pacote onde a classe está localizada.

import java.util.Date; // Importa a classe Date para manipulação de datas.
import java.util.Scanner; // Importa Scanner para entrada de dados do usuário.
import java.text.SimpleDateFormat; // Importa SimpleDateFormat para formatação de datas.
import java.text.ParseException; // Importa ParseException para tratamento de erros na conversão de datas.

import Model.Entities.Reservation1; // Importa a classe Reservation1 do pacote Model.Entities.

public class Aula29SolucaoRuim { // Nome da classe (indicando que esta solução não é ideal).
    
    public static void main(String[] args) throws ParseException {
        
        Scanner scan = new Scanner(System.in); // Cria um objeto Scanner para capturar entrada do usuário via teclado.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato de data esperado.
        
        // Solicita o número do quarto ao usuário.
        System.out.print("Room number: ");
        int number = scan.nextInt();
        
        // Solicita e recebe as datas de check-in e check-out do usuário.
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scan.next()); // Converte a entrada do usuário para um objeto Date.
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scan.next());
        
        // Verifica se a data de check-out é posterior à data de check-in.
        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date.");
        } else {
            // Cria um objeto Reservation1 com os dados fornecidos.
            Reservation1 reservation = new Reservation1(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation); // Exibe os detalhes da reserva.
            
            System.out.println();
            System.out.println("Enter data to update the reservation:"); // Solicita a atualização da reserva.
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scan.next()); // Captura a nova data de check-in.
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scan.next()); // Captura a nova data de check-out.
            
            // Atualiza as datas da reserva e verifica se houve erro.
            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservation);
            }
        }
        scan.close(); // Fecha o Scanner para evitar vazamento de recursos.
    }
}