package Applications;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio37 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números serão digitados ?");
		int qtd = scan.nextInt();
		double[] vect = new double[qtd];
		double soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = scan.nextDouble();
			soma += vect[i];
		}
		
		System.out.println();
		double media = soma / vect.length;
		System.out.printf("Media do vetor: %.3f%n", media);
		
		System.out.println("Elementos abaixo da média: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		scan.close();
	}
}
