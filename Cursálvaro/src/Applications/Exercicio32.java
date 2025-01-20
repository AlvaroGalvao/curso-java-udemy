package Applications;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio32 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números você irá digitar ?");
		int quantidade = scan.nextInt();
		double[] vect = new double[quantidade];
		double soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = scan.nextDouble();
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		System.out.print("Valores digitados: ");
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.printf("%nSoma = %.2f%n", soma);
		System.out.printf("Media = %.2f%n", media);
		
		scan.close();
	}
}
