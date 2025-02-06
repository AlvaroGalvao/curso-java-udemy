package Applications; // Define o pacote onde a classe está localizada.

import java.util.Locale; // Importa a classe Locale para definir configurações regionais.
import java.util.List; // Importa a interface List para trabalhar com listas.
import java.util.ArrayList; // Importa a classe ArrayList para instanciar listas dinâmicas.

import Entities.Account; // Importa a classe Account, que é a classe base das contas bancárias.
import Entities.SavingsAccount; // Importa a classe SavingsAccount, que representa uma conta poupança.
import Entities.BusinessAccount; // Importa a classe BusinessAccount, que representa uma conta empresarial.

public class Aula23 { // Declara a classe principal do programa.

    public static void main(String[] args) { // Método principal, ponto de entrada do programa.

        Locale.setDefault(Locale.US); // Define o formato de saída como padrão dos EUA (para ponto decimal em vez de vírgula).

        List<Account> list = new ArrayList<>(); // Cria uma lista de contas do tipo Account.

        // Adiciona objetos de diferentes tipos de conta à lista.
        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01)); // Conta poupança com saldo inicial de 500.0 e taxa de juros de 0.01.
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0)); // Conta empresarial com saldo inicial de 1000.0 e limite de crédito de 400.0.
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01)); // Outra conta poupança.
        list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0)); // Outra conta empresarial.

        double sum = 0.0; // Variável para armazenar a soma dos saldos.

        // Percorre a lista e soma os saldos das contas.
        for (Account acc : list) {
            sum += acc.getBalance(); // Obtém o saldo da conta e adiciona à soma total.
        }

        // Exibe o saldo total de todas as contas.
        System.out.printf("Total balance: %.2f%n", sum);

        // Percorre novamente a lista, deposita um valor fixo em cada conta e exibe o saldo atualizado.
        for (Account acc : list) {
            acc.deposit(10.0); // Deposita 10.0 na conta.
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }    
}