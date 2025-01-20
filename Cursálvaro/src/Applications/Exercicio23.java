package Applications;
import java.util.Scanner;


public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de casos:");
		int qtdCasos = scan.nextInt();
		System.out.println("Digite os valores a serem divididos:");
		
		for (int i = 0; i < qtdCasos; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if (x == 0 || y == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				int divisao = x / y;
				System.out.printf("Resultado: %d%n", divisao);
			}
		}
		
		scan.close();
	}
}
