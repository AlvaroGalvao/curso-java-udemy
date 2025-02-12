package Model.Entities; // Define o pacote onde a classe está localizada.

import java.util.Date; // Importa a classe Date para manipulação de datas.
import java.util.concurrent.TimeUnit; // Importa TimeUnit para conversão de tempo.
import java.text.SimpleDateFormat; // Importa SimpleDateFormat para formatação de datas.

public class Reservation { // Define a classe Reservation (Reserva).

    // Declara um formato de data estático para ser utilizado na formatação das datas.
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber; // Número do quarto.
    private Date checkIn; // Data de check-in.
    private Date checkOut; // Data de check-out.

    // Construtor padrão (sem argumentos).
    public Reservation() {
    }

    // Construtor que inicializa a reserva com número do quarto, check-in e check-out.
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    // Getter para obter o número do quarto.
    public Integer getRoomNumber() {
        return roomNumber;
    }

    // Setter para definir o número do quarto.
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    // Getter para obter a data de check-in.
    public Date getCheckIn() {
        return checkIn;
    }

    // Getter para obter a data de check-out.
    public Date getCheckOut() {
        return checkOut;
    }

    // Método para calcular a duração da estadia em dias.
    public Long duration() {
        // Calcula a diferença em milissegundos entre check-out e check-in.
        Long diff = checkOut.getTime() - checkIn.getTime();
        // Converte a diferença para dias e retorna.
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    // Método para atualizar as datas da reserva.
    public void updateDates(Date checkIn, Date checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    // Método sobrescrito para retornar uma representação textual da reserva.
    @Override
    public String toString() {
        return "Room " + roomNumber
                + ", check-in: " + sdf.format(checkIn) // Formata a data de check-in.
                + ", check-out: " + sdf.format(checkOut) // Formata a data de check-out.
                + ", " + duration() // Inclui a duração da estadia.
                + " nights.";
    }
}
