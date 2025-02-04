package Entities;

// Classe que representa uma conta empresarial, estendendo a classe Account
public class BusinessAccount extends Account {
    
    private Double loanLimit; // Limite de empréstimo disponível
    
    // Construtor padrão
    public BusinessAccount() {
        super(); // Chama o construtor da classe Account
    }
    
    // Construtor que inicializa os atributos da conta empresarial
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // Chama o construtor da classe Account
        this.loanLimit = loanLimit;
    }
    
    // Método getter para o limite de empréstimo
    public Double getLoanLimit() {
        return loanLimit;
    }
    
    // Método setter para definir um novo limite de empréstimo
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    // Método para realizar um empréstimo
    public void loan(Double amount) {
        if (amount <= loanLimit) { // Verifica se o valor solicitado está dentro do limite
            // deposit(amount); - Depositaria o valor na conta
        	balance += amount; //Com o atributo sendo protected, a classe BusinessAccount consegue acessá-lo, caso estivesse private, esse código daria erro
        }
    }
    
  //Override é uma boa prática para indicar para o compilador que eu estou sobrepondo um código herdado ou já criado
    @Override
    public void withdraw(Double amount) {
    	super.withdraw(amount); //Retira o valor da conta com a taxa padrão
    	balance -= 2.0; //Retira 2 a mais do valor da conta
    }
}