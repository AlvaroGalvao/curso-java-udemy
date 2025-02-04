package Entities;

// Classe SavingsAccount que herda de Account
public class SavingsAccount extends Account {
    
    // Taxa de juros aplicada ao saldo da conta poupança
    private Double interestRate;

    // Construtor padrão sem argumentos
    public SavingsAccount() {
        super(); // Chama o construtor da classe pai (Account)
    }

    // Construtor com parâmetros para inicializar a conta poupança
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance); // Inicializa os atributos herdados da classe Account
        this.interestRate = interestRate; // Define a taxa de juros específica da poupança
    }

    // Método getter para obter a taxa de juros
    public Double getInterestRate() {
        return interestRate;
    }

    // Método setter para definir a taxa de juros
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    // Método que aplica a taxa de juros ao saldo da conta, atualizando-o
    public void updateBalance() {
        balance += balance * interestRate;
    }
    
    //Override é uma boa prática para indicar para o compilador que eu estou sobrepondo um código herdado ou já criado
    @Override
    public void withdraw(Double amount) {
    	balance -= amount; //Retira o valor informado da conta sem a taxa padrão
    }
}