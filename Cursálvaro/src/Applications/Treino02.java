package Applications;
import java.util.Scanner;


public class Treino02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números que serão comparados:");
		int qtdNumeros = scan.nextInt();
		System.out.printf("Digite os %d números:%n", qtdNumeros);
		int resultado = 0;
		
		for (int i = 0; i < qtdNumeros; i++) {
			int numero1 = scan.nextInt();
			if (numero1 > resultado) {
				resultado = numero1;
			}
		}
		
		System.out.printf("O maior número é: %d%n", resultado);
		
		scan.close();
	}
}
