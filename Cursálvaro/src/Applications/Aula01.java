package Applications;

import java.util.Scanner;
import java.util.Locale;

// Classe principal que calcula a área de um imóvel e o preço baseado no valor do metro quadrado.
public class Aula01 {

    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler os dados inseridos pelo usuário.
        Scanner scan = new Scanner(System.in);

        // Definindo a localidade para a formatação de valores monetários em Real.
        Locale.setDefault(Locale.US);

        // Declaração das variáveis necessárias para o cálculo.
        double largura, comprimento, metroQuadrado, area, preco;

        // Solicitação de entrada de dados ao usuário para largura, comprimento e valor do metro quadrado.
        System.out.println("Digite a largura:");
        largura = scan.nextDouble();
        System.out.println("Digite o comprimento:");
        comprimento = scan.nextDouble();
        System.out.println("Digite o valor de metros quadrados (m²):");
        metroQuadrado = scan.nextDouble();

        // Cálculo da área com base na largura e comprimento.
        area = largura * comprimento;

        // Cálculo do preço, multiplicando a área pelo valor do metro quadrado.
        preco = area * metroQuadrado;

        // Exibição do resultado da área formatada em m² e do preço formatado em Real.
        System.out.printf("Area: %.2f m²%n", area);
        System.out.printf("Preço: R$ %.2f%n", preco);

        // Fechamento do objeto Scanner para liberar recursos.
        scan.close();
    }
}