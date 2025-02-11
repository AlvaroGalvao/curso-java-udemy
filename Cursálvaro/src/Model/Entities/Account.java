package Model.Entities;

// Classe que representa uma conta bancária
public class Account {
    
    // Atributos privados da conta, com "private" esses atributos só podem ser acessados pela própria classe Account
    private Integer number; // Número da conta
    private String holder;  // Titular da conta
    //protected permite que o atributo seja acessado por outra classe, no caso, a classe BusinessAccount
    protected Double balance; // Saldo da conta
    
    // Construtor padrão (sem argumentos)
    public Account() {
    }
    
    // Construtor que inicializa os atributos da conta
    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    
    // Métodos getters e setters para acessar e modificar os atributos
    public Integer getNumber() {
        return number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }
    
    public String getHolder() {
        return holder;
    }
    
    public void setHolder(String holder) {
        this.holder = holder;
    }
    
    public Double getBalance() {
        return balance;
    }
    
    // Método para realizar saque na conta
    public void withdraw(Double amount) {
        balance -= amount + 5.0; // Reduz o valor informado, e a taxa da operação, do saldo 
    }
    
    // Método para realizar depósito na conta
    public void deposit(Double amount) {
        balance += amount; // Adiciona o valor ao saldo
    }
}