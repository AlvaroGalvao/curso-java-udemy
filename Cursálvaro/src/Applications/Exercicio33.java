package Applications;

import java.util.Scanner;
import java.util.Locale;
import Entities.Alturas;


public class Exercicio33 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas ?");
		int quantidade = scan.nextInt();
		Alturas[] vect = new Alturas[quantidade];
		double soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite o nome, idade e altura da %dº pessoa:%n", i + 1);
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Idade: ");
			int idade = scan.nextInt();
			System.out.print("Altura: ");
			double altura = scan.nextDouble();
			vect[i] = new Alturas(nome, idade, altura);
			soma += vect[i].getAltura();
		}
		
		double media = soma / vect.length;
		System.out.printf("Altura média: %.2f%n", media);
		
		int menor16 = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				menor16 += 1;
			}
		}
		
		double porc = menor16 * 100 / vect.length;
		System.out.println("Pessoa com menos de 16 anos: " + porc + "%");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		scan.close();
	}
}
