// Pacote onde a classe está localizada
package Model.Entities;

// Importações necessárias para manipulação de datas e exceções personalizadas
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import Model.Exception.DomainException;

// Classe que representa uma reserva de quarto
public class Reservation2 {

    // Objeto de formatação de data para exibição padronizada (dia/mês/ano)
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // Atributos da reserva
    private Integer roomNumber;  // Número do quarto
    private Date checkIn;        // Data de entrada
    private Date checkOut;       // Data de saída

    // Construtor padrão (sem parâmetros)
    public Reservation2() {
    }

    // Construtor que inicializa a reserva com número do quarto, check-in e check-out
    public Reservation2(Integer roomNumber, Date checkIn, Date checkOut) {
        // Validação para garantir que a data de check-out seja posterior à de check-in
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date.");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    // Métodos getters e setters para os atributos
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    // Método que calcula a duração da estadia em dias
    public Long duration() {
        Long diff = checkOut.getTime() - checkIn.getTime();  // Diferença entre as datas em milissegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);  // Converte milissegundos para dias
    }

    // Método para atualizar as datas de check-in e check-out
    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();  // Data atual

        // Valida se as novas datas são futuras
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for update must be future dates.");
        } 
        // Valida se a data de check-out é posterior à de check-in
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date.");
        }

        // Atualiza as datas da reserva
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    // Método que retorna uma representação em string da reserva
    @Override
    public String toString() {
        return "Room " + roomNumber
                + ", check-in: " + sdf.format(checkIn)  // Formata a data de check-in
                + ", check-out: " + sdf.format(checkOut)  // Formata a data de check-out
                + ", " + duration()
                + " nights.";
    }
}