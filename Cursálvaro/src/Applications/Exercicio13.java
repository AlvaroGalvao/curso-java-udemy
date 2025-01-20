package Applications;
import java.util.Scanner;


public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int codigoItem, quantidadeItem;
		double valorTotal = 0;
		
		System.out.println("Cardápio:");
		System.out.println("Código - Produto - Preço");
		System.out.println("1 - Cachorro Quente - R$ 4.00");
		System.out.println("2 - X-Salada - R$ 4.50");
		System.out.println("3 - X-Bacon - R$ 5.00");
		System.out.println("4 - Torrada Simples - R$ 2.00");
		System.out.println("5 - Refrigerante - R$ 1.50");
		
		System.out.println("Digite o código do produto:");
		codigoItem = scan.nextInt();
		System.out.println("Digite a quantidade do item:");
		quantidadeItem = scan.nextInt();
		
		if (codigoItem == 1) {
			valorTotal = quantidadeItem * 4;
		}
		else if (codigoItem == 2) {
			valorTotal = quantidadeItem * 4.5;
		}
		else if (codigoItem == 3) {
			valorTotal = quantidadeItem * 5;
		}
		else if (codigoItem == 4) {
			valorTotal = quantidadeItem * 2;
		}
		else if (codigoItem == 5) {
			valorTotal = quantidadeItem * 1.5;
		}
		else {
			System.out.println("Código do produto inválido!");
		}
		
		System.out.printf("Total a pagar: R$ %.2f%n", valorTotal);
		
		scan.close();
		
	}
}
