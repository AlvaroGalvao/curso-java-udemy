package Applications;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio31 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números você irá digitar ?");
		int quantidade = scan.nextInt();
		int[] vect = new int[quantidade];
		System.out.printf("Digite os %d números:%n", quantidade);
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = scan.nextInt();
		}
		
		System.out.println("Números negativos digitados:");
		
		for (int j = 0; j < vect.length; j++) {
			if (vect[j] < 0) {
				System.out.println(vect[j]);
			}
		}
		
		scan.close();
	}
}
