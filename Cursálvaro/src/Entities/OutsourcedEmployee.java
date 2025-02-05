package Entities; // Declaração do pacote onde a classe está localizada.

public class OutsourcedEmployee extends Employee { // Declaração da classe que herda de Employee.

    private Double additionalCharge; // Taxa adicional exclusiva para funcionários terceirizados.

    public OutsourcedEmployee() {
        super(); // Chama o construtor padrão da superclasse Employee.
    }

    // Construtor que inicializa os atributos herdados e o adicional do terceirizado.
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour); // Chama o construtor da superclasse Employee.
        this.additionalCharge = additionalCharge; // Inicializa o atributo específico.
    }

    public Double getAdditionalCharge() { // Retorna o valor da taxa adicional.
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) { // Permite modificar a taxa adicional.
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() { // Sobrescreve o método payment() da classe Employee.
        return super.payment() + additionalCharge * 1.1; // Adiciona 10% ao adicional e soma ao pagamento base.
    }
}