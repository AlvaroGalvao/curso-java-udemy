package Applications;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio35 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números você irá digitar ?");
		int qtd = scan.nextInt();
		double[] vect = new double[qtd];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = scan.nextDouble();
		}
		
		double maior = vect[0];
		int maiorLoc = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				maiorLoc = i;
			}
		}
		
		System.out.printf("Maior valor: %.1f%n", maior);
		System.out.printf("Posição do maior valor: %d%n", maiorLoc);
		
		scan.close();
	}
}
