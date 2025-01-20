package Applications;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio40 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão digitados ?");
		int qtd = scan.nextInt();
		String[] vectNomes = new String[qtd];
		double[] vectNotas1 = new double[qtd];
		double[] vectNotas2 = new double[qtd];
		
		for (int i = 0; i < vectNomes.length; i++) {
			System.out.printf("Digite o nome, a primeira e a segunda nota do %dº aluno:%n", i + 1);
			scan.nextLine();
			vectNomes[i] = scan.nextLine();
			vectNotas1[i] = scan.nextDouble();
			vectNotas2[i] = scan.nextDouble();
		}
		
		System.out.println();
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < vectNomes.length; i++) {
			if ((vectNotas1[i] + vectNotas2[i]) / 2 > 5.9) {
				System.out.println(vectNomes[i]);
			}
		}
		
		scan.close();
	}
}
