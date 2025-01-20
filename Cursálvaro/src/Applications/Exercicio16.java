package Applications;
import java.util.Scanner;


public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double renda, imposto = 0;
		
		System.out.println("Informe a sua renda:");
		renda = scan.nextDouble();
		
		if (renda <= 2000) {
			System.out.println("Isento(a)!");
		}
		else if (renda <= 3000) {
			imposto = (renda - 2000) * 0.08;
		}
		else if (renda <= 4500) {
			imposto = (renda - 3000) * 0.18 + 1000 * 0.08;
		}
		else {
			imposto = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		
		System.out.printf("Total de imposto a pagar: R$ %.2f%n", imposto);
		
		scan.close();
	}
}
