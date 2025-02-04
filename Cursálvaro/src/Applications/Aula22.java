package Applications; // Define o pacote onde a classe está localizada

import Entities.Account; // Importa a classe Account do pacote Entities
import Entities.SavingsAccount; // Importa a classe SavingsAccount do pacote Entities

public class Aula22 { // Declaração da classe principal
	
	public static void main(String[] args) { // Método principal da aplicação
		
		// Criação de um objeto do tipo Account (Conta comum)
		Account x = new Account(1020, "Alex", 1000.0);
		
		// Criação de um objeto do tipo SavingsAccount (Conta Poupança)
		// SavingsAccount herda de Account e adiciona a taxa de juros (0.01 no caso)
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		// Ambas as contas realizam a operação de saque, porém os comportamentos podem diferir devido ao polimorfismo
		x.withdraw(50.0); // Executa o método withdraw() da classe Account
		y.withdraw(50.0); // Executa o método withdraw() da classe SavingsAccount (sobrescrito)

		// Exibe os saldos atualizados após os saques
		System.out.println(x.getBalance()); // Exibe o saldo da conta comum
		System.out.println(y.getBalance()); // Exibe o saldo da conta poupança (com possível desconto adicional)
	}
}