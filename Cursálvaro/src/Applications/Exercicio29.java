package Applications;

import java.util.Scanner;
import java.util.Locale;
import Entities.Estudante;


public class Exercicio29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Estudante estudante = new Estudante();
		
		System.out.println("Digite o nome do aluno:");
		estudante.nome = scan.nextLine();
		System.out.println("Digite as notas dos semestres em ordem:");
		estudante.nota1 = scan.nextDouble();
		estudante.nota2 = scan.nextDouble();
		estudante.nota3 = scan.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n", estudante.notaFinal());

		if (estudante.notaFinal() < 60) {
			System.out.printf("FALHOU%nFALTARAM %.2f PONTOS%n", estudante.pontosFaltantes());
		}
		else {
			System.out.println("PASSOU");
		}
		
		scan.close();
	}
}
