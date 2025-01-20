package Applications;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados do usuário
import java.util.Locale; // Importa a classe Locale para definir o formato de números
import Entities.BancoCliente; // Importa a classe BancoCliente, que representa as informações do cliente no banco

public class BancoBasico {

    public static void main(String[] args) {

        // Inicialização do objeto Scanner para ler entradas do usuário
        Scanner scan = new Scanner(System.in);
        
        // Define o formato de números como o padrão dos Estados Unidos (usado para separação de decimais e milhares)
        Locale.setDefault(Locale.US);
        
        // Declara a variável clienteBanco que será usada para armazenar os dados do cliente
        BancoCliente clienteBanco;
        
        // Mensagem de boas-vindas
        System.out.println("Bem vindo ao Banco básico!");
        System.out.println();

        // Solicita o número da conta do cliente
        System.out.print("Digite o número da sua conta (somente números): ");
        int numeroConta = scan.nextInt();
        
        // Solicita o nome completo do cliente
        System.out.print("Digite seu nome completo: ");
        scan.nextLine(); // Consome a quebra de linha deixada pelo nextInt
        String nome = scan.nextLine();
        
        System.out.println();
        System.out.println("Você gostaria de realizar o primeiro depósito ?");
        System.out.printf("1 - Sim%n2 - Não%n");
        
        // Pergunta ao usuário se deseja realizar um depósito inicial
        int escolha1 = scan.nextInt();
        
        // Se o cliente escolher realizar o depósito inicial
        if (escolha1 == 1) {
            System.out.println();
            System.out.println("Digite o valor do primeiro depósito:");
            Double valorConta = scan.nextDouble();
            clienteBanco = new BancoCliente(nome, valorConta, numeroConta); // Cria um novo objeto BancoCliente com o depósito inicial
            System.out.println();
            System.out.println("Primeiro depósito realizado com sucesso!");
        } else {
            // Se o cliente não desejar realizar o depósito inicial, cria o cliente sem valor inicial
            clienteBanco = new BancoCliente(nome, numeroConta);
        }

        // Inicia um loop para que o cliente possa realizar operações até decidir sair
        int i = 1;
        
        // O loop continua enquanto o cliente desejar realizar operações
        while (i != 2) {
            System.out.println();
            System.out.println("Selecione a operação que deseja realizar:");
            System.out.printf("1 - Depositar%n2 - Sacar%n3 - Consultar saldo%n4 - Consultar nome%n5 - Consultar número da conta%n6 - Mudar nome%n");

            // Lê a opção escolhida pelo usuário
            int escolha2 = scan.nextInt();
            
            // Switch para realizar diferentes operações com base na escolha do usuário
            switch (escolha2) {
            case 1:
                // Opção 1: Depositar
                System.out.println();
                System.out.println("Digite o valor que será depositado:");
                clienteBanco.depConta(scan.nextDouble()); // Chama o método depConta para depositar o valor
                System.out.println();
                System.out.println("Dados da conta atualizados:");
                System.out.println(clienteBanco); // Exibe os dados da conta atualizados
                break;
            case 2:
                // Opção 2: Sacar
                System.out.println();
                System.out.println("O valor de R$ 5,00 será descontado de sua conta ao realizar o saque devido ao imposto!");
                System.out.printf("Deseja continuar ?%n1 - Sim%n2 - Não");
                byte escolha3 = scan.nextByte();
                if (escolha3 == 1) {
                    System.out.println("Digite o valor que será sacado:");
                    clienteBanco.sacConta(scan.nextDouble()); // Chama o método sacConta para sacar o valor
                    System.out.println();
                    System.out.println("Dados da conta atualizados:");
                    System.out.println(clienteBanco); // Exibe os dados da conta atualizados
                } else {
                    System.out.println("Operação finalizada!");
                }
                break;
            case 3:
                // Opção 3: Consultar saldo
                System.out.println();
                System.out.println("Seu saldo atual: R$ " + String.format("%.2f", clienteBanco.getValorConta())); // Exibe o saldo atual formatado
                break;
            case 4:
                // Opção 4: Consultar nome
                System.out.println();
                System.out.printf("Nome no registro atual: %S%n", clienteBanco.getNome()); // Exibe o nome atual do cliente
                break;
            case 5:
                // Opção 5: Consultar número da conta
                System.out.println();
                System.out.println("Número da sua conta: " + clienteBanco.getNumeroConta()); // Exibe o número da conta
                break;
            case 6:
                // Opção 6: Mudar nome
                System.out.println();
                System.out.println("Digite o novo nome que deseja no registro:");
                scan.nextLine(); // Consome a quebra de linha deixada pelo nextInt
                clienteBanco.setNome(scan.nextLine()); // Atualiza o nome do cliente
                System.out.println();
                System.out.println(clienteBanco); // Exibe os dados da conta atualizados com o novo nome
                break;
            }

            // Pergunta se o cliente deseja realizar outra operação
            System.out.println();
            System.out.println("Deseja realizar outra operação ?");
            System.out.printf("1 - Sim%n2 - Não%n");
            i = scan.nextInt(); // Lê a resposta do cliente
        }

        // Mensagem de despedida quando o cliente decide sair
        System.out.println("Muito obrigado por utilizar o banco básico, tenha um bom dia!");

        // Fecha o scanner ao final para liberar recursos
        scan.close();
    }
}