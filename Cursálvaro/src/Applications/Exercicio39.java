package Applications;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio39 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você irá digitar ?");
		int qtd = scan.nextInt();
		String[] vect1 = new String[qtd];
		int[] vect2 = new int[qtd];
		int velhoLoc = 0;
		int idadeVelho = 0;
		
		for (int i = 0; i < vect1.length; i++) {
			System.out.printf("Digite os dados da %dº pessoa (nome e idade):%n", i + 1);
			scan.nextLine();
			vect1[i] = scan.nextLine();
			vect2[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vect2.length; i++) {
			if (vect2[i] > idadeVelho) {
				idadeVelho = vect2[i];
				velhoLoc += 1;
			}
		}
		
		System.out.printf("Pessoa mais velha: %s%n", vect1[velhoLoc]);
		
		scan.close();
	}
}
