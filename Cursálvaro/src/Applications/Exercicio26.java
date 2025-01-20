package Applications;
import java.util.Scanner;


public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas:");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		
		scan.close();
	}
}
