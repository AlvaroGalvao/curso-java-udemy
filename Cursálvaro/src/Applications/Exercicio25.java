package Applications;
import java.util.Scanner;


public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int resultado = n % i;
			if (resultado == 0) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}
}
