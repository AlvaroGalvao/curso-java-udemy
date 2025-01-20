package Applications;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio36 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qauntos valores terá em cada vetor ?");
		int qtd = scan.nextInt();
		double[] vectA = new double[qtd];
		double[] vectB = new double[qtd];
		double[] vectC = new double[qtd];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = scan.nextDouble();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = scan.nextDouble();
		}
		
		System.out.println("Vetor resultante:");
		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		scan.close();
	}
}
