package Applications;

import java.util.Scanner;
import Entities.Pensionato;

public class Exercicio42 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados ? ");
		int qtd = scan.nextInt();
		System.out.println();
		Pensionato[] vect = new Pensionato[10];
		
		for (int i = 0; i < qtd; i++) {
			System.out.printf("Aluguel #%d:%n", i + 1);
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.nextLine();
			System.out.print("Quarto escolhido: ");
			int numeroQuarto = scan.nextInt();
			System.out.println();
			if (vect[numeroQuarto] == null) {
				vect[numeroQuarto] = new Pensionato(nome, email);
			}
			else {
				System.out.println("Quarto ocupado, tente novamente!");
			}
		}
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.printf("%d: %s, %s%n", i, vect[i].getNome(), vect[i].getEmail());
			}
		}
		
		scan.close();
	}
}
