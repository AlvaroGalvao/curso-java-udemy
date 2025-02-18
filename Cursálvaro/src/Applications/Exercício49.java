package Applications; // Declara o pacote ao qual esta classe pertence.

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

// Importa classes necessárias para entrada de dados e manipulação de exceções.

import Model.Exception.BusinessException; // Importa uma exceção personalizada para regras de negócio.
import Model.Entities.Account1; // Importa a classe Account1, que representa uma conta bancária.

public class Exercício49 { // Declaração da classe principal

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define o formato numérico para o padrão dos EUA (ponto decimal em vez de vírgula).
        Scanner scan = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados do usuário.

        try {
            // Solicita e recebe os dados da conta bancária do usuário.
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = scan.nextInt(); // Lê o número da conta.
            scan.nextLine(); // Consome a quebra de linha pendente no buffer do Scanner.
            System.out.print("Holder: ");
            String holder = scan.nextLine(); // Lê o nome do titular da conta.
            System.out.print("Initial balance: ");
            Double initialBalance = scan.nextDouble(); // Lê o saldo inicial da conta.
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = scan.nextDouble(); // Lê o limite de saque.

            // Cria uma nova conta bancária com os dados fornecidos.
            Account1 account1 = new Account1(number, holder, initialBalance, withdrawLimit);

            // Solicita e processa um saque.
            System.out.print("Enter amount for withdraw: ");
            Double withdraw = scan.nextDouble(); // Lê o valor a ser sacado.

            account1.withdraw(withdraw); // Chama o método de saque da conta.

            // Exibe o novo saldo após a operação.
            System.out.printf("New balance: %.2f%n", account1.getBalance());
        }
        catch (BusinessException e) { // Captura exceções relacionadas às regras de negócio (por exemplo, saldo insuficiente).
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (InputMismatchException e) { // Captura erros de entrada de dados, como tentar inserir texto em vez de número.
            System.out.println("Unexpected error!");
        }
        scan.close(); // Fecha o Scanner para evitar vazamento de recursos.
    }
}