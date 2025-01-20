package Applications;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio38 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números serão digitados ?");
		int qtd = scan.nextInt();
		double[] vect = new double[qtd];
		double soma = 0;
		int qtdPares = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = scan.nextDouble();
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				qtdPares += 1;
			}
		}
		
		if (soma == 0) {
			System.out.println("Nenhum número par!");
		}
		else {
			double mediaPares = soma / qtdPares;
			System.out.printf("Media dos pares: %.1f%n", mediaPares);
		}
		
		scan.close();
	}
}
