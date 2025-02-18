package Model.Entities;

import Model.Exception.BusinessException; // Importa a exceção personalizada para tratar erros de negócio.

public class Account1 {
	
	// Declaração dos atributos privados da classe.
	private Integer number;         // Número da conta.
	private String holder;          // Nome do titular da conta.
	private Double balance;         // Saldo atual da conta.
	private Double withdrawLimit;   // Limite máximo permitido para saque.
	
	// Construtor sem argumentos.
	public Account1() {
	}
	
	// Construtor com argumentos para inicialização dos atributos.
	public Account1(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	// Métodos getters e setters para acesso e modificação dos atributos.
	
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
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	// Método para realizar um depósito na conta.
	public void deposit(Double deposit) {
		balance += deposit; // Incrementa o saldo com o valor depositado.
	}
	
	// Método para realizar um saque na conta.
	public void withdraw(Double withdraw) {
		// Verifica se o valor do saque excede o limite de retirada.
		if (withdraw > withdrawLimit) {
			throw new BusinessException("Valor informado é maior que o limite de retirada!");
		}
		// Verifica se o saldo é insuficiente para o saque.
		if (withdraw > balance) {
			throw new BusinessException("Valor informado é maior que o saldo da conta!");
		}
		else {
			balance -= withdraw; // Deduz o valor do saque do saldo.
		}
	}
}