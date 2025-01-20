package Entities;

// Classe que representa a entidade BancoCliente, que gerencia informações de clientes bancários, como nome, número da conta e saldo.
public class BancoCliente {

    // Atributos da classe BancoCliente: nome (String), valorConta (double) e numeroConta (int).
    private String nome;
    private double valorConta;
    private int numeroConta;

    // Construtor da classe, utilizado para inicializar os atributos nome, numeroConta e valorConta.
    // Recebe três parâmetros: nome (String), valorConta (Double) e numeroConta (int).
    public BancoCliente(String nome, Double valorConta, int numeroConta) {
        this.nome = nome;           // Inicializa o atributo nome com o valor passado.
        this.numeroConta = numeroConta;  // Inicializa o atributo numeroConta com o valor passado.
        depConta(valorConta);      // Chama o método depConta para inicializar o saldo da conta com o valor de depósito.
    }

    // Construtor alternativo da classe, utilizado para inicializar os atributos nome e numeroConta.
    // Recebe dois parâmetros: nome (String) e numeroConta (int).
    public BancoCliente(String nome, int numeroConta) {
        this.nome = nome;           // Inicializa o atributo nome com o valor passado.
        this.numeroConta = numeroConta;  // Inicializa o atributo numeroConta com o valor passado.
    }

    // Método getter para o atributo numeroConta.
    // Retorna o número da conta bancária do cliente.
    public int getNumeroConta() {
        return numeroConta;
    }

    // Método getter para o atributo nome.
    // Retorna o nome do titular da conta.
    public String getNome() {
        return nome;
    }

    // Método setter para o atributo nome.
    // Permite alterar o nome do titular da conta.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para o atributo valorConta.
    // Retorna o saldo atual da conta bancária do cliente.
    public Double getValorConta() {
        return valorConta;
    }

    // Método que realiza o depósito na conta.
    // Adiciona o valor recebido no parâmetro depConta ao saldo atual.
    public void depConta(Double depConta) {
        valorConta += depConta;  // Atualiza o saldo adicionando o valor do depósito.
    }

    // Método que realiza o saque da conta.
    // Subtrai o valor recebido no parâmetro retConta do saldo atual, aplicando uma taxa de R$ 5,00.
    public void sacConta(Double retConta) {
        valorConta -= retConta + 5;  // Atualiza o saldo subtraindo o valor do saque e a taxa.
    }

    // Sobrescrita do método toString(), que retorna uma representação em formato de String dos dados do cliente.
    // Exibe o número da conta, o nome do titular e o saldo formatado.
    public String toString() {
        return "Conta: " + getNumeroConta() + 
               ", Titular: " + String.format("%S", getNome()) +  // Nome do titular formatado.
               ", Saldo: R$ " + String.format("%.2f", getValorConta());  // Exibe o saldo com 2 casas decimais.
    }
}