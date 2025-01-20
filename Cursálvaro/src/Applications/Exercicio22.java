package Applications;
import java.util.Scanner;
import java.util.Locale;


public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite a quantidade de casos de teste:");
		int qtdCasos = scan.nextInt();
		System.out.println("Digite os 3 números de cada caso:");
		
		for (int i = 0; i < qtdCasos; i++) {
			float numero1 = scan.nextFloat();
			float numero2 = scan.nextFloat();
			float numero3 = scan.nextFloat();
			float resultado = (numero1 * 2 + numero2 * 3 + numero3 * 5) / 10;
			System.out.printf("Resultado: %.1f%n", resultado);
		}
		
		scan.close();
	}
}
