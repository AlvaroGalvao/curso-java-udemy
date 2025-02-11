package Model.Entities; // Declaração do pacote onde a classe está localizada.

public class Employee { // Declaração da classe Employee.

    // Atributos privados para armazenar os dados do funcionário.
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee() { // Construtor padrão (sem argumentos).
    }

    // Construtor que inicializa os atributos do funcionário.
    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    // Métodos getters e setters para acessar e modificar os atributos.

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    // Método para calcular o pagamento do funcionário.
    public Double payment() {
        return hours * valuePerHour; // Multiplica as horas trabalhadas pelo valor por hora.
    }
}