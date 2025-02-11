// Define o pacote ao qual esta classe pertence
package Model.Entities;

import java.util.Date;

/**
 * A classe `HourContract` representa um contrato por hora para um trabalhador.
 * Ela contém informações sobre a data do contrato, o valor por hora trabalhada,
 * e o número total de horas trabalhadas.
 */
public class HourContract {

    // Data em que o contrato foi firmado
    private Date date;

    // Valor pago por hora trabalhada
    private Double valuePerHour;

    // Número de horas trabalhadas no contrato
    private Integer hours;

    /**
     * Construtor padrão (sem argumentos).
     * Cria uma instância da classe `HourContract` sem inicializar os atributos.
     */
    public HourContract() {
    }

    /**
     * Construtor com argumentos.
     * Permite criar uma instância da classe `HourContract` com todos os atributos inicializados.
     * 
     * @param date A data do contrato.
     * @param valuePerHour O valor por hora trabalhada.
     * @param hours O número de horas trabalhadas.
     */
    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    /**
     * Método getter para o atributo `date`.
     * 
     * @return A data do contrato.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Método setter para o atributo `date`.
     * Permite definir ou modificar a data do contrato.
     * 
     * @param date A nova data do contrato.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Método getter para o atributo `valuePerHour`.
     * 
     * @return O valor por hora trabalhada.
     */
    public Double getValuePerHour() {
        return valuePerHour;
    }

    /**
     * Método setter para o atributo `valuePerHour`.
     * Permite definir ou modificar o valor por hora trabalhada.
     * 
     * @param valuePerHour O novo valor por hora trabalhada.
     */
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    /**
     * Método getter para o atributo `hours`.
     * 
     * @return O número de horas trabalhadas.
     */
    public Integer getHours() {
        return hours;
    }

    /**
     * Método setter para o atributo `hours`.
     * Permite definir ou modificar o número de horas trabalhadas.
     * 
     * @param hours O novo número de horas trabalhadas.
     */
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    /**
     * Método que calcula o valor total do contrato.
     * Multiplica o valor por hora pelo número de horas trabalhadas.
     * 
     * @return O valor total do contrato.
     */
    public Double totalValue() {
        return valuePerHour * hours;
    }
}