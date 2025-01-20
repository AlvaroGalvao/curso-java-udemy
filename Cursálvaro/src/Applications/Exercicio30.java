package Applications;

import java.util.Scanner;
import java.util.Locale;
import Util.CurrencyConverter;


public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Bem Vindo ao conversor de moedas simples:");
		int i = 1;
		
		while (i != 2) {
			System.out.println("Escolha qual das opções você gostaria de converter (o cálculo considera o imposto de 6% do IOF):");
			System.out.printf("1 - Real em Dólar%n2 - Real em Euro%n3 - Dólar em Real%n4 - Dólar em Euro%n5 - Euro em Real%n6 - Euro em Dólar%n");
			int escolha = scan.nextInt();
			
			switch (escolha) {
			case 1:
				System.out.println("Digite o valor do Dólar em Reais:");
				double valorRealPraDolar = scan.nextDouble();
				System.out.println("Digite a quantidade de Dólar que deseja comprar:");
				double qtdRealPraDolar = scan.nextDouble();
				
				double valorTotalRD = CurrencyConverter.convRealEmDolar(valorRealPraDolar, qtdRealPraDolar);
				
				System.out.printf("Quantidade a pagar em Reais: R$ %.2f%n", valorTotalRD);
				break;
				
			case 2:
				System.out.println("Digite o valor do Euro em Reais:");
				double valorRealPraEuro = scan.nextDouble();
				System.out.println("Digite a quantidade de Euro que deseja comprar:");
				double qtdRealPraEuro = scan.nextDouble();
				
				double valorTotalRE = CurrencyConverter.convRealEmEuro(valorRealPraEuro, qtdRealPraEuro);
				
				System.out.printf("Quantidade a pagar em Reais: R$ %.2f%n", valorTotalRE);
				break;
				
			case 3:
				System.out.println("Digite o valor do Real em Dólar:");
				double valorDolarPraReal = scan.nextDouble();
				System.out.println("Digite a quantidade de Reais que deseja comprar:");
				double qtdDolarPraReal = scan.nextDouble();
				
				double valorTotalDR = CurrencyConverter.convRealEmEuro(valorDolarPraReal, qtdDolarPraReal);
				
				System.out.printf("Quantidade a pagar em Dólares: R$ %.2f%n", valorTotalDR);
				break;
				
			case 4:
				System.out.println("Digite o valor do Euro em Dólar:");
				double valorDolarPraEuro = scan.nextDouble();
				System.out.println("Digite a quantidade de Euros que deseja comprar:");
				double qtdDolarPraEuro = scan.nextDouble();
				
				double valorTotalDE = CurrencyConverter.convRealEmEuro(valorDolarPraEuro, qtdDolarPraEuro);
				
				System.out.printf("Quantidade a pagar em Dólares: R$ %.2f%n", valorTotalDE);
				break;
				
			case 5:
				System.out.println("Digite o valor do Real em Euros:");
				double valorEuroPraReal = scan.nextDouble();
				System.out.println("Digite a quantidade de Reais que deseja comprar:");
				double qtdEuroPraReal = scan.nextDouble();
				
				double valorTotalER = CurrencyConverter.convRealEmEuro(valorEuroPraReal, qtdEuroPraReal);
				
				System.out.printf("Quantidade a pagar em Euros: R$ %.2f%n", valorTotalER);
				break;
				
			case 6:
				System.out.println("Digite o valor do Dólar em Euros:");
				double valorEuroPraDolar = scan.nextDouble();
				System.out.println("Digite a quantidade de Dólares que deseja comprar:");
				double qtdEuroPraDolar = scan.nextDouble();
				
				double valorTotalED = CurrencyConverter.convRealEmEuro(valorEuroPraDolar, qtdEuroPraDolar);
				
				System.out.printf("Quantidade a pagar em Euros: R$ %.2f%n", valorTotalED);
				break;
			}
			
			System.out.println("Deseja realizar outra conversão ?");
			System.out.printf("1 - Sim%n2 - Não");
			i = scan.nextInt();
		}
		
		scan.close();
	}
}
