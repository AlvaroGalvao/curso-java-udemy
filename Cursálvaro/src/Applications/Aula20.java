package Applications;

import Model.Entities.Account;
import Model.Entities.BusinessAccount;
import Model.Entities.SavingsAccount;

public class Aula20 {
    
    public static void main(String[] args) {
        
        // Criando uma conta comum do tipo Account
        Account acc = new Account(1001, "Alex", 0.0);
        
        // Criando uma conta empresarial do tipo BusinessAccount
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
        
        // UPCASTING
        
        // Referente a regra "É um", como uma BusinessAccount é um tipo de Account, podemos atribuí-la a uma variável do tipo Account
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
        
        // DOWNCASTING
        
        // Para utilizar métodos específicos de uma subclasse, precisamos fazer o downcasting
        BusinessAccount acc4 = (BusinessAccount)acc2; // Necessário especificar o tipo correto antes de acessar métodos específicos
        acc4.loan(100.0); // Chamando o método específico da classe BusinessAccount
        
        // BusinessAccount acc5 = (BusinessAccount)acc3; 
        // Esse código daria erro em tempo de execução, pois acc3 foi instanciado como SavingsAccount e não pode ser convertido para BusinessAccount
        
        // Para evitar esse erro, é recomendado verificar o tipo da instância antes de converter
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!"); // Só será impresso se acc3 for realmente uma BusinessAccount
        }
        
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance(); // Chamando método específico da classe SavingsAccount
            System.out.println("Update!"); // Só será impresso se acc3 for realmente uma SavingsAccount
        }       
    }
}