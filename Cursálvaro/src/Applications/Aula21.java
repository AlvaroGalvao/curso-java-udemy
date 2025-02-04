package Applications;

// Importação das classes do pacote Entities
import Entities.Account;
import Entities.SavingsAccount;
import Entities.BusinessAccount;

// Classe principal para demonstrar o uso de herança e polimorfismo em contas bancárias
public class Aula21 {
    
    public static void main(String[] args) {
        
        // Criando uma conta comum (Account)
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0); // Realizando um saque de 200.0
        System.out.println(acc1.getBalance()); // Exibindo saldo atualizado
        
        // Criando uma conta poupança (SavingsAccount), que pode ter regras específicas como rendimento
        Account acc2 = new SavingsAccount(1002, "Bia", 1000.0, 0.01);
        acc2.withdraw(200.0); // Realizando um saque na conta poupança
        System.out.println(acc2.getBalance()); // Exibindo saldo atualizado
        
        // Criando uma conta empresarial (BusinessAccount), que pode ter um limite de crédito adicional
        Account acc3 = new BusinessAccount(1003, "Carlos", 1000.0, 500.0);
        acc3.withdraw(200.0); // Realizando um saque na conta empresarial
        System.out.println(acc3.getBalance()); // Exibindo saldo atualizado
    }
}