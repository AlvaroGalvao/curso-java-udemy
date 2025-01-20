package Applications;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio34 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números serão digitados ?");
		int qtd = scan.nextInt();
		int[] vect = new int[qtd];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = scan.nextInt();
		}
		
		int qtdPares = 0;
		System.out.println("Números pares: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				qtdPares += 1;
			}
		}
		
		System.out.printf("%nQuantidade de pares: %d%n", qtdPares);
		
		scan.close();
	}
}
