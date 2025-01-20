package Applications;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio41 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas ?");
		int qtd = scan.nextInt();
		double[] vectAlt = new double[qtd];
		char[] vectGen = new char[qtd];
		double maiorAlt = 0.0;
		double menorAlt = 10.0;
		double mediaAltFem = 0.0;
		double somaFem = 0.0;
		int qtdM = 0;
		int qtdF = 0;
		
		for (int i = 0; i < vectGen.length; i++) {
			System.out.printf("Altura da %dº pessoa: ", i + 1);
			vectAlt[i] = scan.nextDouble();
			System.out.printf("Genero da %dº pessoa: ", i + 1);
			vectGen[i] = scan.next().charAt(0);
		}
		
		for (int i = 0; i < vectGen.length; i++) {
			if (vectAlt[i] > maiorAlt) {
				maiorAlt = vectAlt[i];
			}
			
			if (vectAlt[i] < menorAlt) {
				menorAlt = vectAlt[i];
			}
			
			if (vectGen[i] == 'f' || vectGen[i] == 'F') {
				somaFem += vectAlt[i];
				qtdF += 1;
			}
			
			if (vectGen[i] == 'm' || vectGen[i] == 'M') {
				qtdM += 1;
			}
		}
		
		mediaAltFem = somaFem / qtdF;
		
		System.out.println();
		System.out.printf("Menor altura: %.2f%n", menorAlt);
		System.out.printf("Maior altura: %.2f%n", maiorAlt);
		System.out.printf("Media das alturas das mulheres: %.2f%n", mediaAltFem);
		System.out.printf("Número de homens: %d%n", qtdM);
		
		scan.close();
	}
}
